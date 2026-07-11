package motobox.vehicle.attachment.rear;

import motobox.entity.VehicleEntity;
import motobox.vehicle.attachment.RearAttachmentType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

public class Spoiler1 extends RearAttachment {
    public Spoiler1(RearAttachmentType<?> type, VehicleEntity entity) {
        super(type, entity);
    }

    @Override
    public boolean hasMenu() {
        return false;
    }

    @Override
    public @Nullable NamedScreenHandlerFactory createMenu(ScreenHandlerContext ctx) {
        return super.createMenu(ctx);
    }

    @Override
    public void setYaw(float yaw) {

        this.yaw = this.vehicle.getYaw();
    }
@Override
    protected final void updateTrackedAnimation(float animation) {
        this.vehicle.setTrackedRearAttachmentAnimation(animation);
    }
@Override
    public final void pull(Vec3d movement) {
        var vec = this.scaledYawVec().add(movement);
        this.setYaw(180 - (float) Math.toDegrees(Math.atan2(vec.x, vec.z)));
    }
@Override
    public void tick() {
        this.lastYaw = this.yaw();

        rotationTrackingTick();
    }
@Override
    public void rotationTrackingTick() {
        if (!world().isClient()) {
            this.yawLerpProgress = 0;
            updateTrackedYaw(yaw());
        } else if (yawLerpProgress > 0) {
            this.setYaw(this.yaw() + (MathHelper.wrapDegrees(this.trackedYaw - this.yaw()) / (float)this.yawLerpProgress));

            this.yawLerpProgress--;
        }
    }
@Override
    public void writeNbt(NbtCompound nbt) {
        nbt.putFloat("yaw", this.yaw());
    }
@Override
    public void readNbt(NbtCompound nbt) {
        this.setYaw(nbt.getFloat("yaw"));
    }
}
