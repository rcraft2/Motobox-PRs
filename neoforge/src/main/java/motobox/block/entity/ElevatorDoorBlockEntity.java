package motobox.block.entity;

import motobox.block.ElevatorDoorBlock;
import motobox.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ElevatorDoorBlockEntity extends BlockEntity {
    private static final float STEP = 1.0f / 8.0f;

    private float openProgress;
    private float previousOpenProgress;

    public ElevatorDoorBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlocks.ELEVATOR_DOOR_BLOCK_ENTITY.get(), pos, blockState);
        this.openProgress = blockState.getValue(ElevatorDoorBlock.POWERED) ? 1.0f : 0.0f;
        this.previousOpenProgress = this.openProgress;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, ElevatorDoorBlockEntity blockEntity) {
        blockEntity.previousOpenProgress = blockEntity.openProgress;
        float target = state.getValue(ElevatorDoorBlock.POWERED) ? 1.0f : 0.0f;
        if (blockEntity.openProgress < target) {
            blockEntity.openProgress = Math.min(target, blockEntity.openProgress + STEP);
        } else if (blockEntity.openProgress > target) {
            blockEntity.openProgress = Math.max(target, blockEntity.openProgress - STEP);
        }
    }

    public float getOpenProgress(float partialTick) {
        return Mth.lerp(partialTick, this.previousOpenProgress, this.openProgress);
    }
}