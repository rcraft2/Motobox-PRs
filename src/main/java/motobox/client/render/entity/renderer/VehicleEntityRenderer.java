package motobox.client.render.entity.renderer;

import motobox.client.render.entity.renderer.utils.BBModelRenderer;
import motobox.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.VehicleEntity;
import immersive_aircraft.resources.BBModelLoader;
import immersive_aircraft.resources.bbmodel.BBAnimationVariables;
import immersive_aircraft.resources.bbmodel.BBModel;
import immersive_aircraft.resources.bbmodel.BBObject;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public abstract class VehicleEntityRenderer<T extends VehicleEntity> extends EntityRenderer<T> {
    private static final Identifier TEXTURE = new Identifier("invalid");

    public VehicleEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    protected abstract ModelPartRenderHandler<T> getModel(T var1);

    protected abstract Identifier getModelId();

    public void render(T entity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light) {
        MatrixStack.Entry peek = matrixStack.peek();
        matrixStack.push();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-yaw));
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.getPitch(tickDelta)));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(entity.getRoll(tickDelta)));
        this.renderLocal(entity, yaw, tickDelta, matrixStack, peek, vertexConsumerProvider, light, new ArrayList<>());
        matrixStack.pop();
        super.render(entity, yaw, tickDelta, matrixStack, vertexConsumerProvider, light);
    }

    public void renderLocal(T entity, float yaw, float tickDelta, MatrixStack matrixStack, MatrixStack.Entry peek, VertexConsumerProvider vertexConsumerProvider, int light, List<Integer> anims) {
        float h = (float)entity.getDamageWobbleTicks() - tickDelta;
        float j = entity.getDamageWobbleStrength() - tickDelta;
        if (j < 0.0F) {
            j = 0.0F;
        }

        if (h > 0.0F) {
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(MathHelper.sin(h) * h * j / 10.0F * (float)entity.getDamageWobbleSide()));
        }

        float time = ((float)(entity.getWorld().getTime() % 24000L) + tickDelta) / 20.0F;
        BBAnimationVariables.set("time", time);
        entity.setAnimationVariables(tickDelta);
        BBModel bbModel = (BBModel)BBModelLoader.MODELS.get(this.getModelId());
        if (bbModel != null) {
            float health = entity.getHealth();
            float r = health * 0.6F + 0.4F;
            float g = health * 0.4F + 0.6F;
            float b = health * 0.4F + 0.6F;
            BBModelRenderer.renderModel(bbModel, matrixStack, vertexConsumerProvider, light, time, entity, this.getModel(entity), r, g, b, 1.0F, anims);
        }

    }

    public void renderOptionalObject(String name, BBModel model, VertexConsumerProvider vertexConsumerProvider, T entity, MatrixStack matrixStack, int light, float time) {
        this.renderOptionalObject(name, model, vertexConsumerProvider, entity, matrixStack, light, time, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    public void renderOptionalObject(String name, BBModel model, VertexConsumerProvider vertexConsumerProvider, T entity, MatrixStack matrixStack, int light, float time, float red, float green, float blue, float alpha) {
        BBObject object = (BBObject)model.objectsByName.get(name);
        if (object != null) {
            BBModelRenderer.renderObject(model, object, matrixStack, vertexConsumerProvider, light, time, entity, (ModelPartRenderHandler)null, red, green, blue, alpha, new ArrayList<>());
        }

    }

    public boolean shouldRender(T entity, Frustum frustum, double x, double y, double z) {
        if (!entity.shouldRender(x, y, z)) {
            return false;
        } else {
            Box box = entity.getVisibilityBoundingBox().expand(this.getCullingBoundingBoxInflation());
            return frustum.isVisible(box);
        }
    }

    protected double getCullingBoundingBoxInflation() {
        return 1.0;
    }

    public Identifier getTextureLocation(@NotNull T aircraft) {
        return TEXTURE;
    }

}
