package motobox.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class RouletteWheelBlock extends HorizontalFacingBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 8, 16);
    public RouletteWheelBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(FACING, Direction.NORTH));
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    // Prevent see-through effect under the block (like WallBlock)
    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        // Return a full block shape for culling, so faces under are not rendered
        return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        // Like WallBlock: not full brightness under the block
        return 0.2F;
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState adjacentState, Direction direction) {
        if (direction == Direction.DOWN && !adjacentState.isOf(this)) {
            return false; // Always render the bottom face unless the block below is the same
        }
        return super.isSideInvisible(state, adjacentState, direction);
    }
}
