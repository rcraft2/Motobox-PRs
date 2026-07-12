package minecrafttransportsimulator.systems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import minecrafttransportsimulator.baseclasses.Point3D;
import minecrafttransportsimulator.entities.components.AEntityA_Base;
import minecrafttransportsimulator.entities.components.AEntityE_Interactable;
import minecrafttransportsimulator.entities.instances.EntityVehicleF_Physics;
import minecrafttransportsimulator.entities.instances.APart;
import minecrafttransportsimulator.items.components.AItemPack;
import minecrafttransportsimulator.items.components.AItemPart;
import minecrafttransportsimulator.items.instances.ItemItem;
import minecrafttransportsimulator.items.instances.ItemVehicle;
import minecrafttransportsimulator.jsondefs.JSONConfigVehiclePrices.VehiclePriceEntry;
import minecrafttransportsimulator.jsondefs.JSONPartDefinition;
import minecrafttransportsimulator.mcinterface.AWrapperWorld;
import minecrafttransportsimulator.mcinterface.IWrapperEntity;
import minecrafttransportsimulator.mcinterface.IWrapperNBT;
import minecrafttransportsimulator.mcinterface.IWrapperPlayer;
import minecrafttransportsimulator.mcinterface.InterfaceManager;
import minecrafttransportsimulator.packets.instances.PacketPlayerMoneyUpdate;
import minecrafttransportsimulator.packloading.PackParser;

public final class StolenVehicleSystem {
    private static final String DATA_KEY = "stolen_vehicle_data";
    private static final String SALE_POINT_KEY = "salePoint";
    private static final String SPAWN_POINTS_KEY = "spawnPoints";
    private static final String AUTOBODY_SHOPS_KEY = "autobodyShops";
    private static final String ACTIVE_VEHICLES_KEY = "activeVehicles";
    private static final String LAST_SPAWN_TIME_KEY = "lastSpawnTime";
    private static final String SPAWNED_AT_KEY = "spawnedAt";

    private static final int MAX_ACTIVE_STOLEN_VEHICLES = 3;
    private static final long DESPAWN_TIME_MS = 60L * 60L * 1000L;
    private static final long SPAWN_INTERVAL_MS = 5L * 60L * 1000L;
    private static final double SALE_RADIUS_BLOCKS = 12.0D;

    private StolenVehicleSystem() {
    }

    public static void serverTick(AWrapperWorld world) {
        if (world.isClient()) {
            return;
        }

        IWrapperNBT systemData = world.getData(DATA_KEY);
        if (systemData == null) {
            return;
        }

        long now = System.currentTimeMillis();
        boolean modified = false;

        modified |= cleanupInvalidOrExpiredVehicles(world, systemData, now);
        modified |= processSaleDeliveries(world, systemData);
        modified |= trySpawnVehicle(world, systemData, now);

        if (modified) {
            world.setData(DATA_KEY, systemData);
        }
    }

    public static void addSpawnPoint(AWrapperWorld world, Point3D point) {
        IWrapperNBT systemData = getOrCreateData(world);
        List<Point3D> spawnPoints = getSpawnPoints(systemData);
        spawnPoints.add(point.copy());
        systemData.setPoint3dsCompact(SPAWN_POINTS_KEY, spawnPoints);
        world.setData(DATA_KEY, systemData);
    }

    public static int clearSpawnPoints(AWrapperWorld world) {
        IWrapperNBT systemData = world.getData(DATA_KEY);
        if (systemData == null) {
            return 0;
        }

        int count = getSpawnPoints(systemData).size();
        systemData.setPoint3dsCompact(SPAWN_POINTS_KEY, new ArrayList<>());
        world.setData(DATA_KEY, systemData);
        return count;
    }

    public static void setSalePoint(AWrapperWorld world, Point3D point) {
        IWrapperNBT systemData = getOrCreateData(world);
        systemData.setPoint3dCompact(SALE_POINT_KEY, point.copy());
        world.setData(DATA_KEY, systemData);
    }

    public static void addAutobodyShop(AWrapperWorld world, Point3D point) {
        IWrapperNBT systemData = getOrCreateData(world);
        List<Point3D> shops = getAutobodyShops(systemData);
        shops.add(point.copy());
        systemData.setPoint3dsCompact(AUTOBODY_SHOPS_KEY, shops);
        world.setData(DATA_KEY, systemData);
    }

    public static int clearAutobodyShops(AWrapperWorld world) {
        IWrapperNBT systemData = world.getData(DATA_KEY);
        if (systemData == null) {
            return 0;
        }
        int count = getAutobodyShops(systemData).size();
        systemData.setPoint3dsCompact(AUTOBODY_SHOPS_KEY, new ArrayList<>());
        world.setData(DATA_KEY, systemData);
        return count;
    }

    public static int getAutobodyShopCount(AWrapperWorld world) {
        IWrapperNBT systemData = world.getData(DATA_KEY);
        return systemData != null ? getAutobodyShops(systemData).size() : 0;
    }

    /**
     * Called when a vehicle is destroyed.  Spawns a locked replacement at the nearest
     * autobody shop with a 1% maintenance-fee purchase price.
     */
    public static void onVehicleDestroyed(EntityVehicleF_Physics vehicle) {
        if (vehicle.world.isClient()) {
            return;
        }
        if (vehicle.theftVehicle || vehicle.ownerUUID == null) {
            debugVehicleOwner(vehicle, "autobody: skipped destroyed vehicle because it was theft or had no owner");
            return;
        }
        AWrapperWorld world = vehicle.world;
        IWrapperNBT systemData = world.getData(DATA_KEY);
        if (systemData == null) {
            debugVehicleOwner(vehicle, "autobody: no stolen_vehicle_data found in world saved data");
            return;
        }

        List<Point3D> shops = getAutobodyShops(systemData);
        if (shops.isEmpty()) {
            debugVehicleOwner(vehicle, "autobody: no autobody shops configured");
            return;
        }

        // Find the shop closest to where the vehicle exploded.
        Point3D destroyedPos = vehicle.position.copy();
        Point3D closestShop = shops.get(0);
        double closestDist = destroyedPos.distanceTo(closestShop);
        for (int i = 1; i < shops.size(); i++) {
            double dist = destroyedPos.distanceTo(shops.get(i));
            if (dist < closestDist) {
                closestDist = dist;
                closestShop = shops.get(i);
            }
        }

        // Determine the 1% maintenance fee price from the normal vehicle price.
        double normalPrice = ConfigSystem.getVehiclePrice(vehicle);
        double maintenancePrice = Math.max(1.0D, Math.round(normalPrice * 0.01D));
        debugVehicleOwner(vehicle, "autobody: nearest shop=" + closestShop + ", normalPrice=" + (long) normalPrice + ", maintenancePrice=" + (long) maintenancePrice);

        IWrapperNBT replacementData = vehicle.save(InterfaceManager.coreInterface.getNewNBTWrapper());
        replacementData.deleteAllUUIDTags();
        replacementData.deleteEntry("ownerUUID");
        replacementData.deleteEntry("authorizedDrivers");
        replacementData.deleteEntry(ItemItem.KEY_UUID_TAG);
        replacementData.setBoolean("theftVehicle", false);
        replacementData.setDouble("customPurchasePrice", maintenancePrice);
        replacementData.setDouble("locked", 1.0D);
        clearDestroyedState(replacementData);

        // Spawn the same vehicle type (same pack/system/variant) at the shop, locked.
        ItemVehicle item = getVehicleItem(vehicle);
        if (item == null) {
            debugVehicleOwner(vehicle, "autobody: failed to resolve vehicle item for " + vehicle.definition.packID + ":" + vehicle.definition.systemName + vehicle.subDefinition.subName);
            return;
        }

        EntityVehicleF_Physics replacement = spawnShopVehicle(world, item, replacementData, closestShop);
        if (replacement != null) {
            debugVehicleOwner(vehicle, "autobody: spawned replacement " + replacement.uniqueUUID + " at " + replacement.position);
        } else {
            debugVehicleOwner(vehicle, "autobody: spawnShopVehicle returned null");
        }
    }

    /**
     * Clears persisted totaled/burning state from a cloned vehicle NBT tree.
     * This keeps all attachments but prevents the shop replacement from spawning on fire.
     */
    private static void clearDestroyedState(IWrapperNBT data) {
        data.setDouble(AEntityE_Interactable.DAMAGE_VARIABLE, 0.0D);
        data.setInteger("ticksOutOfHealth", 0);
        data.setInteger("fire", 0);
        data.setInteger("Fire", 0);
        data.setBoolean("onFire", false);
        data.setBoolean("OnFire", false);
        data.setBoolean("HasVisualFire", false);

        for (String childName : data.getAllNames()) {
            IWrapperNBT childData = data.getData(childName);
            if (childData != null) {
                clearDestroyedState(childData);
            }
        }
    }

    public static int getSpawnPointCount(AWrapperWorld world) {
        IWrapperNBT systemData = world.getData(DATA_KEY);
        return systemData != null ? getSpawnPoints(systemData).size() : 0;
    }

    public static boolean hasSalePoint(AWrapperWorld world) {
        IWrapperNBT systemData = world.getData(DATA_KEY);
        return systemData != null && systemData.getPoint3dCompact(SALE_POINT_KEY) != null;
    }

    public static int getActiveVehicleCount(AWrapperWorld world) {
        IWrapperNBT systemData = world.getData(DATA_KEY);
        if (systemData == null) {
            return 0;
        }

        IWrapperNBT activeData = systemData.getData(ACTIVE_VEHICLES_KEY);
        return activeData != null ? activeData.getAllNames().size() : 0;
    }

    private static IWrapperNBT getOrCreateData(AWrapperWorld world) {
        IWrapperNBT systemData = world.getData(DATA_KEY);
        if (systemData == null) {
            systemData = InterfaceManager.coreInterface.getNewNBTWrapper();
        }
        return systemData;
    }

    private static List<Point3D> getSpawnPoints(IWrapperNBT systemData) {
        List<Point3D> points = systemData.getPoint3dsCompact(SPAWN_POINTS_KEY);
        return points != null ? new ArrayList<>(points) : new ArrayList<>();
    }

    private static IWrapperNBT getOrCreateActiveData(IWrapperNBT systemData) {
        IWrapperNBT activeData = systemData.getData(ACTIVE_VEHICLES_KEY);
        if (activeData == null) {
            activeData = InterfaceManager.coreInterface.getNewNBTWrapper();
            systemData.setData(ACTIVE_VEHICLES_KEY, activeData);
        }
        return activeData;
    }

    private static boolean cleanupInvalidOrExpiredVehicles(AWrapperWorld world, IWrapperNBT systemData, long now) {
        IWrapperNBT activeData = systemData.getData(ACTIVE_VEHICLES_KEY);
        if (activeData == null) {
            return false;
        }

        boolean modified = false;
        for (String uuidString : new ArrayList<>(activeData.getAllNames())) {
            UUID vehicleUUID;
            try {
                vehicleUUID = UUID.fromString(uuidString);
            } catch (Exception e) {
                activeData.deleteEntry(uuidString);
                modified = true;
                continue;
            }

            AEntityA_Base entity = world.getEntity(vehicleUUID);
            if (!(entity instanceof EntityVehicleF_Physics)) {
                activeData.deleteEntry(uuidString);
                modified = true;
                continue;
            }

            IWrapperNBT entryData = activeData.getData(uuidString);
            long spawnedAt = entryData != null ? (long) entryData.getDouble(SPAWNED_AT_KEY) : 0L;
            if (spawnedAt > 0 && now - spawnedAt >= DESPAWN_TIME_MS) {
                EntityVehicleF_Physics vehicle = (EntityVehicleF_Physics) entity;
                IWrapperEntity controller = vehicle.getController();
                if (controller instanceof IWrapperPlayer) {
                    ((IWrapperPlayer) controller).displayChatMessage(LanguageSystem.INTERACT_VEHICLE_THEFT_EXPIRED);
                }
                vehicle.remove();
                activeData.deleteEntry(uuidString);
                modified = true;
            }
        }

        return modified;
    }

    private static boolean processSaleDeliveries(AWrapperWorld world, IWrapperNBT systemData) {
        Point3D salePoint = systemData.getPoint3dCompact(SALE_POINT_KEY);
        IWrapperNBT activeData = systemData.getData(ACTIVE_VEHICLES_KEY);
        if (salePoint == null || activeData == null) {
            return false;
        }

        boolean modified = false;
        for (String uuidString : new ArrayList<>(activeData.getAllNames())) {
            UUID vehicleUUID;
            try {
                vehicleUUID = UUID.fromString(uuidString);
            } catch (Exception e) {
                activeData.deleteEntry(uuidString);
                modified = true;
                continue;
            }

            AEntityA_Base entity = world.getEntity(vehicleUUID);
            if (!(entity instanceof EntityVehicleF_Physics)) {
                activeData.deleteEntry(uuidString);
                modified = true;
                continue;
            }

            EntityVehicleF_Physics vehicle = (EntityVehicleF_Physics) entity;
            if (!vehicle.position.isDistanceToCloserThan(salePoint, SALE_RADIUS_BLOCKS)) {
                continue;
            }

            IWrapperEntity controller = vehicle.getController();
            if (!(controller instanceof IWrapperPlayer)) {
                continue;
            }

            IWrapperPlayer sellingPlayer = (IWrapperPlayer) controller;
            int payout = getSalePrice(vehicle);
            int balance = MoneySystem.addMoney(sellingPlayer, payout);
            sellingPlayer.sendPacket(new PacketPlayerMoneyUpdate(sellingPlayer, balance));
            sellingPlayer.displayChatMessage(LanguageSystem.INTERACT_VEHICLE_THEFT_SOLD, payout);

            vehicle.remove();
            activeData.deleteEntry(uuidString);
            modified = true;
        }

        return modified;
    }

    private static boolean trySpawnVehicle(AWrapperWorld world, IWrapperNBT systemData, long now) {
        Point3D salePoint = systemData.getPoint3dCompact(SALE_POINT_KEY);
        List<Point3D> spawnPoints = getSpawnPoints(systemData);
        if (salePoint == null || spawnPoints.isEmpty()) {
            return false;
        }

        IWrapperNBT activeData = getOrCreateActiveData(systemData);
        Set<String> activeKeys = activeData.getAllNames();
        int maxActive = Math.max(1, Math.min(MAX_ACTIVE_STOLEN_VEHICLES, spawnPoints.size()));
        if (activeKeys.size() >= maxActive) {
            return false;
        }

        long lastSpawnTime = (long) systemData.getDouble(LAST_SPAWN_TIME_KEY);
        if (lastSpawnTime > 0 && now - lastSpawnTime < SPAWN_INTERVAL_MS) {
            return false;
        }

        List<List<ItemVehicle>> eligibleVehicleGroups = getEligibleVehicleGroups();
        if (eligibleVehicleGroups.isEmpty()) {
            return false;
        }

        Point3D spawnPoint = spawnPoints.get(ThreadLocalRandom.current().nextInt(spawnPoints.size())).copy();
        List<ItemVehicle> variantGroup = eligibleVehicleGroups.get(ThreadLocalRandom.current().nextInt(eligibleVehicleGroups.size()));
        ItemVehicle selectedVehicle = variantGroup.get(ThreadLocalRandom.current().nextInt(variantGroup.size()));

        EntityVehicleF_Physics spawnedVehicle = spawnStolenVehicle(world, selectedVehicle, spawnPoint);
        if (spawnedVehicle == null) {
            return false;
        }

        IWrapperNBT entryData = InterfaceManager.coreInterface.getNewNBTWrapper();
        entryData.setDouble(SPAWNED_AT_KEY, now);
        activeData.setData(spawnedVehicle.uniqueUUID.toString(), entryData);
        systemData.setDouble(LAST_SPAWN_TIME_KEY, now);
        return true;
    }

    private static List<List<ItemVehicle>> getEligibleVehicleGroups() {
        Map<String, List<ItemVehicle>> groupedVehicles = new HashMap<>();
        for (AItemPack<?> packItem : PackParser.getAllPackItems()) {
            if (!(packItem instanceof ItemVehicle)) {
                continue;
            }

            ItemVehicle vehicleItem = (ItemVehicle) packItem;
            VehiclePriceEntry entry = getVehicleEntry(vehicleItem.definition.packID, vehicleItem.definition.systemName);
            if (entry != null && entry.stolenVehicleSpawnEnabled) {
                String key = vehicleItem.definition.packID + ":" + vehicleItem.definition.systemName;
                groupedVehicles.computeIfAbsent(key, ignored -> new ArrayList<>()).add(vehicleItem);
            }
        }
        return new ArrayList<>(groupedVehicles.values());
    }

    private static VehiclePriceEntry getVehicleEntry(String packID, String systemName) {
        if (ConfigSystem.vehiclePrices == null || ConfigSystem.vehiclePrices.prices == null) {
            return null;
        }

        Map<String, VehiclePriceEntry> packPrices = ConfigSystem.vehiclePrices.prices.get(packID);
        return packPrices != null ? packPrices.get(systemName) : null;
    }

    private static EntityVehicleF_Physics spawnStolenVehicle(AWrapperWorld world, ItemVehicle item, Point3D spawnPoint) {
        EntityVehicleF_Physics vehicle = new EntityVehicleF_Physics(world, null, item, null);
        vehicle.position.set(spawnPoint).add(0.5D, 1.0D, 0.5D);
        vehicle.prevPosition.set(vehicle.position);
        vehicle.orientation.setToAngles(new Point3D(0D, ThreadLocalRandom.current().nextDouble(0D, 360D), 0D));
        vehicle.prevOrientation.set(vehicle.orientation);
        vehicle.motion.set(0D, 0D, 0D);
        vehicle.prevMotion.set(vehicle.motion);
        vehicle.theftVehicle = true;
        vehicle.ownerUUID = null;
        vehicle.lockedVar.setTo(0.0D, false);

        vehicle.world.spawnEntity(vehicle);
        vehicle.addPartsPostAddition(null, null);
        fillMissingParts(vehicle, item.definition.packID);
        return vehicle;
    }

    private static void fillMissingParts(EntityVehicleF_Physics vehicle, String preferredPackID) {
        if (vehicle.definition.parts == null) {
            return;
        }

        // Build a lookup of valid parts per slot type, preferring the same pack as the vehicle.
        for (int i = 0; i < vehicle.definition.parts.size(); i++) {
            if (vehicle.partsInSlots.get(i) != null) {
                continue; // already has a part
            }

            JSONPartDefinition slotDef = vehicle.definition.parts.get(i);
            if (slotDef.types == null || slotDef.types.isEmpty()) {
                continue;
            }

            AItemPart candidate = findValidPartForSlot(slotDef, vehicle, preferredPackID);
            if (candidate != null) {
                vehicle.addPartFromStack(candidate.getNewStack(null), null, i, false, true);
            }
        }
    }

    private static AItemPart findValidPartForSlot(JSONPartDefinition slotDef, EntityVehicleF_Physics vehicle, String preferredPackID) {
        AItemPart fallback = null;
        for (AItemPack<?> packItem : PackParser.getAllPackItems()) {
            if (!(packItem instanceof AItemPart)) {
                continue;
            }
            AItemPart partItem = (AItemPart) packItem;
            if (partItem.isPartValidForPackDef(slotDef, vehicle.subDefinition, true)) {
                if (partItem.definition.packID.equals(preferredPackID)) {
                    return partItem; // same-pack match wins immediately
                }
                if (fallback == null) {
                    fallback = partItem;
                }
            }
        }
        return fallback;
    }

    private static int getSalePrice(EntityVehicleF_Physics vehicle) {
        VehiclePriceEntry entry = getVehicleEntry(vehicle.definition.packID, vehicle.definition.systemName);
        if (entry != null && entry.stolenVehicleSalePrice > 0.0D) {
            return (int) Math.round(entry.stolenVehicleSalePrice);
        }

        double fallbackPurchasePrice = ConfigSystem.getVehiclePrice(vehicle);
        if (fallbackPurchasePrice > 0.0D) {
            return (int) Math.round(fallbackPurchasePrice * 0.6D);
        }

        return 50000;
    }

    private static List<Point3D> getAutobodyShops(IWrapperNBT systemData) {
        List<Point3D> shops = systemData.getPoint3dsCompact(AUTOBODY_SHOPS_KEY);
        return shops != null ? new ArrayList<>(shops) : new ArrayList<>();
    }

    private static ItemVehicle getVehicleItem(EntityVehicleF_Physics vehicle) {
        for (AItemPack<?> packItem : PackParser.getAllPackItems()) {
            if (!(packItem instanceof ItemVehicle)) {
                continue;
            }
            ItemVehicle vehicleItem = (ItemVehicle) packItem;
            if (vehicleItem.definition.packID.equals(vehicle.definition.packID)
                    && vehicleItem.definition.systemName.equals(vehicle.definition.systemName)
                    && vehicleItem.subDefinition.subName.equals(vehicle.subDefinition.subName)) {
                return vehicleItem;
            }
        }
        return null;
    }

    private static EntityVehicleF_Physics spawnShopVehicle(AWrapperWorld world, ItemVehicle item, IWrapperNBT vehicleData, Point3D shopPoint) {
        EntityVehicleF_Physics vehicle = new EntityVehicleF_Physics(world, null, item, vehicleData);
        vehicle.position.set(shopPoint).add(0.5D, 1.0D, 0.5D);
        vehicle.prevPosition.set(vehicle.position);
        vehicle.orientation.setToAngles(new Point3D(0D, ThreadLocalRandom.current().nextDouble(0D, 360D), 0D));
        vehicle.prevOrientation.set(vehicle.orientation);
        vehicle.motion.set(0D, 0D, 0D);
        vehicle.prevMotion.set(vehicle.motion);
        vehicle.theftVehicle = false;
        vehicle.ownerUUID = null;
        vehicle.lockedVar.setTo(1.0D, false);  // locked until purchased

        vehicle.world.spawnEntity(vehicle);
        // Ensure the spawn point itself is not keeping the replacement visibly on fire.
        vehicle.world.extinguish(vehicle.position);
        vehicle.addPartsPostAddition(null, vehicleData);
        resetDestroyedRuntimeState(vehicle);
        return vehicle;
    }

    /**
     * Ensures runtime totaled/fire-related state is cleared after spawning from cloned NBT.
     */
    private static void resetDestroyedRuntimeState(EntityVehicleF_Physics vehicle) {
        // Send synced resets so client-side particle logic immediately drops all damage-driven fire effects.
        vehicle.damageVar.setTo(0.0D, true);
        vehicle.outOfHealth = false;
        vehicle.ticksOutOfHealth = 0;

        for (APart part : vehicle.allParts) {
            part.damageVar.setTo(0.0D, true);
            part.outOfHealth = false;
        }
    }

    private static void debugVehicleOwner(EntityVehicleF_Physics vehicle, String message) {
        IWrapperEntity controller = vehicle.getController();
        if (controller instanceof IWrapperPlayer) {
            ((IWrapperPlayer) controller).displayChatMessage(LanguageSystem.SYSTEM_DEBUG, message);
            return;
        }

        if (vehicle.ownerUUID != null) {
            IWrapperEntity ownerEntity = vehicle.world.getExternalEntity(vehicle.ownerUUID);
            if (ownerEntity instanceof IWrapperPlayer) {
                ((IWrapperPlayer) ownerEntity).displayChatMessage(LanguageSystem.SYSTEM_DEBUG, message);
            }
        }
    }
}
