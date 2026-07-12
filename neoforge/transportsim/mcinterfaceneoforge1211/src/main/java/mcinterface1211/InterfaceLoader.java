package mcinterface1211;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import minecrafttransportsimulator.baseclasses.Point3D;
import minecrafttransportsimulator.blocks.components.ABlockBase;
import minecrafttransportsimulator.blocks.components.ABlockBaseTileEntity;
import minecrafttransportsimulator.blocks.instances.BlockCollision;
import minecrafttransportsimulator.entities.components.AEntityA_Base;
import minecrafttransportsimulator.entities.instances.EntityVehicleF_Physics;
import minecrafttransportsimulator.blocks.tileentities.components.ITileEntityEnergyCharger;
import minecrafttransportsimulator.blocks.tileentities.components.ITileEntityFluidTankProvider;
import minecrafttransportsimulator.blocks.tileentities.components.ITileEntityInventoryProvider;
import minecrafttransportsimulator.items.components.AItemPack;
import minecrafttransportsimulator.items.components.AItemSubTyped;
import minecrafttransportsimulator.items.components.IItemBlock;
import minecrafttransportsimulator.items.components.IItemEntityProvider;
import minecrafttransportsimulator.items.components.IItemFood;
import minecrafttransportsimulator.items.instances.ItemItem;
import minecrafttransportsimulator.jsondefs.JSONPack;
import minecrafttransportsimulator.mcinterface.IInterfaceCore;
import minecrafttransportsimulator.mcinterface.InterfaceManager;
import minecrafttransportsimulator.packloading.PackParser;
import minecrafttransportsimulator.systems.ConfigSystem;
import minecrafttransportsimulator.systems.LanguageSystem;
import minecrafttransportsimulator.systems.StolenVehicleSystem;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.arguments.UuidArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.DisplayItemsGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Loader interface for the mod.  This class is not actually an interface, unlike everything else.
 * Instead, it keeps references to all interfaces, which are passed-in during construction.
 * It also handles initialization calls when the game is first booted.  There will only
 * be ONE loader per running instance of Minecraft.
 *
 * @author don_bruce
 */
@Mod(InterfaceLoader.MODID)
public class InterfaceLoader {
    public static final String MODID = "mts";
    public static final String MODNAME = "Immersive Vehicles (MTS)";
    public static final String MODVER = "25.0.0";

    public static final Logger LOGGER = LogManager.getLogger(InterfaceLoader.MODID);
    private final String gameDirectory;
    private final IEventBus modBus;
    public static Set<String> packIDs = new HashSet<>();

    private static List<BuilderBlock> normalBlocks = new ArrayList<>();
    private static List<BuilderBlock> fluidBlocks = new ArrayList<>();
    private static List<BuilderBlock> inventoryBlocks = new ArrayList<>();
    private static List<BuilderBlock> chargerBlocks = new ArrayList<>();
    protected static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InterfaceLoader.MODID);

    public InterfaceLoader(IEventBus modBus) {
        this.modBus = modBus;
        this.gameDirectory = FMLPaths.GAMEDIR.get().toFile().getAbsolutePath();
        modBus.addListener(this::init);
        modBus.addListener(this::onPostConstruction);
        modBus.addListener(InterfacePacket::registerPayloads);
        modBus.addListener(InterfaceLoader::onRegisterCapabilities);
        NeoForge.EVENT_BUS.addListener(this::onRegisterCommands);
    }

    /**Need to defer init until post-mod construction, as in this version
     * {@link IInterfaceCore#getModName(String)} requires a constructor pack-mod
     * instance to query the classloader for a resource, and we need that for pack
     * init in the boot calls.
     * 
     */
    public void init(FMLConstructModEvent event) {
        //Add registries.
        BuilderItem.ITEMS.register(modBus);
        BuilderBlock.BLOCKS.register(modBus);
        BuilderTileEntity.TILE_ENTITIES.register(modBus);
        ABuilderEntityBase.ENTITIES.register(modBus);
        CREATIVE_TABS.register(modBus);

        //Need to do pack parsing first, since that generates items which have to be registered prior to any other events.
        boolean isClient = FMLLoader.getDist() == Dist.CLIENT;

        //Init interfaces and send to the main game system.
        if (isClient) {
            new InterfaceManager(MODID, gameDirectory, new InterfaceCore(), new InterfacePacket(), new InterfaceClient(), new InterfaceInput(), new InterfaceSound(), new InterfaceRender());
            modBus.addListener(InterfaceInput::onIVRegisterKeyMappingsEvent);
            modBus.addListener(InterfaceRender::onIVRegisterShadersEvent);
            modBus.addListener(InterfaceRender::onIVRegisterRenderersEvent);
        } else {
            new InterfaceManager(MODID, gameDirectory, new InterfaceCore(), new InterfacePacket(), null, null, null, null);
        }

        InterfaceManager.coreInterface.logError("Welcome to MTS VERSION: " + MODVER);

        //Init config
        ConfigSystem.loadFromDisk(isClient);

        //Parse packs.  Look though default game directory and file runtime
        //Some systems don't use the "proper" game directory for mods so we need to look in the file directory too
        List<File> packDirectories = new ArrayList<>();
        File modDirectory = new File(gameDirectory, "mods");
        if (modDirectory.exists()) {
            packDirectories.add(modDirectory);
        }
        try {
            modDirectory = ModList.get().getModFileById(MODID).getFile().getFilePath().getParent().toFile().getCanonicalFile();
        } catch (Exception e) {
        } //Do nothing, this won't happen.
        if (modDirectory.exists()) {
            packDirectories.add(modDirectory);
        }
        if (!packDirectories.isEmpty()) {
            PackParser.addDefaultItems();
            PackParser.parsePacks(packDirectories);
        } else {
            InterfaceManager.coreInterface.logError("Could not find mods directory!  Checked game directory: " + gameDirectory + " and runtime file directory:" + modDirectory);
        }

        //Set pack IDs.
        packIDs.addAll(PackParser.getAllPackIDs());

        //Create all pack items.  We need to do this before anything else.
        //Item registration comes first, and we use the items registered to determine
        //which blocks we need to register.
        Set<ABlockBase> blocksRegistred = new HashSet<>();
        Map<String, List<AItemPack<?>>> creativeTabsRequired = new HashMap<>();
        for (String packID : PackParser.getAllPackIDs()) {
            for (AItemPack<?> item : PackParser.getAllItemsForPack(packID, true)) {
                if (item.autoGenerate()) {
                    //Crate the item registry creator.
                    BuilderItem.ITEMS.register(item.getRegistrationName(), () -> {
                        Item.Properties itemProperties = new Item.Properties();
                        itemProperties.stacksTo(item.getStackSize());
                        if (item instanceof ItemItem && ((ItemItem) item).definition.food != null) {
                            IItemFood food = (IItemFood) item;
                            itemProperties.food(new FoodProperties.Builder().nutrition(food.getHungerAmount()).saturationModifier(food.getSaturationAmount()).build());
                        }
                        return new BuilderItem(itemProperties, item);
                    });

                    //Check if the creative tab is set/created.
                    //The only exception is for "invisible" parts of the core mod, these are internal.
                    boolean hideOnCreativeTab = item.definition.general.hideOnCreativeTab || (item instanceof AItemSubTyped && ((AItemSubTyped<?>) item).subDefinition.hideOnCreativeTab);
                    if (!hideOnCreativeTab && (!item.definition.packID.equals(InterfaceLoader.MODID) || !item.definition.systemName.contains("invisible"))) {
                        creativeTabsRequired.computeIfAbsent(item.getCreativeTabID(), k -> new ArrayList<>()).add(item);
                    }
                }

                //If this item is an IItemBlock, generate a block in the registry for it.
                //iterate over all items and get the blocks they spawn.
                //Not only does this prevent us from having to manually set the blocks
                //we also pre-generate the block classes here and note which tile entities they go to.
                if (item instanceof IItemBlock) {
                    IItemBlock itemBlock = (IItemBlock) item;
                    ABlockBase itemBlockBlock = itemBlock.getBlock();
                    if (!blocksRegistred.contains(itemBlockBlock)) {
                        //New block class detected.  Register it and its instance.
                        String name = itemBlock.getBlockClass() != null ? itemBlock.getBlockClass().getSimpleName().substring("Block".length()).toLowerCase(Locale.ROOT) : (item.getRegistrationName() + "_Block").toLowerCase(Locale.ROOT);
                        blocksRegistred.add(itemBlockBlock);
                        BuilderBlock.BLOCKS.register(name, () -> {
                            BuilderBlock wrapper;

                            if (itemBlockBlock instanceof ABlockBaseTileEntity) {
                                wrapper = new BuilderBlockTileEntity(itemBlockBlock);
                                if (ITileEntityFluidTankProvider.class.isAssignableFrom(((ABlockBaseTileEntity) itemBlockBlock).getTileEntityClass())) {
                                    fluidBlocks.add(wrapper);
                                } else if (ITileEntityInventoryProvider.class.isAssignableFrom(((ABlockBaseTileEntity) itemBlockBlock).getTileEntityClass())) {
                                    inventoryBlocks.add(wrapper);
                                } else if (ITileEntityEnergyCharger.class.isAssignableFrom(((ABlockBaseTileEntity) itemBlockBlock).getTileEntityClass())) {
                                    chargerBlocks.add(wrapper);
                                } else {
                                    normalBlocks.add(wrapper);
                                }
                            } else {
                                wrapper = new BuilderBlock(itemBlockBlock);
                            }
                            BuilderBlock.blockMap.put(itemBlockBlock, wrapper);

                            return wrapper;
                        });
                    }
                }
            }
        }

        //Create creative tabs, as required.
        creativeTabsRequired.forEach((tabID, tabItems) -> {
            CREATIVE_TABS.register(tabID, () -> {
                JSONPack packConfiguration = PackParser.getPackConfiguration(tabID);
                AItemPack<?> tabIconItem = packConfiguration.packItem != null ? PackParser.getItem(packConfiguration.packID, packConfiguration.packItem) : null;
                ItemStack tabIconStack = tabIconItem != null ? new ItemStack(BuilderItem.itemMap.get(tabIconItem)) : null;
                DisplayItemsGenerator validItemsGenerator = (pParameters, pOutput) -> tabItems.forEach(tabItem -> pOutput.accept(BuilderItem.itemMap.get(tabItem)));
                Supplier<ItemStack> iconSupplier = tabIconStack != null ? () -> tabIconStack : () -> new ItemStack(BuilderItem.itemMap.get(tabItems.get((int) (System.currentTimeMillis() / 1000 % tabItems.size()))));
                return CreativeModeTab.builder().title(Component.literal(packConfiguration.packName)).icon(iconSupplier).displayItems(validItemsGenerator).build();
            });
        });

        //Register the collision blocks.
        for (int i = 0; i < BlockCollision.blockInstances.size(); ++i) {
            BlockCollision collisionBlock = BlockCollision.blockInstances.get(i);
            String name = collisionBlock.getClass().getSimpleName().substring("Block".length()).toLowerCase(Locale.ROOT) + i;
            BuilderBlock.BLOCKS.register(name, () -> {
                BuilderBlock wrapper = new BuilderBlock(collisionBlock);
                BuilderBlock.blockMap.put(collisionBlock, wrapper);
                return wrapper;
            });
        }

        //If we are on the client, create models.
        if (isClient) {
            InterfaceEventsModelLoader.init();
        }

        //Init the language system for the created items and blocks.
        LanguageSystem.init(isClient);

        //Init tile entities.  These will run after blocks, so the tile entity lists will be populated by this time.
        BuilderTileEntity.TE_TYPE = BuilderTileEntity.TILE_ENTITIES.register("builder_base", () -> BlockEntityType.Builder.of(BuilderTileEntity::new, normalBlocks.toArray(new BuilderBlock[0])).build(null));
        BuilderTileEntityFluidTank.TE_TYPE2 = BuilderTileEntity.TILE_ENTITIES.register("builder_fluidtank", () -> BlockEntityType.Builder.of(BuilderTileEntityFluidTank::new, fluidBlocks.toArray(new BuilderBlock[0])).build(null));
        BuilderTileEntityInventoryContainer.TE_TYPE2 = BuilderTileEntity.TILE_ENTITIES.register("builder_inventory", () -> BlockEntityType.Builder.of(BuilderTileEntityInventoryContainer::new, inventoryBlocks.toArray(new BuilderBlock[0])).build(null));
        BuilderTileEntityEnergyCharger.TE_TYPE2 = BuilderTileEntity.TILE_ENTITIES.register("builder_charger", () -> BlockEntityType.Builder.of(BuilderTileEntityEnergyCharger::new, chargerBlocks.toArray(new BuilderBlock[0])).build(null));

        //Init entities.
        BuilderEntityExisting.E_TYPE2 = ABuilderEntityBase.ENTITIES.register("builder_existing", () -> EntityType.Builder.<BuilderEntityExisting>of(BuilderEntityExisting::new, MobCategory.MISC).sized(0.05F, 0.05F).clientTrackingRange(32 * 16).updateInterval(5).build("builder_existing"));
        BuilderEntityLinkedSeat.E_TYPE3 = ABuilderEntityBase.ENTITIES.register("builder_seat", () -> EntityType.Builder.<BuilderEntityLinkedSeat>of(BuilderEntityLinkedSeat::new, MobCategory.MISC).sized(0.05F, 0.05F).clientTrackingRange(32 * 16).updateInterval(5).build("builder_seat"));
        BuilderEntityRenderForwarder.E_TYPE4 = ABuilderEntityBase.ENTITIES.register("builder_rendering", () -> EntityType.Builder.<BuilderEntityRenderForwarder>of(BuilderEntityRenderForwarder::new, MobCategory.MISC).sized(0.05F, 0.05F).clientTrackingRange(32 * 16).updateInterval(5).build("builder_rendering"));

        //Iterate over all pack items and find those that spawn entities.
        //Register these with the IV internal system.
        for (AItemPack<?> packItem : PackParser.getAllPackItems()) {
            if (packItem instanceof IItemEntityProvider) {
                ((IItemEntityProvider) packItem).registerEntities(BuilderEntityExisting.entityMap);
            }
        }

        //Init networking interface.  This will register packets as well.
        InterfacePacket.init();

        if (isClient) {
            //Init keybinds if we're on the client.
            InterfaceManager.inputInterface.initConfigKey();

            //Save modified config.
            ConfigSystem.saveToDisk();
        }
    }

    public void onPostConstruction(FMLLoadCompleteEvent event) {
        if (FMLLoader.getDist() == Dist.CLIENT) {
            //Put all liquids into the config file for use by modpack makers.
            ConfigSystem.settings.fuel.lastLoadedFluids = InterfaceManager.clientInterface.getAllFluidNames();

            //Save modified config.
            ConfigSystem.saveToDisk();
        }
    }

    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
            Capabilities.FluidHandler.BLOCK,
            BuilderTileEntityFluidTank.TE_TYPE2.get(),
            (blockEntity, direction) -> direction == Direction.DOWN ? blockEntity : null
        );
        event.registerBlockEntity(
            Capabilities.ItemHandler.BLOCK,
            BuilderTileEntityInventoryContainer.TE_TYPE2.get(),
            (blockEntity, direction) -> (direction == Direction.UP || direction == Direction.DOWN) ? blockEntity : null
        );
        event.registerBlockEntity(
            Capabilities.EnergyStorage.BLOCK,
            BuilderTileEntityEnergyCharger.TE_TYPE2.get(),
            (blockEntity, direction) -> direction != null ? blockEntity : null
        );
    }

    private void onRegisterCommands(RegisterCommandsEvent event) {
        event.getDispatcher().register(
            Commands.literal("mtsgrantcaraccess")
                .requires(source -> source.hasPermission(2))
                .then(Commands.argument("vehicle_uuid", UuidArgument.uuid())
                    .executes(context -> grantCarAccess(context.getSource(), UuidArgument.getUuid(context, "vehicle_uuid"), context.getSource().getPlayerOrException()))
                    .then(Commands.argument("player", EntityArgument.player())
                        .executes(context -> grantCarAccess(context.getSource(), UuidArgument.getUuid(context, "vehicle_uuid"), EntityArgument.getPlayer(context, "player"))))));

        event.getDispatcher().register(
            Commands.literal("mtsstolencars")
                .requires(source -> source.hasPermission(2))
                .then(Commands.literal("addspawn")
                    .executes(context -> addStolenCarSpawnPoint(context.getSource())))
                .then(Commands.literal("clearspawns")
                    .executes(context -> clearStolenCarSpawnPoints(context.getSource())))
                .then(Commands.literal("setsale")
                    .executes(context -> setStolenCarSalePoint(context.getSource())))
                .then(Commands.literal("addshop")
                    .executes(context -> addAutobodyShop(context.getSource())))
                .then(Commands.literal("clearshops")
                    .executes(context -> clearAutobodyShops(context.getSource())))
                .then(Commands.literal("status")
                    .executes(context -> showStolenCarStatus(context.getSource()))));
    }

    private int grantCarAccess(CommandSourceStack source, java.util.UUID vehicleUUID, ServerPlayer targetPlayer) {
        WrapperWorld wrapperWorld = WrapperWorld.getWrapperFor(source.getLevel());
        AEntityA_Base entity = wrapperWorld.getEntity(vehicleUUID);
        if (!(entity instanceof EntityVehicleF_Physics)) {
            source.sendFailure(Component.literal("Vehicle not found for UUID: " + vehicleUUID));
            return 0;
        }

        EntityVehicleF_Physics vehicle = (EntityVehicleF_Physics) entity;
        boolean added = vehicle.grantDriverAccess(targetPlayer.getUUID());
        if (added) {
            source.sendSuccess(() -> Component.literal("Granted driver access to " + targetPlayer.getName().getString() + " for vehicle " + vehicle.uniqueUUID), true);
        } else {
            source.sendSuccess(() -> Component.literal(targetPlayer.getName().getString() + " already has access to vehicle " + vehicle.uniqueUUID), false);
        }
        return 1;
    }

    private int addStolenCarSpawnPoint(CommandSourceStack source) {
        WrapperWorld wrapperWorld = WrapperWorld.getWrapperFor(source.getLevel());
        Point3D point = getCommandPoint(source);
        StolenVehicleSystem.addSpawnPoint(wrapperWorld, point);
        source.sendSuccess(() -> Component.literal("Added stolen-car spawn point at " + formatPoint(point) + "."), true);
        return 1;
    }

    private int clearStolenCarSpawnPoints(CommandSourceStack source) {
        WrapperWorld wrapperWorld = WrapperWorld.getWrapperFor(source.getLevel());
        int clearedCount = StolenVehicleSystem.clearSpawnPoints(wrapperWorld);
        source.sendSuccess(() -> Component.literal("Cleared " + clearedCount + " stolen-car spawn points."), true);
        return 1;
    }

    private int setStolenCarSalePoint(CommandSourceStack source) {
        WrapperWorld wrapperWorld = WrapperWorld.getWrapperFor(source.getLevel());
        Point3D point = getCommandPoint(source);
        StolenVehicleSystem.setSalePoint(wrapperWorld, point);
        source.sendSuccess(() -> Component.literal("Set stolen-car sale point to " + formatPoint(point) + "."), true);
        return 1;
    }

    private int showStolenCarStatus(CommandSourceStack source) {
        WrapperWorld wrapperWorld = WrapperWorld.getWrapperFor(source.getLevel());
        boolean hasSalePoint = StolenVehicleSystem.hasSalePoint(wrapperWorld);
        int spawnPointCount = StolenVehicleSystem.getSpawnPointCount(wrapperWorld);
        int activeCount = StolenVehicleSystem.getActiveVehicleCount(wrapperWorld);
        int shopCount = StolenVehicleSystem.getAutobodyShopCount(wrapperWorld);
        source.sendSuccess(() -> Component.literal("Stolen cars status: salePoint=" + (hasSalePoint ? "set" : "not-set") + ", spawns=" + spawnPointCount + ", active=" + activeCount + ", autobodyShops=" + shopCount), false);
        return 1;
    }

    private int addAutobodyShop(CommandSourceStack source) {
        WrapperWorld wrapperWorld = WrapperWorld.getWrapperFor(source.getLevel());
        Point3D point = getCommandPoint(source);
        StolenVehicleSystem.addAutobodyShop(wrapperWorld, point);
        source.sendSuccess(() -> Component.literal("Added autobody shop at " + formatPoint(point) + "."), true);
        return 1;
    }

    private int clearAutobodyShops(CommandSourceStack source) {
        WrapperWorld wrapperWorld = WrapperWorld.getWrapperFor(source.getLevel());
        int clearedCount = StolenVehicleSystem.clearAutobodyShops(wrapperWorld);
        source.sendSuccess(() -> Component.literal("Cleared " + clearedCount + " autobody shop location(s)."), true);
        return 1;
    }

    private static Point3D getCommandPoint(CommandSourceStack source) {
        return new Point3D(Math.floor(source.getPosition().x), Math.floor(source.getPosition().y), Math.floor(source.getPosition().z));
    }

    private static String formatPoint(Point3D point) {
        return "(" + (int) point.x + ", " + (int) point.y + ", " + (int) point.z + ")";
    }
}
