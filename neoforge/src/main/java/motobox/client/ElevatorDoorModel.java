package motobox.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;

public class ElevatorDoorModel {
    private final ModelPart root;
    private final ModelPart leftLeaf;
    private final ModelPart rightLeaf;

    public ElevatorDoorModel(ModelPart root) {
        this.root = root;
        this.leftLeaf = root.getChild("left_leaf");
        this.rightLeaf = root.getChild("right_leaf");
    }

    public static LayerDefinition createLayerDefinition() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        root.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, 0.0F, -1.5F, 4.0F, 64.0F, 3.0F), PartPose.ZERO);
        root.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(0, 0).addBox(20.0F, 0.0F, -1.5F, 4.0F, 64.0F, 3.0F), PartPose.ZERO);
        root.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, 60.0F, -1.5F, 48.0F, 4.0F, 3.0F), PartPose.ZERO);
        root.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, 0.0F, -1.5F, 48.0F, 4.0F, 3.0F), PartPose.ZERO);
        root.addOrReplaceChild("left_leaf", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, -1.0F, 20.0F, 56.0F, 2.0F), PartPose.offset(-10.0F, 4.0F, 0.0F));
        root.addOrReplaceChild("right_leaf", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, -1.0F, 20.0F, 56.0F, 2.0F), PartPose.offset(10.0F, 4.0F, 0.0F));

        return LayerDefinition.create(mesh, 64, 64);
    }

    public void setOpenProgress(float progress) {
        float slide = Mth.lerp(progress, 0.0f, 20.0f);
        this.leftLeaf.x = -10.0f - slide;
        this.rightLeaf.x = 10.0f + slide;
    }

    public void render(PoseStack poseStack, VertexConsumer vertexConsumer, int light, int overlay) {
        this.root.render(poseStack, vertexConsumer, light, overlay);
    }
}