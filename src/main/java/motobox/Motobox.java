package motobox;

import immersive_aircraft.cobalt.registration.Registration;
import motobox.block.MotoboxBlocks;
import motobox.block.RaceTrophyBlock;
import motobox.block.entity.WorkLaptop;
import motobox.block.entity.WorkLaptopEntity;
import motobox.entity.MotoboxEntities;
import motobox.entity.custom.GangEntity;
import motobox.event.PlayerJoinHandler;
import motobox.networking.ModMessages;
import motobox.particle.MotoboxParticles;
import motobox.persistent.CustomEntityState;
import motobox.persistent.CustomEntityStateManager;
import motobox.recipe.MechanicTableRecipe;
import motobox.recipe.MechanicTableRecipeSerializer;
import motobox.resource.MotoboxData;
import motobox.screen.MechanicTableScreenHandler;
import motobox.screen.RouletteTableScreenHandler;
import motobox.screen.BlackjackScreenHandler;
import motobox.screen.SingleSlotScreenHandler;
import motobox.screen.WorkLaptopScreenHandler;
import motobox.screen.SlotMachineScreenHandler;
import motobox.sound.MotoboxSounds;
import motobox.util.AUtils;
import motobox.util.IEntityDataSaver;
import motobox.util.midnightcontrols.ControllerUtils;
import motobox.util.network.PayloadPackets;
import motobox.item.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.block.Block;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.BlockEvent;
import net.minecraft.server.world.ChunkTicketType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;

import java.util.Random;
import java.util.function.Supplier;
import motobox.util.DailyObjectives;

// TODO fix player not rotating when vehicle rotating
public class Motobox implements ModInitializer {
    private static final int TICKS_PER_MINUTE = 1200;
    private static int spawnTimer = 0;
    public static final String MOD_ID = "motobox";

    public static final ItemGroup GROUP = FabricItemGroup.builder().icon(AUtils::createGroupIcon).entries((enabledFeatures, entries) -> {
        for (Item item : Registries.ITEM) {
            if (item instanceof GenericMotoboxItem) {
                entries.add(item);
            }
            if (item instanceof BlockItem blockItem && blockItem.getBlock() instanceof GenericMotoboxItem) {
                entries.add(item);
            }
            if (item instanceof VehicleComponentItem<?> vehicleComponentItem) {
                vehicleComponentItem.appendStacks(entries);
            }
        }
    }).displayName(Text.translatable("itemGroup.motobox.motobox")).build();
    public static final ItemGroup COURSE_ELEMENTS = FabricItemGroup.builder().icon(AUtils::createCourseElementsIcon).entries((enabledFeatures, entries) -> {
        for (Item item : Registries.ITEM) {
            if (item instanceof CourseElementItem) {
                entries.add(item);
            }
            if (item instanceof BlockItem blockItem) {
                if (blockItem.getBlock() instanceof CourseElementItem) {
                    entries.add(item);
                }
            }
        }
    }).displayName(Text.translatable("itemGroup.motobox.motobox_course_elements")).build();
    public static final ItemGroup PREFABS = FabricItemGroup.builder().icon(AUtils::createPrefabsIcon).entries((enabledFeatures, entries) -> {
        for (var prefab : VehicleItem.PREFABS) {
            entries.add(prefab.toStack());
        }
    }).displayName(Text.translatable("itemGroup.motobox.motobox_prefabs")).build();

    public static final TagKey<Block> SLOPES = TagKey.of(Registries.BLOCK.getKey(), id("slopes"));
    public static final TagKey<Block> STEEP_SLOPES = TagKey.of(Registries.BLOCK.getKey(), id("steep_slopes"));
    public static final TagKey<Block> NON_STEEP_SLOPES = TagKey.of(Registries.BLOCK.getKey(), id("non_steep_slopes"));
    public static final TagKey<Block> STICKY_SLOPES = TagKey.of(Registries.BLOCK.getKey(), id("sticky_slopes"));

        public static final ScreenHandlerType<MechanicTableScreenHandler> MECHANIC_SCREEN =
            Registry.register(Registries.SCREEN_HANDLER, Motobox.id("mechanic_table"), new ScreenHandlerType<>(MechanicTableScreenHandler::new, FeatureSet.empty()));

        public static final ScreenHandlerType<RouletteTableScreenHandler> ROULETTE_TABLE_SCREEN =
            Registry.register(Registries.SCREEN_HANDLER, Motobox.id("roulette_table"), new ScreenHandlerType<>(RouletteTableScreenHandler::new, FeatureSet.empty()));
    public static final ScreenHandlerType<WorkLaptopScreenHandler> LAPTOP_SCREEN =
            Registry.register(Registries.SCREEN_HANDLER, Motobox.id("work_laptop"), new ExtendedScreenHandlerType<>(WorkLaptopScreenHandler::new));
    public static final ScreenHandlerType<SlotMachineScreenHandler> SLOT_SCREEN =
            Registry.register(Registries.SCREEN_HANDLER, Motobox.id("slot_machine"), new ExtendedScreenHandlerType<>(SlotMachineScreenHandler::new));
    public static final ScreenHandlerType<SingleSlotScreenHandler> SINGLE_SLOT_SCREEN =
            Registry.register(Registries.SCREEN_HANDLER, Motobox.id("single_slot"), new ScreenHandlerType<>(SingleSlotScreenHandler::new, FeatureSet.empty()));
        public static final ScreenHandlerType<BlackjackScreenHandler> BLACKJACK_SCREEN =
            Registry.register(Registries.SCREEN_HANDLER, Motobox.id("blackjack"), new ScreenHandlerType<>(BlackjackScreenHandler::new, FeatureSet.empty()));
    private static MinecraftServer server;

    public static MinecraftServer server() {
        return server;
    }

    @Override
    public void onInitialize() {
        MotoboxBlocks.init();
        MotoboxItems.init();
        MotoboxEntities.init();
        MotoboxParticles.init();
        MotoboxSounds.init();
        initOther();
        ModMessages.registerC2SPackets();

        PayloadPackets.init();
        MotoboxData.setup();
        ControllerUtils.initMidnightControlsHandler();
        PlayerJoinHandler.register();

        // Register Item Group
        Registry.register(Registries.ITEM_GROUP, Motobox.id("motobox"), GROUP);
        Registry.register(Registries.ITEM_GROUP, Motobox.id("course_elements"), COURSE_ELEMENTS);
        Registry.register(Registries.ITEM_GROUP, Motobox.id("prefabs"), PREFABS);

        FabricDefaultAttributeRegistry.register(MotoboxEntities.GANG_MEMBER, GangEntity.createGangAttributes());

        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {
            if (entity instanceof ServerPlayerEntity player && killedEntity instanceof GangEntity) {
                DailyObjectives.onGangMemberKill(player);
            }
        });

        ServerLifecycleEvents.SERVER_STARTING.register(server -> Motobox.server = server);

        ServerLifecycleEvents.SERVER_STOPPED.register(server -> Motobox.server = null);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register((entries) -> {
            entries.add(MotoboxBlocks.ALLOW);
        });
        ServerPlayerEvents.AFTER_RESPAWN.register((oldPlayer, newPlayer, alive) -> {
            // Cast both the old and new players to IEntityDataSaver to access persistent data
            IEntityDataSaver oldDataSaver = (IEntityDataSaver) oldPlayer;
            IEntityDataSaver newDataSaver = (IEntityDataSaver) newPlayer;

            // Get the old player's persistent data
            NbtCompound oldData = oldDataSaver.getPersistentData();

            // Transfer the "money" data from the old player to the new player
            if (oldData.contains("money")) {
                double money = oldData.getDouble("money");
                newDataSaver.getPersistentData().putDouble("money", money);
                PacketByteBuf buf = PacketByteBufs.create();
                buf.writeDouble(newDataSaver.getPersistentData().getDouble("money"));
                ServerPlayNetworking.send(newPlayer, ModMessages.MONEY_SYNC_ID, buf);
            }
            if (oldData.contains("ownedcars")) {
                newDataSaver.getPersistentData().put("ownedcars", oldData.getList("ownedcars", 8));
            }
            if (oldData.contains("timeJoined")) {
                newDataSaver.getPersistentData().putLong("timeJoined", oldData.getLong("timeJoined"));
            }
            if (oldData.contains("daily_objectives_day")) {
                newDataSaver.getPersistentData().putString("daily_objectives_day", oldData.getString("daily_objectives_day"));
            }
            if (oldData.contains("daily_objectives_gang_kills")) {
                newDataSaver.getPersistentData().putInt("daily_objectives_gang_kills", oldData.getInt("daily_objectives_gang_kills"));
            }
            if (oldData.contains("daily_objectives_blackjack_win")) {
                newDataSaver.getPersistentData().putBoolean("daily_objectives_blackjack_win", oldData.getBoolean("daily_objectives_blackjack_win"));
            }
            if (oldData.contains("daily_objectives_slot_win")) {
                newDataSaver.getPersistentData().putBoolean("daily_objectives_slot_win", oldData.getBoolean("daily_objectives_slot_win"));
            }
            if (oldData.contains("daily_objectives_reward_claimed")) {
                newDataSaver.getPersistentData().putBoolean("daily_objectives_reward_claimed", oldData.getBoolean("daily_objectives_reward_claimed"));
            }
        });
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            if (state.getBlock() instanceof WorkLaptop) { // Replace SlotMachine with your block class
                if (blockEntity instanceof WorkLaptopEntity) {
                    if (((WorkLaptopEntity) blockEntity).isBusiness) {
// Prevent the block from being broken
                        blockEntity.cancelRemoval();
                        return false; // Returning false cancels the break event
                    }
                }
            }
            if (state.getBlock() instanceof RaceTrophyBlock) {
                int num = ((IEntityDataSaver)player).getPersistentData().getInt("trophy") + 1;
                ((IEntityDataSaver)player).getPersistentData().putInt("trophy", num);
            }
            return true; // Allow the block to break
        });

        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            // Check if the player is trying to place a block in the world
            if (world.isClient) {
                return ActionResult.PASS;
            }

            // Only limit placement of a specific block, e.g., DIAMOND_BLOCK
            if (player.getStackInHand(hand).getItem() == MotoboxBlocks.WORK_LAPTOP.asItem()) {
                if (!player.getName().equals(Text.literal("rjcraft14"))) {
                    return ActionResult.FAIL;
                }
            }
            if (player.getStackInHand(hand).getItem() == MotoboxBlocks.RACE_TROPHY.asItem()) {
                int num = ((IEntityDataSaver)player).getPersistentData().getInt("trophy");
                if (num >= 1) {
                    return ActionResult.PASS;
                } else {
                    return ActionResult.FAIL;
                }
            }

            return ActionResult.PASS;
        });




        ServerTickEvents.START_SERVER_TICK.register((MinecraftServer server) -> {
            spawnTimer++;

            // Spawn every 15 minutes (15 * 1200 ticks = 18000 ticks)
            if (spawnTimer >= 15 * TICKS_PER_MINUTE) {
                spawnMyEntities(server);
                spawnTimer = 0;  // Reset timer
            }
        });
    }

    public static void initOther() {
        Registry.register(Registries.RECIPE_TYPE, MechanicTableRecipe.ID, MechanicTableRecipe.TYPE);
        Registry.register(Registries.RECIPE_SERIALIZER, MechanicTableRecipe.ID, MechanicTableRecipeSerializer.INSTANCE);
    }

    private static void spawnMyEntities(MinecraftServer server) {
        server.execute(() -> {
            ServerWorld world = server.getWorld(World.OVERWORLD);
            int[] xcoord = new int[] {741,621,-433};
            int[] ycoord = new int[] {82,121,70};
            int[] zcoord = new int[] {-1632,-1576,-1741};
            int temp = new Random().nextInt(3);
            ChunkPos chunkPos = new ChunkPos(new BlockPos(xcoord[temp], ycoord[temp], zcoord[temp]));
            if (world != null && CustomEntityStateManager.getEntityCount(server.getOverworld()) < 9) {
                world.getChunkManager().addTicket(ChunkTicketType.FORCED, chunkPos, 1, chunkPos);
                for (int i = 0; i < 3; i++) {
                    GangEntity myEntity = new GangEntity(MotoboxEntities.GANG_MEMBER, world);
                    myEntity.setPosition(xcoord[temp], ycoord[temp], zcoord[temp]);  // Set desired spawn location
                    myEntity.setPersistent();
                    myEntity.initialize(world, world.getLocalDifficulty(myEntity.getBlockPos()), SpawnReason.EVENT, null, null);
                    world.spawnEntity(myEntity);
                    CustomEntityStateManager.incrementEntityCount(server.getOverworld());
                }
            }
        });
    }


    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
