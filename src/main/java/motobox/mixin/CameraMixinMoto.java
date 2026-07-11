package motobox.mixin;

import motobox.entity.VehicleEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

/*@Mixin(Camera.class)
public abstract class CameraMixinMoto {
    @Shadow protected abstract double clipToSpace(double desiredCameraDistance);

    @Shadow private Entity focusedEntity;

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;clipToSpace(D)D"), method = "update")
    public double motobox$changeThirdsPersonDistance(Camera instance, double desiredCameraDistance) {
        if (focusedEntity.getVehicle() instanceof VehicleEntity) {
            return clipToSpace(desiredCameraDistance * 2);
        }
        return clipToSpace(desiredCameraDistance);
    }
}*/
@Mixin(Camera.class)
public abstract class CameraMixinMoto {
    @Shadow protected abstract double clipToSpace(double desiredCameraDistance);

    @Shadow private Entity focusedEntity;

    @ModifyArg(
            method = "update",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;clipToSpace(D)D"),
            index = 0
    )
    public double motobox$changeThirdsPersonDistance(double desiredCameraDistance) {
        if (focusedEntity.getVehicle() instanceof VehicleEntity) {
            return desiredCameraDistance * 2;
        }
        return desiredCameraDistance;
    }
}


