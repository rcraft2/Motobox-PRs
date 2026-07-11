package motobox.block.entity.render;

import motobox.block.entity.VehicleAssemblerBlockEntity;
import motobox.block.entity.WorkLaptopEntity;
import motobox.util.EntityRenderHelper;
import motobox.vehicle.render.VehicleRenderer;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.state.property.Properties;
import org.joml.Quaternionf;

public class Work_Laptop_Renderer implements BlockEntityRenderer<WorkLaptopEntity> {
    private EntityRendererFactory.Context context = null;

    public Work_Laptop_Renderer(BlockEntityRendererFactory.Context blockEntityCtx) {
        EntityRenderHelper.registerContextListener(this::setContext);

    }

    public void setContext(EntityRendererFactory.Context context) {
        this.context = context;
    }

    @Override
    public void render(WorkLaptopEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (this.context != null) {

            matrices.push();
            matrices.translate(0.5, 0, 0.5);
            matrices.multiply(new Quaternionf().rotateY((float) Math.toRadians(-entity.getCachedState().get(Properties.HORIZONTAL_FACING).asRotation())));
            matrices.translate(0, 0.372, 0.501);
            matrices.scale(0.008f, -0.008f, -0.008f);

            matrices.pop();
        }
    }
}
