package motobox.client.render.entity.renderer;

import immersive_aircraft.client.ColorUtils;
import motobox.client.render.entity.renderer.VehicleEntityRenderer;
import motobox.client.render.entity.renderer.utils.BBModelRenderer;
import motobox.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.DyeableVehicleEntity;
import immersive_aircraft.resources.bbmodel.BBModel;
import immersive_aircraft.resources.bbmodel.BBObject;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

import java.util.ArrayList;

public abstract class DyeableVehicleEntityRenderer<T extends DyeableVehicleEntity> extends VehicleEntityRenderer<T> {
    public DyeableVehicleEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    public void renderUndyed(BBModel model, BBObject object, VertexConsumerProvider vertexConsumerProvider, T entity, MatrixStack matrixStack, int light, float time) {
        if (entity.getDyeColor() < 0) {
            BBModelRenderer.renderObjectInner(model, object, matrixStack, vertexConsumerProvider, light, time, entity, (ModelPartRenderHandler)null, 1.0F, 1.0F, 1.0F, 1.0F, new ArrayList<>());
        }

    }

    public void renderDyed(BBModel model, BBObject object, VertexConsumerProvider vertexConsumerProvider, T entity, MatrixStack matrixStack, int light, float time, boolean highlight, boolean hideWhenUndyed) {
        if (entity.getDyeColor() >= 0 || !hideWhenUndyed) {
            int color = highlight ? entity.getHighlightColor() : entity.getBodyColor();
            float[] rgb = ColorUtils.hexToDecimalRGB(color);
            BBModelRenderer.renderObjectInner(model, object, matrixStack, vertexConsumerProvider, light, time, entity, (ModelPartRenderHandler)null, rgb[0], rgb[1], rgb[2], 1.0F, new ArrayList<>());
        }
    }
}
