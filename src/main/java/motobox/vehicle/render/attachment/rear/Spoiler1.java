package motobox.vehicle.render.attachment.rear;

import motobox.Motobox;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Quaternionf;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Spoiler1 extends RearAttachmentRenderModel {

    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("vehicle/rear_attachment/spoiler1"), "main");

    public Spoiler1(EntityRendererFactory.Context ctx) {
        super(RenderLayer::getEntityCutoutNoCull, ctx, MODEL_LAYER);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create().uv(28, 29).cuboid(-7.2066F, -23.4365F, -94.1621F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 13).cuboid(-7.2066F, -27.7494F, -95.6843F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(26, 8).cuboid(-7.2066F, -32.4471F, -103.4715F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-57.2066F, -31.4471F, -105.4715F, 63.0F, 1.0F, 7.0F, new Dilation(0.0F))
                .uv(13, 13).cuboid(-58.2066F, -33.4471F, -107.4715F, 1.0F, 5.0F, 11.0F, new Dilation(0.0F))
                .uv(3, 3).cuboid(-58.2066F, -32.4471F, -108.4715F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 8).cuboid(5.7934F, -33.4471F, -107.4715F, 1.0F, 5.0F, 11.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(5.7934F, -32.4471F, -108.4715F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(14, 29).cuboid(-45.2066F, -23.4365F, -94.1621F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 8).cuboid(-45.2066F, -27.7494F, -95.6843F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 24).cuboid(-45.2066F, -32.4471F, -103.4715F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData cube_r1 = main.addChild("cube_r1", ModelPartBuilder.create().uv(13, 8).cuboid(0.0F, -11.0F, 4.0F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F))
                .uv(17, 8).cuboid(38.0F, -11.0F, 4.0F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-45.2066F, -19.8397F, -97.3648F, 0.4363F, 0.0F, 0.0F));

        ModelPartData cube_r2 = main.addChild("cube_r2", ModelPartBuilder.create().uv(8, 34).cuboid(0.0F, -8.0F, 4.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 36).cuboid(38.0F, -8.0F, 4.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-45.2066F, -18.7494F, -90.6843F, 1.0036F, 0.0F, 0.0F));

        ModelPartData cube_r3 = main.addChild("cube_r3", ModelPartBuilder.create().uv(0, 34).cuboid(0.0F, -12.0F, 4.0F, 1.0F, 11.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 34).cuboid(38.0F, -12.0F, 4.0F, 1.0F, 11.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-45.2066F, -19.7494F, -91.6843F, 0.6109F, 0.0F, 0.0F));

        ModelPartData cube_r4 = main.addChild("cube_r4", ModelPartBuilder.create().uv(0, 24).cuboid(12.0F, -10.0F, 4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(26, 9).cuboid(-52.0F, -10.0F, 4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.2066F, -27.0329F, -118.7852F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r5 = main.addChild("cube_r5", ModelPartBuilder.create().uv(21, 8).cuboid(12.0F, -10.0F, 4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(26, 13).cuboid(-52.0F, -10.0F, 4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.2066F, -21.4263F, -105.3502F, 0.7854F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 256, 256);
    }

    @Override
    protected void prepare(MatrixStack matrices) {
        float angleInRadians = (float) Math.PI; // 180 degrees
        Quaternionf rotation = new Quaternionf();
        rotation.rotateY(angleInRadians);
        matrices.multiply(rotation);
        float scale = 0.7f;
        matrices.scale(scale,scale,scale);
        matrices.translate(2, -1.75, 6);
    }

}
