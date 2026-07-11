package motobox.registry;

import motobox.MotoboxNeoForge;
import motobox.block.ElevatorDoorBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import motobox.block.entity.ElevatorDoorBlockEntity;

public final class ModBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MotoboxNeoForge.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MotoboxNeoForge.MOD_ID);

    // Cannot use ofFullCopy(Blocks.BARRIER) — BARRIER uses waterloggedMapColor which requires the
    // WATERLOGGED property to exist on the block state; a plain Block doesn't declare it, causing
    // an IllegalArgumentException during state initialisation in 1.21.1.
    public static final DeferredHolder<Block, Block> ALLOW = registerSimple("allow",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NONE)
                    .noCollission()
                    .noOcclusion()
                    .strength(-1.0f, 3600000.8f)
                    .noLootTable());
    public static final DeferredHolder<Block, Block> ASPHALT = registerSimple("asphalt", BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).strength(1.5f, 6.0f));
    public static final DeferredHolder<Block, Block> BLACKJACK = registerSimple("blackjack", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(0.5f, 2.0f));
    public static final DeferredHolder<Block, Block> BRASS_BLOCK = registerSimple("brass_block", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK));
    public static final DeferredHolder<Block, Block> BRASS_SLAB = register("brass_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredHolder<Block, Block> BRASS_WALL = register("brass_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredHolder<Block, Block> BRASS_STAIR = register("brass_stair", () -> new StairBlock(BRASS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    public static final DeferredHolder<Block, Block> COUCH_1 = registerSimple("couch_1", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(0.5f, 2.0f));
    public static final DeferredHolder<Block, Block> COUCH_1_FLIP = registerSimple("couch_1_flip", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(0.5f, 2.0f));
    public static final DeferredHolder<Block, Block> ELEVATOR_DOOR = register("elevator_door", () -> new ElevatorDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noCollission().noOcclusion()));
    public static final DeferredHolder<Block, Block> MECHANIC_TABLE = registerSimple("mechanic_table", BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).noOcclusion());
    // Cannot use ofFullCopy(Blocks.GLASS) for the same waterloggedMapColor reason.
    public static final DeferredHolder<Block, Block> MODERN_LAMP_1 = registerSimple("modern_lamp_1",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NONE)
                    .strength(0.5f, 2.0f)
                    .sound(net.minecraft.world.level.block.SoundType.GLASS)
                    .lightLevel(state -> 10)
                    .noOcclusion());
    public static final DeferredHolder<Block, Block> RACE_TROPHY = registerSimple("race_trophy",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NONE)
                    .strength(0.5f, 2.0f)
                    .sound(net.minecraft.world.level.block.SoundType.GLASS)
                    .noOcclusion());
    public static final DeferredHolder<Block, Block> ROADBLOCK = registerSimple("roadblock", BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).strength(2.0f, 6.0f));
    public static final DeferredHolder<Block, Block> ROULETTE_TABLE = registerSimple("roulette_table", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(0.5f, 2.0f));
    public static final DeferredHolder<Block, Block> ROULETTE_WHEEL = registerSimple("roulette_wheel", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(0.5f, 2.0f));
    public static final DeferredHolder<Block, Block> SLOT_MACHINE = registerSimple("slot_machine", BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).noOcclusion());
    public static final DeferredHolder<Block, Block> TABLE_1 = registerSimple("table_1", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(0.5f, 2.0f));
    public static final DeferredHolder<Block, Block> TRAFFIC_CONE = registerSimple("traffic_cone", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(0.5f, 2.0f));
    public static final DeferredHolder<Block, Block> VEHICLE_ASSEMBLER = registerSimple("vehicle_assembler", BlockBehaviour.Properties.ofFullCopy(Blocks.ANVIL));
    public static final DeferredHolder<Block, Block> WORK_LAPTOP = registerSimple("work_laptop", BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).noOcclusion());

        private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MotoboxNeoForge.MOD_ID);
        public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ElevatorDoorBlockEntity>> ELEVATOR_DOOR_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "elevator_door",
            () -> BlockEntityType.Builder.of(ElevatorDoorBlockEntity::new, ELEVATOR_DOOR.get()).build(null)
        );

    private ModBlocks() {
    }

    public static void register(IEventBus modBus) {
        BLOCKS.register(modBus);
        ITEMS.register(modBus);
        BLOCK_ENTITY_TYPES.register(modBus);
        modBus.addListener(ModBlocks::addToTabs);
    }

    private static DeferredHolder<Block, Block> registerSimple(String id, BlockBehaviour.Properties properties) {
        return register(id, () -> new Block(properties));
    }

    private static DeferredHolder<Block, Block> register(String id, java.util.function.Supplier<Block> supplier) {
        DeferredHolder<Block, Block> block = BLOCKS.register(id, supplier);
        ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static void addToTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS || event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            ITEMS.getEntries().forEach(item -> event.accept(item.get()));
        }
    }
}
