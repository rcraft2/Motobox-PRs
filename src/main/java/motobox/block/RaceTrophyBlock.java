package motobox.block;

import motobox.item.CourseElementItem;
import motobox.util.IEntityDataSaver;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class RaceTrophyBlock extends HorizontalFacingBlock {

    protected static final VoxelShape SHAPE = Block.createCuboidShape(7, 0, 7, 8, 8, 8);

    public RaceTrophyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (placer != null && !world.isClient) {
            ((IEntityDataSaver)placer).getPersistentData().putInt("trophy", ((IEntityDataSaver)placer).getPersistentData().getInt("trophy")-1);
        }

    }
}
