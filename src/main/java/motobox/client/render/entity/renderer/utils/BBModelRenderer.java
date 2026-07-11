package motobox.client.render.entity.renderer.utils;

import com.mojang.datafixers.util.Pair;
import immersive_aircraft.resources.bbmodel.*;
import motobox.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.VehicleEntity;
import immersive_aircraft.resources.bbmodel.BBAnimator.Channel;
import immersive_aircraft.util.Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import net.minecraft.block.entity.BannerPattern;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.DyeColor;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class BBModelRenderer {
    public static final motobox.client.render.entity.renderer.utils.BBModelRenderer.VertexConsumerProvider DEFAULT_VERTEX_CONSUMER_PROVIDER = (source, container, face) -> {
        //return source.getBuffer(container.enableCulling() ? RenderLayer.getEntityCutout(face.texture.location) : RenderLayer.getEntityCutoutNoCull(face.texture.location));
        return source.getBuffer(RenderLayer.getEntityTranslucent(face.texture.location));

    };

    public BBModelRenderer() {
    }

    public static <T extends VehicleEntity> void renderModel(BBModel model, MatrixStack matrixStack, net.minecraft.client.render.VertexConsumerProvider vertexConsumerProvider, int light, float time, T entity, ModelPartRenderHandler<T> modelPartRenderer, float red, float green, float blue, float alpha, List<Integer> anims) {
        model.root.forEach((object) -> {
            renderObject(model, object, matrixStack, vertexConsumerProvider, light, time, entity, modelPartRenderer, red, green, blue, alpha, anims);
        });
    }

    public static <T extends VehicleEntity> void renderObject(BBModel model, BBObject object, MatrixStack matrixStack, net.minecraft.client.render.VertexConsumerProvider vertexConsumerProvider, int light, float time, T entity, ModelPartRenderHandler<T> modelPartRenderer, float red, float green, float blue, float alpha, List<Integer> anims) {
        matrixStack.push();
        matrixStack.translate(object.origin.x(), object.origin.y(), object.origin.z());
        if (!model.animations.isEmpty()) {
            if (!anims.isEmpty()) {
                for (int i = 0; i < anims.size(); i++) {
                    BBAnimation animation = (BBAnimation) model.animations.get(anims.get(i));
                    if (animation.hasAnimator(object.uuid) && animation.loop.equals("hold") && time >= animation.length) {
                        Vector3f rotation = ((BBAnimator)animation.animators.get(object.uuid)).sample(animation, Channel.ROTATION, animation.length);
                        rotation.mul(0.017453294F);
                        matrixStack.multiply(Utils.fromXYZ(rotation));
                        Vector3f position = ((BBAnimator)animation.animators.get(object.uuid)).sample(animation, Channel.POSITION, animation.length);
                        position.mul(0.0625F);
                        matrixStack.translate(position.x(), position.y(), position.z());
                        Vector3f scale = ((BBAnimator)animation.animators.get(object.uuid)).sample(animation, Channel.SCALE, animation.length);
                        matrixStack.scale(scale.x(), scale.y(), scale.z());
                    }
                    else if (animation.hasAnimator(object.uuid)) {
                        Vector3f position = animation.sample(object.uuid, Channel.POSITION, time);
                        position.mul(0.0625F);
                        matrixStack.translate(position.x(), position.y(), position.z());
                        Vector3f rotation = animation.sample(object.uuid, Channel.ROTATION, time);
                        rotation.mul(0.017453294F);
                        matrixStack.multiply(Utils.fromXYZ(rotation));
                        Vector3f scale = animation.sample(object.uuid, Channel.SCALE, time);
                        matrixStack.scale(scale.x(), scale.y(), scale.z());
                    }
                }
            }
        }

        matrixStack.multiply(Utils.fromXYZ(object.rotation));
        if (object instanceof BBBone bone) {
            if (modelPartRenderer != null) {
                modelPartRenderer.animate(bone.name, entity, matrixStack, time);
            }
        }

        if (object instanceof BBBone) {
            matrixStack.translate(-object.origin.x(), -object.origin.y(), -object.origin.z());
        }

        if (modelPartRenderer == null || !modelPartRenderer.render(object.name, model, object, vertexConsumerProvider, entity, matrixStack, light, time, modelPartRenderer)) {
            renderObjectInner(model, object, matrixStack, vertexConsumerProvider, light, time, entity, modelPartRenderer, red, green, blue, alpha, anims);
        }

        matrixStack.pop();
    }

    public static <T extends VehicleEntity> void renderObjectInner(BBModel model, BBObject object, MatrixStack matrixStack, net.minecraft.client.render.VertexConsumerProvider vertexConsumerProvider, int light, float time, T entity, ModelPartRenderHandler<T> modelPartRenderer, float red, float green, float blue, float alpha, List<Integer> anims) {
        if (object instanceof BBFaceContainer cube) {
            renderFaces(cube, matrixStack, vertexConsumerProvider, light, red, green, blue, alpha, modelPartRenderer == null ? DEFAULT_VERTEX_CONSUMER_PROVIDER : modelPartRenderer.getVertexConsumerProvider());
        } else if (object instanceof BBBone bone) {
            boolean shouldRender = bone.visibility;
            if (bone.name.equals("lod0")) {
                shouldRender = entity.isWithinParticleRange();
            } else if (bone.name.equals("lod1")) {
                shouldRender = !entity.isWithinParticleRange();
            }

            if (shouldRender) {
                bone.children.forEach((child) -> {
                    renderObject(model, child, matrixStack, vertexConsumerProvider, light, time, entity, modelPartRenderer, red, green, blue, alpha, anims);
                });
            }
        }

    }

    public static void renderFaces(BBFaceContainer cube, MatrixStack matrixStack, net.minecraft.client.render.VertexConsumerProvider source, int light, float red, float green, float blue, float alpha, motobox.client.render.entity.renderer.utils.BBModelRenderer.VertexConsumerProvider provider) {
        MatrixStack.Entry last = matrixStack.peek();
        Matrix4f positionMatrix = last.getPositionMatrix();
        Matrix3f normalMatrix = last.getNormalMatrix();
        Iterator var12 = cube.getFaces().iterator();

        while(var12.hasNext()) {
            BBFace face = (BBFace)var12.next();
            VertexConsumer vertexConsumer = provider.getBuffer(source, cube, face);

            for(int i = 0; i < 4; ++i) {
                BBFace.BBVertex v = face.vertices[i];
                vertexConsumer.vertex(positionMatrix, v.x, v.y, v.z);
                vertexConsumer.color(red, green, blue, alpha);
                vertexConsumer.texture(v.u, v.v);
                vertexConsumer.overlay(OverlayTexture.DEFAULT_UV);
                vertexConsumer.light(light);
                vertexConsumer.normal(normalMatrix, v.nx, v.ny, v.nz);
                vertexConsumer.next();
            }
        }

    }

    public static void renderBanner(BBFaceContainer cube, MatrixStack matrixStack, net.minecraft.client.render.VertexConsumerProvider vertexConsumers, int light, boolean isBanner, List<Pair<RegistryEntry<BannerPattern>, DyeColor>> patterns) {
        matrixStack.push();
        if (cube instanceof BBObject object) {
            matrixStack.translate(object.origin.x(), object.origin.y(), object.origin.z());
        }

        for(int i = 0; i < 17 && i < patterns.size(); ++i) {
            Pair<RegistryEntry<BannerPattern>, DyeColor> pair = (Pair)patterns.get(i);
            RegistryEntry<BannerPattern> bannerPattern = (RegistryEntry)pair.getFirst();
            bannerPattern.getKey().map((key) -> {
                return isBanner ? TexturedRenderLayers.getBannerPatternTextureId(key) : TexturedRenderLayers.getShieldPatternTextureId(key);
            }).ifPresent((material) -> {
                float[] fs = ((DyeColor)pair.getSecond()).getColorComponents();
                renderFaces(cube, matrixStack, vertexConsumers, light, fs[0], fs[1], fs[2], 1.0F, (source, container, face) -> {
                    return material.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline);
                });
            });
        }

        matrixStack.pop();
    }

    public static void renderSailObject(BBMesh cube, MatrixStack matrixStack, net.minecraft.client.render.VertexConsumerProvider vertexConsumerProvider, int light, float time, float red, float green, float blue, float alpha) {
        renderSailObject(cube, matrixStack, vertexConsumerProvider, light, time, red, green, blue, alpha, 0.025F, 0.0F);
    }

    public static void renderSailObject(BBMesh cube, MatrixStack matrixStack, net.minecraft.client.render.VertexConsumerProvider vertexConsumerProvider, int light, float time, float red, float green, float blue, float alpha, float distanceScale, float baseScale) {
        MatrixStack.Entry last = matrixStack.peek();
        Matrix4f positionMatrix = last.getPositionMatrix();
        Matrix3f normalMatrix = last.getNormalMatrix();
        Iterator var14 = cube.getFaces().iterator();

        while(var14.hasNext()) {
            BBFace face = (BBFace)var14.next();
            VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayer.getEntityCutoutNoCull(face.texture.location));

            for(int i = 0; i < 4; ++i) {
                BBFace.BBVertex v = face.vertices[i];
                float distance = Math.max(Math.max(Math.abs(v.x), Math.abs(v.y)), Math.abs(v.z));
                double angle = ((double)(v.x + v.z) + (double)v.y * 0.25) * 4.0 + (double)(time * 4.0F);
                double scale = (double)(distanceScale * distance + baseScale);
                float x = (float)((Math.cos(angle) + Math.cos(angle * 1.7)) * scale);
                float z = (float)((Math.sin(angle) + Math.sin(angle * 1.7)) * scale);
                vertexConsumer.vertex(positionMatrix, v.x + x, v.y, v.z + z).color(red, green, blue, alpha).texture(v.u, v.v).overlay(OverlayTexture.DEFAULT_UV).light(light).normal(normalMatrix, v.nx, v.ny, v.nz).next();
            }
        }

    }

    public interface VertexConsumerProvider {
        VertexConsumer getBuffer(net.minecraft.client.render.VertexConsumerProvider var1, BBFaceContainer var2, BBFace var3);
    }
}
