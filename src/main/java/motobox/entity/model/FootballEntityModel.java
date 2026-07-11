package motobox.entity.model;

import motobox.Motobox;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class FootballEntityModel {

    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(new Identifier(Motobox.MOD_ID, "football"), "main");

    private final ModelPart root;

    public FootballEntityModel(ModelPart root) {
        this.root = root.getChild("football");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        // Main body — elongated prism (10 x 5 x 5 pixels, centered)
        ModelPartData football = modelPartData.addChild("football", ModelPartBuilder.create()
                // Core body
                .uv(0, 0).cuboid(-5.0f, -2.5f, -2.5f, 10.0f, 5.0f, 5.0f, new Dilation(0.0f))
                // Tapered nose (front)
                .uv(0, 10).cuboid(5.0f, -1.5f, -1.5f, 3.0f, 3.0f, 3.0f, new Dilation(0.0f))
                // Tapered tail (back)
                .uv(12, 10).cuboid(-8.0f, -1.5f, -1.5f, 3.0f, 3.0f, 3.0f, new Dilation(0.0f))
                // Laces (thin strip on top)
                .uv(0, 16).cuboid(-3.0f, -2.8f, -0.5f, 6.0f, 0.5f, 1.0f, new Dilation(0.0f)),
                ModelTransform.NONE
        );

        return TexturedModelData.of(modelData, 64, 32);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay) {
        this.root.render(matrices, vertices, light, overlay);
    }
}
