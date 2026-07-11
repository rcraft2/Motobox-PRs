package motobox.vehicle.render.frame;// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.systems.RenderSystem;
import motobox.Motobox;
import motobox.entity.VehicleEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class veloce_v8 extends EntityModel<VehicleEntity> {
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("frame_veloce_v8"), "main");
	private final ModelPart group;

	private int color;
	public veloce_v8(EntityRendererFactory.Context root) {
		super(RenderLayer::getEntityTranslucent);
		this.group = root.getPart(MODEL_LAYER).getChild("group");
		color = 0x808080;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData group = modelPartData.addChild("group", ModelPartBuilder.create().uv(301, 89).cuboid(-3.0F, -18.0F, 13.0F, 24.0F, 17.0F, 26.0F, new Dilation(0.0F))
		.uv(302, 232).cuboid(-84.0F, -17.0F, 13.0F, 24.0F, 16.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, 24.0F, 33.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r1 = group.addChild("cube_r1", ModelPartBuilder.create().uv(73, 184).cuboid(-1.0F, -10.0F, -1.0F, 7.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-105.5059F, -0.5406F, 19.0327F, 0.1928F, -0.4444F, 0.182F));

		ModelPartData cube_r2 = group.addChild("cube_r2", ModelPartBuilder.create().uv(28, 253).cuboid(-1.0F, -10.0F, -1.0F, 7.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-105.3402F, -0.5024F, 32.9098F, -0.1928F, 0.4444F, 0.182F));

		ModelPartData cube_r3 = group.addChild("cube_r3", ModelPartBuilder.create().uv(53, 253).cuboid(-1.0F, -10.0F, -1.0F, 7.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-106.4731F, -0.643F, 33.8316F, -0.2154F, -0.628F, 0.3936F));

		ModelPartData cube_r4 = group.addChild("cube_r4", ModelPartBuilder.create().uv(19, 20).cuboid(-24.0109F, -9.0F, 40.1246F, 1.0F, 9.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-101.5019F, -0.6507F, -12.1381F, 0.0F, 0.48F, 0.0F));

		ModelPartData cube_r5 = group.addChild("cube_r5", ModelPartBuilder.create().uv(82, 56).cuboid(0.0F, -9.0F, -11.0F, 1.0F, 9.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-101.5019F, -0.6507F, 12.1381F, 0.0F, -0.48F, 0.0F));

		ModelPartData cube_r6 = group.addChild("cube_r6", ModelPartBuilder.create().uv(0, 10).cuboid(-1.0F, -10.0F, -5.0F, 2.0F, 10.0F, 6.0F, new Dilation(0.0F))
		.uv(38, 20).cuboid(-1.0F, -10.0F, -5.0F, 2.0F, 10.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-106.5019F, -0.6507F, 18.1381F, 0.3297F, -1.0071F, -0.0211F));

		ModelPartData side2 = group.addChild("side2", ModelPartBuilder.create(), ModelTransform.pivot(101.0867F, -16.3015F, 56.2934F));

		ModelPartData fender2 = side2.addChild("fender2", ModelPartBuilder.create().uv(217, 7).cuboid(-8.5194F, -6.9718F, -1.3313F, 2.0F, 7.0F, 49.0F, new Dilation(0.0F))
		.uv(210, 202).cuboid(17.5768F, -6.9718F, -1.3313F, 2.0F, 7.0F, 49.0F, new Dilation(0.0F)), ModelTransform.pivot(-179.0867F, 13.3015F, -56.2934F));

		ModelPartData cube_r7 = fender2.addChild("cube_r7", ModelPartBuilder.create().uv(297, 95).cuboid(-1.0F, -7.0F, 1.0F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(14.9463F, 6.5309F, -4.6889F, 0.1201F, 0.4205F, 0.2875F));

		ModelPartData cube_r8 = fender2.addChild("cube_r8", ModelPartBuilder.create().uv(83, 148).cuboid(-1.0F, -7.0F, 1.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.5574F, 0.0282F, -5.4402F, 0.0F, 0.4363F, 0.0F));

		ModelPartData cube_r9 = fender2.addChild("cube_r9", ModelPartBuilder.create().uv(0, 213).cuboid(-1.0F, -6.0F, 1.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.8403F, -5.6957F, -5.4402F, 0.0F, 0.4363F, -0.4363F));

		ModelPartData cube_r10 = fender2.addChild("cube_r10", ModelPartBuilder.create().uv(101, 60).cuboid(-1.0F, -8.0F, 1.0F, 2.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(15.6469F, -9.7314F, -5.4402F, 0.0F, 0.4363F, -1.0908F));

		ModelPartData cube_r11 = fender2.addChild("cube_r11", ModelPartBuilder.create().uv(217, 87).cuboid(-1.0F, -8.8199F, 1.0F, 2.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -13.0842F, -5.4402F, 0.0F, -0.4363F, 1.5708F));

		ModelPartData cube_r12 = fender2.addChild("cube_r12", ModelPartBuilder.create().uv(102, 82).cuboid(-1.0F, -8.0F, 1.0F, 2.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.5895F, -9.7314F, -5.4402F, 0.0F, -0.4363F, 1.0908F));

		ModelPartData cube_r13 = fender2.addChild("cube_r13", ModelPartBuilder.create().uv(157, 213).cuboid(-1.0F, -6.0F, 1.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.7829F, -5.6957F, -5.4402F, 0.0F, -0.4363F, 0.4363F));

		ModelPartData cube_r14 = fender2.addChild("cube_r14", ModelPartBuilder.create().uv(49, 299).cuboid(-1.0F, -7.0F, 1.0F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.8889F, 6.5309F, -4.6889F, 0.1201F, -0.4205F, -0.2875F));

		ModelPartData cube_r15 = fender2.addChild("cube_r15", ModelPartBuilder.create().uv(148, 138).cuboid(-1.0F, -7.0F, 1.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.5001F, 0.0282F, -5.4402F, 0.0F, -0.4363F, 0.0F));

		ModelPartData cube_r16 = fender2.addChild("cube_r16", ModelPartBuilder.create().uv(53, 243).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 3.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(16.7992F, 6.5309F, -0.3313F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r17 = fender2.addChild("cube_r17", ModelPartBuilder.create().uv(0, 179).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 50.0F, new Dilation(0.0F)), ModelTransform.of(-7.6131F, -6.5491F, -0.3313F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r18 = fender2.addChild("cube_r18", ModelPartBuilder.create().uv(0, 235).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(18.6705F, -6.5491F, -0.3313F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r19 = fender2.addChild("cube_r19", ModelPartBuilder.create().uv(157, 194).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(-5.522F, -11.5226F, -0.3313F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r20 = fender2.addChild("cube_r20", ModelPartBuilder.create().uv(195, 136).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(16.5794F, -11.5226F, -0.3313F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r21 = fender2.addChild("cube_r21", ModelPartBuilder.create().uv(104, 185).cuboid(-1.0F, -8.8199F, -1.0F, 2.0F, 9.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -15.1036F, -0.3313F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r22 = fender2.addChild("cube_r22", ModelPartBuilder.create().uv(248, 115).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 3.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(-5.7418F, 6.5309F, -0.3313F, 0.0F, 0.0F, -0.2618F));

		ModelPartData sideee = fender2.addChild("sideee", ModelPartBuilder.create().uv(256, 33).cuboid(-2.0F, -11.0306F, -2.8638F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(18.6053F, 1.1271F, -1.6336F));

		ModelPartData cube_r23 = sideee.addChild("cube_r23", ModelPartBuilder.create().uv(157, 231).cuboid(-5.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(235, 102).cuboid(-5.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-30.1967F, -12.6215F, 5.5815F, 0.7137F, 0.3614F, -0.3876F));

		ModelPartData cube_r24 = sideee.addChild("cube_r24", ModelPartBuilder.create().uv(302, 283).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(302, 286).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-25.9779F, -14.1397F, 4.0633F, 0.7363F, 0.3035F, -0.3185F));

		ModelPartData cube_r25 = sideee.addChild("cube_r25", ModelPartBuilder.create().uv(302, 280).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(302, 289).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-21.588F, -15.3921F, 2.8109F, 0.7543F, 0.2443F, -0.2519F));

		ModelPartData cube_r26 = sideee.addChild("cube_r26", ModelPartBuilder.create().uv(121, 269).cuboid(12.5395F, 38.9977F, 10.4333F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-30.8542F, -25.4168F, -3.2186F, 1.009F, -0.3035F, -0.3185F));

		ModelPartData cube_r27 = sideee.addChild("cube_r27", ModelPartBuilder.create().uv(272, 259).cuboid(9.5759F, 39.2108F, 11.6422F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-25.3074F, -27.0081F, -1.6273F, 0.991F, -0.2443F, -0.2519F));

		ModelPartData cube_r28 = sideee.addChild("cube_r28", ModelPartBuilder.create().uv(161, 173).cuboid(6.5167F, 39.3783F, 12.5921F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-19.5856F, -28.2514F, -0.384F, 0.9773F, -0.1841F, -0.1872F));

		ModelPartData cube_r29 = sideee.addChild("cube_r29", ModelPartBuilder.create().uv(268, 128).cuboid(3.385F, 38.1815F, 15.1018F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-13.7226F, -28.7487F, 0.8122F, 0.924F, -0.1231F, -0.124F));

		ModelPartData cube_r30 = sideee.addChild("cube_r30", ModelPartBuilder.create().uv(270, 6).cuboid(-3.0F, -3.0F, 11.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-19.5856F, -28.2514F, 3.6512F, -0.9773F, 0.1841F, -0.1872F));

		ModelPartData cube_r31 = sideee.addChild("cube_r31", ModelPartBuilder.create().uv(0, 200).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-17.0604F, -16.3692F, 1.8338F, 0.1572F, 0.1841F, -0.1872F));

		ModelPartData cube_r32 = sideee.addChild("cube_r32", ModelPartBuilder.create().uv(302, 277).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(301, 5).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-17.0604F, -16.3692F, 1.8338F, 0.7681F, 0.1841F, -0.1872F));

		ModelPartData cube_r33 = sideee.addChild("cube_r33", ModelPartBuilder.create().uv(302, 274).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(302, 295).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-12.4296F, -17.0635F, 1.1395F, 0.7777F, 0.1231F, -0.124F));

		ModelPartData cube_r34 = sideee.addChild("cube_r34", ModelPartBuilder.create().uv(98, 302).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(302, 298).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.7347F, -17.5314F, 0.6716F, 0.7835F, 0.0617F, -0.0618F));

		ModelPartData cube_r35 = sideee.addChild("cube_r35", ModelPartBuilder.create().uv(248, 150).cuboid(21.0F, -3.0F, -1.0F, 12.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -17.585F, 1.618F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r36 = sideee.addChild("cube_r36", ModelPartBuilder.create().uv(146, 109).cuboid(-4.0F, -3.0F, -1.0F, 80.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -17.585F, 0.618F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r37 = sideee.addChild("cube_r37", ModelPartBuilder.create().uv(146, 112).cuboid(-4.0F, -3.0F, -1.0F, 80.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(132, 231).cuboid(-11.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(220, 42).cuboid(-11.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -17.585F, 0.618F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r38 = sideee.addChild("cube_r38", ModelPartBuilder.create().uv(190, 0).cuboid(-4.0F, -3.0F, -10.0F, 4.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(43.4124F, -25.5754F, 7.0113F, 0.9278F, 0.1574F, 0.1409F));

		ModelPartData cube_r39 = sideee.addChild("cube_r39", ModelPartBuilder.create().uv(0, 115).cuboid(0.0F, -3.0F, -9.0F, 18.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(190, 136).cuboid(-4.0F, -3.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(42.4018F, -25.8284F, 7.0291F, 0.9314F, -0.1233F, 0.3491F));

		ModelPartData cube_r40 = sideee.addChild("cube_r40", ModelPartBuilder.create().uv(190, 132).cuboid(-4.0F, -3.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(42.4661F, -26.5577F, 8.554F, 0.1896F, -0.1233F, 0.3491F));

		ModelPartData cube_r41 = sideee.addChild("cube_r41", ModelPartBuilder.create().uv(327, 322).cuboid(-4.0F, -3.0F, 12.0F, 22.0F, 2.0F, 13.0F, new Dilation(0.0F))
		.uv(338, 337).cuboid(-4.0F, -3.0F, -1.0F, 22.0F, 2.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(42.5051F, -26.7032F, 9.4903F, 0.0151F, 0.0076F, 0.3491F));

		ModelPartData cube_r42 = sideee.addChild("cube_r42", ModelPartBuilder.create().uv(190, 140).cuboid(-4.0F, -3.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(42.4684F, -26.1546F, 7.4241F, 0.4514F, -0.1233F, 0.3491F));

		ModelPartData cube_r43 = sideee.addChild("cube_r43", ModelPartBuilder.create().uv(319, 0).cuboid(-4.0F, -3.0F, 0.0F, 12.0F, 2.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(31.2293F, -29.2897F, 8.0139F, 0.0151F, 0.0076F, 0.1745F));

		ModelPartData cube_r44 = sideee.addChild("cube_r44", ModelPartBuilder.create().uv(248, 134).cuboid(-4.0F, -3.0F, -1.0F, 12.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(31.2161F, -29.1396F, 7.0777F, 0.1896F, -0.1233F, 0.1745F));

		ModelPartData cube_r45 = sideee.addChild("cube_r45", ModelPartBuilder.create().uv(216, 163).cuboid(-4.0F, -3.0F, -1.0F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(31.2884F, -28.7431F, 5.9477F, 0.4514F, -0.1233F, 0.1745F));

		ModelPartData cube_r46 = sideee.addChild("cube_r46", ModelPartBuilder.create().uv(171, 32).cuboid(-4.0F, -3.0F, -11.0F, 12.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(32.2569F, -29.2048F, 6.1274F, 1.455F, -0.1233F, 0.1745F));

		ModelPartData cube_r47 = sideee.addChild("cube_r47", ModelPartBuilder.create().uv(170, 251).cuboid(-4.0F, -3.0F, -1.0F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(31.2795F, -28.4102F, 5.5528F, 0.9314F, -0.1233F, 0.1745F));

		ModelPartData cube_r48 = sideee.addChild("cube_r48", ModelPartBuilder.create().uv(237, 341).cuboid(-4.0F, -3.0F, 0.0F, 7.0F, 2.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(24.7331F, -29.7032F, 7.1527F, 0.0151F, 0.0076F, -0.0524F));

		ModelPartData cube_r49 = sideee.addChild("cube_r49", ModelPartBuilder.create().uv(275, 147).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(24.754F, -29.554F, 6.2165F, 0.1896F, -0.1233F, -0.0524F));

		ModelPartData cube_r50 = sideee.addChild("cube_r50", ModelPartBuilder.create().uv(285, 6).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.9137F, -29.1839F, 5.0865F, 0.4514F, -0.1233F, -0.0524F));

		ModelPartData cube_r51 = sideee.addChild("cube_r51", ModelPartBuilder.create().uv(220, 0).cuboid(-4.0F, -3.0F, -10.0F, 7.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(25.2231F, -29.6612F, 5.2662F, 1.455F, -0.1233F, -0.0524F));

		ModelPartData cube_r52 = sideee.addChild("cube_r52", ModelPartBuilder.create().uv(120, 286).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.9798F, -28.8575F, 4.6915F, 0.9314F, -0.1233F, -0.0524F));

		ModelPartData cube_r53 = sideee.addChild("cube_r53", ModelPartBuilder.create().uv(158, 339).cuboid(-4.0F, -3.0F, -22.0F, 7.0F, 2.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(18.4781F, -29.2153F, 28.2026F, 0.0151F, 0.0076F, -0.2269F));

		ModelPartData cube_r54 = sideee.addChild("cube_r54", ModelPartBuilder.create().uv(73, 275).cuboid(-4.0F, -3.0F, -2.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(18.2983F, -28.9433F, 6.3299F, 0.1896F, -0.1233F, -0.2269F));

		ModelPartData cube_r55 = sideee.addChild("cube_r55", ModelPartBuilder.create().uv(285, 0).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.5911F, -28.3738F, 4.2252F, 0.4514F, -0.1233F, -0.2269F));

		ModelPartData cube_r56 = sideee.addChild("cube_r56", ModelPartBuilder.create().uv(229, 115).cuboid(-4.0F, -3.0F, -10.0F, 6.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(19.2226F, -28.9256F, 4.528F, 1.455F, -0.1233F, -0.2269F));

		ModelPartData cube_r57 = sideee.addChild("cube_r57", ModelPartBuilder.create().uv(288, 10).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.5677F, -28.0045F, 3.8303F, 0.9314F, -0.1233F, -0.2269F));

		ModelPartData cube_r58 = sideee.addChild("cube_r58", ModelPartBuilder.create().uv(289, 322).cuboid(-4.0F, -3.0F, -23.0F, 7.0F, 2.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(12.3195F, -27.3045F, 28.2555F, 0.0151F, 0.0076F, -0.4014F));

		ModelPartData cube_r59 = sideee.addChild("cube_r59", ModelPartBuilder.create().uv(53, 275).cuboid(-4.0F, -3.0F, -2.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.2068F, -27.0644F, 5.4686F, 0.1896F, -0.1233F, -0.4014F));

		ModelPartData cube_r60 = sideee.addChild("cube_r60", ModelPartBuilder.create().uv(284, 87).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.5053F, -26.4781F, 3.364F, 0.4514F, -0.1233F, -0.4014F));

		ModelPartData cube_r61 = sideee.addChild("cube_r61", ModelPartBuilder.create().uv(237, 271).cuboid(-1.0F, -3.0F, -9.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(250, 115).cuboid(-4.0F, -3.0F, -7.0F, 7.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(12.5275F, -26.7713F, 3.6668F, 1.455F, -0.1233F, -0.4014F));

		ModelPartData cube_r62 = sideee.addChild("cube_r62", ModelPartBuilder.create().uv(136, 288).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.4011F, -26.051F, 2.9691F, 0.9314F, -0.1233F, -0.4014F));

		ModelPartData cube_r63 = sideee.addChild("cube_r63", ModelPartBuilder.create().uv(190, 311).cuboid(-5.0F, -3.0F, -25.0F, 13.0F, 2.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(2.4443F, -21.5927F, 28.3461F, 0.0151F, 0.0076F, -0.5834F));

		ModelPartData cube_r64 = sideee.addChild("cube_r64", ModelPartBuilder.create().uv(236, 129).cuboid(-5.0F, -3.0F, -2.0F, 13.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.4243F, -21.4175F, 3.9923F, 0.1896F, -0.1233F, -0.5834F));

		ModelPartData cube_r65 = sideee.addChild("cube_r65", ModelPartBuilder.create().uv(248, 154).cuboid(-5.0F, -3.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7316F, -20.815F, 1.8876F, 0.4514F, -0.1233F, -0.5834F));

		ModelPartData cube_r66 = sideee.addChild("cube_r66", ModelPartBuilder.create().uv(142, 217).cuboid(3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(287, 258).cuboid(4.0F, -2.0F, -6.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(102, 95).cuboid(-1.0F, -2.0F, -3.0F, 9.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.2149F, -20.8941F, 1.2046F, 1.455F, -0.1233F, -0.5834F));

		ModelPartData cube_r67 = sideee.addChild("cube_r67", ModelPartBuilder.create().uv(0, 253).cuboid(-4.0F, -3.0F, -1.0F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5553F, -20.3136F, 1.4927F, 0.9314F, -0.1233F, -0.5834F));

		ModelPartData cube_r68 = sideee.addChild("cube_r68", ModelPartBuilder.create().uv(190, 157).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -17.585F, 0.618F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r69 = sideee.addChild("cube_r69", ModelPartBuilder.create().uv(82, 70).cuboid(-4.0F, -3.0F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-30.1967F, -12.6215F, 5.5815F, 1.3682F, 0.3614F, -0.3876F));

		ModelPartData cube_r70 = sideee.addChild("cube_r70", ModelPartBuilder.create().uv(190, 144).cuboid(-5.0F, -3.0F, -1.0F, 7.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-30.1967F, -12.6215F, 5.5815F, 0.1029F, 0.3614F, -0.3876F));

		ModelPartData cube_r71 = sideee.addChild("cube_r71", ModelPartBuilder.create().uv(253, 300).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-25.9779F, -14.1397F, 4.0633F, 1.3908F, 0.3035F, -0.3185F));

		ModelPartData cube_r72 = sideee.addChild("cube_r72", ModelPartBuilder.create().uv(159, 269).cuboid(-3.0F, -3.0F, 11.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-30.8542F, -25.4168F, 6.4858F, -1.009F, 0.3035F, -0.3185F));

		ModelPartData cube_r73 = sideee.addChild("cube_r73", ModelPartBuilder.create().uv(83, 148).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-25.9779F, -14.1397F, 4.0633F, 0.1254F, 0.3035F, -0.3185F));

		ModelPartData cube_r74 = sideee.addChild("cube_r74", ModelPartBuilder.create().uv(301, 2).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-21.588F, -15.3921F, 2.8109F, 1.4088F, 0.2443F, -0.2519F));

		ModelPartData cube_r75 = sideee.addChild("cube_r75", ModelPartBuilder.create().uv(270, 0).cuboid(-3.0F, -3.0F, 11.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-25.3074F, -27.0081F, 4.8945F, -0.991F, 0.2443F, -0.2519F));

		ModelPartData cube_r76 = sideee.addChild("cube_r76", ModelPartBuilder.create().uv(148, 138).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-21.588F, -15.3921F, 2.8109F, 0.1435F, 0.2443F, -0.2519F));

		ModelPartData cube_r77 = sideee.addChild("cube_r77", ModelPartBuilder.create().uv(302, 292).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-17.0604F, -16.3692F, 1.8338F, 1.4226F, 0.1841F, -0.1872F));

		ModelPartData cube_r78 = sideee.addChild("cube_r78", ModelPartBuilder.create().uv(287, 41).cuboid(-3.0F, -3.0F, -2.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-12.4296F, -17.0635F, 1.1395F, 1.4322F, 0.1231F, -0.124F));

		ModelPartData cube_r79 = sideee.addChild("cube_r79", ModelPartBuilder.create().uv(270, 12).cuboid(-3.0F, -3.0F, 11.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-13.7226F, -28.7487F, 2.455F, -0.924F, 0.1231F, -0.124F));

		ModelPartData cube_r80 = sideee.addChild("cube_r80", ModelPartBuilder.create().uv(106, 201).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-12.4296F, -17.0635F, 1.1395F, 0.1669F, 0.1231F, -0.124F));

		ModelPartData cube_r81 = sideee.addChild("cube_r81", ModelPartBuilder.create().uv(112, 153).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(189, 56).cuboid(-2.0F, -3.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(176, 128).cuboid(-4.0F, -3.0F, 0.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.7399F, -15.7049F, 0.4837F, 1.4816F, 0.0617F, -0.0618F));

		ModelPartData cube_r82 = sideee.addChild("cube_r82", ModelPartBuilder.create().uv(302, 87).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.7357F, -17.5314F, 0.6716F, 1.438F, 0.0617F, -0.0618F));

		ModelPartData cube_r83 = sideee.addChild("cube_r83", ModelPartBuilder.create().uv(54, 205).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-6.7347F, -17.5314F, 0.6716F, 0.1726F, 0.0617F, -0.0618F));

		ModelPartData cube_r84 = sideee.addChild("cube_r84", ModelPartBuilder.create().uv(15, 37).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -12.0306F, 0.1362F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r85 = sideee.addChild("cube_r85", ModelPartBuilder.create().uv(189, 43).cuboid(-1.0F, -3.0F, -2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(95, 161).cuboid(-2.0F, -3.0F, -1.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(171, 43).cuboid(-4.0F, -3.0F, 0.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -12.8978F, 0.2206F, 1.5272F, 0.0F, 0.0F));

		ModelPartData cube_r86 = sideee.addChild("cube_r86", ModelPartBuilder.create().uv(71, 280).cuboid(-4.0F, -3.0F, -2.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -15.7586F, 0.4299F, 1.4835F, 0.0F, 0.0F));

		ModelPartData cube_r87 = sideee.addChild("cube_r87", ModelPartBuilder.create().uv(302, 301).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -17.585F, 0.618F, 1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r88 = sideee.addChild("cube_r88", ModelPartBuilder.create().uv(256, 38).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8858F, -1.48F, -0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r89 = sideee.addChild("cube_r89", ModelPartBuilder.create().uv(174, 269).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.9406F, -1.7368F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r90 = sideee.addChild("cube_r90", ModelPartBuilder.create().uv(177, 274).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.987F, -1.8648F, -0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r91 = sideee.addChild("cube_r91", ModelPartBuilder.create().uv(241, 274).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.077F, -1.7339F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r92 = sideee.addChild("cube_r92", ModelPartBuilder.create().uv(145, 276).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.132F, -1.4753F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r93 = sideee.addChild("cube_r93", ModelPartBuilder.create().uv(177, 279).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.799F, -1.0885F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r94 = sideee.addChild("cube_r94", ModelPartBuilder.create().uv(312, 194).cuboid(-1.0F, -4.6756F, -0.2627F, 57.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r95 = sideee.addChild("cube_r95", ModelPartBuilder.create().uv(98, 311).cuboid(-0.9128F, -7.0F, -0.0038F, 58.0F, 11.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.443F, -3.265F, -1.0051F, 0.0F, -0.0873F, -0.0873F));

		ModelPartData cube_r96 = sideee.addChild("cube_r96", ModelPartBuilder.create().uv(312, 177).cuboid(-0.9128F, -16.0F, -0.0038F, 58.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.6632F, -2.7624F, -1.0051F, 0.0F, -0.0873F, 0.0873F));

		ModelPartData cube_r97 = sideee.addChild("cube_r97", ModelPartBuilder.create().uv(301, 139).cuboid(-1.0F, -1.3244F, -0.2627F, 61.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.1743F, -17.9817F, 0.0F, 0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r98 = sideee.addChild("cube_r98", ModelPartBuilder.create().uv(10, 124).cuboid(-11.0436F, -7.9564F, 3.9981F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(89.0333F, -11.9043F, -6.9113F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r99 = sideee.addChild("cube_r99", ModelPartBuilder.create().uv(243, 0).cuboid(-11.0436F, -7.9564F, 3.9981F, 15.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 115).cuboid(-13.0436F, -7.9564F, 3.9981F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(74.0333F, -11.9043F, -6.9113F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r100 = sideee.addChild("cube_r100", ModelPartBuilder.create().uv(38, 20).cuboid(-13.0436F, -7.9564F, 3.9981F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(72.0333F, -11.9043F, -6.9113F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r101 = sideee.addChild("cube_r101", ModelPartBuilder.create().uv(220, 0).cuboid(-13.0436F, -7.9564F, 3.9981F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(69.0333F, -11.9043F, -6.9113F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r102 = sideee.addChild("cube_r102", ModelPartBuilder.create().uv(106, 243).cuboid(-13.0436F, -7.9564F, 3.9981F, 14.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(55.0333F, -11.9043F, -6.9113F, -0.2618F, 0.0436F, 0.0F));

		ModelPartData cube_r103 = sideee.addChild("cube_r103", ModelPartBuilder.create().uv(20, 56).cuboid(1.9564F, -12.9564F, 3.9981F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 128).cuboid(0.9564F, -12.9564F, 3.9981F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(220, 30).cuboid(-13.0436F, -12.9564F, 3.9981F, 14.0F, 11.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(55.0702F, -0.0182F, -6.0641F, 0.0436F, 0.0436F, 0.0F));

		ModelPartData cube_r104 = sideee.addChild("cube_r104", ModelPartBuilder.create().uv(248, 158).cuboid(-13.0436F, -4.9564F, 3.9981F, 14.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(55.1394F, 3.7821F, -4.4793F, 0.3054F, 0.0436F, 0.0F));

		ModelPartData fender3 = side2.addChild("fender3", ModelPartBuilder.create().uv(128, 185).cuboid(-8.5194F, -6.9718F, 2.6687F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(146, 89).cuboid(17.5768F, -6.9718F, 2.6687F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-97.0867F, 13.3015F, -56.2934F));

		ModelPartData cube_r105 = fender3.addChild("cube_r105", ModelPartBuilder.create().uv(84, 218).cuboid(-1.0F, -5.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(23.6058F, -10.6687F, 13.1722F, 2.7346F, 0.0F, 2.8685F));

		ModelPartData cube_r106 = fender3.addChild("cube_r106", ModelPartBuilder.create().uv(210, 223).cuboid(-1.0F, -8.0F, -2.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(23.4535F, -11.2125F, 15.4339F, 2.2982F, 0.0F, 2.8685F));

		ModelPartData cube_r107 = fender3.addChild("cube_r107", ModelPartBuilder.create().uv(176, 175).cuboid(-3.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.2532F, -5.8472F, 10.9292F, 2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r108 = fender3.addChild("cube_r108", ModelPartBuilder.create().uv(176, 173).cuboid(-3.0F, -9.0F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.9606F, -2.0835F, 5.9125F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r109 = fender3.addChild("cube_r109", ModelPartBuilder.create().uv(176, 130).cuboid(-3.0F, -10.0F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.326F, -5.4601F, 12.3492F, 2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r110 = fender3.addChild("cube_r110", ModelPartBuilder.create().uv(0, 166).cuboid(-3.0F, -10.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.0155F, -1.7916F, 5.6238F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r111 = fender3.addChild("cube_r111", ModelPartBuilder.create().uv(111, 165).cuboid(-3.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4932F, -4.5702F, -1.4885F, -2.3705F, 0.0F, 2.9558F));

		ModelPartData cube_r112 = fender3.addChild("cube_r112", ModelPartBuilder.create().uv(98, 165).cuboid(-3.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.9622F, -2.0753F, 5.3267F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r113 = fender3.addChild("cube_r113", ModelPartBuilder.create().uv(0, 164).cuboid(-3.0F, -8.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.5155F, -4.4517F, 10.5353F, 2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r114 = fender3.addChild("cube_r114", ModelPartBuilder.create().uv(111, 163).cuboid(-3.0F, -8.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.9073F, -2.3672F, 5.6154F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r115 = fender3.addChild("cube_r115", ModelPartBuilder.create().uv(28, 186).cuboid(-3.0F, -10.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0155F, -1.7916F, 13.6238F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r116 = fender3.addChild("cube_r116", ModelPartBuilder.create().uv(34, 186).cuboid(-3.0F, -8.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.9073F, -2.3672F, 13.6154F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r117 = fender3.addChild("cube_r117", ModelPartBuilder.create().uv(183, 85).cuboid(-3.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 184).cuboid(-1.0F, -12.0F, -13.0F, 2.0F, 6.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(23.9622F, -2.0753F, 13.3267F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r118 = fender3.addChild("cube_r118", ModelPartBuilder.create().uv(115, 184).cuboid(-3.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.4932F, -4.5702F, 6.5115F, -2.3705F, 0.0F, 2.9558F));

		ModelPartData cube_r119 = fender3.addChild("cube_r119", ModelPartBuilder.create().uv(115, 186).cuboid(-3.0F, -8.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.5155F, -4.4517F, 18.5353F, 2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r120 = fender3.addChild("cube_r120", ModelPartBuilder.create().uv(183, 43).cuboid(-3.0F, -10.0F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.326F, -5.4601F, 20.3492F, 2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r121 = fender3.addChild("cube_r121", ModelPartBuilder.create().uv(152, 177).cuboid(-3.0F, -9.0F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.9606F, -2.0835F, 13.9125F, 3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r122 = fender3.addChild("cube_r122", ModelPartBuilder.create().uv(28, 188).cuboid(-3.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.2532F, -5.8472F, 18.9292F, 2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r123 = fender3.addChild("cube_r123", ModelPartBuilder.create().uv(151, 151).cuboid(0.0F, -6.0F, -13.0F, 2.0F, 4.0F, 13.0F, new Dilation(0.0F))
		.uv(0, 83).cuboid(-1.0F, -6.0F, -9.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 83).cuboid(-1.0F, -6.0F, -6.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 56).cuboid(-1.0F, -6.0F, -3.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(145, 222).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 179).cuboid(-1.0F, -12.0F, -13.0F, 2.0F, 6.0F, 15.0F, new Dilation(0.0F))
		.uv(92, 82).cuboid(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0997F, 3.8584F, 13.6694F, 3.1273F, 0.0F, 3.0431F));

		ModelPartData cube_r124 = fender3.addChild("cube_r124", ModelPartBuilder.create().uv(278, 152).cuboid(-1.0F, -12.0F, 1.0F, 6.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.6929F, 3.9025F, 13.4056F, 3.1269F, 0.2181F, 3.0399F));

		ModelPartData cube_r125 = fender3.addChild("cube_r125", ModelPartBuilder.create().uv(146, 56).cuboid(-1.0F, -12.0F, -14.0F, 2.0F, 6.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(23.3281F, -7.8904F, 12.9841F, 3.1273F, 0.0F, 2.8685F));

		ModelPartData cube_r126 = fender3.addChild("cube_r126", ModelPartBuilder.create().uv(0, 83).cuboid(0.0F, -32.0F, -15.0F, 2.0F, 9.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(26.4318F, -21.9693F, 11.7407F, 3.1367F, -0.0135F, 1.6468F));

		ModelPartData cube_r127 = fender3.addChild("cube_r127", ModelPartBuilder.create().uv(64, 125).cuboid(0.0F, -23.0F, -15.0F, 2.0F, 7.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(26.1923F, -19.9773F, 11.7673F, 3.1355F, -0.013F, 1.7341F));

		ModelPartData cube_r128 = fender3.addChild("cube_r128", ModelPartBuilder.create().uv(0, 56).cuboid(0.0F, -16.0F, -15.0F, 2.0F, 11.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(25.9055F, -18.6114F, 11.785F, 3.1344F, -0.0124F, 1.8214F));

		ModelPartData cube_r129 = fender3.addChild("cube_r129", ModelPartBuilder.create().uv(106, 184).cuboid(-1.0F, -7.0F, -15.0F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(24.4997F, -14.0473F, 11.8889F, 3.1273F, 0.0F, 2.8685F));

		ModelPartData cube_r130 = fender3.addChild("cube_r130", ModelPartBuilder.create().uv(171, 0).cuboid(0.0F, -7.0F, -1.0F, 1.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(20.3668F, -0.3507F, 5.4534F, 3.0488F, 0.9066F, 2.9568F));

		ModelPartData cube_r131 = fender3.addChild("cube_r131", ModelPartBuilder.create().uv(159, 251).cuboid(0.0F, -7.0F, -8.0F, 1.0F, 3.0F, 9.0F, new Dilation(0.0F))
		.uv(128, 128).cuboid(0.0F, -7.0F, 1.0F, 1.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(23.6485F, -0.6341F, 3.9871F, 3.0839F, -0.1383F, 3.0379F));

		ModelPartData cube_r132 = fender3.addChild("cube_r132", ModelPartBuilder.create().uv(0, 115).cuboid(0.0F, -7.0F, 1.0F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(21.7608F, 4.7734F, 4.3298F, 3.0839F, -0.1383F, -2.8962F));

		ModelPartData cube_r133 = fender3.addChild("cube_r133", ModelPartBuilder.create().uv(210, 205).cuboid(0.0F, -7.0F, -8.0F, 1.0F, 6.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(16.5769F, -1.7228F, 4.6159F, 2.9941F, 0.0259F, -1.9858F));

		ModelPartData cube_r134 = fender3.addChild("cube_r134", ModelPartBuilder.create().uv(216, 145).cuboid(0.0F, -7.0F, -8.0F, 1.0F, 6.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(23.1212F, -6.5114F, 3.6444F, 3.0839F, -0.1383F, 2.9507F));

		ModelPartData cube_r135 = fender3.addChild("cube_r135", ModelPartBuilder.create().uv(157, 213).cuboid(0.0F, -9.0F, -8.0F, 1.0F, 6.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 213).cuboid(-1.0F, -7.0F, -8.0F, 1.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(22.6673F, -10.3208F, 3.416F, 3.0839F, -0.1383F, 2.8634F));

		ModelPartData cube_r136 = fender3.addChild("cube_r136", ModelPartBuilder.create().uv(22, 235).cuboid(0.0F, -33.0F, -8.0F, 2.0F, 9.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(26.424F, -21.1525F, 1.8055F, -3.0308F, -0.101F, 1.6321F));

		ModelPartData cube_r137 = fender3.addChild("cube_r137", ModelPartBuilder.create().uv(242, 10).cuboid(0.0F, -24.0F, -8.0F, 2.0F, 7.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(26.206F, -19.0819F, 2.0264F, -3.04F, -0.1102F, 1.7193F));

		ModelPartData cube_r138 = fender3.addChild("cube_r138", ModelPartBuilder.create().uv(220, 10).cuboid(0.0F, -17.0F, -8.0F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(25.9246F, -17.6357F, 2.1959F, -3.05F, -0.1187F, 1.8068F));

		ModelPartData cube_r139 = fender3.addChild("cube_r139", ModelPartBuilder.create().uv(128, 201).cuboid(-1.0F, -7.0F, -8.0F, 3.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(23.6673F, -13.3208F, 3.416F, 3.0839F, -0.1383F, 2.8634F));

		ModelPartData cube_r140 = fender3.addChild("cube_r140", ModelPartBuilder.create().uv(106, 125).cuboid(0.0F, -24.0F, -3.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(24.9557F, -18.652F, -3.0605F, -2.8615F, -0.1416F, 1.7015F));

		ModelPartData cube_r141 = fender3.addChild("cube_r141", ModelPartBuilder.create().uv(105, 138).cuboid(0.0F, -17.0F, -3.0F, 2.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(24.7032F, -17.2083F, -2.8337F, -2.8745F, -0.1652F, 1.7865F));

		ModelPartData cube_r142 = fender3.addChild("cube_r142", ModelPartBuilder.create().uv(283, 128).cuboid(-1.0F, -7.0F, -3.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(22.7268F, -12.9304F, -0.5715F, 3.1287F, -0.3127F, 2.858F));

		ModelPartData cube_r143 = fender3.addChild("cube_r143", ModelPartBuilder.create().uv(0, 37).cuboid(0.0F, -40.0F, 1.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(28.0386F, -27.2239F, -3.509F, -2.744F, -0.9232F, 1.1707F));

		ModelPartData cube_r144 = fender3.addChild("cube_r144", ModelPartBuilder.create().uv(53, 235).cuboid(0.0F, -35.0F, 1.0F, 2.0F, 9.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(27.9821F, -22.7889F, -3.509F, -2.744F, -0.9232F, 1.3016F));

		ModelPartData cube_r145 = fender3.addChild("cube_r145", ModelPartBuilder.create().uv(64, 128).cuboid(0.0F, -26.0F, 1.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(27.4837F, -19.5357F, -3.509F, -2.744F, -0.9232F, 1.4325F));

		ModelPartData cube_r146 = fender3.addChild("cube_r146", ModelPartBuilder.create().uv(138, 141).cuboid(0.0F, -19.0F, 5.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(210, 205).cuboid(0.0F, -19.0F, 1.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(205, 15).cuboid(0.0F, -19.0F, 1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(26.4866F, -16.4948F, -3.509F, -2.744F, -0.9232F, 1.607F));

		ModelPartData cube_r147 = fender3.addChild("cube_r147", ModelPartBuilder.create().uv(146, 78).cuboid(0.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.65F, -12.6749F, -2.1251F, -3.093F, -0.9232F, 2.8287F));

		ModelPartData cube_r148 = fender3.addChild("cube_r148", ModelPartBuilder.create().uv(180, 56).cuboid(0.0F, -7.0F, -4.0F, 2.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(17.1051F, -11.4406F, -3.5639F, -3.0024F, -1.3581F, 2.7314F));

		ModelPartData cube_r149 = fender3.addChild("cube_r149", ModelPartBuilder.create().uv(128, 138).cuboid(-1.0F, -6.0F, 0.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.8585F, -6.0055F, -2.6416F, -3.118F, -1.3559F, 2.9387F));

		ModelPartData cube_r150 = fender3.addChild("cube_r150", ModelPartBuilder.create().uv(190, 0).cuboid(-1.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.3176F, -6.6307F, -1.9707F, -3.1333F, -0.9196F, 2.9552F));

		ModelPartData cube_r151 = fender3.addChild("cube_r151", ModelPartBuilder.create().uv(285, 265).cuboid(-1.0F, -6.0F, -4.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(17.8585F, -6.0055F, -2.6416F, -3.118F, -1.3559F, 2.9387F));

		ModelPartData cube_r152 = fender3.addChild("cube_r152", ModelPartBuilder.create().uv(171, 21).cuboid(-1.0F, -7.0F, -2.0F, 3.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.887F, 0.1372F, -1.8445F, 3.1106F, -0.9169F, 3.081F));

		ModelPartData cube_r153 = fender3.addChild("cube_r153", ModelPartBuilder.create().uv(42, 137).cuboid(-1.0F, -7.0F, -4.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(18.3874F, 0.449F, -2.5244F, 3.0543F, -1.3526F, 3.1416F));

		ModelPartData cube_r154 = fender3.addChild("cube_r154", ModelPartBuilder.create().uv(255, 14).cuboid(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(22.6713F, 2.926F, -1.2377F, 0.0F, -2.2253F, 0.0F));

		ModelPartData cube_r155 = fender3.addChild("cube_r155", ModelPartBuilder.create().uv(276, 287).cuboid(-1.0F, -3.0F, -4.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(18.3651F, 2.926F, -2.5293F, 0.0F, -1.789F, 0.0F));

		ModelPartData cube_r156 = fender3.addChild("cube_r156", ModelPartBuilder.create().uv(142, 211).cuboid(-1.0F, -7.0F, 2.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(216, 296).cuboid(-1.0F, -7.0F, 1.0F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(14.9463F, 6.5309F, -4.6889F, 0.1201F, 0.4205F, 0.2875F));

		ModelPartData cube_r157 = fender3.addChild("cube_r157", ModelPartBuilder.create().uv(281, 276).cuboid(-1.0F, -7.0F, 1.0F, 3.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.5574F, 0.0282F, -5.4402F, 0.0F, 0.4363F, 0.0F));

		ModelPartData cube_r158 = fender3.addChild("cube_r158", ModelPartBuilder.create().uv(286, 24).cuboid(-1.0F, -6.0F, 1.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.8403F, -5.6957F, -5.4402F, 0.0F, 0.4363F, -0.4363F));

		ModelPartData cube_r159 = fender3.addChild("cube_r159", ModelPartBuilder.create().uv(227, 271).cuboid(-1.0F, -8.0F, 1.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(15.6469F, -9.7314F, -5.4402F, 0.0F, 0.4363F, -1.0908F));

		ModelPartData cube_r160 = fender3.addChild("cube_r160", ModelPartBuilder.create().uv(0, 179).cuboid(-2.0F, -8.8199F, 1.0F, 3.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -13.0842F, -5.4402F, 0.0F, -0.4363F, 1.5708F));

		ModelPartData cube_r161 = fender3.addChild("cube_r161", ModelPartBuilder.create().uv(0, 272).cuboid(-2.0F, -8.0F, 1.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.5895F, -9.7314F, -5.4402F, 0.0F, -0.4363F, 1.0908F));

		ModelPartData cube_r162 = fender3.addChild("cube_r162", ModelPartBuilder.create().uv(159, 286).cuboid(-2.0F, -6.0F, 1.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.7829F, -5.6957F, -5.4402F, 0.0F, -0.4363F, 0.4363F));

		ModelPartData cube_r163 = fender3.addChild("cube_r163", ModelPartBuilder.create().uv(196, 216).cuboid(-1.0F, -7.0F, 2.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.8889F, 6.5309F, -4.6889F, 0.1201F, -0.4205F, -0.2875F));

		ModelPartData cube_r164 = fender3.addChild("cube_r164", ModelPartBuilder.create().uv(233, 283).cuboid(-2.0F, -7.0F, 1.0F, 3.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.5001F, 0.0282F, -5.4402F, 0.0F, -0.4363F, 0.0F));

		ModelPartData cube_r165 = fender3.addChild("cube_r165", ModelPartBuilder.create().uv(0, 290).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(16.0821F, 6.3388F, -3.9702F, 0.0F, 0.2618F, 0.2618F));

		ModelPartData cube_r166 = fender3.addChild("cube_r166", ModelPartBuilder.create().uv(177, 261).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(16.7992F, 6.5309F, -0.3313F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r167 = fender3.addChild("cube_r167", ModelPartBuilder.create().uv(35, 267).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(17.8345F, 0.0282F, -3.9702F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r168 = fender3.addChild("cube_r168", ModelPartBuilder.create().uv(253, 280).cuboid(-1.0F, -6.0F, 3.0F, 2.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-6.9403F, -6.2354F, -3.9702F, 0.0F, -0.2618F, 0.4363F));

		ModelPartData cube_r169 = fender3.addChild("cube_r169", ModelPartBuilder.create().uv(128, 201).cuboid(-1.0F, -6.0F, 3.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.6131F, -6.5491F, -0.3313F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r170 = fender3.addChild("cube_r170", ModelPartBuilder.create().uv(267, 280).cuboid(-1.0F, -6.0F, 3.0F, 2.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(17.9977F, -6.2354F, -3.9702F, 0.0F, 0.2618F, -0.4363F));

		ModelPartData cube_r171 = fender3.addChild("cube_r171", ModelPartBuilder.create().uv(207, 0).cuboid(-1.0F, -6.0F, 3.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.6705F, -6.5491F, -0.3313F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r172 = fender3.addChild("cube_r172", ModelPartBuilder.create().uv(168, 151).cuboid(-1.0F, -8.0F, 3.0F, 2.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-5.1792F, -10.8641F, -3.9702F, 0.0F, -0.2618F, 1.0908F));

		ModelPartData cube_r173 = fender3.addChild("cube_r173", ModelPartBuilder.create().uv(171, 32).cuboid(-1.0F, -8.0F, 3.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.522F, -11.5226F, -0.3313F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r174 = fender3.addChild("cube_r174", ModelPartBuilder.create().uv(106, 184).cuboid(-1.0F, -8.0F, 3.0F, 2.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(16.2366F, -10.8641F, -3.9702F, 0.0F, 0.2618F, -1.0908F));

		ModelPartData cube_r175 = fender3.addChild("cube_r175", ModelPartBuilder.create().uv(205, 32).cuboid(-1.0F, -8.0F, 3.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(16.5794F, -11.5226F, -0.3313F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r176 = fender3.addChild("cube_r176", ModelPartBuilder.create().uv(0, 147).cuboid(-1.0F, -8.8199F, 3.0F, 2.0F, 9.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -14.3612F, -3.9702F, 0.0F, -0.2618F, 1.5708F));

		ModelPartData cube_r177 = fender3.addChild("cube_r177", ModelPartBuilder.create().uv(143, 199).cuboid(-1.0F, -8.8199F, 3.0F, 2.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -15.1036F, -0.3313F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r178 = fender3.addChild("cube_r178", ModelPartBuilder.create().uv(216, 288).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-5.0975F, 6.3388F, -3.6421F, 0.0F, -0.2618F, -0.2618F));

		ModelPartData cube_r179 = fender3.addChild("cube_r179", ModelPartBuilder.create().uv(241, 264).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.7418F, 6.5309F, -0.3313F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r180 = fender3.addChild("cube_r180", ModelPartBuilder.create().uv(141, 264).cuboid(-1.0F, -7.0F, 3.0F, 2.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-6.7771F, 0.0282F, -3.9702F, 0.0F, -0.2618F, 0.0F));

		ModelPartData side3 = group.addChild("side3", ModelPartBuilder.create(), ModelTransform.pivot(101.0867F, -16.3015F, -4.2934F));

		ModelPartData fender4 = side3.addChild("fender4", ModelPartBuilder.create().uv(0, 124).cuboid(-8.5194F, -6.9718F, -4.6687F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(64, 115).cuboid(17.5768F, -6.9718F, -4.6687F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-179.0867F, 13.3015F, 56.2934F));

		ModelPartData cube_r181 = fender4.addChild("cube_r181", ModelPartBuilder.create().uv(15, 257).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(14.9463F, 6.5309F, 4.6889F, -0.1201F, -0.4205F, 0.2875F));

		ModelPartData cube_r182 = fender4.addChild("cube_r182", ModelPartBuilder.create().uv(42, 124).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.5574F, 0.0282F, 5.4402F, 0.0F, -0.4363F, 0.0F));

		ModelPartData cube_r183 = fender4.addChild("cube_r183", ModelPartBuilder.create().uv(190, 170).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.8403F, -5.6957F, 5.4402F, 0.0F, -0.4363F, -0.4363F));

		ModelPartData cube_r184 = fender4.addChild("cube_r184", ModelPartBuilder.create().uv(20, 56).cuboid(-1.0F, -8.0F, -5.0F, 2.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(15.6469F, -9.7314F, 5.4402F, 0.0F, -0.4363F, -1.0908F));

		ModelPartData cube_r185 = fender4.addChild("cube_r185", ModelPartBuilder.create().uv(183, 72).cuboid(-1.0F, -8.8199F, -5.0F, 2.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -13.0842F, 5.4402F, 0.0F, 0.4363F, 1.5708F));

		ModelPartData cube_r186 = fender4.addChild("cube_r186", ModelPartBuilder.create().uv(42, 56).cuboid(-1.0F, -8.0F, -5.0F, 2.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.5895F, -9.7314F, 5.4402F, 0.0F, 0.4363F, 1.0908F));

		ModelPartData cube_r187 = fender4.addChild("cube_r187", ModelPartBuilder.create().uv(0, 200).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.7829F, -5.6957F, 5.4402F, 0.0F, 0.4363F, 0.4363F));

		ModelPartData cube_r188 = fender4.addChild("cube_r188", ModelPartBuilder.create().uv(293, 189).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.8889F, 6.5309F, 4.6889F, -0.1201F, 0.4205F, -0.2875F));

		ModelPartData cube_r189 = fender4.addChild("cube_r189", ModelPartBuilder.create().uv(84, 125).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.5001F, 0.0282F, 5.4402F, 0.0F, 0.4363F, 0.0F));

		ModelPartData cube_r190 = fender4.addChild("cube_r190", ModelPartBuilder.create().uv(0, 37).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(16.7992F, 6.5309F, 0.3313F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r191 = fender4.addChild("cube_r191", ModelPartBuilder.create().uv(128, 138).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.6131F, -6.5491F, 0.3313F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r192 = fender4.addChild("cube_r192", ModelPartBuilder.create().uv(146, 56).cuboid(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(18.6705F, -6.5491F, 0.3313F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r193 = fender4.addChild("cube_r193", ModelPartBuilder.create().uv(82, 56).cuboid(-1.0F, -8.0F, -5.0F, 2.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-5.522F, -11.5226F, 0.3313F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r194 = fender4.addChild("cube_r194", ModelPartBuilder.create().uv(82, 82).cuboid(-1.0F, -8.0F, -5.0F, 2.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(16.5794F, -11.5226F, 0.3313F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r195 = fender4.addChild("cube_r195", ModelPartBuilder.create().uv(0, 56).cuboid(-1.0F, -8.8199F, -5.0F, 2.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -15.1036F, 0.3313F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r196 = fender4.addChild("cube_r196", ModelPartBuilder.create().uv(190, 201).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-5.7418F, 6.5309F, 0.3313F, 0.0F, 0.0F, -0.2618F));

		ModelPartData sideee3 = fender4.addChild("sideee3", ModelPartBuilder.create().uv(255, 9).cuboid(-2.0F, -11.0306F, 0.8638F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(18.6053F, 1.1271F, 1.6336F));

		ModelPartData cube_r197 = sideee3.addChild("cube_r197", ModelPartBuilder.create().uv(20, 137).cuboid(-5.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(190, 12).cuboid(-5.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-30.1967F, -12.6215F, -5.5815F, -0.7137F, -0.3614F, -0.3876F));

		ModelPartData cube_r198 = sideee3.addChild("cube_r198", ModelPartBuilder.create().uv(148, 151).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(253, 102).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-25.9779F, -14.1397F, -4.0633F, -0.7363F, -0.3035F, -0.3185F));

		ModelPartData cube_r199 = sideee3.addChild("cube_r199", ModelPartBuilder.create().uv(128, 173).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(106, 289).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-21.588F, -15.3921F, -2.8109F, -0.7543F, -0.2443F, -0.2519F));

		ModelPartData cube_r200 = sideee3.addChild("cube_r200", ModelPartBuilder.create().uv(20, 56).cuboid(-3.0F, -3.0F, -11.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-17.0604F, -16.3692F, -1.8338F, -0.1572F, -0.1841F, -0.1872F));

		ModelPartData cube_r201 = sideee3.addChild("cube_r201", ModelPartBuilder.create().uv(150, 173).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(173, 293).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-17.0604F, -16.3692F, -1.8338F, -0.7681F, -0.1841F, -0.1872F));

		ModelPartData cube_r202 = sideee3.addChild("cube_r202", ModelPartBuilder.create().uv(106, 197).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(294, 176).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-12.4296F, -17.0635F, -1.1395F, -0.7777F, -0.1231F, -0.124F));

		ModelPartData cube_r203 = sideee3.addChild("cube_r203", ModelPartBuilder.create().uv(228, 167).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(277, 299).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.7347F, -17.5314F, -0.6716F, -0.7835F, -0.0617F, -0.0618F));

		ModelPartData cube_r204 = sideee3.addChild("cube_r204", ModelPartBuilder.create().uv(54, 218).cuboid(21.0F, -3.0F, -2.0F, 12.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -17.585F, -1.618F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r205 = sideee3.addChild("cube_r205", ModelPartBuilder.create().uv(128, 125).cuboid(-4.0F, -3.0F, -1.0F, 80.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -17.585F, -0.618F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r206 = sideee3.addChild("cube_r206", ModelPartBuilder.create().uv(146, 106).cuboid(-4.0F, -3.0F, -1.0F, 80.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(84, 138).cuboid(-11.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(73, 196).cuboid(-11.0F, -3.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -17.585F, -0.618F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r207 = sideee3.addChild("cube_r207", ModelPartBuilder.create().uv(109, 98).cuboid(-4.0F, -3.0F, 1.0F, 4.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(43.4124F, -25.5754F, -7.0113F, -0.9278F, -0.1574F, 0.1409F));

		ModelPartData cube_r208 = sideee3.addChild("cube_r208", ModelPartBuilder.create().uv(0, 46).cuboid(0.0F, -3.0F, 1.0F, 18.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(101, 56).cuboid(-4.0F, -3.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(42.4018F, -25.8284F, -7.0291F, -0.9314F, 0.1233F, 0.3491F));

		ModelPartData cube_r209 = sideee3.addChild("cube_r209", ModelPartBuilder.create().uv(146, 100).cuboid(-4.0F, -3.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(42.4661F, -26.5577F, -8.554F, -0.1896F, 0.1233F, 0.3491F));

		ModelPartData cube_r210 = sideee3.addChild("cube_r210", ModelPartBuilder.create().uv(217, 87).cuboid(-4.0F, -3.0F, -25.0F, 22.0F, 2.0F, 13.0F, new Dilation(0.0F))
		.uv(319, 23).cuboid(-4.0F, -3.0F, -12.0F, 22.0F, 2.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(42.5051F, -26.7032F, -9.4903F, -0.0151F, -0.0076F, 0.3491F));

		ModelPartData cube_r211 = sideee3.addChild("cube_r211", ModelPartBuilder.create().uv(190, 128).cuboid(-4.0F, -3.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(42.4684F, -26.1546F, -7.4241F, -0.4514F, 0.1233F, 0.3491F));

		ModelPartData cube_r212 = sideee3.addChild("cube_r212", ModelPartBuilder.create().uv(247, 318).cuboid(-4.0F, -3.0F, -21.0F, 12.0F, 2.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(31.2293F, -29.2897F, -8.0139F, -0.0151F, -0.0076F, 0.1745F));

		ModelPartData cube_r213 = sideee3.addChild("cube_r213", ModelPartBuilder.create().uv(243, 193).cuboid(-4.0F, -3.0F, -2.0F, 12.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(31.2161F, -29.1396F, -7.0777F, -0.1896F, 0.1233F, 0.1745F));

		ModelPartData cube_r214 = sideee3.addChild("cube_r214", ModelPartBuilder.create().uv(200, 121).cuboid(-4.0F, -3.0F, -1.0F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(31.2884F, -28.7431F, -5.9477F, -0.4514F, 0.1233F, 0.1745F));

		ModelPartData cube_r215 = sideee3.addChild("cube_r215", ModelPartBuilder.create().uv(171, 21).cuboid(-4.0F, -3.0F, 1.0F, 12.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(32.2569F, -29.2048F, -6.1274F, -1.455F, 0.1233F, 0.1745F));

		ModelPartData cube_r216 = sideee3.addChild("cube_r216", ModelPartBuilder.create().uv(73, 251).cuboid(-4.0F, -3.0F, -1.0F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(31.2795F, -28.4102F, -5.5528F, -0.9314F, 0.1233F, 0.1745F));

		ModelPartData cube_r217 = sideee3.addChild("cube_r217", ModelPartBuilder.create().uv(0, 341).cuboid(-4.0F, -3.0F, -22.0F, 7.0F, 2.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(24.7331F, -29.7032F, -7.1527F, -0.0151F, -0.0076F, -0.0524F));

		ModelPartData cube_r218 = sideee3.addChild("cube_r218", ModelPartBuilder.create().uv(14, 213).cuboid(-4.0F, -3.0F, -2.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(24.754F, -29.554F, -6.2165F, -0.1896F, 0.1233F, -0.0524F));

		ModelPartData cube_r219 = sideee3.addChild("cube_r219", ModelPartBuilder.create().uv(270, 265).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.9137F, -29.1839F, -5.0865F, -0.4514F, 0.1233F, -0.0524F));

		ModelPartData cube_r220 = sideee3.addChild("cube_r220", ModelPartBuilder.create().uv(20, 10).cuboid(-4.0F, -3.0F, 1.0F, 7.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(25.2231F, -29.6612F, -5.2662F, -1.455F, 0.1233F, -0.0524F));

		ModelPartData cube_r221 = sideee3.addChild("cube_r221", ModelPartBuilder.create().uv(274, 121).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.9798F, -28.8575F, -4.6915F, -0.9314F, 0.1233F, -0.0524F));

		ModelPartData cube_r222 = sideee3.addChild("cube_r222", ModelPartBuilder.create().uv(121, 323).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(18.4781F, -29.2153F, -28.2026F, -0.0151F, -0.0076F, -0.2269F));

		ModelPartData cube_r223 = sideee3.addChild("cube_r223", ModelPartBuilder.create().uv(270, 51).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(18.2983F, -28.9433F, -6.3299F, -0.1896F, 0.1233F, -0.2269F));

		ModelPartData cube_r224 = sideee3.addChild("cube_r224", ModelPartBuilder.create().uv(278, 134).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.5911F, -28.3738F, -4.2252F, -0.4514F, 0.1233F, -0.2269F));

		ModelPartData cube_r225 = sideee3.addChild("cube_r225", ModelPartBuilder.create().uv(224, 205).cuboid(-4.0F, -3.0F, 1.0F, 6.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(19.2226F, -28.9256F, -4.528F, -1.455F, 0.1233F, -0.2269F));

		ModelPartData cube_r226 = sideee3.addChild("cube_r226", ModelPartBuilder.create().uv(27, 279).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.5677F, -28.0045F, -3.8303F, -0.9314F, 0.1233F, -0.2269F));

		ModelPartData cube_r227 = sideee3.addChild("cube_r227", ModelPartBuilder.create().uv(321, 63).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(12.3195F, -27.3045F, -28.2555F, -0.0151F, -0.0076F, -0.4014F));

		ModelPartData cube_r228 = sideee3.addChild("cube_r228", ModelPartBuilder.create().uv(273, 193).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.2068F, -27.0644F, -5.4686F, -0.1896F, 0.1233F, -0.4014F));

		ModelPartData cube_r229 = sideee3.addChild("cube_r229", ModelPartBuilder.create().uv(53, 280).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.5053F, -26.4781F, -3.364F, -0.4514F, 0.1233F, -0.4014F));

		ModelPartData cube_r230 = sideee3.addChild("cube_r230", ModelPartBuilder.create().uv(90, 255).cuboid(-1.0F, -3.0F, 7.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(106, 250).cuboid(-4.0F, -3.0F, 1.0F, 7.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(12.5275F, -26.7713F, -3.6668F, -1.455F, 0.1233F, -0.4014F));

		ModelPartData cube_r231 = sideee3.addChild("cube_r231", ModelPartBuilder.create().uv(283, 208).cuboid(-4.0F, -3.0F, -1.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.4011F, -26.051F, -2.9691F, -0.9314F, 0.1233F, -0.4014F));

		ModelPartData cube_r232 = sideee3.addChild("cube_r232", ModelPartBuilder.create().uv(159, 258).cuboid(-5.0F, -3.0F, -1.0F, 13.0F, 2.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(2.4443F, -21.5927F, -28.3461F, -0.0151F, -0.0076F, -0.5834F));

		ModelPartData cube_r233 = sideee3.addChild("cube_r233", ModelPartBuilder.create().uv(150, 168).cuboid(-5.0F, -3.0F, -1.0F, 13.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.4243F, -21.4175F, -3.9923F, -0.1896F, 0.1233F, -0.5834F));

		ModelPartData cube_r234 = sideee3.addChild("cube_r234", ModelPartBuilder.create().uv(246, 198).cuboid(-5.0F, -3.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7316F, -20.815F, -1.8876F, -0.4514F, 0.1233F, -0.5834F));

		ModelPartData cube_r235 = sideee3.addChild("cube_r235", ModelPartBuilder.create().uv(208, 12).cuboid(3.0F, -2.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(150, 160).cuboid(4.0F, -2.0F, 3.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 93).cuboid(-1.0F, -2.0F, 1.0F, 9.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.2149F, -20.8941F, -1.2046F, -1.455F, 0.1233F, -0.5834F));

		ModelPartData cube_r236 = sideee3.addChild("cube_r236", ModelPartBuilder.create().uv(126, 251).cuboid(-4.0F, -3.0F, -1.0F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5553F, -20.3136F, -1.4927F, -0.9314F, 0.1233F, -0.5834F));

		ModelPartData cube_r237 = sideee3.addChild("cube_r237", ModelPartBuilder.create().uv(157, 185).cuboid(-4.0F, -3.0F, -11.0F, 7.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -17.585F, -0.618F, -0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r238 = sideee3.addChild("cube_r238", ModelPartBuilder.create().uv(20, 69).cuboid(-4.0F, -3.0F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-30.1967F, -12.6215F, -5.5815F, -1.3682F, -0.3614F, -0.3876F));

		ModelPartData cube_r239 = sideee3.addChild("cube_r239", ModelPartBuilder.create().uv(0, 147).cuboid(-5.0F, -3.0F, -13.0F, 7.0F, 1.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-30.1967F, -12.6215F, -5.5815F, -0.1029F, -0.3614F, -0.3876F));

		ModelPartData cube_r240 = sideee3.addChild("cube_r240", ModelPartBuilder.create().uv(250, 30).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-25.9779F, -14.1397F, -4.0633F, -1.3908F, -0.3035F, -0.3185F));

		ModelPartData cube_r241 = sideee3.addChild("cube_r241", ModelPartBuilder.create().uv(101, 60).cuboid(-3.0F, -3.0F, -11.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-25.9779F, -14.1397F, -4.0633F, -0.1254F, -0.3035F, -0.3185F));

		ModelPartData cube_r242 = sideee3.addChild("cube_r242", ModelPartBuilder.create().uv(259, 122).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-21.588F, -15.3921F, -2.8109F, -1.4088F, -0.2443F, -0.2519F));

		ModelPartData cube_r243 = sideee3.addChild("cube_r243", ModelPartBuilder.create().uv(102, 82).cuboid(-3.0F, -3.0F, -11.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-21.588F, -15.3921F, -2.8109F, -0.1435F, -0.2443F, -0.2519F));

		ModelPartData cube_r244 = sideee3.addChild("cube_r244", ModelPartBuilder.create().uv(187, 293).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-17.0604F, -16.3692F, -1.8338F, -1.4226F, -0.1841F, -0.1872F));

		ModelPartData cube_r245 = sideee3.addChild("cube_r245", ModelPartBuilder.create().uv(146, 68).cuboid(-3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-12.4296F, -17.0635F, -1.1395F, -1.4322F, -0.1231F, -0.124F));

		ModelPartData cube_r246 = sideee3.addChild("cube_r246", ModelPartBuilder.create().uv(20, 124).cuboid(-3.0F, -3.0F, -11.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-12.4296F, -17.0635F, -1.1395F, -0.1669F, -0.1231F, -0.124F));

		ModelPartData cube_r247 = sideee3.addChild("cube_r247", ModelPartBuilder.create().uv(102, 107).cuboid(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(47, 163).cuboid(-2.0F, -3.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 161).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.7399F, -15.7049F, -0.4837F, -1.4816F, -0.0617F, -0.0618F));

		ModelPartData cube_r248 = sideee3.addChild("cube_r248", ModelPartBuilder.create().uv(299, 103).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.7357F, -17.5314F, -0.6716F, -1.438F, -0.0617F, -0.0618F));

		ModelPartData cube_r249 = sideee3.addChild("cube_r249", ModelPartBuilder.create().uv(84, 125).cuboid(-4.0F, -3.0F, -11.0F, 5.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-6.7347F, -17.5314F, -0.6716F, -0.1726F, -0.0617F, -0.0618F));

		ModelPartData cube_r250 = sideee3.addChild("cube_r250", ModelPartBuilder.create().uv(5, 0).cuboid(0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -12.0306F, -0.1362F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r251 = sideee3.addChild("cube_r251", ModelPartBuilder.create().uv(98, 163).cuboid(-1.0F, -3.0F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 121).cuboid(-2.0F, -3.0F, 0.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(83, 161).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -12.8978F, -0.2206F, -1.5272F, 0.0F, 0.0F));

		ModelPartData cube_r252 = sideee3.addChild("cube_r252", ModelPartBuilder.create().uv(128, 150).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -15.7586F, -0.4299F, -1.4835F, 0.0F, 0.0F));

		ModelPartData cube_r253 = sideee3.addChild("cube_r253", ModelPartBuilder.create().uv(300, 39).cuboid(-4.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -17.585F, -0.618F, -1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r254 = sideee3.addChild("cube_r254", ModelPartBuilder.create().uv(205, 27).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8858F, 1.48F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r255 = sideee3.addChild("cube_r255", ModelPartBuilder.create().uv(178, 0).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.9406F, 1.7368F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r256 = sideee3.addChild("cube_r256", ModelPartBuilder.create().uv(232, 224).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.987F, 1.8648F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r257 = sideee3.addChild("cube_r257", ModelPartBuilder.create().uv(148, 243).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.077F, 1.7339F, -0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r258 = sideee3.addChild("cube_r258", ModelPartBuilder.create().uv(251, 215).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.132F, 1.4753F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r259 = sideee3.addChild("cube_r259", ModelPartBuilder.create().uv(121, 257).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.799F, 1.0885F, -0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r260 = sideee3.addChild("cube_r260", ModelPartBuilder.create().uv(312, 187).cuboid(-1.0F, -4.6756F, -0.7373F, 57.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r261 = sideee3.addChild("cube_r261", ModelPartBuilder.create().uv(301, 146).cuboid(-0.9128F, -7.0F, -0.9962F, 58.0F, 11.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.443F, -3.265F, 1.0051F, 0.0F, 0.0873F, -0.0873F));

		ModelPartData cube_r262 = sideee3.addChild("cube_r262", ModelPartBuilder.create().uv(312, 167).cuboid(-0.9128F, -16.0F, -0.9962F, 58.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.6632F, -2.7624F, 1.0051F, 0.0F, 0.0873F, 0.0873F));

		ModelPartData cube_r263 = sideee3.addChild("cube_r263", ModelPartBuilder.create().uv(301, 132).cuboid(-1.0F, -1.3244F, -0.7373F, 61.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.1743F, -17.9817F, 0.0F, -0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r264 = sideee3.addChild("cube_r264", ModelPartBuilder.create().uv(20, 86).cuboid(-11.0436F, -7.9564F, -4.9981F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(89.0333F, -11.9043F, 6.9113F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r265 = sideee3.addChild("cube_r265", ModelPartBuilder.create().uv(54, 223).cuboid(-11.0436F, -7.9564F, -4.9981F, 15.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(82, 82).cuboid(-13.0436F, -7.9564F, -4.9981F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(74.0333F, -11.9043F, 6.9113F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r266 = sideee3.addChild("cube_r266", ModelPartBuilder.create().uv(10, 10).cuboid(-13.0436F, -7.9564F, -4.9981F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(72.0333F, -11.9043F, 6.9113F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r267 = sideee3.addChild("cube_r267", ModelPartBuilder.create().uv(14, 218).cuboid(-13.0436F, -7.9564F, -4.9981F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(69.0333F, -11.9043F, 6.9113F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r268 = sideee3.addChild("cube_r268", ModelPartBuilder.create().uv(19, 179).cuboid(-13.0436F, -7.9564F, -4.9981F, 14.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(55.0333F, -11.9043F, 6.9113F, 0.2618F, -0.0436F, 0.0F));

		ModelPartData cube_r269 = sideee3.addChild("cube_r269", ModelPartBuilder.create().uv(31, 20).cuboid(1.9564F, -12.9564F, -4.9981F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 124).cuboid(0.9564F, -12.9564F, -4.9981F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(214, 170).cuboid(-13.0436F, -12.9564F, -4.9981F, 14.0F, 11.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(55.0702F, -0.0182F, 6.0641F, -0.0436F, -0.0436F, 0.0F));

		ModelPartData cube_r270 = sideee3.addChild("cube_r270", ModelPartBuilder.create().uv(248, 146).cuboid(-13.0436F, -4.9564F, -4.9981F, 14.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(55.1394F, 3.7821F, 4.4793F, -0.3054F, -0.0436F, 0.0F));

		ModelPartData fender5 = side3.addChild("fender5", ModelPartBuilder.create().uv(253, 266).cuboid(-8.5194F, -6.9718F, -47.6687F, 2.0F, 7.0F, 45.0F, new Dilation(0.0F))
		.uv(263, 167).cuboid(17.5768F, -6.9718F, -47.6687F, 2.0F, 7.0F, 45.0F, new Dilation(0.0F)), ModelTransform.pivot(-97.0867F, 13.3015F, 56.2934F));

		ModelPartData cube_r271 = fender5.addChild("cube_r271", ModelPartBuilder.create().uv(100, 138).cuboid(-1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(23.6058F, -10.6687F, -13.1722F, -2.7346F, 0.0F, 2.8685F));

		ModelPartData cube_r272 = fender5.addChild("cube_r272", ModelPartBuilder.create().uv(10, 37).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(23.4535F, -11.2125F, -15.4339F, -2.2982F, 0.0F, 2.8685F));

		ModelPartData cube_r273 = fender5.addChild("cube_r273", ModelPartBuilder.create().uv(40, 93).cuboid(-3.0F, -8.0F, -2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.2532F, -5.8472F, -10.9292F, -2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r274 = fender5.addChild("cube_r274", ModelPartBuilder.create().uv(122, 95).cuboid(-3.0F, -9.0F, -2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.9606F, -2.0835F, -5.9125F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r275 = fender5.addChild("cube_r275", ModelPartBuilder.create().uv(74, 132).cuboid(-3.0F, -10.0F, -2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.326F, -5.4601F, -12.3492F, -2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r276 = fender5.addChild("cube_r276", ModelPartBuilder.create().uv(128, 142).cuboid(-3.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.0155F, -1.7916F, -5.6238F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r277 = fender5.addChild("cube_r277", ModelPartBuilder.create().uv(146, 60).cuboid(-3.0F, -10.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4932F, -4.5702F, 1.4885F, 2.3705F, 0.0F, 2.9558F));

		ModelPartData cube_r278 = fender5.addChild("cube_r278", ModelPartBuilder.create().uv(47, 155).cuboid(-3.0F, -9.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.9622F, -2.0753F, -5.3267F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r279 = fender5.addChild("cube_r279", ModelPartBuilder.create().uv(156, 56).cuboid(-3.0F, -8.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.5155F, -4.4517F, -10.5353F, -2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r280 = fender5.addChild("cube_r280", ModelPartBuilder.create().uv(156, 58).cuboid(-3.0F, -8.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.9073F, -2.3672F, -5.6154F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r281 = fender5.addChild("cube_r281", ModelPartBuilder.create().uv(156, 60).cuboid(-3.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0155F, -1.7916F, -13.6238F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r282 = fender5.addChild("cube_r282", ModelPartBuilder.create().uv(112, 156).cuboid(-3.0F, -8.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.9073F, -2.3672F, -13.6154F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r283 = fender5.addChild("cube_r283", ModelPartBuilder.create().uv(47, 157).cuboid(-3.0F, -9.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(171, 0).cuboid(-1.0F, -12.0F, -2.0F, 2.0F, 6.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(23.9622F, -2.0753F, -13.3267F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r284 = fender5.addChild("cube_r284", ModelPartBuilder.create().uv(137, 160).cuboid(-3.0F, -10.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.4932F, -4.5702F, -6.5115F, 2.3705F, 0.0F, 2.9558F));

		ModelPartData cube_r285 = fender5.addChild("cube_r285", ModelPartBuilder.create().uv(47, 161).cuboid(-3.0F, -8.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.5155F, -4.4517F, -18.5353F, -2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r286 = fender5.addChild("cube_r286", ModelPartBuilder.create().uv(111, 161).cuboid(-3.0F, -10.0F, -2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.326F, -5.4601F, -20.3492F, -2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r287 = fender5.addChild("cube_r287", ModelPartBuilder.create().uv(0, 162).cuboid(-3.0F, -9.0F, -2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.9606F, -2.0835F, -13.9125F, -3.1273F, 0.0F, 2.9558F));

		ModelPartData cube_r288 = fender5.addChild("cube_r288", ModelPartBuilder.create().uv(137, 162).cuboid(-3.0F, -8.0F, -2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.2532F, -5.8472F, -18.9292F, -2.3419F, 0.0F, 2.9558F));

		ModelPartData cube_r289 = fender5.addChild("cube_r289", ModelPartBuilder.create().uv(23, 70).cuboid(0.0F, -6.0F, 0.0F, 2.0F, 4.0F, 13.0F, new Dilation(0.0F))
		.uv(48, 20).cuboid(-1.0F, -6.0F, 8.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 56).cuboid(-1.0F, -6.0F, 5.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 56).cuboid(-1.0F, -6.0F, 2.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(74, 115).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 148).cuboid(-1.0F, -12.0F, -2.0F, 2.0F, 6.0F, 15.0F, new Dilation(0.0F))
		.uv(82, 56).cuboid(-1.0F, -6.0F, -2.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0997F, 3.8584F, -13.6694F, -3.1273F, 0.0F, 3.0431F));

		ModelPartData cube_r290 = fender5.addChild("cube_r290", ModelPartBuilder.create().uv(211, 273).cuboid(-1.0F, -12.0F, -2.0F, 6.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.6929F, 3.9025F, -13.4056F, -3.1269F, -0.2181F, 3.0399F));

		ModelPartData cube_r291 = fender5.addChild("cube_r291", ModelPartBuilder.create().uv(128, 138).cuboid(-1.0F, -12.0F, -2.0F, 2.0F, 6.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(23.3281F, -7.8904F, -12.9841F, -3.1273F, 0.0F, 2.8685F));

		ModelPartData cube_r292 = fender5.addChild("cube_r292", ModelPartBuilder.create().uv(82, 82).cuboid(0.0F, -32.0F, -1.0F, 2.0F, 9.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(26.4318F, -21.9693F, -11.7407F, -3.1367F, 0.0135F, 1.6468F));

		ModelPartData cube_r293 = fender5.addChild("cube_r293", ModelPartBuilder.create().uv(0, 124).cuboid(0.0F, -23.0F, -1.0F, 2.0F, 7.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(26.1923F, -19.9773F, -11.7673F, -3.1355F, 0.013F, 1.7341F));

		ModelPartData cube_r294 = fender5.addChild("cube_r294", ModelPartBuilder.create().uv(0, 10).cuboid(0.0F, -16.0F, -1.0F, 2.0F, 11.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(25.9055F, -18.6114F, -11.785F, -3.1344F, 0.0124F, 1.8214F));

		ModelPartData cube_r295 = fender5.addChild("cube_r295", ModelPartBuilder.create().uv(128, 160).cuboid(-1.0F, -7.0F, -1.0F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(24.4997F, -14.0473F, -11.8889F, -3.1273F, 0.0F, 2.8685F));

		ModelPartData cube_r296 = fender5.addChild("cube_r296", ModelPartBuilder.create().uv(42, 93).cuboid(0.0F, -7.0F, -4.0F, 1.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(20.3668F, -0.3507F, -5.4534F, -3.0488F, -0.9066F, 2.9568F));

		ModelPartData cube_r297 = fender5.addChild("cube_r297", ModelPartBuilder.create().uv(183, 185).cuboid(0.0F, -7.0F, -1.0F, 1.0F, 3.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, -7.0F, -4.0F, 1.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(23.6485F, -0.6341F, -3.9871F, -3.0839F, 0.1383F, 3.0379F));

		ModelPartData cube_r298 = fender5.addChild("cube_r298", ModelPartBuilder.create().uv(0, 46).cuboid(0.0F, -7.0F, -4.0F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(21.7608F, 4.7734F, -4.3298F, -3.0839F, 0.1383F, -2.8962F));

		ModelPartData cube_r299 = fender5.addChild("cube_r299", ModelPartBuilder.create().uv(28, 137).cuboid(0.0F, -7.0F, -4.0F, 1.0F, 6.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(16.5769F, -1.7228F, -4.6159F, -2.9941F, -0.0259F, -1.9858F));

		ModelPartData cube_r300 = fender5.addChild("cube_r300", ModelPartBuilder.create().uv(22, 188).cuboid(0.0F, -7.0F, -4.0F, 1.0F, 6.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(23.1212F, -6.5114F, -3.6444F, -3.0839F, 0.1383F, 2.9507F));

		ModelPartData cube_r301 = fender5.addChild("cube_r301", ModelPartBuilder.create().uv(22, 206).cuboid(0.0F, -9.0F, -4.0F, 1.0F, 6.0F, 12.0F, new Dilation(0.0F))
		.uv(166, 56).cuboid(-1.0F, -7.0F, -4.0F, 1.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(22.6673F, -10.3208F, -3.416F, -3.0839F, 0.1383F, 2.8634F));

		ModelPartData cube_r302 = fender5.addChild("cube_r302", ModelPartBuilder.create().uv(231, 224).cuboid(0.0F, -33.0F, -1.0F, 2.0F, 9.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(26.424F, -21.1525F, -1.8055F, 3.0308F, 0.101F, 1.6321F));

		ModelPartData cube_r303 = fender5.addChild("cube_r303", ModelPartBuilder.create().uv(75, 235).cuboid(0.0F, -24.0F, -1.0F, 2.0F, 7.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(26.206F, -19.0819F, -2.0264F, 3.04F, 0.1102F, 1.7193F));

		ModelPartData cube_r304 = fender5.addChild("cube_r304", ModelPartBuilder.create().uv(183, 213).cuboid(0.0F, -17.0F, -1.0F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(25.9246F, -17.6357F, -2.1959F, 3.05F, 0.1187F, 1.8068F));

		ModelPartData cube_r305 = fender5.addChild("cube_r305", ModelPartBuilder.create().uv(128, 185).cuboid(-1.0F, -7.0F, -1.0F, 3.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(23.6673F, -13.3208F, -3.416F, -3.0839F, 0.1383F, 2.8634F));

		ModelPartData cube_r306 = fender5.addChild("cube_r306", ModelPartBuilder.create().uv(123, 60).cuboid(0.0F, -24.0F, -1.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(24.9557F, -18.652F, 3.0605F, 2.8615F, 0.1416F, 1.7015F));

		ModelPartData cube_r307 = fender5.addChild("cube_r307", ModelPartBuilder.create().uv(124, 73).cuboid(0.0F, -17.0F, -1.0F, 2.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(24.7032F, -17.2083F, 2.8337F, 2.8745F, 0.1652F, 1.7865F));

		ModelPartData cube_r308 = fender5.addChild("cube_r308", ModelPartBuilder.create().uv(54, 192).cuboid(-1.0F, -7.0F, -1.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(22.7268F, -12.9304F, 0.5715F, -3.1287F, 0.3127F, 2.858F));

		ModelPartData cube_r309 = fender5.addChild("cube_r309", ModelPartBuilder.create().uv(0, 10).cuboid(0.0F, -40.0F, -2.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(28.0386F, -27.2239F, 3.509F, 2.744F, 0.9232F, 1.1707F));

		ModelPartData cube_r310 = fender5.addChild("cube_r310", ModelPartBuilder.create().uv(0, 235).cuboid(0.0F, -35.0F, -10.0F, 2.0F, 9.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(27.9821F, -22.7889F, 3.509F, 2.744F, 0.9232F, 1.3016F));

		ModelPartData cube_r311 = fender5.addChild("cube_r311", ModelPartBuilder.create().uv(0, 83).cuboid(0.0F, -26.0F, -7.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(27.4837F, -19.5357F, 3.509F, 2.744F, 0.9232F, 1.4325F));

		ModelPartData cube_r312 = fender5.addChild("cube_r312", ModelPartBuilder.create().uv(138, 138).cuboid(0.0F, -19.0F, -6.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(190, 157).cuboid(0.0F, -19.0F, -5.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(126, 95).cuboid(0.0F, -19.0F, -3.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(26.4866F, -16.4948F, 3.509F, 2.744F, 0.9232F, 1.607F));

		ModelPartData cube_r313 = fender5.addChild("cube_r313", ModelPartBuilder.create().uv(20, 10).cuboid(0.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.65F, -12.6749F, 2.1251F, 3.093F, 0.9232F, 2.8287F));

		ModelPartData cube_r314 = fender5.addChild("cube_r314", ModelPartBuilder.create().uv(36, 186).cuboid(0.0F, -7.0F, -1.0F, 2.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(17.1051F, -11.4406F, 3.5639F, 3.0024F, 1.3581F, 2.7314F));

		ModelPartData cube_r315 = fender5.addChild("cube_r315", ModelPartBuilder.create().uv(74, 128).cuboid(-1.0F, -6.0F, -1.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.8585F, -6.0055F, 2.6416F, 3.118F, 1.3559F, 2.9387F));

		ModelPartData cube_r316 = fender5.addChild("cube_r316", ModelPartBuilder.create().uv(44, 46).cuboid(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.3176F, -6.6307F, 1.9707F, 3.1333F, 0.9196F, 2.9552F));

		ModelPartData cube_r317 = fender5.addChild("cube_r317", ModelPartBuilder.create().uv(216, 144).cuboid(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(17.8585F, -6.0055F, 2.6416F, 3.118F, 1.3559F, 2.9387F));

		ModelPartData cube_r318 = fender5.addChild("cube_r318", ModelPartBuilder.create().uv(45, 0).cuboid(-1.0F, -7.0F, 0.0F, 3.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.887F, 0.1372F, 1.8445F, -3.1106F, 0.9169F, 3.081F));

		ModelPartData cube_r319 = fender5.addChild("cube_r319", ModelPartBuilder.create().uv(20, 124).cuboid(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(18.3874F, 0.449F, 2.5244F, -3.0543F, 1.3526F, 3.1416F));

		ModelPartData cube_r320 = fender5.addChild("cube_r320", ModelPartBuilder.create().uv(100, 223).cuboid(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(22.6713F, 2.926F, 1.2377F, 0.0F, 2.2253F, 0.0F));

		ModelPartData cube_r321 = fender5.addChild("cube_r321", ModelPartBuilder.create().uv(19, 186).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(18.3651F, 2.926F, 2.5293F, 0.0F, 1.789F, 0.0F));

		ModelPartData cube_r322 = fender5.addChild("cube_r322", ModelPartBuilder.create().uv(44, 115).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(140, 255).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(14.9463F, 6.5309F, 4.6889F, -0.1201F, -0.4205F, 0.2875F));

		ModelPartData cube_r323 = fender5.addChild("cube_r323", ModelPartBuilder.create().uv(274, 87).cuboid(-1.0F, -7.0F, -5.0F, 3.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.5574F, 0.0282F, 5.4402F, 0.0F, -0.4363F, 0.0F));

		ModelPartData cube_r324 = fender5.addChild("cube_r324", ModelPartBuilder.create().uv(285, 198).cuboid(-1.0F, -6.0F, -5.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.8403F, -5.6957F, 5.4402F, 0.0F, -0.4363F, -0.4363F));

		ModelPartData cube_r325 = fender5.addChild("cube_r325", ModelPartBuilder.create().uv(36, 206).cuboid(-1.0F, -8.0F, -5.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(15.6469F, -9.7314F, 5.4402F, 0.0F, -0.4363F, -1.0908F));

		ModelPartData cube_r326 = fender5.addChild("cube_r326", ModelPartBuilder.create().uv(64, 148).cuboid(-2.0F, -8.8199F, -5.0F, 3.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -13.0842F, 5.4402F, 0.0F, 0.4363F, 1.5708F));

		ModelPartData cube_r327 = fender5.addChild("cube_r327", ModelPartBuilder.create().uv(230, 144).cuboid(-2.0F, -8.0F, -5.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.5895F, -9.7314F, 5.4402F, 0.0F, 0.4363F, 1.0908F));

		ModelPartData cube_r328 = fender5.addChild("cube_r328", ModelPartBuilder.create().uv(286, 14).cuboid(-2.0F, -6.0F, -5.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.7829F, -5.6957F, 5.4402F, 0.0F, 0.4363F, 0.4363F));

		ModelPartData cube_r329 = fender5.addChild("cube_r329", ModelPartBuilder.create().uv(196, 210).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.8889F, 6.5309F, 4.6889F, -0.1201F, 0.4205F, -0.2875F));

		ModelPartData cube_r330 = fender5.addChild("cube_r330", ModelPartBuilder.create().uv(122, 275).cuboid(-2.0F, -7.0F, -5.0F, 3.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.5001F, 0.0282F, 5.4402F, 0.0F, 0.4363F, 0.0F));

		ModelPartData cube_r331 = fender5.addChild("cube_r331", ModelPartBuilder.create().uv(244, 224).cuboid(-1.0F, -7.0F, -8.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(16.0821F, 6.3388F, 3.9702F, 0.0F, -0.2618F, 0.2618F));

		ModelPartData cube_r332 = fender5.addChild("cube_r332", ModelPartBuilder.create().uv(302, 274).cuboid(-1.0F, -7.0F, -48.0F, 2.0F, 3.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(16.7992F, 6.5309F, 0.3313F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r333 = fender5.addChild("cube_r333", ModelPartBuilder.create().uv(245, 202).cuboid(-1.0F, -7.0F, -8.0F, 2.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(17.8345F, 0.0282F, 3.9702F, 0.0F, -0.2618F, 0.0F));

		ModelPartData cube_r334 = fender5.addChild("cube_r334", ModelPartBuilder.create().uv(136, 276).cuboid(-1.0F, -6.0F, -8.0F, 2.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-6.9403F, -6.2354F, 3.9702F, 0.0F, 0.2618F, 0.4363F));

		ModelPartData cube_r335 = fender5.addChild("cube_r335", ModelPartBuilder.create().uv(270, 0).cuboid(-1.0F, -6.0F, -48.0F, 2.0F, 6.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(-7.6131F, -6.5491F, 0.3313F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r336 = fender5.addChild("cube_r336", ModelPartBuilder.create().uv(106, 278).cuboid(-1.0F, -6.0F, -8.0F, 2.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(17.9977F, -6.2354F, 3.9702F, 0.0F, -0.2618F, -0.4363F));

		ModelPartData cube_r337 = fender5.addChild("cube_r337", ModelPartBuilder.create().uv(0, 290).cuboid(-1.0F, -6.0F, -48.0F, 2.0F, 6.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(18.6705F, -6.5491F, 0.3313F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r338 = fender5.addChild("cube_r338", ModelPartBuilder.create().uv(128, 160).cuboid(-1.0F, -8.0F, -8.0F, 2.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-5.1792F, -10.8641F, 3.9702F, 0.0F, 0.2618F, 1.0908F));

		ModelPartData cube_r339 = fender5.addChild("cube_r339", ModelPartBuilder.create().uv(110, 251).cuboid(-1.0F, -8.0F, -48.0F, 2.0F, 8.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(-5.522F, -11.5226F, 0.3313F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r340 = fender5.addChild("cube_r340", ModelPartBuilder.create().uv(54, 179).cuboid(-1.0F, -8.0F, -8.0F, 2.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(16.2366F, -10.8641F, 3.9702F, 0.0F, -0.2618F, -1.0908F));

		ModelPartData cube_r341 = fender5.addChild("cube_r341", ModelPartBuilder.create().uv(204, 258).cuboid(-1.0F, -8.0F, -48.0F, 2.0F, 8.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(16.5794F, -11.5226F, 0.3313F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r342 = fender5.addChild("cube_r342", ModelPartBuilder.create().uv(40, 69).cuboid(-1.0F, -8.8199F, -8.0F, 2.0F, 9.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -14.3612F, 3.9702F, 0.0F, 0.2618F, 1.5708F));

		ModelPartData cube_r343 = fender5.addChild("cube_r343", ModelPartBuilder.create().uv(171, 0).cuboid(-1.0F, -8.8199F, -48.0F, 2.0F, 9.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(1.1251F, -15.1036F, 0.3313F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r344 = fender5.addChild("cube_r344", ModelPartBuilder.create().uv(88, 275).cuboid(-1.0F, -7.0F, -8.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-5.0975F, 6.3388F, 3.6421F, 0.0F, 0.2618F, -0.2618F));

		ModelPartData cube_r345 = fender5.addChild("cube_r345", ModelPartBuilder.create().uv(48, 295).cuboid(-1.0F, -7.0F, -49.0F, 2.0F, 3.0F, 46.0F, new Dilation(0.0F)), ModelTransform.of(-5.7418F, 6.5309F, 0.3313F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r346 = fender5.addChild("cube_r346", ModelPartBuilder.create().uv(248, 167).cuboid(-1.0F, -7.0F, -8.0F, 2.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-6.7771F, 0.0282F, 3.9702F, 0.0F, 0.2618F, 0.0F));

		ModelPartData frontblade = group.addChild("frontblade", ModelPartBuilder.create().uv(146, 89).cuboid(22.6623F, -19.7473F, -7.4538F, 14.0F, 2.0F, 9.0F, new Dilation(0.0F))
		.uv(146, 78).cuboid(22.6623F, -19.7473F, 12.1777F, 14.0F, 2.0F, 9.0F, new Dilation(0.0F))
		.uv(211, 266).cuboid(19.8601F, -1.0F, 30.584F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(128, 130).cuboid(19.8601F, -1.0F, -22.8601F, 4.0F, 1.0F, 54.0F, new Dilation(0.0F))
		.uv(146, 56).cuboid(8.8601F, -1.0F, -17.8601F, 11.0F, 1.0F, 49.0F, new Dilation(0.0F))
		.uv(54, 184).cuboid(3.8601F, -1.0F, -12.8601F, 7.0F, 1.0F, 38.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(48.0133F, -1.0F, -22.8601F, 58.0F, 1.0F, 55.0F, new Dilation(0.0F))
		.uv(263, 225).cuboid(48.0133F, -1.0F, 31.584F, 58.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(22, 206).cuboid(52.0F, -21.0F, -25.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(35, 235).cuboid(52.0F, -23.0F, -30.0F, 2.0F, 4.0F, 5.0F, new Dilation(0.0F))
		.uv(124, 88).cuboid(52.0F, -21.0F, 34.7239F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(167, 128).cuboid(52.0F, -23.0F, 38.7239F, 2.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-108.408F, -0.074F, 19.138F));

		ModelPartData cube_r347 = frontblade.addChild("cube_r347", ModelPartBuilder.create().uv(157, 198).cuboid(-15.792F, -9.0F, 9.0F, 18.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(312, 201).cuboid(-15.792F, -1.0F, -1.0F, 18.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r348 = frontblade.addChild("cube_r348", ModelPartBuilder.create().uv(171, 213).cuboid(-1.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.1585F, 0.0F, 16.5351F, 0.0F, -1.3963F, 0.0F));

		ModelPartData cube_r349 = frontblade.addChild("cube_r349", ModelPartBuilder.create().uv(125, 255).cuboid(-1.0F, -1.0F, -6.0F, 4.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.9763F, 0.0F, 20.2608F, 0.0F, -1.2217F, 0.0F));

		ModelPartData cube_r350 = frontblade.addChild("cube_r350", ModelPartBuilder.create().uv(0, 257).cuboid(-1.0F, -1.0F, -6.0F, 4.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(2.4287F, 0.0F, 23.7879F, 0.0F, -1.0472F, 0.0F));

		ModelPartData cube_r351 = frontblade.addChild("cube_r351", ModelPartBuilder.create().uv(82, 261).cuboid(-1.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.4715F, 0.0F, 27.0093F, 0.0F, -0.8727F, 0.0F));

		ModelPartData cube_r352 = frontblade.addChild("cube_r352", ModelPartBuilder.create().uv(227, 264).cuboid(-1.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(7.0427F, 0.0F, 29.8269F, 0.0F, -0.6981F, 0.0F));

		ModelPartData cube_r353 = frontblade.addChild("cube_r353", ModelPartBuilder.create().uv(0, 265).cuboid(-1.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(10.064F, 0.0F, 32.1553F, 0.0F, -0.5236F, 0.0F));

		ModelPartData cube_r354 = frontblade.addChild("cube_r354", ModelPartBuilder.create().uv(20, 265).cuboid(-1.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(13.4438F, 0.0F, 33.9237F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r355 = frontblade.addChild("cube_r355", ModelPartBuilder.create().uv(106, 265).cuboid(-2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(18.0641F, 0.0F, 35.2519F, 0.0F, -0.1745F, 0.0F));

		ModelPartData cube_r356 = frontblade.addChild("cube_r356", ModelPartBuilder.create().uv(217, 81).cuboid(-3.0F, -1.0F, -1.0F, 58.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(263, 219).cuboid(-3.0F, -1.0F, -55.4441F, 58.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(51.0133F, 0.0F, 32.584F, 0.0F, 0.0F, -0.0175F));

		ModelPartData cube_r357 = frontblade.addChild("cube_r357", ModelPartBuilder.create().uv(53, 267).cuboid(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.1585F, 0.0F, -2.8112F, 0.0F, 1.3963F, 0.0F));

		ModelPartData cube_r358 = frontblade.addChild("cube_r358", ModelPartBuilder.create().uv(106, 257).cuboid(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.9763F, 0.0F, -6.5369F, 0.0F, 1.2217F, 0.0F));

		ModelPartData cube_r359 = frontblade.addChild("cube_r359", ModelPartBuilder.create().uv(211, 258).cuboid(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(2.4287F, 0.0F, -10.064F, 0.0F, 1.0472F, 0.0F));

		ModelPartData cube_r360 = frontblade.addChild("cube_r360", ModelPartBuilder.create().uv(67, 268).cuboid(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.4715F, 0.0F, -13.2854F, 0.0F, 0.8727F, 0.0F));

		ModelPartData cube_r361 = frontblade.addChild("cube_r361", ModelPartBuilder.create().uv(159, 275).cuboid(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(7.0427F, 0.0F, -16.103F, 0.0F, 0.6981F, 0.0F));

		ModelPartData cube_r362 = frontblade.addChild("cube_r362", ModelPartBuilder.create().uv(14, 278).cuboid(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(10.064F, 0.0F, -18.4314F, 0.0F, 0.5236F, 0.0F));

		ModelPartData cube_r363 = frontblade.addChild("cube_r363", ModelPartBuilder.create().uv(283, 93).cuboid(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(13.4438F, 0.0F, -20.1998F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r364 = frontblade.addChild("cube_r364", ModelPartBuilder.create().uv(283, 99).cuboid(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(18.0641F, 0.0F, -21.528F, 0.0F, 0.1745F, 0.0F));

		ModelPartData cube_r365 = frontblade.addChild("cube_r365", ModelPartBuilder.create().uv(128, 128).cuboid(-6.0F, -1.0F, -4.0F, 15.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(42.2475F, -22.6099F, 17.1777F, 0.0F, 1.5708F, -0.0436F));

		ModelPartData cube_r366 = frontblade.addChild("cube_r366", ModelPartBuilder.create().uv(20, 20).cuboid(6.0F, -1.0F, -4.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(37.3961F, -22.445F, 17.1777F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r367 = frontblade.addChild("cube_r367", ModelPartBuilder.create().uv(193, 251).cuboid(6.0F, -1.0F, -4.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(32.487F, -22.3616F, 17.1777F, 0.0F, 1.5708F, -0.0873F));

		ModelPartData cube_r368 = frontblade.addChild("cube_r368", ModelPartBuilder.create().uv(98, 161).cuboid(6.0F, -1.0F, -4.0F, 3.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(25.7027F, -21.3836F, 17.1777F, 0.0F, 1.5708F, -0.2182F));

		ModelPartData cube_r369 = frontblade.addChild("cube_r369", ModelPartBuilder.create().uv(241, 33).cuboid(6.0F, -1.0F, -4.0F, 3.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(17.2246F, -18.8443F, 17.1777F, 0.0F, 1.5708F, -0.3491F));

		ModelPartData cube_r370 = frontblade.addChild("cube_r370", ModelPartBuilder.create().uv(24, 96).cuboid(6.0F, -1.0F, -4.0F, 3.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(6.914F, -13.2741F, 17.1777F, 0.0F, 1.5708F, -0.5672F));

		ModelPartData cube_r371 = frontblade.addChild("cube_r371", ModelPartBuilder.create().uv(20, 87).cuboid(64.0F, -1.0F, 4.0F, 12.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(40.6623F, -26.7473F, -52.8223F, 0.0F, -1.5708F, -1.1781F));

		ModelPartData cube_r372 = frontblade.addChild("cube_r372", ModelPartBuilder.create().uv(76, 205).cuboid(-55.8021F, -23.0618F, 3.3414F, 7.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(13.3287F, -29.4932F, -39.203F, -0.7418F, 1.4835F, 1.5708F));

		ModelPartData cube_r373 = frontblade.addChild("cube_r373", ModelPartBuilder.create().uv(126, 223).cuboid(27.9761F, -48.128F, -3.0F, 6.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(24.4007F, -27.2562F, -44.2643F, -1.5708F, -0.4363F, 1.3526F));

		ModelPartData cube_r374 = frontblade.addChild("cube_r374", ModelPartBuilder.create().uv(226, 258).cuboid(27.9761F, -48.128F, -1.0F, 6.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(31.9628F, -28.354F, -44.2643F, -1.5708F, -0.4363F, 1.4835F));

		ModelPartData cube_r375 = frontblade.addChild("cube_r375", ModelPartBuilder.create().uv(263, 202).cuboid(27.9761F, -48.128F, -1.0F, 6.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(37.3961F, -28.4602F, -44.2643F, -1.5708F, -0.4363F, 1.5708F));

		ModelPartData cube_r376 = frontblade.addChild("cube_r376", ModelPartBuilder.create().uv(157, 207).cuboid(12.0F, 0.0F, 0.0F, 14.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(11.6623F, -16.7473F, 15.1777F, 0.964F, -0.0749F, -0.1074F));

		ModelPartData cube_r377 = frontblade.addChild("cube_r377", ModelPartBuilder.create().uv(200, 115).cuboid(12.0F, 0.0F, 0.0F, 14.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(11.6623F, -16.7473F, 11.1777F, 0.964F, -0.0749F, -0.1074F));

		ModelPartData cube_r378 = frontblade.addChild("cube_r378", ModelPartBuilder.create().uv(210, 193).cuboid(12.0F, 0.0F, -5.0F, 14.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(12.6623F, -16.7473F, -1.4538F, -0.964F, 0.0749F, -0.1074F));

		ModelPartData cube_r379 = frontblade.addChild("cube_r379", ModelPartBuilder.create().uv(210, 199).cuboid(12.0F, 0.0F, -5.0F, 14.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(11.6623F, -16.7473F, 2.5462F, -0.964F, 0.0749F, -0.1074F));

		ModelPartData cube_r380 = frontblade.addChild("cube_r380", ModelPartBuilder.create().uv(106, 214).cuboid(12.0F, -1.0F, -9.0F, 12.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(40.6623F, -26.7473F, 14.5462F, 0.0F, 1.5708F, -1.1781F));

		ModelPartData cube_r381 = frontblade.addChild("cube_r381", ModelPartBuilder.create().uv(0, 0).cuboid(6.0F, -1.0F, -4.0F, 18.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(42.2475F, -22.6099F, 14.5462F, 0.0F, 1.5708F, -0.0436F));

		ModelPartData cube_r382 = frontblade.addChild("cube_r382", ModelPartBuilder.create().uv(253, 264).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(37.3961F, -28.4602F, 5.9882F, 1.5708F, 0.4363F, 1.5708F));

		ModelPartData cube_r383 = frontblade.addChild("cube_r383", ModelPartBuilder.create().uv(159, 263).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(37.3961F, -22.445F, 14.5462F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r384 = frontblade.addChild("cube_r384", ModelPartBuilder.create().uv(66, 261).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(31.9628F, -28.354F, 5.9882F, 1.5708F, 0.4363F, 1.4835F));

		ModelPartData cube_r385 = frontblade.addChild("cube_r385", ModelPartBuilder.create().uv(123, 263).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(32.487F, -22.3616F, 14.5462F, 0.0F, 1.5708F, -0.0873F));

		ModelPartData cube_r386 = frontblade.addChild("cube_r386", ModelPartBuilder.create().uv(232, 216).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(24.4007F, -27.2562F, 5.9882F, 1.5708F, 0.4363F, 1.3526F));

		ModelPartData cube_r387 = frontblade.addChild("cube_r387", ModelPartBuilder.create().uv(129, 243).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(25.7027F, -21.3836F, 14.5462F, 0.0F, 1.5708F, -0.2182F));

		ModelPartData cube_r388 = frontblade.addChild("cube_r388", ModelPartBuilder.create().uv(210, 233).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(17.2246F, -18.8443F, 14.5462F, 0.0F, 1.5708F, -0.3491F));

		ModelPartData cube_r389 = frontblade.addChild("cube_r389", ModelPartBuilder.create().uv(190, 170).cuboid(6.0F, -1.0F, -4.0F, 6.0F, 1.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(6.914F, -13.2741F, 14.5462F, 0.0F, 1.5708F, -0.5672F));

		ModelPartData cube_r390 = frontblade.addChild("cube_r390", ModelPartBuilder.create().uv(0, 162).cuboid(-4.0F, -1.0F, -4.0F, 17.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(217, 102).cuboid(-4.0F, -4.0F, -1.0F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0031F, -8.8978F, 14.9051F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r391 = frontblade.addChild("cube_r391", ModelPartBuilder.create().uv(270, 139).cuboid(-4.0F, -1.0F, -4.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(14, 265).cuboid(-4.0F, -5.0F, -3.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(295, 196).cuboid(-4.0F, -5.0F, -4.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.0043F, -8.8978F, 22.51F, 0.0F, -1.309F, 0.0F));

		ModelPartData cube_r392 = frontblade.addChild("cube_r392", ModelPartBuilder.create().uv(270, 115).cuboid(-4.0F, -1.0F, -4.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(285, 138).cuboid(-4.0F, -5.0F, -3.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(61, 299).cuboid(-4.0F, -5.0F, -4.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.1632F, -8.8978F, 26.6989F, 0.0F, -1.0472F, 0.0F));

		ModelPartData cube_r393 = frontblade.addChild("cube_r393", ModelPartBuilder.create().uv(270, 38).cuboid(-4.0F, -1.0F, -4.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(98, 295).cuboid(-4.0F, -6.0F, -3.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 298).cuboid(-4.0F, -6.0F, -4.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.3327F, -8.8978F, 30.1862F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r394 = frontblade.addChild("cube_r394", ModelPartBuilder.create().uv(81, 223).cuboid(-6.0F, -1.0F, -4.0F, 7.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(88, 235).cuboid(-6.0F, -6.0F, -3.0F, 7.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(286, 34).cuboid(-6.0F, -6.0F, -4.0F, 7.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.0289F, -8.8978F, 33.7344F, 0.0F, -0.5236F, 0.0F));

		ModelPartData cube_r395 = frontblade.addChild("cube_r395", ModelPartBuilder.create().uv(28, 155).cuboid(-6.0F, -1.0F, -4.0F, 7.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(233, 10).cuboid(-6.0F, -6.0F, -3.0F, 8.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(173, 286).cuboid(-6.0F, -6.0F, -4.0F, 7.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4493F, -8.8978F, 35.6874F, 0.0F, -0.2618F, 0.0F));

		ModelPartData cube_r396 = frontblade.addChild("cube_r396", ModelPartBuilder.create().uv(128, 195).cuboid(-4.0F, -1.0F, -1.0F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.3838F, -10.6374F, 14.9622F, -1.0036F, 1.309F, -1.5708F));

		ModelPartData cube_r397 = frontblade.addChild("cube_r397", ModelPartBuilder.create().uv(26, 224).cuboid(-4.0F, -1.0F, -2.0F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.3838F, -10.6374F, -1.2383F, 1.0036F, -1.309F, -1.5708F));

		ModelPartData cube_r398 = frontblade.addChild("cube_r398", ModelPartBuilder.create().uv(296, 14).cuboid(-4.0F, -1.0F, -2.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(5.372F, -9.5917F, 22.4115F, -0.5672F, -1.309F, 0.0F));

		ModelPartData cube_r399 = frontblade.addChild("cube_r399", ModelPartBuilder.create().uv(277, 295).cuboid(-4.0F, -1.0F, -2.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(7.4929F, -9.5917F, 26.5085F, -0.5672F, -1.0472F, 0.0F));

		ModelPartData cube_r400 = frontblade.addChild("cube_r400", ModelPartBuilder.create().uv(65, 295).cuboid(-4.0F, -1.0F, -2.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.6019F, -9.5917F, 29.917F, -0.5672F, -0.7854F, 0.0F));

		ModelPartData cube_r401 = frontblade.addChild("cube_r401", ModelPartBuilder.create().uv(243, 5).cuboid(-6.0F, -1.0F, -2.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(16.2192F, -9.5917F, 33.4047F, -0.5672F, -0.5236F, 0.0F));

		ModelPartData cube_r402 = frontblade.addChild("cube_r402", ModelPartBuilder.create().uv(242, 26).cuboid(-6.0F, -1.0F, -2.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(22.5478F, -9.5917F, 35.3197F, -0.5672F, -0.2618F, 0.0F));

		ModelPartData cube_r403 = frontblade.addChild("cube_r403", ModelPartBuilder.create().uv(49, 295).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(296, 91).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(5.372F, -9.5917F, -8.6876F, 0.5672F, 1.309F, 0.0F));

		ModelPartData cube_r404 = frontblade.addChild("cube_r404", ModelPartBuilder.create().uv(78, 296).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(7.4929F, -9.5917F, -12.7846F, 0.5672F, 1.0472F, 0.0F));

		ModelPartData cube_r405 = frontblade.addChild("cube_r405", ModelPartBuilder.create().uv(296, 24).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.6019F, -9.5917F, -16.1931F, 0.5672F, 0.7854F, 0.0F));

		ModelPartData cube_r406 = frontblade.addChild("cube_r406", ModelPartBuilder.create().uv(266, 102).cuboid(-6.0F, -1.0F, -1.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(16.2192F, -9.5917F, -19.6808F, 0.5672F, 0.5236F, 0.0F));

		ModelPartData cube_r407 = frontblade.addChild("cube_r407", ModelPartBuilder.create().uv(263, 208).cuboid(-6.0F, -1.0F, -1.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(22.5478F, -9.5917F, -21.5958F, 0.5672F, 0.2618F, 0.0F));

		ModelPartData cube_r408 = frontblade.addChild("cube_r408", ModelPartBuilder.create().uv(20, 96).cuboid(-6.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.7435F, -14.4505F, 33.2423F, 0.0503F, -0.5214F, -0.1007F));

		ModelPartData cube_r409 = frontblade.addChild("cube_r409", ModelPartBuilder.create().uv(170, 148).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(12.0559F, -13.8404F, 29.7263F, 0.0869F, -0.7816F, -0.1231F));

		ModelPartData cube_r410 = frontblade.addChild("cube_r410", ModelPartBuilder.create().uv(263, 241).cuboid(-4.0F, -1.0F, -4.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(8.015F, -13.4046F, 26.7669F, 0.1498F, -1.0406F, -0.1732F));

		ModelPartData cube_r411 = frontblade.addChild("cube_r411", ModelPartBuilder.create().uv(166, 66).cuboid(-4.0F, -1.0F, -2.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.7438F, -12.9688F, 22.3624F, 0.3145F, -1.2952F, -0.326F));

		ModelPartData cube_r412 = frontblade.addChild("cube_r412", ModelPartBuilder.create().uv(0, 96).cuboid(-4.0F, -2.0F, 0.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.6899F, -11.2754F, 14.6187F, 1.5708F, 1.4835F, 1.5708F));

		ModelPartData cube_r413 = frontblade.addChild("cube_r413", ModelPartBuilder.create().uv(82, 107).cuboid(-6.0F, -1.0F, -1.0F, 10.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.1472F, -15.0606F, 35.1665F, 0.0233F, -0.2608F, -0.0903F));

		ModelPartData cube_r414 = frontblade.addChild("cube_r414", ModelPartBuilder.create().uv(166, 56).cuboid(-4.0F, -10.0F, -2.0F, 5.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.2369F, -14.9036F, 22.3228F, 1.3617F, -1.2952F, -0.326F));

		ModelPartData cube_r415 = frontblade.addChild("cube_r415", ModelPartBuilder.create().uv(190, 144).cuboid(-4.0F, -9.0F, -2.0F, 5.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.3441F, -15.8375F, 26.5979F, 1.197F, -1.0406F, -0.1732F));

		ModelPartData cube_r416 = frontblade.addChild("cube_r416", ModelPartBuilder.create().uv(157, 185).cuboid(-4.0F, -10.0F, -1.0F, 5.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.549F, -14.9124F, 30.7368F, 1.1341F, -0.7816F, -0.1231F));

		ModelPartData cube_r417 = frontblade.addChild("cube_r417", ModelPartBuilder.create().uv(253, 291).cuboid(-4.0F, -18.0F, -1.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.8062F, -16.8978F, 31.2341F, 1.3523F, -0.7816F, -0.1231F));

		ModelPartData cube_r418 = frontblade.addChild("cube_r418", ModelPartBuilder.create().uv(230, 294).cuboid(-4.0F, -16.0F, -2.0F, 5.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.7512F, -17.7116F, 26.7509F, 1.4152F, -1.0406F, -0.1732F));

		ModelPartData cube_r419 = frontblade.addChild("cube_r419", ModelPartBuilder.create().uv(43, 10).cuboid(-4.0F, -18.0F, -2.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.6406F, -16.5507F, 22.3334F, 1.5362F, -1.2952F, -0.326F));

		ModelPartData cube_r420 = frontblade.addChild("cube_r420", ModelPartBuilder.create().uv(270, 28).cuboid(-4.0F, -20.0F, 0.0F, 7.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.9611F, -14.4655F, 14.1117F, 0.3927F, 1.4835F, 1.5708F));

		ModelPartData cube_r421 = frontblade.addChild("cube_r421", ModelPartBuilder.create().uv(270, 18).cuboid(-4.0F, -11.0F, 0.0F, 7.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.8465F, -12.7712F, 14.26F, 0.5672F, 1.4835F, 1.5708F));

		ModelPartData cube_r422 = frontblade.addChild("cube_r422", ModelPartBuilder.create().uv(263, 231).cuboid(-4.0F, -20.0F, -1.0F, 7.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(13.3287F, -29.4932F, 0.9269F, 0.7418F, -1.4835F, 1.5708F));

		ModelPartData cube_r423 = frontblade.addChild("cube_r423", ModelPartBuilder.create().uv(253, 270).cuboid(-4.0F, -20.0F, -1.0F, 7.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.9611F, -14.4655F, -0.3878F, -0.3927F, -1.4835F, 1.5708F));

		ModelPartData cube_r424 = frontblade.addChild("cube_r424", ModelPartBuilder.create().uv(269, 270).cuboid(-4.0F, -11.0F, -1.0F, 7.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.8465F, -12.7712F, -0.5361F, -0.5672F, -1.4835F, 1.5708F));

		ModelPartData cube_r425 = frontblade.addChild("cube_r425", ModelPartBuilder.create().uv(0, 137).cuboid(-4.0F, -2.0F, -1.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.6899F, -11.2754F, -0.8948F, -1.5708F, -1.4835F, 1.5708F));

		ModelPartData cube_r426 = frontblade.addChild("cube_r426", ModelPartBuilder.create().uv(170, 255).cuboid(-4.0F, -4.0F, -1.0F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(159, 281).cuboid(-4.0F, -4.0F, 0.0F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(248, 139).cuboid(-4.0F, -1.0F, -2.0F, 8.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(7.0031F, -8.8978F, -1.1812F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r427 = frontblade.addChild("cube_r427", ModelPartBuilder.create().uv(300, 18).cuboid(-4.0F, -5.0F, 3.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(73, 300).cuboid(-4.0F, -5.0F, 2.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 272).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(5.0043F, -8.8978F, -8.7861F, 0.0F, 1.309F, 0.0F));

		ModelPartData cube_r428 = frontblade.addChild("cube_r428", ModelPartBuilder.create().uv(183, 89).cuboid(-4.0F, -18.0F, 1.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.6406F, -16.5507F, -8.6095F, -1.5362F, 1.2952F, -0.326F));

		ModelPartData cube_r429 = frontblade.addChild("cube_r429", ModelPartBuilder.create().uv(170, 138).cuboid(-4.0F, -10.0F, 1.0F, 5.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.2369F, -14.9036F, -8.5989F, -1.3617F, 1.2952F, -0.326F));

		ModelPartData cube_r430 = frontblade.addChild("cube_r430", ModelPartBuilder.create().uv(140, 177).cuboid(-4.0F, -1.0F, 1.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.7438F, -12.9688F, -8.6385F, -0.3145F, 1.2952F, -0.326F));

		ModelPartData cube_r431 = frontblade.addChild("cube_r431", ModelPartBuilder.create().uv(300, 28).cuboid(-4.0F, -5.0F, 3.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(301, 158).cuboid(-4.0F, -5.0F, 2.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(106, 272).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(7.1632F, -8.8978F, -12.975F, 0.0F, 1.0472F, 0.0F));

		ModelPartData cube_r432 = frontblade.addChild("cube_r432", ModelPartBuilder.create().uv(265, 294).cuboid(-4.0F, -16.0F, 1.0F, 5.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.7512F, -17.7116F, -13.0269F, -1.4152F, 1.0406F, -0.1732F));

		ModelPartData cube_r433 = frontblade.addChild("cube_r433", ModelPartBuilder.create().uv(54, 205).cuboid(-4.0F, -9.0F, 1.0F, 5.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.3441F, -15.8375F, -12.874F, -1.197F, 1.0406F, -0.1732F));

		ModelPartData cube_r434 = frontblade.addChild("cube_r434", ModelPartBuilder.create().uv(290, 51).cuboid(-4.0F, -1.0F, 1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(8.015F, -13.4046F, -13.043F, -0.1498F, 1.0406F, -0.1732F));

		ModelPartData cube_r435 = frontblade.addChild("cube_r435", ModelPartBuilder.create().uv(217, 63).cuboid(23.0F, -8.82F, 44.3492F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1253F, -8.1379F, -18.4325F, -0.1745F, -0.5236F, 0.0F));

		ModelPartData cube_r436 = frontblade.addChild("cube_r436", ModelPartBuilder.create().uv(118, 73).cuboid(25.0F, -6.878F, 44.6481F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1253F, -8.1379F, -18.4325F, -0.1309F, -0.5236F, 0.0F));

		ModelPartData cube_r437 = frontblade.addChild("cube_r437", ModelPartBuilder.create().uv(200, 197).cuboid(7.4586F, -5.3777F, 50.037F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4992F, -8.1379F, -16.4988F, -0.0873F, -0.2618F, 0.0F));

		ModelPartData cube_r438 = frontblade.addChild("cube_r438", ModelPartBuilder.create().uv(159, 251).cuboid(0.6646F, -3.2591F, 51.7411F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4352F, -8.155F, -17.136F, -0.0436F, -0.0898F, -0.0303F));

		ModelPartData cube_r439 = frontblade.addChild("cube_r439", ModelPartBuilder.create().uv(97, 242).cuboid(11.4586F, -1.0F, 50.2281F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4903F, -8.0866F, -16.4657F, 0.0F, -0.2618F, 0.0F));

		ModelPartData cube_r440 = frontblade.addChild("cube_r440", ModelPartBuilder.create().uv(238, 134).cuboid(12.4586F, 1.1909F, 50.1803F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4709F, -7.9887F, -16.3931F, 0.0436F, -0.2618F, 0.0F));

		ModelPartData cube_r441 = frontblade.addChild("cube_r441", ModelPartBuilder.create().uv(143, 185).cuboid(20.0F, -10.747F, 43.9659F, 3.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1253F, -8.1379F, -18.4325F, -0.2182F, -0.5236F, 0.0F));

		ModelPartData cube_r442 = frontblade.addChild("cube_r442", ModelPartBuilder.create().uv(294, 167).cuboid(32.7696F, -8.9584F, 35.898F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.469F, -8.1379F, -21.9501F, -0.2182F, -0.7854F, 0.0F));

		ModelPartData cube_r443 = frontblade.addChild("cube_r443", ModelPartBuilder.create().uv(26, 290).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.469F, -8.1379F, -16.326F, 0.2182F, 0.7854F, 0.0F));

		ModelPartData cube_r444 = frontblade.addChild("cube_r444", ModelPartBuilder.create().uv(12, 299).cuboid(-4.0F, -6.0F, 3.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 299).cuboid(-4.0F, -6.0F, 2.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 268).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(10.3327F, -8.8978F, -16.4623F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r445 = frontblade.addChild("cube_r445", ModelPartBuilder.create().uv(14, 290).cuboid(-4.0F, -18.0F, 0.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.3799F, -29.6346F, -9.3605F, -2.4868F, 0.7816F, -0.1231F));

		ModelPartData cube_r446 = frontblade.addChild("cube_r446", ModelPartBuilder.create().uv(204, 293).cuboid(-4.0F, -18.0F, 0.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.8062F, -16.8978F, -17.5102F, -1.3523F, 0.7816F, -0.1231F));

		ModelPartData cube_r447 = frontblade.addChild("cube_r447", ModelPartBuilder.create().uv(106, 201).cuboid(-4.0F, -10.0F, 0.0F, 5.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.549F, -14.9124F, -17.0129F, -1.1341F, 0.7816F, -0.1231F));

		ModelPartData cube_r448 = frontblade.addChild("cube_r448", ModelPartBuilder.create().uv(128, 177).cuboid(-4.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(12.0559F, -13.8404F, -16.0024F, -0.0869F, 0.7816F, -0.1231F));

		ModelPartData cube_r449 = frontblade.addChild("cube_r449", ModelPartBuilder.create().uv(224, 205).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1253F, -8.1379F, -19.8436F, 0.1309F, 0.5236F, 0.0F));

		ModelPartData cube_r450 = frontblade.addChild("cube_r450", ModelPartBuilder.create().uv(220, 10).cuboid(-3.0F, -1.0F, -1.0F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1253F, -8.1379F, -19.8436F, 0.1745F, 0.5236F, 0.0F));

		ModelPartData cube_r451 = frontblade.addChild("cube_r451", ModelPartBuilder.create().uv(183, 185).cuboid(-6.0F, -1.0F, -1.0F, 3.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1253F, -8.1379F, -19.8436F, 0.2182F, 0.5236F, 0.0F));

		ModelPartData cube_r452 = frontblade.addChild("cube_r452", ModelPartBuilder.create().uv(189, 286).cuboid(-6.0F, -6.0F, 3.0F, 7.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(205, 286).cuboid(-6.0F, -6.0F, 2.0F, 7.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(71, 255).cuboid(-6.0F, -1.0F, -1.0F, 7.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(16.0289F, -8.8978F, -20.0105F, 0.0F, 0.5236F, 0.0F));

		ModelPartData cube_r453 = frontblade.addChild("cube_r453", ModelPartBuilder.create().uv(82, 96).cuboid(-6.0F, -1.0F, 0.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.7435F, -14.4505F, -19.5184F, -0.0503F, 0.5214F, -0.1007F));

		ModelPartData cube_r454 = frontblade.addChild("cube_r454", ModelPartBuilder.create().uv(44, 244).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4903F, -8.0866F, -21.8104F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r455 = frontblade.addChild("cube_r455", ModelPartBuilder.create().uv(210, 233).cuboid(-4.0F, -1.0F, -1.0F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4352F, -8.155F, -21.1401F, 0.0436F, 0.0898F, -0.0303F));

		ModelPartData cube_r456 = frontblade.addChild("cube_r456", ModelPartBuilder.create().uv(0, 235).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4709F, -7.9887F, -21.883F, -0.0436F, 0.2618F, 0.0F));

		ModelPartData cube_r457 = frontblade.addChild("cube_r457", ModelPartBuilder.create().uv(53, 235).cuboid(-6.0F, -1.0F, -1.0F, 2.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4992F, -8.1379F, -21.7773F, 0.0873F, 0.2618F, 0.0F));

		ModelPartData cube_r458 = frontblade.addChild("cube_r458", ModelPartBuilder.create().uv(66, 235).cuboid(-6.0F, -7.0F, 3.0F, 7.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 235).cuboid(-6.0F, -6.0F, 2.0F, 8.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(253, 258).cuboid(-6.0F, -1.0F, -1.0F, 7.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(22.4493F, -8.8978F, -21.9635F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r459 = frontblade.addChild("cube_r459", ModelPartBuilder.create().uv(0, 108).cuboid(-6.0F, -1.0F, 0.0F, 10.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.1472F, -15.0606F, -21.4426F, -0.0233F, 0.2608F, -0.0903F));

		ModelPartData interior = group.addChild("interior", ModelPartBuilder.create().uv(0, 56).cuboid(-65.0F, -21.0F, -1.0F, 14.0F, 5.0F, 54.0F, new Dilation(0.0F))
		.uv(195, 339).cuboid(-40.0F, -6.0F, 3.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(28, 147).cuboid(-50.0F, -18.0F, 11.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(131, 211).cuboid(-45.0F, -18.0F, 7.0F, 1.0F, 2.0F, 9.0F, new Dilation(0.0F))
		.uv(217, 63).cuboid(-59.0F, -11.0F, 19.0F, 55.0F, 9.0F, 9.0F, new Dilation(0.0F))
		.uv(263, 231).cuboid(-39.0F, -6.0F, 28.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r460 = interior.addChild("cube_r460", ModelPartBuilder.create().uv(104, 223).cuboid(14.0F, -2.0F, -10.0F, 7.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(210, 223).cuboid(14.0F, -2.0F, -35.0F, 7.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-24.9128F, -7.9962F, 42.0F, 0.0F, 0.0F, -1.4835F));

		ModelPartData cube_r461 = interior.addChild("cube_r461", ModelPartBuilder.create().uv(248, 167).cuboid(-2.0F, -2.0F, -13.0F, 16.0F, 2.0F, 14.0F, new Dilation(0.0F))
		.uv(36, 344).cuboid(-2.0F, -2.0F, -38.0F, 16.0F, 2.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-23.9128F, -7.9962F, 42.0F, 0.0F, 0.0F, -1.4835F));

		ModelPartData cube_r462 = interior.addChild("cube_r462", ModelPartBuilder.create().uv(171, 220).cuboid(-10.0F, -6.0F, -8.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 20).cuboid(-9.0F, -4.0F, -7.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-35.0F, -7.0F, 29.0F, 0.0F, 0.0F, 0.48F));

		ModelPartData cube_r463 = interior.addChild("cube_r463", ModelPartBuilder.create().uv(105, 153).cuboid(-1.0F, -5.0F, 8.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-44.0F, -8.4564F, 16.0829F, 1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r464 = interior.addChild("cube_r464", ModelPartBuilder.create().uv(40, 161).cuboid(-1.0F, -5.0F, -13.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-44.0F, -8.4564F, 6.9171F, -1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r465 = interior.addChild("cube_r465", ModelPartBuilder.create().uv(82, 61).cuboid(-5.0F, -7.0F, -36.0F, 5.0F, 10.0F, 54.0F, new Dilation(0.0F)), ModelTransform.of(-57.4047F, -10.2656F, 35.0F, 0.0F, 0.0F, 2.0508F));

		ModelPartData cube_r466 = interior.addChild("cube_r466", ModelPartBuilder.create().uv(0, 115).cuboid(-5.0F, -7.0F, -36.0F, 5.0F, 10.0F, 54.0F, new Dilation(0.0F)), ModelTransform.of(-55.8869F, -11.4685F, 35.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r467 = interior.addChild("cube_r467", ModelPartBuilder.create().uv(64, 125).cuboid(-5.0F, -7.0F, -36.0F, 5.0F, 5.0F, 54.0F, new Dilation(0.0F)), ModelTransform.of(-55.2311F, -13.5101F, 35.0F, 0.0F, 0.0F, 1.1345F));
		return TexturedModelData.of(modelData, 512, 512);
	}
	@Override
	public void setAngles(VehicleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		poseStack.push();
		//float angleInRadians = (float) Math.PI; // 180 degrees
		//Quaternionf rotation = new Quaternionf();
		//rotation.rotateY(angleInRadians);
		//poseStack.multiply(rotation);
		float scale = 0.8f;
		poseStack.scale(scale,scale,scale);
		poseStack.translate(0, -1.1, -0.01);
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		poseStack.pop();
	}

	public int getBodyColor() {
		return this.color;
	}
}