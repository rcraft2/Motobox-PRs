package motobox.block.entity.render;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class ElevatorDoorModel {
    private final ModelPart root;
    private final ModelPart leftLeaf;
    private final ModelPart rightLeaf;

    public ElevatorDoorModel(ModelPart root) {
        this.root = root;
        this.leftLeaf = root.getChild("left_leaf");
        this.rightLeaf = root.getChild("right_leaf");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        root.addChild("left_frame", ModelPartBuilder.create().uv(0, 0).cuboid(-24.0F, 0.0F, -1.5F, 4.0F, 64.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("right_frame", ModelPartBuilder.create().uv(0, 0).cuboid(20.0F, 0.0F, -1.5F, 4.0F, 64.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("top_frame", ModelPartBuilder.create().uv(0, 0).cuboid(-24.0F, 60.0F, -1.5F, 48.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("bottom_frame", ModelPartBuilder.create().uv(0, 0).cuboid(-24.0F, 0.0F, -1.5F, 48.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        root.addChild("left_leaf", ModelPartBuilder.create().uv(0, 0).cuboid(-10.0F, 0.0F, -1.0F, 20.0F, 56.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-10.0F, 4.0F, 0.0F));
        root.addChild("right_leaf", ModelPartBuilder.create().uv(0, 0).cuboid(-10.0F, 0.0F, -1.0F, 20.0F, 56.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(10.0F, 4.0F, 0.0F));

        return TexturedModelData.of(modelData, 64, 64);
    }

    public void setOpenProgress(float progress) {
        float slide = MathHelper.lerp(progress, 0.0f, 20.0f);
        this.leftLeaf.pivotX = -10.0f - slide;
        this.rightLeaf.pivotX = 10.0f + slide;
    }

    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay) {
        this.root.render(matrices, vertexConsumer, light, overlay, 1.0f, 1.0f, 1.0f, 1.0f);
    }
}