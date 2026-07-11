package motobox.client.render.entity.renderer.utils;

import motobox.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.resources.bbmodel.BBModel;
import immersive_aircraft.resources.bbmodel.BBObject;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public record ModelPartRenderer<T extends Entity>(String id, motobox.client.render.entity.renderer.utils.ModelPartRenderer.AnimationConsumer<T> animationConsumer, motobox.client.render.entity.renderer.utils.ModelPartRenderer.RenderConsumer<T> renderConsumer) {
    public ModelPartRenderer(String id, motobox.client.render.entity.renderer.utils.ModelPartRenderer.AnimationConsumer<T> animationConsumer, motobox.client.render.entity.renderer.utils.ModelPartRenderer.RenderConsumer<T> renderConsumer) {
        this.id = id;
        this.animationConsumer = animationConsumer;
        this.renderConsumer = renderConsumer;
    }

    public String id() {
        return this.id;
    }

    public motobox.client.render.entity.renderer.utils.ModelPartRenderer.AnimationConsumer<T> animationConsumer() {
        return this.animationConsumer;
    }

    public motobox.client.render.entity.renderer.utils.ModelPartRenderer.RenderConsumer<T> renderConsumer() {
        return this.renderConsumer;
    }

    public interface AnimationConsumer<T> {
        void run(T var1, float var2, float var3, MatrixStack var4);
    }

    public interface RenderConsumer<T extends Entity> {
        void run(BBModel var1, BBObject var2, VertexConsumerProvider var3, T var4, MatrixStack var5, int var6, float var7, ModelPartRenderHandler<T> var8);
    }
}
