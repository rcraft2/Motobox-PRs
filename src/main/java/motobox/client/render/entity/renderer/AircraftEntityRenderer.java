package motobox.client.render.entity.renderer;

import motobox.client.render.entity.renderer.InventoryVehicleRenderer;
import immersive_aircraft.client.render.entity.renderer.TrailRenderer;
import motobox.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.AircraftEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import org.joml.Vector3f;

import java.util.List;

public abstract class AircraftEntityRenderer<T extends AircraftEntity> extends InventoryVehicleRenderer<T> {
    public AircraftEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    protected abstract ModelPartRenderHandler<T> getModel(AircraftEntity var1);

    public void renderLocal(T entity, float yaw, float tickDelta, MatrixStack matrixStack, MatrixStack.Entry peek, VertexConsumerProvider vertexConsumerProvider, int light, List<Integer> anims) {
        Vector3f effect = entity.isOnGround() ? new Vector3f(0.0F, 0.0F, 0.0F) : entity.getWindEffect();
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(effect.z));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(effect.x));
        if (entity.isOnGround()) {
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(7));
        }
        super.renderLocal(entity, yaw, tickDelta, matrixStack, peek, vertexConsumerProvider, light, anims);
        entity.getTrails().forEach((t) -> {
            TrailRenderer.render(t, vertexConsumerProvider, peek);
        });
    }
}
