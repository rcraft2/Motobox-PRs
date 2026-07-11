package motobox.block.entity.render;

import motobox.Motobox;
import motobox.block.entity.ElevatorDoorBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import org.joml.Quaternionf;

public class ElevatorDoorBlockEntityRenderer implements BlockEntityRenderer<ElevatorDoorBlockEntity> {
    private static final Identifier TEXTURE = new Identifier("minecraft", "textures/block/iron_block.png");

    private final ElevatorDoorModel model;

    public ElevatorDoorBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        this.model = new ElevatorDoorModel(ElevatorDoorModel.getTexturedModelData().createModel());
    }

    @Override
    public void render(ElevatorDoorBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        matrices.translate(0.5, 0.0, 0.5);
        matrices.multiply(new Quaternionf().rotateY((float) Math.toRadians(-entity.getCachedState().get(Properties.HORIZONTAL_FACING).asRotation())));
        matrices.translate(0.0, 0.0, -0.5);

        this.model.setOpenProgress(entity.getOpenProgress(tickDelta));
        this.model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TEXTURE)), light, overlay);
        matrices.pop();
    }
}