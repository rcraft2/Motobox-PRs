package motobox.block;

import motobox.block.entity.ElevatorDoorBlockEntity;
import motobox.item.GenericMotoboxItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ElevatorDoorBlock extends HorizontalFacingBlock implements BlockEntityProvider, GenericMotoboxItem {
    public static final BooleanProperty POWERED = Properties.POWERED;

    public ElevatorDoorBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(POWERED, false));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        super.neighborUpdate(state, world, pos, block, fromPos, notify);

        if (world.isClient) {
            return;
        }

        boolean powered = world.isReceivingRedstonePower(pos);
        if (powered != state.get(POWERED)) {
            world.setBlockState(pos, state.with(POWERED, powered), Block.NOTIFY_ALL);
        }

        if (world.getBlockEntity(pos) instanceof ElevatorDoorBlockEntity door) {
            door.setPowered(powered);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);

        if (!world.isClient && world.getBlockEntity(pos) instanceof ElevatorDoorBlockEntity door) {
            door.setPowered(world.isReceivingRedstonePower(pos));
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction playerLookDirection = ctx.getPlayerLookDirection();
        if (playerLookDirection != null && playerLookDirection.getAxis().isHorizontal()) {
            return super.getPlacementState(ctx).with(FACING, playerLookDirection.getOpposite());
        }

        return super.getPlacementState(ctx).with(FACING, Direction.NORTH);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(FACING, POWERED);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ElevatorDoorBlockEntity(pos, state);
    }
}