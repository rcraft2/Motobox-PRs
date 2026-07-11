package motobox.block.entity;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WorkLaptop extends HorizontalFacingBlock implements BlockEntityProvider {

    boolean isJobAssigned = true;
    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,12,16);

    public static final BooleanProperty POWERED = Properties.POWERED;
    public WorkLaptop(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(POWERED, false));
    }

    private static final VoxelShape BASE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(5, 4, 5, 11, 12, 11));

    private static final VoxelShape NORTH_SOUTH = VoxelShapes.union(BASE,
            Block.createCuboidShape(0, 8, 6, 16, 12, 10));
    private static final VoxelShape EAST_WEST = VoxelShapes.union(BASE,
            Block.createCuboidShape(6, 8, 0, 10, 12, 16));

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new WorkLaptopEntity(pos,state);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> EAST_WEST;
            default -> NORTH_SOUTH;
        };
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction playerLookDirection = ctx.getPlayerLookDirection().getOpposite();

        // Ensure the direction is horizontal
        if (playerLookDirection.getAxis().isHorizontal()) {
            return super.getPlacementState(ctx).with(FACING, playerLookDirection);
        } else {
            // Default to a horizontal direction, e.g., NORTH
            return super.getPlacementState(ctx).with(FACING, Direction.NORTH);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(FACING, POWERED);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = ((WorkLaptopEntity) world.getBlockEntity(pos));
            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!isJobAssigned) {
            super.onBreak(world, pos, state, player);
        }
    }

}
