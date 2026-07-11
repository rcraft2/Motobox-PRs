package motobox.vehicle.render.frame;// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import motobox.Motobox;
import motobox.entity.VehicleEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.math.Direction;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class Veloce_M3_vrd extends EntityModel<VehicleEntity> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("frame_veloce_m3_vrd"), "main");
    private final ModelPart group;
    public Veloce_M3_vrd(EntityRendererFactory.Context root) {
        super(RenderLayer::getEntityTranslucent);
        this.group = root.getPart(MODEL_LAYER).getChild("group");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData group = modelPartData.addChild("group", ModelPartBuilder.create().uv(165, 0).cuboid(-10.9621F, -24.9404F, -1.4531F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(142, 69).cuboid(-26.03F, -15.9003F, 20.3706F, 18.0F, 7.0F, 12.0F, new Dilation(0.0F))
                .uv(274, 113).cuboid(-38.03F, -15.9003F, 28.3706F, 12.0F, 7.0F, 4.0F, new Dilation(0.0F))
                .uv(274, 140).cuboid(-38.03F, -15.9003F, 20.3706F, 12.0F, 7.0F, 4.0F, new Dilation(0.0F))
                .uv(63, 192).cuboid(-38.03F, -11.9003F, 24.3706F, 12.0F, 3.0F, 4.0F, new Dilation(0.0F))
                .uv(213, 232).cuboid(-33.03F, -15.9003F, 24.3706F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F))
                .uv(156, 146).cuboid(-10.9621F, -24.9404F, 50.5469F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(94, 255).cuboid(-45.03F, -15.9003F, 20.3706F, 7.0F, 7.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r1 = group.addChild("cube_r1", ModelPartBuilder.create().uv(9, 0).cuboid(-44.27F, 0.0F, -6.5706F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.97F, -41.9003F, 34.3706F, 0.0F, 0.0F, -0.5236F));

        ModelPartData cube_r2 = group.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-44.0F, -2.0F, -6.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.97F, -38.9003F, 34.3706F, 0.0F, 0.0F, -0.5236F));

        ModelPartData cube_r3 = group.addChild("cube_r3", ModelPartBuilder.create().uv(166, 96).cuboid(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-9.9621F, -20.9404F, 53.5469F, 0.0F, -0.5236F, 0.0F));

        ModelPartData cube_r4 = group.addChild("cube_r4", ModelPartBuilder.create().uv(0, 229).cuboid(-2.0F, -5.0F, -4.0F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-9.9621F, -20.9404F, -2.4531F, 0.0F, 0.5236F, 0.0F));

        ModelPartData side = group.addChild("side", ModelPartBuilder.create().uv(30, 121).cuboid(44.7127F, -6.0938F, -26.8313F, 2.0F, 12.0F, 5.0F, new Dilation(0.0F))
                .uv(111, 123).cuboid(23.7127F, -6.0938F, -26.8313F, 2.0F, 8.0F, 5.0F, new Dilation(0.0F))
                .uv(174, 146).cuboid(40.7127F, -6.0938F, -26.8313F, 4.0F, 7.0F, 5.0F, new Dilation(0.0F))
                .uv(139, 285).cuboid(25.7127F, -6.0938F, -26.8313F, 3.0F, 7.0F, 5.0F, new Dilation(0.0F))
                .uv(248, 54).cuboid(28.7127F, -6.0938F, -26.8313F, 12.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(16, 41).cuboid(57.5673F, -3.6703F, -26.0379F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-101.0867F, -16.3015F, 25.7066F));

        ModelPartData cube_r5 = side.addChild("cube_r5", ModelPartBuilder.create().uv(22, 0).cuboid(-21.0F, -16.0F, -1.0F, 9.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 62).cuboid(-56.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 96).cuboid(-56.0F, -16.0F, -0.5191F, 1.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 62).cuboid(-56.0F, -16.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(91, 96).cuboid(-22.0F, -16.0F, -0.5191F, 1.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(28, 62).cuboid(-22.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 62).cuboid(-22.0F, -16.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(80, 237).cuboid(-55.0F, -16.0F, -1.0F, 33.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(190, 209).cuboid(-12.0F, -14.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F))
                .uv(191, 34).cuboid(-8.0F, -14.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(238, 272).cuboid(-10.0F, -14.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F))
                .uv(38, 47).cuboid(8.0F, -13.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(95, 192).cuboid(-6.0F, -14.0F, -1.0F, 14.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(79, 274).cuboid(10.0F, -15.0F, -1.0F, 15.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(109.5673F, 9.7506F, -22.9175F, 0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r6 = side.addChild("cube_r6", ModelPartBuilder.create().uv(171, 277).cuboid(-1.0F, -21.0F, -1.0F, 4.0F, 23.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(90.4722F, -5.4251F, -24.3761F, -0.0984F, -0.1329F, -0.602F));

        ModelPartData cube_r7 = side.addChild("cube_r7", ModelPartBuilder.create().uv(268, 272).cuboid(-1.0F, -23.0F, -1.0F, 4.0F, 25.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(19.7084F, -5.6384F, -25.5668F, -0.1566F, 0.0531F, 0.6527F));

        ModelPartData cube_r8 = side.addChild("cube_r8", ModelPartBuilder.create().uv(142, 47).cuboid(-1.0F, -17.0F, -1.0F, 4.0F, 17.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(54.5673F, -6.1034F, -23.6182F, -0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r9 = side.addChild("cube_r9", ModelPartBuilder.create().uv(187, 23).cuboid(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(48.6415F, 13.3297F, -25.027F, -0.4363F, -0.6545F, 0.0F));

        ModelPartData cube_r10 = side.addChild("cube_r10", ModelPartBuilder.create().uv(274, 124).cuboid(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(97.3827F, 13.3297F, -25.6357F, -0.4363F, 0.6545F, 0.0F));

        ModelPartData cube_r11 = side.addChild("cube_r11", ModelPartBuilder.create().uv(202, 8).cuboid(-37.0F, -4.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(159.5673F, 10.7506F, -22.9175F, 0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r12 = side.addChild("cube_r12", ModelPartBuilder.create().uv(223, 188).cuboid(-37.0F, -1.0F, -1.0F, 12.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(159.5673F, 13.7506F, -22.9175F, 0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r13 = side.addChild("cube_r13", ModelPartBuilder.create().uv(201, 197).cuboid(-4.0F, -16.0F, -1.0F, 8.0F, 16.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(50.1078F, 9.8275F, -24.0053F, 0.044F, -0.3051F, -0.0057F));

        ModelPartData cube_r14 = side.addChild("cube_r14", ModelPartBuilder.create().uv(166, 128).cuboid(-52.0F, -4.0F, -1.0F, 50.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(99.5673F, 13.3297F, -26.0379F, -0.7854F, 0.0F, 0.0F));

        ModelPartData fender2 = side.addChild("fender2", ModelPartBuilder.create().uv(18, 270).cuboid(-6.5194F, -6.9718F, -1.3313F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F))
                .uv(243, 232).cuboid(17.5768F, -6.9718F, -1.3313F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(28.0867F, 13.3015F, -25.7066F));

        ModelPartData cube_r15 = fender2.addChild("cube_r15", ModelPartBuilder.create().uv(217, 285).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-5.6131F, -6.5491F, -0.3313F, 0.0F, 0.0F, 0.4363F));

        ModelPartData cube_r16 = fender2.addChild("cube_r16", ModelPartBuilder.create().uv(190, 69).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(18.6705F, -6.5491F, -0.3313F, 0.0F, 0.0F, -0.4363F));

        ModelPartData cube_r17 = fender2.addChild("cube_r17", ModelPartBuilder.create().uv(78, 255).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-3.522F, -11.5226F, -0.3313F, 0.0F, 0.0F, 1.0908F));

        ModelPartData cube_r18 = fender2.addChild("cube_r18", ModelPartBuilder.create().uv(142, 267).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(16.5794F, -11.5226F, -0.3313F, 0.0F, 0.0F, -1.0908F));

        ModelPartData cube_r19 = fender2.addChild("cube_r19", ModelPartBuilder.create().uv(146, 146).cuboid(-1.0F, -4.0199F, -1.0F, 2.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(6.8122F, -14.6418F, -0.3313F, 0.0F, 0.0F, 1.5708F));

        ModelPartData fender = side.addChild("fender", ModelPartBuilder.create().uv(86, 284).cuboid(-7.5194F, -6.9718F, -1.3313F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F))
                .uv(49, 271).cuboid(16.5768F, -6.9718F, -1.3313F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(105.0867F, 13.3015F, -25.7066F));

        ModelPartData cube_r20 = fender.addChild("cube_r20", ModelPartBuilder.create().uv(272, 188).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(15.5574F, 0.0282F, -5.4402F, 0.0F, 0.4363F, 0.0F));

        ModelPartData cube_r21 = fender.addChild("cube_r21", ModelPartBuilder.create().uv(286, 212).cuboid(-1.0F, -6.0F, 3.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(15.8403F, -5.6957F, -5.4402F, 0.0F, 0.4363F, -0.4363F));

        ModelPartData cube_r22 = fender.addChild("cube_r22", ModelPartBuilder.create().uv(65, 271).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(14.6469F, -9.7314F, -5.4402F, 0.0F, 0.4363F, -1.0908F));

        ModelPartData cube_r23 = fender.addChild("cube_r23", ModelPartBuilder.create().uv(42, 251).cuboid(-1.0F, -8.8199F, 3.0F, 2.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0122F, -12.6224F, -5.4402F, 0.0F, -0.4363F, 1.5708F));

        ModelPartData cube_r24 = fender.addChild("cube_r24", ModelPartBuilder.create().uv(34, 270).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.5895F, -9.7314F, -5.4402F, 0.0F, -0.4363F, 1.0908F));

        ModelPartData cube_r25 = fender.addChild("cube_r25", ModelPartBuilder.create().uv(284, 124).cuboid(-1.0F, -6.0F, 3.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.7829F, -5.6957F, -5.4402F, 0.0F, -0.4363F, 0.4363F));

        ModelPartData cube_r26 = fender.addChild("cube_r26", ModelPartBuilder.create().uv(0, 270).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.5001F, 0.0282F, -5.4402F, 0.0F, -0.4363F, 0.0F));

        ModelPartData cube_r27 = fender.addChild("cube_r27", ModelPartBuilder.create().uv(286, 188).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-6.6131F, -6.5491F, -0.3313F, 0.0F, 0.0F, 0.4363F));

        ModelPartData cube_r28 = fender.addChild("cube_r28", ModelPartBuilder.create().uv(233, 285).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(17.6705F, -6.5491F, -0.3313F, 0.0F, 0.0F, -0.4363F));

        ModelPartData cube_r29 = fender.addChild("cube_r29", ModelPartBuilder.create().uv(281, 232).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-4.522F, -11.5226F, -0.3313F, 0.0F, 0.0F, 1.0908F));

        ModelPartData cube_r30 = fender.addChild("cube_r30", ModelPartBuilder.create().uv(107, 279).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(15.5794F, -11.5226F, -0.3313F, 0.0F, 0.0F, -1.0908F));

        ModelPartData cube_r31 = fender.addChild("cube_r31", ModelPartBuilder.create().uv(155, 0).cuboid(-1.0F, -8.8199F, -1.0F, 2.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0122F, -14.6418F, -0.3313F, 0.0F, 0.0F, 1.5708F));

        ModelPartData side3 = group.addChild("side3", ModelPartBuilder.create().uv(0, 0).cuboid(-157.4608F, -6.0938F, 51.9934F, 2.0F, 12.0F, 5.0F, new Dilation(0.0F))
                .uv(77, 123).cuboid(-178.4608F, -6.0938F, 51.9934F, 2.0F, 8.0F, 5.0F, new Dilation(0.0F))
                .uv(155, 23).cuboid(-161.4608F, -6.0938F, 51.9934F, 4.0F, 7.0F, 5.0F, new Dilation(0.0F))
                .uv(286, 200).cuboid(-176.4608F, -6.0938F, 51.9934F, 3.0F, 7.0F, 5.0F, new Dilation(0.0F))
                .uv(202, 35).cuboid(-173.4608F, -6.0938F, 51.9934F, 12.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 41).cuboid(-144.6062F, -3.6703F, 54.2F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(101.0867F, -16.3015F, -4.2934F));

        ModelPartData cube_r32 = side3.addChild("cube_r32", ModelPartBuilder.create().uv(30, 96).cuboid(-20.0F, -16.0F, -1.0F, 9.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(40, 62).cuboid(-55.0F, -16.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 121).cuboid(-55.0F, -16.0F, -1.4862F, 1.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(34, 62).cuboid(-55.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(44, 121).cuboid(-21.0F, -16.0F, -1.4862F, 1.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(102, 116).cuboid(-21.0F, -16.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(91, 114).cuboid(-21.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(223, 170).cuboid(-54.0F, -16.0F, -1.0F, 33.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(142, 66).cuboid(-11.0F, -14.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F))
                .uv(191, 11).cuboid(-7.0F, -14.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(94, 255).cuboid(-9.0F, -14.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F))
                .uv(10, 47).cuboid(9.0F, -13.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(146, 189).cuboid(-5.0F, -14.0F, -1.0F, 14.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 199).cuboid(11.0F, -15.0F, -1.0F, 15.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-93.6062F, 9.7506F, 53.0797F, -0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r33 = side3.addChild("cube_r33", ModelPartBuilder.create().uv(155, 277).cuboid(-1.0F, -21.0F, -3.0F, 4.0F, 23.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-111.7013F, -5.4251F, 54.5382F, 0.0984F, 0.1329F, -0.602F));

        ModelPartData cube_r34 = side3.addChild("cube_r34", ModelPartBuilder.create().uv(252, 272).cuboid(-1.0F, -23.0F, -3.0F, 4.0F, 25.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-182.465F, -5.6384F, 55.729F, 0.1566F, -0.0531F, 0.6527F));

        ModelPartData cube_r35 = side3.addChild("cube_r35", ModelPartBuilder.create().uv(0, 121).cuboid(-1.0F, -17.0F, -1.0F, 4.0F, 17.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-147.6062F, -6.1034F, 53.7804F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r36 = side3.addChild("cube_r36", ModelPartBuilder.create().uv(155, 35).cuboid(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-153.532F, 13.3297F, 55.1891F, 0.4363F, 0.6545F, 0.0F));

        ModelPartData cube_r37 = side3.addChild("cube_r37", ModelPartBuilder.create().uv(36, 199).cuboid(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-104.7908F, 13.3297F, 55.7979F, 0.4363F, -0.6545F, 0.0F));

        ModelPartData cube_r38 = side3.addChild("cube_r38", ModelPartBuilder.create().uv(202, 0).cuboid(-37.0F, -4.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-42.6062F, 10.7506F, 53.0797F, -0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r39 = side3.addChild("cube_r39", ModelPartBuilder.create().uv(142, 88).cuboid(-37.0F, -1.0F, -1.0F, 12.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-42.6062F, 13.7506F, 53.0797F, -0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r40 = side3.addChild("cube_r40", ModelPartBuilder.create().uv(102, 96).cuboid(-4.0F, -16.0F, -3.0F, 8.0F, 16.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-151.9466F, 9.7969F, 54.141F, -0.0457F, 0.3051F, -0.0138F));

        ModelPartData cube_r41 = side3.addChild("cube_r41", ModelPartBuilder.create().uv(166, 122).cuboid(-52.0F, -4.0F, -1.0F, 50.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-102.6062F, 13.3297F, 56.2F, 0.7854F, 0.0F, 0.0F));

        ModelPartData fender5 = side3.addChild("fender5", ModelPartBuilder.create().uv(221, 97).cuboid(-152.5194F, -6.9718F, 76.9066F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 216).cuboid(-128.4232F, -6.9718F, 76.9066F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-28.0867F, 13.3015F, -25.7066F));

        ModelPartData cube_r42 = fender5.addChild("cube_r42", ModelPartBuilder.create().uv(284, 284).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-151.6131F, -6.5491F, 81.9066F, 0.0F, 0.0F, 0.4363F));

        ModelPartData cube_r43 = fender5.addChild("cube_r43", ModelPartBuilder.create().uv(123, 285).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-127.3295F, -6.5491F, 81.9066F, 0.0F, 0.0F, -0.4363F));

        ModelPartData cube_r44 = fender5.addChild("cube_r44", ModelPartBuilder.create().uv(57, 216).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-149.522F, -11.5226F, 81.9066F, 0.0F, 0.0F, 1.0908F));

        ModelPartData cube_r45 = fender5.addChild("cube_r45", ModelPartBuilder.create().uv(93, 216).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-129.4206F, -11.5226F, 81.9066F, 0.0F, 0.0F, -1.0908F));

        ModelPartData cube_r46 = fender5.addChild("cube_r46", ModelPartBuilder.create().uv(28, 47).cuboid(-1.0F, -4.0199F, -5.0F, 2.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-139.1878F, -14.6418F, 81.9066F, 0.0F, 0.0F, 1.5708F));

        ModelPartData fender6 = side3.addChild("fender6", ModelPartBuilder.create().uv(192, 88).cuboid(0.4806F, -6.9718F, 76.9066F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F))
                .uv(114, 165).cuboid(24.5768F, -6.9718F, 76.9066F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-105.0867F, 13.3015F, -25.7066F));

        ModelPartData cube_r47 = fender6.addChild("cube_r47", ModelPartBuilder.create().uv(120, 255).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(23.5574F, 0.0282F, 87.0155F, 0.0F, -0.4363F, 0.0F));

        ModelPartData cube_r48 = fender6.addChild("cube_r48", ModelPartBuilder.create().uv(187, 277).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(23.8403F, -5.6957F, 87.0155F, 0.0F, -0.4363F, -0.4363F));

        ModelPartData cube_r49 = fender6.addChild("cube_r49", ModelPartBuilder.create().uv(259, 97).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(22.6469F, -9.7314F, 87.0155F, 0.0F, -0.4363F, -1.0908F));

        ModelPartData cube_r50 = fender6.addChild("cube_r50", ModelPartBuilder.create().uv(0, 251).cuboid(-1.0F, -8.8199F, -5.0F, 2.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.0122F, -12.6224F, 87.0155F, 0.0F, 0.4363F, 1.5708F));

        ModelPartData cube_r51 = fender6.addChild("cube_r51", ModelPartBuilder.create().uv(202, 261).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.4105F, -9.7314F, 87.0155F, 0.0F, 0.4363F, 1.0908F));

        ModelPartData cube_r52 = fender6.addChild("cube_r52", ModelPartBuilder.create().uv(209, 281).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.2171F, -5.6957F, 87.0155F, 0.0F, 0.4363F, 0.4363F));

        ModelPartData cube_r53 = fender6.addChild("cube_r53", ModelPartBuilder.create().uv(221, 261).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.4999F, 0.0282F, 87.0155F, 0.0F, 0.4363F, 0.0F));

        ModelPartData cube_r54 = fender6.addChild("cube_r54", ModelPartBuilder.create().uv(186, 261).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.3869F, -6.5491F, 81.9066F, 0.0F, 0.0F, 0.4363F));

        ModelPartData cube_r55 = fender6.addChild("cube_r55", ModelPartBuilder.create().uv(284, 272).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(25.6705F, -6.5491F, 81.9066F, 0.0F, 0.0F, -0.4363F));

        ModelPartData cube_r56 = fender6.addChild("cube_r56", ModelPartBuilder.create().uv(177, 0).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(3.478F, -11.5226F, 81.9066F, 0.0F, 0.0F, 1.0908F));

        ModelPartData cube_r57 = fender6.addChild("cube_r57", ModelPartBuilder.create().uv(177, 23).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(23.5794F, -11.5226F, 81.9066F, 0.0F, 0.0F, -1.0908F));

        ModelPartData cube_r58 = fender6.addChild("cube_r58", ModelPartBuilder.create().uv(0, 47).cuboid(-1.0F, -8.8199F, -5.0F, 2.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(9.0122F, -14.6418F, 81.9066F, 0.0F, 0.0F, 1.5708F));

        ModelPartData back = group.addChild("back", ModelPartBuilder.create().uv(0, 47).cuboid(-73.1704F, -40.6359F, 2.7877F, 48.0F, 3.0F, 46.0F, new Dilation(0.0F))
                .uv(223, 143).cuboid(-100.1621F, -22.4365F, 37.2066F, 18.0F, 12.0F, 15.0F, new Dilation(0.0F))
                .uv(0, 216).cuboid(-99.1621F, -22.4365F, 14.2066F, 17.0F, 12.0F, 23.0F, new Dilation(0.0F))
                .uv(77, 96).cuboid(-100.1621F, -22.4365F, 14.2066F, 1.0F, 4.0F, 23.0F, new Dilation(0.0F))
                .uv(63, 165).cuboid(-100.1621F, -22.4365F, -0.7934F, 18.0F, 12.0F, 15.0F, new Dilation(0.0F))
                .uv(254, 118).cuboid(-101.0F, -19.0F, -1.0F, 2.0F, 6.0F, 16.0F, new Dilation(0.0F))
                .uv(134, 245).cuboid(-101.0F, -19.0F, 36.5F, 2.0F, 6.0F, 16.0F, new Dilation(0.0F))
                .uv(251, 188).cuboid(-101.0F, -22.0F, 23.8F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 0.0F, 0.0F));

        ModelPartData cube_r59 = back.addChild("cube_r59", ModelPartBuilder.create().uv(77, 146).cuboid(-4.0F, -5.0F, -26.5F, 8.0F, 10.0F, 53.0F, new Dilation(0.0F)), ModelTransform.of(-96.0159F, -12.232F, 25.7066F, 0.0F, 0.0F, 0.6118F));

        ModelPartData cube_r60 = back.addChild("cube_r60", ModelPartBuilder.create().uv(0, 96).cuboid(-14.0F, -16.0F, -1.0F, 12.0F, 16.0F, 53.0F, new Dilation(0.0F)), ModelTransform.of(-81.7943F, -3.7655F, 0.2066F, 0.0F, 0.0F, 0.1739F));

        ModelPartData front2 = group.addChild("front2", ModelPartBuilder.create().uv(32, 271).cuboid(18.6583F, -49.8797F, 19.6781F, 2.0F, 5.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 39.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        ModelPartData cube_r61 = front2.addChild("cube_r61", ModelPartBuilder.create().uv(0, 0).cuboid(-1.9132F, -3.0038F, -1.0076F, 2.0F, 5.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(20.4878F, -46.8759F, 33.3897F, 0.0F, -0.0873F, 0.0F));

        ModelPartData cube_r62 = front2.addChild("cube_r62", ModelPartBuilder.create().uv(155, 0).cuboid(-1.9132F, -3.0038F, -0.9924F, 2.0F, 5.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(19.0933F, -46.8759F, 2.8299F, 0.0F, 0.0873F, 0.0F));

        ModelPartData front3 = group.addChild("front3", ModelPartBuilder.create().uv(119, 267).cuboid(22.9329F, -48.0258F, 19.6781F, 5.0F, 5.0F, 13.0F, new Dilation(0.0F))
                .uv(202, 16).cuboid(12.2884F, -48.0258F, 0.0119F, 9.0F, 5.0F, 3.0F, new Dilation(0.0F))
                .uv(165, 35).cuboid(11.2884F, -48.0258F, 0.0119F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(236, 35).cuboid(11.2012F, -48.0258F, 49.1431F, 10.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, 34.0F, 0.0F));

        ModelPartData cube_r63 = front3.addChild("cube_r63", ModelPartBuilder.create().uv(0, 96).cuboid(-2.0F, -4.0F, -1.0F, 5.0F, 5.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(24.8496F, -44.0258F, 33.3897F, 0.0F, -0.0873F, 0.0F));

        ModelPartData cube_r64 = front3.addChild("cube_r64", ModelPartBuilder.create().uv(0, 121).cuboid(-2.0F, -4.0F, -3.0F, 5.0F, 5.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(23.4551F, -44.0258F, 2.8299F, 0.0F, 0.0873F, 0.0F));

        ModelPartData front4 = group.addChild("front4", ModelPartBuilder.create().uv(198, 261).cuboid(22.9329F, -50.0258F, 19.6781F, 5.0F, 7.0F, 13.0F, new Dilation(0.0F))
                .uv(223, 143).cuboid(26.0F, -49.0F, 4.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(180, 171).cuboid(26.5F, -49.0F, 11.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(63, 165).cuboid(26.4F, -49.0F, 36.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(146, 171).cuboid(26.4F, -49.0F, 43.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 29.0F, 0.0F));

        ModelPartData cube_r65 = front4.addChild("cube_r65", ModelPartBuilder.create().uv(0, 47).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 7.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(24.8496F, -44.0258F, 33.3897F, 0.0F, -0.0873F, 0.0F));

        ModelPartData cube_r66 = front4.addChild("cube_r66", ModelPartBuilder.create().uv(146, 146).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 7.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(23.4551F, -44.0258F, 2.8299F, 0.0F, 0.0873F, 0.0F));

        ModelPartData interiro = group.addChild("interiro", ModelPartBuilder.create().uv(0, 0).cuboid(-53.5194F, -8.5945F, 3.3706F, 55.0F, 2.0F, 45.0F, new Dilation(0.0F))
                .uv(166, 69).cuboid(-3.5194F, -16.5945F, 3.3706F, 5.0F, 8.0F, 45.0F, new Dilation(0.0F))
                .uv(202, 0).cuboid(1.4806F, -16.5945F, 13.3706F, 30.0F, 10.0F, 25.0F, new Dilation(0.0F))
                .uv(201, 197).cuboid(-82.5194F, -16.5945F, 13.3706F, 26.0F, 10.0F, 25.0F, new Dilation(0.0F))
                .uv(77, 96).cuboid(-77.03F, -21.9003F, 1.3706F, 20.0F, 1.0F, 49.0F, new Dilation(0.0F))
                .uv(0, 165).cuboid(-55.03F, -12.9003F, 2.3706F, 8.0F, 4.0F, 47.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r67 = interiro.addChild("cube_r67", ModelPartBuilder.create().uv(146, 146).cuboid(-61.0F, -2.0F, -46.0F, 14.0F, 2.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(-40.2937F, 36.8316F, 47.3706F, 0.0F, 0.0F, 1.2654F));

        ModelPartData dash = interiro.addChild("dash", ModelPartBuilder.create().uv(57, 216).cuboid(-5.0F, -5.0F, -15.0F, 10.0F, 5.0F, 16.0F, new Dilation(0.0F))
                .uv(40, 254).cuboid(-6.0F, -6.0F, -15.0F, 11.0F, 1.0F, 16.0F, new Dilation(0.0F))
                .uv(221, 97).cuboid(-6.0F, 0.0F, -15.0F, 11.0F, 1.0F, 16.0F, new Dilation(0.0F))
                .uv(14, 10).cuboid(-6.0F, -5.0F, -15.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(14, 4).cuboid(-6.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(243, 232).cuboid(-6.0F, -6.0F, -44.0F, 11.0F, 6.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 72).cuboid(-5.0F, -6.0F, -28.0F, 10.0F, 6.0F, 13.0F, new Dilation(0.0F))
                .uv(63, 202).cuboid(-5.4806F, 0.0F, -25.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
                .uv(27, 202).cuboid(-5.4806F, -5.0F, -25.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
                .uv(30, 121).cuboid(-5.4806F, -4.0F, -25.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(40, 18).cuboid(-5.4806F, -4.0F, -19.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 41).cuboid(-6.0F, -5.0F, -17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(14, 41).cuboid(-6.0F, -3.0F, -17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(13, 16).cuboid(-6.0F, -1.4055F, -17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-12.5194F, -16.5945F, 48.3706F));

        ModelPartData steerwheel = dash.addChild("steerwheel", ModelPartBuilder.create().uv(81, 109).cuboid(-7.4806F, -5.0F, -11.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
                .uv(28, 47).cuboid(-7.4806F, -8.0F, -8.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 47).cuboid(-7.4806F, -3.0F, -8.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(32, 41).cuboid(-8.0F, -5.0F, -8.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

        ModelPartData cube_r68 = steerwheel.addChild("cube_r68", ModelPartBuilder.create().uv(108, 116).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 0.9282F, 0.5236F, 0.0F, 0.0F));

        ModelPartData cube_r69 = steerwheel.addChild("cube_r69", ModelPartBuilder.create().uv(114, 116).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.1962F, 0.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r70 = steerwheel.addChild("cube_r70", ModelPartBuilder.create().uv(120, 116).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.9282F, -7.0F, 2.0944F, 0.0F, 0.0F));

        ModelPartData cube_r71 = steerwheel.addChild("cube_r71", ModelPartBuilder.create().uv(120, 123).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.0F, -11.1962F, 2.618F, 0.0F, 0.0F));

        ModelPartData cube_r72 = steerwheel.addChild("cube_r72", ModelPartBuilder.create().uv(30, 138).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, -14.9282F, -2.618F, 0.0F, 0.0F));

        ModelPartData cube_r73 = steerwheel.addChild("cube_r73", ModelPartBuilder.create().uv(36, 138).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.1962F, -14.0F, -2.0944F, 0.0F, 0.0F));

        ModelPartData cube_r74 = steerwheel.addChild("cube_r74", ModelPartBuilder.create().uv(77, 141).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.9282F, -7.0F, -1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r75 = steerwheel.addChild("cube_r75", ModelPartBuilder.create().uv(83, 141).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0F, -2.8038F, -0.5236F, 0.0F, 0.0F));

        ModelPartData seat = interiro.addChild("seat", ModelPartBuilder.create().uv(0, 251).cuboid(-41.03F, -13.9003F, 77.3706F, 14.0F, 5.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, -45.0F));

        ModelPartData cube_r76 = seat.addChild("cube_r76", ModelPartBuilder.create().uv(158, 261).cuboid(-51.0F, -2.0F, -13.0F, 8.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 24.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

        ModelPartData cube_r77 = seat.addChild("cube_r77", ModelPartBuilder.create().uv(187, 281).cuboid(-50.0F, -2.0F, -11.0F, 7.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 14.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

        ModelPartData cube_r78 = seat.addChild("cube_r78", ModelPartBuilder.create().uv(0, 270).cuboid(-45.0F, -2.0F, -14.0F, 2.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 16.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

        ModelPartData cube_r79 = seat.addChild("cube_r79", ModelPartBuilder.create().uv(146, 171).cuboid(-53.0F, -2.0F, -14.0F, 10.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-38.9261F, 34.0952F, 91.3706F, 0.0F, 0.0F, 1.4835F));

        ModelPartData seat2 = interiro.addChild("seat2", ModelPartBuilder.create().uv(248, 35).cuboid(-41.03F, -13.9003F, 77.3706F, 14.0F, 5.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, -71.0F));

        ModelPartData cube_r80 = seat2.addChild("cube_r80", ModelPartBuilder.create().uv(259, 97).cuboid(-51.0F, -2.0F, -13.0F, 8.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 24.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

        ModelPartData cube_r81 = seat2.addChild("cube_r81", ModelPartBuilder.create().uv(274, 56).cuboid(-50.0F, -2.0F, -11.0F, 7.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 14.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

        ModelPartData cube_r82 = seat2.addChild("cube_r82", ModelPartBuilder.create().uv(220, 267).cuboid(-45.0F, -2.0F, -14.0F, 2.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 16.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

        ModelPartData cube_r83 = seat2.addChild("cube_r83", ModelPartBuilder.create().uv(77, 123).cuboid(-53.0F, -2.0F, -14.0F, 10.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-38.9261F, 34.0952F, 91.3706F, 0.0F, 0.0F, 1.4835F));

        ModelPartData windows = group.addChild("windows", ModelPartBuilder.create(), ModelTransform.pivot(-26.5194F, -22.4049F, 50.0704F));

        ModelPartData window = windows.addChild("window", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r84 = window.addChild("cube_r84", ModelPartBuilder.create().uv(187, 0).cuboid(11.0F, -5.0F, -1.0F, 4.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 72).cuboid(7.0F, -11.0F, -1.0F, 4.0F, 11.0F, 1.0F, new Dilation(0.0F))
                .uv(243, 254).cuboid(-17.0F, -17.0F, -1.0F, 24.0F, 17.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData window2 = windows.addChild("window2", ModelPartBuilder.create(), ModelTransform.pivot(-22.0F, 0.0F, 0.0F));

        ModelPartData cube_r85 = window2.addChild("cube_r85", ModelPartBuilder.create().uv(184, 158).cuboid(11.0F, -5.0F, -1.0F, 4.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 72).cuboid(15.0F, -11.0F, -1.0F, 5.0F, 11.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 23).cuboid(20.0F, -17.0F, -1.0F, 21.0F, 17.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData windshield = windows.addChild("windshield", ModelPartBuilder.create(), ModelTransform.pivot(26.5194F, 22.4049F, -50.0704F));

        ModelPartData cube_r86 = windshield.addChild("cube_r86", ModelPartBuilder.create().uv(154, 1).cuboid(-3.0F, -22.0F, -1.0F, 1.0F, 22.0F, 46.0F, new Dilation(0.0F)), ModelTransform.of(-78.0144F, -21.2605F, 3.7877F, 0.0F, 0.0F, 0.6458F));

        ModelPartData cube_r87 = windshield.addChild("cube_r87", ModelPartBuilder.create().uv(157, 197).cuboid(-3.0F, -22.0F, 1.0F, 1.0F, 22.0F, 42.0F, new Dilation(0.0F)), ModelTransform.of(-6.7325F, -23.1881F, 3.7877F, 0.0F, 0.0F, -0.6109F));

        ModelPartData window3 = windows.addChild("window3", ModelPartBuilder.create(), ModelTransform.pivot(11.0F, 0.0F, -47.9821F));

        ModelPartData cube_r88 = window3.addChild("cube_r88", ModelPartBuilder.create().uv(263, 188).cuboid(-1.0F, -7.0F, 1.0F, 4.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(190, 223).cuboid(-5.0F, -12.0F, 1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 165).cuboid(-28.0F, -17.0F, 1.0F, 23.0F, 17.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData window4 = windows.addChild("window4", ModelPartBuilder.create(), ModelTransform.pivot(11.0F, 0.0F, -47.9821F));

        ModelPartData cube_r89 = window4.addChild("cube_r89", ModelPartBuilder.create().uv(174, 158).cuboid(-2.0F, -6.0F, 1.0F, 5.0F, 6.0F, 0.0F, new Dilation(0.0F))
                .uv(202, 81).cuboid(3.0F, -12.0F, 1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 182).cuboid(7.0F, -17.0F, 1.0F, 21.0F, 17.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-60.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData hood = group.addChild("hood", ModelPartBuilder.create().uv(166, 134).cuboid(-64.9493F, -1.4703F, 18.979F, 39.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(58.4806F, -20.5297F, 3.2052F, 0.0F, 0.0F, 0.0349F));

        ModelPartData cube_r90 = hood.addChild("cube_r90", ModelPartBuilder.create().uv(0, 96).cuboid(-66.0F, -17.0F, -1.0F, 5.0F, 19.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(36.0752F, 0.8872F, -2.8803F, -1.5533F, 0.0436F, 0.0008F));

        ModelPartData cube_r91 = hood.addChild("cube_r91", ModelPartBuilder.create().uv(77, 96).cuboid(-66.0F, -21.0F, -1.0F, 5.0F, 20.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(36.9039F, 0.556F, 29.6496F, -1.5883F, -0.0436F, 0.0008F));

        ModelPartData cube_r92 = hood.addChild("cube_r92", ModelPartBuilder.create().uv(225, 232).cuboid(-67.0F, -24.0F, -1.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(37.8747F, 0.8585F, -1.236F, -1.5533F, 0.0F, 0.0F));

        ModelPartData cube_r93 = hood.addChild("cube_r93", ModelPartBuilder.create().uv(221, 69).cuboid(-66.0F, -23.0F, -1.0F, 37.0F, 25.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0507F, 0.837F, 0.0F, -1.5533F, 0.0F, 0.0F));

        ModelPartData cube_r94 = hood.addChild("cube_r94", ModelPartBuilder.create().uv(201, 232).cuboid(-68.0F, -1.0F, 1.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(38.9184F, -1.4902F, 27.0232F, -1.5882F, 0.0F, 0.0F));

        ModelPartData cube_r95 = hood.addChild("cube_r95", ModelPartBuilder.create().uv(110, 209).cuboid(-66.0F, -21.0F, -1.0F, 37.0F, 25.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0507F, 0.5054F, 26.7512F, -1.5882F, 0.0F, 0.0F));

        ModelPartData front = group.addChild("front", ModelPartBuilder.create().uv(62, 271).cuboid(46.1232F, -28.3861F, 19.6781F, 2.0F, 4.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 44.0F, 0.0F, 0.0F, 0.0F, -0.5672F));

        ModelPartData cube_r96 = front.addChild("cube_r96", ModelPartBuilder.create().uv(155, 23).cuboid(-1.5353F, -3.1566F, -0.9532F, 2.0F, 4.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(47.5771F, -25.2295F, 33.3897F, 0.0F, -0.0873F, 0.0F));

        ModelPartData cube_r97 = front.addChild("cube_r97", ModelPartBuilder.create().uv(170, 88).cuboid(-1.5353F, -3.1566F, -1.0468F, 2.0F, 4.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(46.1826F, -25.2295F, 2.8299F, 0.0F, 0.0873F, 0.0F));
        return TexturedModelData.of(modelData, 512, 512);
    }
    @Override
    public void setAngles(VehicleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    /*@Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        side.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        side2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        back.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        hood.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        front.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        front2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        front3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        front4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        interiro.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        windows.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }*/
    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        poseStack.push();
        float angleInRadians = (float) Math.PI; // 180 degrees
        Quaternionf rotation = new Quaternionf();
        rotation.rotateY(angleInRadians);
        poseStack.multiply(rotation);
        float scale = 0.7f;
        poseStack.scale(scale,scale,scale);
        poseStack.translate(2, -1.0, 2);
        group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        poseStack.pop();
    }

}
