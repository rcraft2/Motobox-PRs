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
import net.minecraft.util.math.Direction;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class Veloce_M3 extends EntityModel<VehicleEntity> {
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("frame_veloce_m3"), "main");
	private final ModelPart group;
	public Veloce_M3(EntityRendererFactory.Context root) {
		super(RenderLayer::getEntityTranslucent);
		this.group = root.getPart(MODEL_LAYER).getChild("group");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData group = modelPartData.addChild("group", ModelPartBuilder.create().uv(95, 108).cuboid(-10.9621F, -24.9404F, -1.4531F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(196, 219).cuboid(-26.03F, -15.9003F, 20.3706F, 18.0F, 7.0F, 12.0F, new Dilation(0.0F))
				.uv(230, 137).cuboid(-38.03F, -15.9003F, 28.3706F, 12.0F, 7.0F, 4.0F, new Dilation(0.0F))
				.uv(233, 184).cuboid(-38.03F, -15.9003F, 20.3706F, 12.0F, 7.0F, 4.0F, new Dilation(0.0F))
				.uv(271, 158).cuboid(-38.03F, -11.9003F, 24.3706F, 12.0F, 3.0F, 4.0F, new Dilation(0.0F))
				.uv(32, 0).cuboid(-33.03F, -15.9003F, 24.3706F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F))
				.uv(38, 47).cuboid(-10.9621F, -24.9404F, 50.5469F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 254).cuboid(-45.03F, -15.9003F, 20.3706F, 7.0F, 7.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r1 = group.addChild("cube_r1", ModelPartBuilder.create().uv(9, 0).cuboid(-44.27F, 0.0F, -6.5706F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.97F, -41.9003F, 34.3706F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r2 = group.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-44.0F, -2.0F, -6.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.97F, -38.9003F, 34.3706F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r3 = group.addChild("cube_r3", ModelPartBuilder.create().uv(64, 159).cuboid(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-9.9621F, -20.9404F, 53.5469F, 0.0F, -0.5236F, 0.0F));

		ModelPartData cube_r4 = group.addChild("cube_r4", ModelPartBuilder.create().uv(16, 273).cuboid(-2.0F, -5.0F, -4.0F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-9.9621F, -20.9404F, -2.4531F, 0.0F, 0.5236F, 0.0F));

		ModelPartData side = group.addChild("side", ModelPartBuilder.create().uv(0, 0).cuboid(39.7127F, -6.0938F, -26.8313F, 2.0F, 12.0F, 5.0F, new Dilation(0.0F))
				.uv(226, 271).cuboid(23.7127F, -6.0938F, -26.8313F, 4.0F, 19.0F, 5.0F, new Dilation(0.0F))
				.uv(165, 30).cuboid(27.7127F, -6.0938F, -26.8313F, 12.0F, 10.0F, 5.0F, new Dilation(0.0F))
				.uv(16, 41).cuboid(57.5673F, -3.6703F, -26.0379F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-101.0867F, -16.3015F, 25.7066F));

		ModelPartData cube_r5 = side.addChild("cube_r5", ModelPartBuilder.create().uv(196, 201).cuboid(-46.0F, -16.0F, -1.0F, 49.0F, 16.0F, 2.0F, new Dilation(0.0F))
				.uv(44, 96).cuboid(3.0F, -14.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F))
				.uv(272, 95).cuboid(5.0F, -14.0F, -1.0F, 13.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(149, 201).cuboid(18.0F, -15.0F, -1.0F, 17.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(99.5673F, 9.7506F, -22.9175F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r6 = side.addChild("cube_r6", ModelPartBuilder.create().uv(107, 271).cuboid(-1.0F, -21.0F, -1.0F, 4.0F, 23.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(90.4722F, -5.4251F, -24.3761F, -0.0984F, -0.1329F, -0.602F));

		ModelPartData cube_r7 = side.addChild("cube_r7", ModelPartBuilder.create().uv(210, 265).cuboid(-1.0F, -23.0F, -1.0F, 4.0F, 25.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(19.7084F, -5.6384F, -25.5668F, -0.1566F, 0.0531F, 0.6527F));

		ModelPartData cube_r8 = side.addChild("cube_r8", ModelPartBuilder.create().uv(83, 96).cuboid(-1.0F, -17.0F, -1.0F, 4.0F, 17.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(54.5673F, -6.1034F, -23.6182F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r9 = side.addChild("cube_r9", ModelPartBuilder.create().uv(128, 189).cuboid(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(43.6415F, 13.3297F, -25.027F, -0.4363F, -0.6545F, 0.0F));

		ModelPartData cube_r10 = side.addChild("cube_r10", ModelPartBuilder.create().uv(0, 170).cuboid(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(102.3827F, 13.3297F, -25.6357F, -0.4363F, 0.6545F, 0.0F));

		ModelPartData cube_r11 = side.addChild("cube_r11", ModelPartBuilder.create().uv(94, 204).cuboid(-41.0F, -4.0F, -1.0F, 14.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(159.5673F, 10.7506F, -22.9175F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r12 = side.addChild("cube_r12", ModelPartBuilder.create().uv(83, 142).cuboid(-41.0F, -1.0F, -1.0F, 16.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(159.5673F, 13.7506F, -22.9175F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r13 = side.addChild("cube_r13", ModelPartBuilder.create().uv(105, 169).cuboid(-9.0F, -16.0F, -1.0F, 12.0F, 16.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(50.4624F, 9.768F, -23.3172F, 0.044F, -0.1308F, -0.0057F));

		ModelPartData cube_r14 = side.addChild("cube_r14", ModelPartBuilder.create().uv(165, 6).cuboid(-57.0F, -4.0F, -1.0F, 60.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(99.5673F, 13.3297F, -26.0379F, -0.7854F, 0.0F, 0.0F));

		ModelPartData fender2 = side.addChild("fender2", ModelPartBuilder.create().uv(233, 150).cuboid(-2.5194F, -4.9718F, -1.3313F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F))
				.uv(186, 117).cuboid(12.5768F, -4.9718F, -1.3313F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(28.0867F, 13.3015F, -25.7066F));

		ModelPartData cube_r15 = fender2.addChild("cube_r15", ModelPartBuilder.create().uv(187, 169).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.6131F, -4.5491F, -0.3313F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r16 = fender2.addChild("cube_r16", ModelPartBuilder.create().uv(28, 47).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(13.6705F, -4.5491F, -0.3313F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r17 = fender2.addChild("cube_r17", ModelPartBuilder.create().uv(199, 30).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0554F, -8.6163F, -0.3313F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r18 = fender2.addChild("cube_r18", ModelPartBuilder.create().uv(130, 222).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(12.002F, -8.6163F, -0.3313F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r19 = fender2.addChild("cube_r19", ModelPartBuilder.create().uv(123, 275).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.0287F, -10.812F, -0.3313F, 0.0F, 0.0F, 1.5708F));

		ModelPartData fender = side.addChild("fender", ModelPartBuilder.create().uv(0, 273).cuboid(-2.5194F, -4.9718F, -1.3313F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F))
				.uv(233, 167).cuboid(12.5768F, -4.9718F, -1.3313F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(105.0867F, 13.3015F, -25.7066F));

		ModelPartData cube_r20 = fender.addChild("cube_r20", ModelPartBuilder.create().uv(272, 118).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.6131F, -4.5491F, -0.3313F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r21 = fender.addChild("cube_r21", ModelPartBuilder.create().uv(244, 219).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(13.6705F, -4.5491F, -0.3313F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r22 = fender.addChild("cube_r22", ModelPartBuilder.create().uv(26, 254).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0554F, -8.6163F, -0.3313F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r23 = fender.addChild("cube_r23", ModelPartBuilder.create().uv(128, 249).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(12.002F, -8.6163F, -0.3313F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r24 = fender.addChild("cube_r24", ModelPartBuilder.create().uv(244, 276).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.0287F, -10.812F, -0.3313F, 0.0F, 0.0F, 1.5708F));

		ModelPartData side2 = group.addChild("side2", ModelPartBuilder.create().uv(0, 47).cuboid(59.5392F, -6.0938F, 23.5769F, 2.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 121).cuboid(43.5392F, -6.0938F, 23.5769F, 4.0F, 19.0F, 4.0F, new Dilation(0.0F))
				.uv(92, 249).cuboid(47.5392F, -6.0938F, 23.5769F, 12.0F, 10.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 41).cuboid(77.3938F, -3.6703F, 24.7834F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-120.9133F, -16.3015F, 25.7066F));

		ModelPartData cube_r25 = side2.addChild("cube_r25", ModelPartBuilder.create().uv(165, 12).cuboid(-46.0F, -16.0F, -1.0F, 49.0F, 16.0F, 2.0F, new Dilation(0.0F))
				.uv(12, 96).cuboid(3.0F, -14.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F))
				.uv(271, 167).cuboid(5.0F, -14.0F, -1.0F, 13.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(113, 99).cuboid(19.0F, 3.0F, -1.0F, 16.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(152, 135).cuboid(18.0F, -15.0F, -1.0F, 17.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(119.3938F, 9.7506F, 23.6631F, -0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r26 = side2.addChild("cube_r26", ModelPartBuilder.create().uv(91, 271).cuboid(-1.0F, -21.0F, -3.0F, 4.0F, 23.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(110.2987F, -5.4251F, 24.5382F, 0.0984F, 0.1329F, -0.602F));

		ModelPartData cube_r27 = side2.addChild("cube_r27", ModelPartBuilder.create().uv(48, 159).cuboid(-1.0F, -23.0F, -3.0F, 4.0F, 25.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(39.535F, -5.6384F, 25.729F, 0.1566F, -0.0531F, 0.6527F));

		ModelPartData cube_r28 = side2.addChild("cube_r28", ModelPartBuilder.create().uv(30, 96).cuboid(-1.0F, -17.0F, -1.0F, 4.0F, 17.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(74.3938F, -6.1034F, 24.3638F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r29 = side2.addChild("cube_r29", ModelPartBuilder.create().uv(184, 150).cuboid(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(63.468F, 13.3297F, 25.7726F, 0.4363F, 0.6545F, 0.0F));

		ModelPartData cube_r30 = side2.addChild("cube_r30", ModelPartBuilder.create().uv(119, 142).cuboid(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(122.2092F, 13.3297F, 26.3813F, 0.4363F, -0.6545F, 0.0F));

		ModelPartData cube_r31 = side2.addChild("cube_r31", ModelPartBuilder.create().uv(152, 150).cuboid(-41.0F, 0.0F, -1.0F, 14.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(179.3938F, 6.7506F, 23.6631F, -0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r32 = side2.addChild("cube_r32", ModelPartBuilder.create().uv(180, 265).cuboid(-9.0F, -16.0F, -2.0F, 12.0F, 16.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(70.2889F, 9.768F, 24.0628F, -0.044F, 0.1308F, -0.0057F));

		ModelPartData cube_r33 = side2.addChild("cube_r33", ModelPartBuilder.create().uv(165, 0).cuboid(-57.0F, -4.0F, -1.0F, 60.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(119.3938F, 13.3297F, 26.7834F, 0.7854F, 0.0F, 0.0F));

		ModelPartData fender3 = side2.addChild("fender3", ModelPartBuilder.create().uv(22, 182).cuboid(63.4806F, -4.9718F, 47.49F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F))
				.uv(0, 159).cuboid(78.5768F, -4.9718F, 47.49F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-18.0867F, 13.3015F, -25.7066F));

		ModelPartData cube_r34 = fender3.addChild("cube_r34", ModelPartBuilder.create().uv(22, 159).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(64.3869F, -4.5491F, 52.49F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r35 = fender3.addChild("cube_r35", ModelPartBuilder.create().uv(149, 169).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(79.6705F, -4.5491F, 52.49F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r36 = fender3.addChild("cube_r36", ModelPartBuilder.create().uv(170, 47).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(66.0554F, -8.6163F, 52.49F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r37 = fender3.addChild("cube_r37", ModelPartBuilder.create().uv(0, 182).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(78.002F, -8.6163F, 52.49F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r38 = fender3.addChild("cube_r38", ModelPartBuilder.create().uv(276, 249).cuboid(-1.0F, -4.0F, -5.0F, 2.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(70.0287F, -10.812F, 52.49F, 0.0F, 0.0F, 1.5708F));

		ModelPartData fender4 = side2.addChild("fender4", ModelPartBuilder.create().uv(142, 47).cuboid(227.4806F, -4.9718F, 47.49F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F))
				.uv(113, 104).cuboid(242.5768F, -4.9718F, 47.49F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-105.0867F, 13.3015F, -25.7066F));

		ModelPartData cube_r39 = fender4.addChild("cube_r39", ModelPartBuilder.create().uv(37, 121).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(228.3869F, -4.5491F, 52.49F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r40 = fender4.addChild("cube_r40", ModelPartBuilder.create().uv(83, 121).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(243.6705F, -4.5491F, 52.49F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r41 = fender4.addChild("cube_r41", ModelPartBuilder.create().uv(119, 121).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(230.0554F, -8.6163F, 52.49F, 0.0F, 0.0F, 1.0908F));

		ModelPartData cube_r42 = fender4.addChild("cube_r42", ModelPartBuilder.create().uv(37, 132).cuboid(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(242.002F, -8.6163F, 52.49F, 0.0F, 0.0F, -1.0908F));

		ModelPartData cube_r43 = fender4.addChild("cube_r43", ModelPartBuilder.create().uv(184, 139).cuboid(-1.0F, -4.0F, -5.0F, 2.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(234.0287F, -10.812F, 52.49F, 0.0F, 0.0F, 1.5708F));

		ModelPartData back = group.addChild("back", ModelPartBuilder.create().uv(0, 47).cuboid(-73.1704F, -40.6359F, 2.7877F, 48.0F, 3.0F, 46.0F, new Dilation(0.0F))
				.uv(0, 227).cuboid(-100.1621F, -22.4365F, 37.2066F, 18.0F, 12.0F, 15.0F, new Dilation(0.0F))
				.uv(48, 169).cuboid(-99.1621F, -22.4365F, 14.2066F, 17.0F, 12.0F, 23.0F, new Dilation(0.0F))
				.uv(0, 121).cuboid(-100.1621F, -22.4365F, 14.2066F, 1.0F, 4.0F, 23.0F, new Dilation(0.0F))
				.uv(79, 222).cuboid(-100.1621F, -22.4365F, -0.7934F, 18.0F, 12.0F, 15.0F, new Dilation(0.0F))
				.uv(108, 249).cuboid(-101.0F, -19.0F, -1.0F, 2.0F, 6.0F, 16.0F, new Dilation(0.0F))
				.uv(72, 249).cuboid(-101.0F, -19.0F, 36.5F, 2.0F, 6.0F, 16.0F, new Dilation(0.0F))
				.uv(142, 58).cuboid(-101.0F, -22.0F, 23.8F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 0.0F, 0.0F));

		ModelPartData cube_r44 = back.addChild("cube_r44", ModelPartBuilder.create().uv(83, 106).cuboid(-4.0F, -5.0F, -26.5F, 8.0F, 10.0F, 53.0F, new Dilation(0.0F)), ModelTransform.of(-96.0159F, -12.232F, 25.7066F, 0.0F, 0.0F, 0.6118F));

		ModelPartData cube_r45 = back.addChild("cube_r45", ModelPartBuilder.create().uv(0, 96).cuboid(-14.0F, -10.0F, -1.0F, 15.0F, 10.0F, 53.0F, new Dilation(0.0F)), ModelTransform.of(-81.7943F, -3.7655F, 0.2066F, 0.0F, 0.0F, 0.1739F));

		ModelPartData front2 = group.addChild("front2", ModelPartBuilder.create().uv(267, 12).cuboid(18.6583F, -49.8797F, 19.6781F, 2.0F, 5.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 39.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData cube_r46 = front2.addChild("cube_r46", ModelPartBuilder.create().uv(0, 0).cuboid(-1.9132F, -3.0038F, -1.0076F, 2.0F, 5.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(20.4878F, -46.8759F, 33.3897F, 0.0F, -0.0873F, 0.0F));

		ModelPartData cube_r47 = front2.addChild("cube_r47", ModelPartBuilder.create().uv(0, 159).cuboid(-1.9132F, -3.0038F, -0.9924F, 2.0F, 5.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(19.0933F, -46.8759F, 2.8299F, 0.0F, 0.0873F, 0.0F));

		ModelPartData front3 = group.addChild("front3", ModelPartBuilder.create().uv(253, 258).cuboid(22.9329F, -48.0258F, 19.6781F, 5.0F, 5.0F, 13.0F, new Dilation(0.0F))
				.uv(271, 150).cuboid(8.2884F, -48.0258F, 0.0119F, 13.0F, 5.0F, 3.0F, new Dilation(0.0F))
				.uv(32, 182).cuboid(6.2884F, -48.0258F, 0.0119F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(119, 132).cuboid(4.2884F, -48.0258F, 0.0119F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(51, 227).cuboid(8.2012F, -48.0258F, 49.1431F, 13.0F, 5.0F, 3.0F, new Dilation(0.0F))
				.uv(83, 132).cuboid(4.2012F, -48.0258F, 49.1431F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(32, 171).cuboid(6.2012F, -48.0258F, 49.1431F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, 34.0F, 0.0F));

		ModelPartData cube_r48 = front3.addChild("cube_r48", ModelPartBuilder.create().uv(0, 96).cuboid(-2.0F, -4.0F, -1.0F, 5.0F, 5.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(24.8496F, -44.0258F, 33.3897F, 0.0F, -0.0873F, 0.0F));

		ModelPartData cube_r49 = front3.addChild("cube_r49", ModelPartBuilder.create().uv(83, 96).cuboid(-2.0F, -4.0F, -3.0F, 5.0F, 5.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(23.4551F, -44.0258F, 2.8299F, 0.0F, 0.0873F, 0.0F));

		ModelPartData front4 = group.addChild("front4", ModelPartBuilder.create().uv(38, 258).cuboid(22.9329F, -50.0258F, 19.6781F, 5.0F, 7.0F, 13.0F, new Dilation(0.0F))
				.uv(230, 99).cuboid(26.0F, -49.0F, 4.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 227).cuboid(26.5F, -49.0F, 11.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F))
				.uv(152, 117).cuboid(26.4F, -49.0F, 36.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F))
				.uv(179, 222).cuboid(26.4F, -49.0F, 43.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 29.0F, 0.0F));

		ModelPartData cube_r50 = front4.addChild("cube_r50", ModelPartBuilder.create().uv(0, 47).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 7.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(24.8496F, -44.0258F, 33.3897F, 0.0F, -0.0873F, 0.0F));

		ModelPartData cube_r51 = front4.addChild("cube_r51", ModelPartBuilder.create().uv(142, 47).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 7.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(23.4551F, -44.0258F, 2.8299F, 0.0F, 0.0873F, 0.0F));

		ModelPartData interiro = group.addChild("interiro", ModelPartBuilder.create().uv(0, 0).cuboid(-58.5194F, -8.5945F, 3.3706F, 60.0F, 2.0F, 45.0F, new Dilation(0.0F))
				.uv(94, 169).cuboid(-3.5194F, -16.5945F, 3.3706F, 5.0F, 8.0F, 45.0F, new Dilation(0.0F))
				.uv(152, 99).cuboid(-77.03F, -21.9003F, 1.3706F, 14.0F, 1.0F, 50.0F, new Dilation(0.0F))
				.uv(158, 150).cuboid(-61.03F, -12.9003F, 2.3706F, 14.0F, 4.0F, 47.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r52 = interiro.addChild("cube_r52", ModelPartBuilder.create().uv(138, 47).cuboid(-61.0F, -2.0F, -46.0F, 14.0F, 2.0F, 50.0F, new Dilation(0.0F)), ModelTransform.of(-46.2937F, 36.8316F, 47.3706F, 0.0F, 0.0F, 1.2654F));

		ModelPartData dash = interiro.addChild("dash", ModelPartBuilder.create().uv(83, 121).cuboid(-5.0F, -5.0F, -15.0F, 10.0F, 5.0F, 16.0F, new Dilation(0.0F))
				.uv(233, 167).cuboid(-6.0F, -6.0F, -15.0F, 11.0F, 1.0F, 16.0F, new Dilation(0.0F))
				.uv(233, 150).cuboid(-6.0F, 0.0F, -15.0F, 11.0F, 1.0F, 16.0F, new Dilation(0.0F))
				.uv(14, 10).cuboid(-6.0F, -5.0F, -15.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 4).cuboid(-6.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(149, 169).cuboid(-6.0F, -6.0F, -44.0F, 11.0F, 6.0F, 16.0F, new Dilation(0.0F))
				.uv(0, 72).cuboid(-5.0F, -6.0F, -28.0F, 10.0F, 6.0F, 13.0F, new Dilation(0.0F))
				.uv(35, 108).cuboid(-5.4806F, 0.0F, -25.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
				.uv(22, 10).cuboid(-5.4806F, -5.0F, -25.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
				.uv(28, 47).cuboid(-5.4806F, -4.0F, -25.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(40, 17).cuboid(-5.4806F, -4.0F, -19.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(32, 0).cuboid(-6.0F, -5.0F, -17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(22, 15).cuboid(-6.0F, -3.0F, -17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 16).cuboid(-6.0F, -1.4055F, -17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-12.5194F, -16.5945F, 48.3706F));

		ModelPartData steerwheel = dash.addChild("steerwheel", ModelPartBuilder.create().uv(22, 0).cuboid(-7.4806F, -5.0F, -11.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
				.uv(12, 47).cuboid(-7.4806F, -8.0F, -8.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(22, 10).cuboid(-7.4806F, -3.0F, -8.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(32, 41).cuboid(-8.0F, -5.0F, -8.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData cube_r53 = steerwheel.addChild("cube_r53", ModelPartBuilder.create().uv(12, 52).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 0.9282F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r54 = steerwheel.addChild("cube_r54", ModelPartBuilder.create().uv(12, 55).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.1962F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r55 = steerwheel.addChild("cube_r55", ModelPartBuilder.create().uv(12, 58).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.9282F, -7.0F, 2.0944F, 0.0F, 0.0F));

		ModelPartData cube_r56 = steerwheel.addChild("cube_r56", ModelPartBuilder.create().uv(40, 58).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.0F, -11.1962F, 2.618F, 0.0F, 0.0F));

		ModelPartData cube_r57 = steerwheel.addChild("cube_r57", ModelPartBuilder.create().uv(10, 61).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, -14.9282F, -2.618F, 0.0F, 0.0F));

		ModelPartData cube_r58 = steerwheel.addChild("cube_r58", ModelPartBuilder.create().uv(40, 61).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.1962F, -14.0F, -2.0944F, 0.0F, 0.0F));

		ModelPartData cube_r59 = steerwheel.addChild("cube_r59", ModelPartBuilder.create().uv(12, 110).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.9282F, -7.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r60 = steerwheel.addChild("cube_r60", ModelPartBuilder.create().uv(44, 110).cuboid(-7.4806F, -1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0F, -2.8038F, -0.5236F, 0.0F, 0.0F));

		ModelPartData seat = interiro.addChild("seat", ModelPartBuilder.create().uv(230, 118).cuboid(-41.03F, -13.9003F, 77.3706F, 14.0F, 5.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, -45.0F));

		ModelPartData cube_r61 = seat.addChild("cube_r61", ModelPartBuilder.create().uv(256, 219).cuboid(-51.0F, -2.0F, -13.0F, 8.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 24.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r62 = seat.addChild("cube_r62", ModelPartBuilder.create().uv(265, 184).cuboid(-50.0F, -2.0F, -11.0F, 7.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 14.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r63 = seat.addChild("cube_r63", ModelPartBuilder.create().uv(148, 265).cuboid(-45.0F, -2.0F, -14.0F, 2.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 16.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r64 = seat.addChild("cube_r64", ModelPartBuilder.create().uv(145, 222).cuboid(-53.0F, -2.0F, -14.0F, 10.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-38.9261F, 34.0952F, 91.3706F, 0.0F, 0.0F, 1.4835F));

		ModelPartData seat2 = interiro.addChild("seat2", ModelPartBuilder.create().uv(230, 99).cuboid(-41.03F, -13.9003F, 77.3706F, 14.0F, 5.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, -71.0F));

		ModelPartData cube_r65 = seat2.addChild("cube_r65", ModelPartBuilder.create().uv(226, 255).cuboid(-51.0F, -2.0F, -13.0F, 8.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 24.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r66 = seat2.addChild("cube_r66", ModelPartBuilder.create().uv(262, 137).cuboid(-50.0F, -2.0F, -11.0F, 7.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 14.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r67 = seat2.addChild("cube_r67", ModelPartBuilder.create().uv(130, 257).cuboid(-45.0F, -2.0F, -14.0F, 2.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-41.7977F, 16.1332F, 91.3706F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r68 = seat2.addChild("cube_r68", ModelPartBuilder.create().uv(152, 117).cuboid(-53.0F, -2.0F, -14.0F, 10.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-38.9261F, 34.0952F, 91.3706F, 0.0F, 0.0F, 1.4835F));

		ModelPartData windows = group.addChild("windows", ModelPartBuilder.create(), ModelTransform.pivot(-26.5194F, -22.4049F, 50.0704F));

		ModelPartData window = windows.addChild("window", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r69 = window.addChild("cube_r69", ModelPartBuilder.create().uv(170, 58).cuboid(11.0F, -5.0F, -1.0F, 4.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(33, 72).cuboid(7.0F, -11.0F, -1.0F, 4.0F, 11.0F, 1.0F, new Dilation(0.0F))
				.uv(152, 99).cuboid(-17.0F, -17.0F, -1.0F, 24.0F, 17.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData window2 = windows.addChild("window2", ModelPartBuilder.create(), ModelTransform.pivot(-22.0F, 0.0F, 0.0F));

		ModelPartData cube_r70 = window2.addChild("cube_r70", ModelPartBuilder.create().uv(22, 170).cuboid(11.0F, -5.0F, -1.0F, 4.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 72).cuboid(15.0F, -11.0F, -1.0F, 5.0F, 11.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 23).cuboid(20.0F, -17.0F, -1.0F, 21.0F, 17.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData windshield = windows.addChild("windshield", ModelPartBuilder.create(), ModelTransform.pivot(26.5194F, 22.4049F, -50.0704F));

		ModelPartData cube_r71 = windshield.addChild("cube_r71", ModelPartBuilder.create().uv(0, 159).cuboid(-3.0F, -22.0F, -1.0F, 1.0F, 22.0F, 46.0F, new Dilation(0.0F)), ModelTransform.of(-78.0144F, -21.2605F, 3.7877F, 0.0F, 0.0F, 0.6458F));

		ModelPartData cube_r72 = windshield.addChild("cube_r72", ModelPartBuilder.create().uv(152, 201).cuboid(-3.0F, -22.0F, 1.0F, 1.0F, 22.0F, 42.0F, new Dilation(0.0F)), ModelTransform.of(-6.7325F, -23.1881F, 3.7877F, 0.0F, 0.0F, -0.6109F));

		ModelPartData window3 = windows.addChild("window3", ModelPartBuilder.create(), ModelTransform.pivot(11.0F, 0.0F, -47.9821F));

		ModelPartData cube_r73 = window3.addChild("cube_r73", ModelPartBuilder.create().uv(22, 0).cuboid(-1.0F, -7.0F, 1.0F, 4.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(38, 159).cuboid(-5.0F, -12.0F, 1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F))
				.uv(142, 72).cuboid(-28.0F, -17.0F, 1.0F, 23.0F, 17.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData window4 = windows.addChild("window4", ModelPartBuilder.create(), ModelTransform.pivot(11.0F, 0.0F, -47.9821F));

		ModelPartData cube_r74 = window4.addChild("cube_r74", ModelPartBuilder.create().uv(123, 104).cuboid(-2.0F, -6.0F, 1.0F, 5.0F, 6.0F, 0.0F, new Dilation(0.0F))
				.uv(95, 96).cuboid(3.0F, -12.0F, 1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F))
				.uv(238, 238).cuboid(7.0F, -17.0F, 1.0F, 21.0F, 17.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-60.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData hood = group.addChild("hood", ModelPartBuilder.create().uv(216, 86).cuboid(-64.9493F, -1.4703F, 18.979F, 39.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(58.4806F, -20.5297F, 3.2052F, 0.0F, 0.0F, 0.0349F));

		ModelPartData cube_r75 = hood.addChild("cube_r75", ModelPartBuilder.create().uv(0, 96).cuboid(-66.0F, -17.0F, -1.0F, 5.0F, 19.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(36.0752F, 0.8872F, -2.8803F, -1.5533F, 0.0436F, 0.0008F));

		ModelPartData cube_r76 = hood.addChild("cube_r76", ModelPartBuilder.create().uv(25, 121).cuboid(-66.0F, -21.0F, -1.0F, 5.0F, 20.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(36.9039F, 0.556F, 29.6496F, -1.5883F, -0.0436F, 0.0008F));

		ModelPartData cube_r77 = hood.addChild("cube_r77", ModelPartBuilder.create().uv(28, 58).cuboid(-67.0F, -24.0F, -1.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(37.8747F, 0.8585F, -1.236F, -1.5533F, 0.0F, 0.0F));

		ModelPartData cube_r78 = hood.addChild("cube_r78", ModelPartBuilder.create().uv(216, 58).cuboid(-66.0F, -23.0F, -1.0F, 37.0F, 25.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0507F, 0.837F, 0.0F, -1.5533F, 0.0F, 0.0F));

		ModelPartData cube_r79 = hood.addChild("cube_r79", ModelPartBuilder.create().uv(31, 10).cuboid(-68.0F, -1.0F, 1.0F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(38.9184F, -1.4902F, 27.0232F, -1.5882F, 0.0F, 0.0F));

		ModelPartData cube_r80 = hood.addChild("cube_r80", ModelPartBuilder.create().uv(216, 30).cuboid(-66.0F, -21.0F, -1.0F, 37.0F, 25.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0507F, 0.5054F, 26.7512F, -1.5882F, 0.0F, 0.0F));

		ModelPartData front = group.addChild("front", ModelPartBuilder.create().uv(61, 271).cuboid(46.1232F, -28.3861F, 19.6781F, 2.0F, 4.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 44.0F, 0.0F, 0.0F, 0.0F, -0.5672F));

		ModelPartData cube_r81 = front.addChild("cube_r81", ModelPartBuilder.create().uv(0, 182).cuboid(-1.5353F, -3.1566F, -0.9532F, 2.0F, 4.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(47.5771F, -25.2295F, 33.3897F, 0.0F, -0.0873F, 0.0F));

		ModelPartData cube_r82 = front.addChild("cube_r82", ModelPartBuilder.create().uv(48, 236).cuboid(-1.5353F, -3.1566F, -1.0468F, 2.0F, 4.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(46.1826F, -25.2295F, 2.8299F, 0.0F, 0.0873F, 0.0F));
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
		float scale = 0.8f;
		poseStack.scale(scale,scale,scale);
		poseStack.translate(2, -1.2, 2);
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		poseStack.pop();
	}
}