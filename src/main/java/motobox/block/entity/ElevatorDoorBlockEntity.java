package motobox.block.entity;

import motobox.block.MotoboxBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class ElevatorDoorBlockEntity extends BlockEntity {
    private static final float ANIMATION_DURATION = 8.0f;

    private boolean targetOpen;
    private boolean powered;
    private long animationStartTick;
    private float animationStartProgress;

    public ElevatorDoorBlockEntity(BlockPos pos, BlockState state) {
        super(MotoboxBlocks.ELEVATOR_DOOR_BLOCK_ENTITY, pos, state);
    }

    public void setPowered(boolean powered) {
        var world = this.world;
        if (world == null) {
            this.powered = powered;
            this.targetOpen = powered;
            return;
        }

        if (this.powered == powered && this.targetOpen == powered) {
            return;
        }

        this.powered = powered;
        this.animationStartProgress = this.getOpenProgress(0.0f);
        this.animationStartTick = world.getTime();
        this.targetOpen = powered;
        this.markDirty();

        if (!world.isClient) {
            BlockState blockState = world.getBlockState(this.pos);
            world.updateListeners(this.pos, blockState, blockState, Block.NOTIFY_ALL);
        }
    }

    public float getOpenProgress(float tickDelta) {
        var world = this.world;
        if (world == null) {
            return this.targetOpen ? 1.0f : 0.0f;
        }

        float elapsed = (world.getTime() - this.animationStartTick) + tickDelta;
        float interpolation = MathHelper.clamp(elapsed / ANIMATION_DURATION, 0.0f, 1.0f);
        return MathHelper.clamp(MathHelper.lerp(interpolation, this.animationStartProgress, this.targetOpen ? 1.0f : 0.0f), 0.0f, 1.0f);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putBoolean("Powered", this.powered);
        nbt.putBoolean("TargetOpen", this.targetOpen);
        nbt.putLong("AnimationStartTick", this.animationStartTick);
        nbt.putFloat("AnimationStartProgress", this.animationStartProgress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.powered = nbt.getBoolean("Powered");
        this.targetOpen = nbt.getBoolean("TargetOpen");
        this.animationStartTick = nbt.getLong("AnimationStartTick");
        this.animationStartProgress = nbt.getFloat("AnimationStartProgress");
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        NbtCompound nbt = new NbtCompound();
        this.writeNbt(nbt);
        return nbt;
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }
}