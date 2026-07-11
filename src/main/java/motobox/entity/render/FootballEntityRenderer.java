package motobox.entity.render;

import motobox.entity.custom.FootballEntity;
import motobox.entity.model.FootballEntityModel;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class FootballEntityRenderer extends EntityRenderer<FootballEntity> {

    private static final Identifier TEXTURE = new Identifier("motobox", "textures/entity/football.png");
    private final FootballEntityModel model;

    public FootballEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new FootballEntityModel(context.getPart(FootballEntityModel.MODEL_LAYER));
    }

    @Override
    public void render(FootballEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();

        if (entity.isGrounded()) {
            // Grounded: lay flat on the ground, no spin
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getYaw()));
        } else {
            // In flight: orient along trajectory with spiral spin
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0f));
            matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch())));
            float age = entity.age + tickDelta;
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(age * 20.0f));
        }

        // Scale to a nice in-world size (~0.5 blocks long)
        float scale = 0.5f;
        matrices.scale(scale, scale, scale);

        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TEXTURE));
        this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(FootballEntity entity) {
        return TEXTURE;
    }
}
