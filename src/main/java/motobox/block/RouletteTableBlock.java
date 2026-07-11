
package motobox.block;

import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import motobox.screen.RouletteTableScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

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

public class RouletteTableBlock extends HorizontalFacingBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 10, 16);
    public RouletteTableBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(FACING, Direction.NORTH));
    }

    public static final Text UI_TITLE = Text.translatable("container.motobox.roulette_table");

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, net.minecraft.entity.player.PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient()) {
            return ActionResult.SUCCESS;
        }
        player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
        return ActionResult.CONSUME;
    }

    @Override
    public @Nullable NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, playerInventory, player) ->
                new RouletteTableScreenHandler(syncId, playerInventory), UI_TITLE);
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
}
