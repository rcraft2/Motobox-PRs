package motobox.client.render.entity.renderer.utils;

import motobox.client.render.entity.renderer.utils.BBModelRenderer;
import motobox.client.render.entity.renderer.utils.ModelPartRenderer;
import immersive_aircraft.resources.bbmodel.BBModel;
import immersive_aircraft.resources.bbmodel.BBObject;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class ModelPartRenderHandler<T extends Entity> {
    private final Map<String, ModelPartRenderer<T>> objects = new HashMap();
    private motobox.client.render.entity.renderer.utils.BBModelRenderer.VertexConsumerProvider vertexConsumerProvider;

    public ModelPartRenderHandler() {
        this.vertexConsumerProvider = motobox.client.render.entity.renderer.utils.BBModelRenderer.DEFAULT_VERTEX_CONSUMER_PROVIDER;
    }

    public motobox.client.render.entity.renderer.utils.ModelPartRenderHandler<T> add(String id, ModelPartRenderer.AnimationConsumer<T> animationConsumer) {
        return this.add(id, animationConsumer, (ModelPartRenderer.RenderConsumer)null);
    }

    public motobox.client.render.entity.renderer.utils.ModelPartRenderHandler<T> add(String id, ModelPartRenderer.RenderConsumer<T> renderConsumer) {
        return this.add(id, (ModelPartRenderer.AnimationConsumer)null, renderConsumer);
    }

    public motobox.client.render.entity.renderer.utils.ModelPartRenderHandler<T> add(String id, ModelPartRenderer.AnimationConsumer<T> animationConsumer, ModelPartRenderer.RenderConsumer<T> renderConsumer) {
        ModelPartRenderer<T> o = new ModelPartRenderer(id, animationConsumer, renderConsumer);
        this.objects.put(o.id(), o);
        return this;
    }

    public Map<String, ModelPartRenderer<T>> getObjects() {
        return this.objects;
    }

    public void animate(String name, T entity, MatrixStack matrixStack, float time) {
        ModelPartRenderer<T> o = (ModelPartRenderer)this.objects.get(name);
        if (o != null && o.animationConsumer() != null) {
            o.animationConsumer().run(entity, 0.0F, time, matrixStack);
        }

    }

    public boolean render(String name, BBModel model, BBObject object, VertexConsumerProvider vertexConsumerProvider, T entity, MatrixStack matrixStack, int light, float time, motobox.client.render.entity.renderer.utils.ModelPartRenderHandler<T> modelPartRenderer) {
        ModelPartRenderer<T> o = (ModelPartRenderer)this.objects.get(name);
        if (o != null && o.renderConsumer() != null) {
            o.renderConsumer().run(model, object, vertexConsumerProvider, entity, matrixStack, light, time, modelPartRenderer);
            return true;
        } else {
            return false;
        }
    }

    public motobox.client.render.entity.renderer.utils.ModelPartRenderHandler<T> vertexConsumerProvider(motobox.client.render.entity.renderer.utils.BBModelRenderer.VertexConsumerProvider vertexConsumerProvider) {
        this.vertexConsumerProvider = vertexConsumerProvider;
        return this;
    }

    public BBModelRenderer.VertexConsumerProvider getVertexConsumerProvider() {
        return this.vertexConsumerProvider;
    }
}
