package motobox.client;

import motobox.client.render.entity.renderer.AircraftEntityRenderer;
import motobox.client.render.entity.renderer.utils.ModelPartRenderHandler;
import motobox.client.render.entity.renderer.utils.BBModelRenderer;
import immersive_aircraft.entity.AircraftEntity;
import immersive_aircraft.resources.bbmodel.BBBone;
import immersive_aircraft.resources.bbmodel.BBObject;
import motobox.Motobox;
import motobox.entity.planes.TexanPlaneEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Random;

//import static immersive_aircraft.client.render.entity.renderer.utils.BBModelRenderer.renderObject;

public class TexanPlaneEntityRenderer extends AircraftEntityRenderer<TexanPlaneEntity> {
    private static final Identifier ID = Motobox.id("texan_plane");


    private final Random random = new Random();

    private final ModelPartRenderHandler<TexanPlaneEntity> model = new ModelPartRenderHandler<TexanPlaneEntity>()
            .add("engine_block",
                    (entity, yaw, tickDelta, matrixStack) -> {
                        double p = entity.enginePower.getSmooth() / 32.0;
                        matrixStack.translate((random.nextDouble() - 0.5) * p, (random.nextDouble() - 0.5) * p, (random.nextDouble() - 0.5) * p);
                    })
            .add("belt",
                    (model, object, vertexConsumerProvider, entity, matrixStack, light, time, modelPartRenderer) -> {
                        if (object instanceof BBBone bone) {
                            int frame = (int) entity.engineRotation.getSmooth(time % 1.0f);
                            BBObject belt = bone.children.get(Math.floorMod(frame, bone.children.size()));
                            BBModelRenderer.renderObject(model, belt, matrixStack, vertexConsumerProvider, light, time, entity, null, 1.0f, 1.0f, 1.0f, 0.5f, entity.animations);
                        }
                    }
            )
            .add("dyed_body", (model, object, vertexConsumerProvider, entity, matrixStack, light, time, modelPartRenderer) ->
                    renderDyed(model, object, vertexConsumerProvider, entity, matrixStack, light, time, false, false));



    @Override
    protected Identifier getModelId() {
        return ID;
    }

    public TexanPlaneEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public void renderLocal(TexanPlaneEntity entity, float yaw, float tickDelta, MatrixStack matrixStack, MatrixStack.Entry peek, VertexConsumerProvider vertexConsumerProvider, int light, List<Integer> anims) {
        matrixStack.scale(0.75f,0.75f,0.75f);
        super.renderLocal(entity,yaw,tickDelta,matrixStack,peek,vertexConsumerProvider,light, entity.animations);
    }

    @Override
    public Identifier getTexture(TexanPlaneEntity entity) {
        return Motobox.id("textures/entity/texan_plane.png");
    }

    @Override
    protected ModelPartRenderHandler<TexanPlaneEntity> getModel(AircraftEntity entity) {
        return model;
    }

}