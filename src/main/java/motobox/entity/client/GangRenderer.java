package motobox.entity.client;

import motobox.Motobox;
import motobox.entity.custom.GangEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.util.Identifier;

public class GangRenderer extends BipedEntityRenderer<GangEntity, gang<GangEntity>> {
    private static final Identifier TEXTURE = Motobox.id("textures/entity/gang.png");
    public GangRenderer(EntityRendererFactory.Context context) {
        super(context, new gang<>(context.getPart(ModModelLayers.GANG)), 0.2f);
    }

    @Override
    public Identifier getTexture(GangEntity entity) {
        return TEXTURE;
    }
}
