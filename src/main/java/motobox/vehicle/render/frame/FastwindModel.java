// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package motobox.vehicle.render.frame;// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings

import motobox.Motobox;
import motobox.entity.VehicleEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Quaternionf;

public class FastwindModel extends EntityModel<VehicleEntity> {
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("frame_fastwind"), "main");
	private final ModelPart main1;
	public FastwindModel(EntityRendererFactory.Context root) {
		super(RenderLayer::getEntityTranslucent);
		this.main1 = root.getPart(MODEL_LAYER).getChild("main1");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main1 = modelPartData.addChild("main1", ModelPartBuilder.create().uv(0, 0).cuboid(-56.0F, 10.0F, -162.0F, 90.0F, 3.0F, 163.0F, new Dilation(0.0F))
				.uv(168, 491).cuboid(-58.0F, 10.0F, -209.0F, 94.0F, 3.0F, 10.0F, new Dilation(0.0F))
				.uv(347, 256).cuboid(-53.0F, -13.0F, -5.0F, 84.0F, 15.0F, 2.0F, new Dilation(0.0F))
				.uv(346, 378).cuboid(6.0108F, -22.7185F, -75.079F, 22.0F, 2.0F, 16.0F, new Dilation(0.0F))
				.uv(208, 377).cuboid(-28.0108F, -23.4347F, -75.4047F, 34.0F, 2.0F, 15.0F, new Dilation(0.0F))
				.uv(112, 379).cuboid(-50.0108F, -22.8239F, -75.2832F, 22.0F, 2.0F, 16.0F, new Dilation(0.0F))
				.uv(34, 51).cuboid(-56.0F, -2.0F, -12.0F, 1.0F, 1.0F, 12.0F, new Dilation(0.0F))
				.uv(232, 288).cuboid(-56.0F, -2.0F, -156.0F, 1.0F, 1.0F, 112.0F, new Dilation(0.0F))
				.uv(132, 15).cuboid(33.0F, -2.0F, -10.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
				.uv(0, 299).cuboid(33.0F, -2.0F, -156.0F, 1.0F, 1.0F, 110.0F, new Dilation(0.0F)), ModelTransform.pivot(29.0F, 9.0F, 89.0F));

		ModelPartData cube_r1 = main1.addChild("cube_r1", ModelPartBuilder.create().uv(112, 309).cuboid(-3.0F, -2.0F, -33.0F, 4.0F, 1.0F, 88.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = main1.addChild("cube_r2", ModelPartBuilder.create().uv(135, 597).cuboid(-40.0F, -2.0F, -21.0F, 22.0F, 2.0F, 25.0F, new Dilation(0.0F))
				.uv(598, 114).cuboid(-40.0F, -2.0F, -21.0F, 22.0F, 2.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(-10.0108F, -19.0012F, -38.5374F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r3 = main1.addChild("cube_r3", ModelPartBuilder.create().uv(570, 597).cuboid(-40.0F, -2.0F, -1.0F, 34.0F, 2.0F, 25.0F, new Dilation(0.0F))
				.uv(598, 87).cuboid(-40.0F, -2.0F, -1.0F, 34.0F, 2.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(11.9892F, -21.3552F, -59.5828F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r4 = main1.addChild("cube_r4", ModelPartBuilder.create().uv(282, 555).cuboid(-40.0F, -2.0F, -21.0F, 22.0F, 2.0F, 25.0F, new Dilation(0.0F))
				.uv(598, 249).cuboid(-40.0F, -2.0F, -21.0F, 22.0F, 2.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(46.0108F, -18.8959F, -38.3332F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r5 = main1.addChild("cube_r5", ModelPartBuilder.create().uv(80, 336).cuboid(-2.0F, -2.0F, 11.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F))
				.uv(438, 93).cuboid(-1.0F, -2.0F, -69.0F, 2.0F, 3.0F, 86.0F, new Dilation(0.0F)), ModelTransform.of(29.1603F, -21.7593F, -87.0371F, 0.0F, 0.0F, -1.0036F));

		ModelPartData cube_r6 = main1.addChild("cube_r6", ModelPartBuilder.create().uv(144, 15).cuboid(-2.0F, -2.0F, 11.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F))
				.uv(343, 0).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(30.9651F, -19.8699F, -87.0371F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r7 = main1.addChild("cube_r7", ModelPartBuilder.create().uv(62, 336).cuboid(-2.0F, -2.0F, 11.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F))
				.uv(346, 288).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(32.1116F, -17.4639F, -87.0371F, 0.0F, 0.0F, -0.3491F));

		ModelPartData cube_r8 = main1.addChild("cube_r8", ModelPartBuilder.create().uv(18, 336).cuboid(-2.0F, -2.0F, 11.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F))
				.uv(347, 166).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(32.4815F, -14.8245F, -87.0371F, 0.0F, 0.0F, -0.0436F));

		ModelPartData cube_r9 = main1.addChild("cube_r9", ModelPartBuilder.create().uv(0, 336).cuboid(-2.0F, -2.0F, 11.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F))
				.uv(371, 378).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(32.2717F, -12.0167F, -87.0371F, 0.0F, 0.0F, 0.1309F));

		ModelPartData cube_r10 = main1.addChild("cube_r10", ModelPartBuilder.create().uv(596, 407).cuboid(-40.0F, -2.0F, -4.0F, 34.0F, 2.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(11.9892F, -18.5916F, -31.9079F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r11 = main1.addChild("cube_r11", ModelPartBuilder.create().uv(70, 37).cuboid(-40.0F, -2.0F, 15.0F, 34.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(11.9892F, -16.5916F, -23.9079F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r12 = main1.addChild("cube_r12", ModelPartBuilder.create().uv(55, 597).cuboid(-40.0F, -2.0F, -12.0F, 22.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(46.0108F, -16.4863F, -22.7037F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r13 = main1.addChild("cube_r13", ModelPartBuilder.create().uv(490, 597).cuboid(-40.0F, -2.0F, -12.0F, 22.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(-10.0108F, -16.5916F, -22.9079F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r14 = main1.addChild("cube_r14", ModelPartBuilder.create().uv(278, 342).cuboid(-1.0F, -13.0F, 7.0F, 2.0F, 19.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-53.562F, 3.9726F, -16.9918F, -0.0045F, -0.0223F, 0.1329F));

		ModelPartData cube_r15 = main1.addChild("cube_r15", ModelPartBuilder.create().uv(29, 0).cuboid(-1.0F, -4.0F, 7.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-53.0F, 2.0F, -17.0F, -0.1731F, -0.0227F, -0.1289F));

		ModelPartData cube_r16 = main1.addChild("cube_r16", ModelPartBuilder.create().uv(173, 330).cuboid(-1.0F, -2.0F, 6.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-53.7234F, -2.8562F, -17.0F, -0.1705F, -0.0376F, -0.215F));

		ModelPartData cube_r17 = main1.addChild("cube_r17", ModelPartBuilder.create().uv(129, 461).cuboid(-2.0F, -1.0F, -5.0F, 3.0F, 2.0F, 22.0F, new Dilation(0.0F))
				.uv(313, 309).cuboid(-2.0F, 1.0F, 10.0F, 3.0F, 22.0F, 7.0F, new Dilation(0.0F))
				.uv(343, 40).cuboid(-2.0F, -1.0F, -47.0F, 3.0F, 2.0F, 37.0F, new Dilation(0.0F))
				.uv(122, 56).cuboid(-2.0F, 1.0F, -21.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(347, 205).cuboid(-2.0F, 1.0F, -23.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
				.uv(132, 15).cuboid(-2.0F, 1.0F, -25.0F, 3.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(88, 0).cuboid(-2.0F, 1.0F, -26.0F, 3.0F, 10.0F, 1.0F, new Dilation(0.0F))
				.uv(116, 182).cuboid(-2.0F, 1.0F, -47.0F, 3.0F, 22.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(40.4458F, -12.4257F, -172.0224F, 0.0F, 0.0F, 0.1309F));

		ModelPartData cube_r18 = main1.addChild("cube_r18", ModelPartBuilder.create().uv(155, 121).cuboid(-2.0F, 3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(79, 213).cuboid(-2.0F, 3.0F, 0.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(25, 166).cuboid(-2.0F, 3.0F, 2.0F, 3.0F, 9.0F, 2.0F, new Dilation(0.0F))
				.uv(59, 166).cuboid(-2.0F, 1.0F, -4.0F, 3.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(40.4458F, -12.4257F, -166.0224F, 0.0F, 0.0F, 0.1309F));

		ModelPartData cube_r19 = main1.addChild("cube_r19", ModelPartBuilder.create().uv(304, 253).cuboid(-2.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(34.786F, -26.53F, -183.0301F, 0.0226F, 0.0843F, -1.308F));

		ModelPartData cube_r20 = main1.addChild("cube_r20", ModelPartBuilder.create().uv(323, 342).cuboid(-2.0F, 1.0F, -38.0F, 3.0F, 16.0F, 2.0F, new Dilation(0.0F))
				.uv(326, 309).cuboid(-2.0F, -1.0F, -38.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(40.4458F, -15.569F, -183.0301F, 0.0865F, -0.0114F, 0.1304F));

		ModelPartData cube_r21 = main1.addChild("cube_r21", ModelPartBuilder.create().uv(69, 213).cuboid(-2.0F, -2.0F, -38.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(40.4815F, -18.3844F, -183.0301F, 0.0872F, 0.0038F, -0.0435F));

		ModelPartData cube_r22 = main1.addChild("cube_r22", ModelPartBuilder.create().uv(294, 253).cuboid(-2.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(40.1116F, -21.0237F, -183.0301F, 0.082F, 0.0298F, -0.3478F));

		ModelPartData cube_r23 = main1.addChild("cube_r23", ModelPartBuilder.create().uv(290, 270).cuboid(-2.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(38.9651F, -23.4297F, -183.0301F, 0.0693F, 0.0531F, -0.6527F));

		ModelPartData cube_r24 = main1.addChild("cube_r24", ModelPartBuilder.create().uv(274, 270).cuboid(-2.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(37.1603F, -25.3191F, -183.0301F, 0.047F, 0.0736F, -1.0018F));

		ModelPartData cube_r25 = main1.addChild("cube_r25", ModelPartBuilder.create().uv(447, 401).cuboid(-2.0F, -56.0F, -38.0F, 3.0F, 57.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(32.113F, -27.0136F, -183.0301F, 0.0F, 0.0873F, -1.5708F));

		ModelPartData cube_r26 = main1.addChild("cube_r26", ModelPartBuilder.create().uv(346, 288).cuboid(-1.0F, -31.0F, -38.0F, 3.0F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-54.113F, -27.0136F, -183.0301F, 0.0F, -0.0873F, 1.5708F));

		ModelPartData cube_r27 = main1.addChild("cube_r27", ModelPartBuilder.create().uv(190, 322).cuboid(-1.0F, -1.0F, -38.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(292, 342).cuboid(-1.0F, 1.0F, -38.0F, 3.0F, 16.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-62.4458F, -15.569F, -183.0301F, 0.0865F, 0.0114F, -0.1304F));

		ModelPartData cube_r28 = main1.addChild("cube_r28", ModelPartBuilder.create().uv(59, 213).cuboid(-1.0F, -2.0F, -38.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-62.4815F, -18.3844F, -183.0301F, 0.0872F, -0.0038F, 0.0435F));

		ModelPartData cube_r29 = main1.addChild("cube_r29", ModelPartBuilder.create().uv(258, 270).cuboid(-1.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-62.1116F, -21.0237F, -183.0301F, 0.082F, -0.0298F, 0.3478F));

		ModelPartData cube_r30 = main1.addChild("cube_r30", ModelPartBuilder.create().uv(242, 270).cuboid(-1.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-56.786F, -26.53F, -183.0301F, 0.0226F, -0.0843F, 1.308F));

		ModelPartData cube_r31 = main1.addChild("cube_r31", ModelPartBuilder.create().uv(226, 182).cuboid(-1.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-59.1603F, -25.3191F, -183.0301F, 0.047F, -0.0736F, 1.0018F));

		ModelPartData cube_r32 = main1.addChild("cube_r32", ModelPartBuilder.create().uv(218, 198).cuboid(-1.0F, -2.0F, -38.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-60.9651F, -23.4297F, -183.0301F, 0.0693F, -0.0531F, 0.6527F));

		ModelPartData cube_r33 = main1.addChild("cube_r33", ModelPartBuilder.create().uv(208, 309).cuboid(-2.0F, -2.0F, -47.0F, 3.0F, 4.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(40.4815F, -15.2411F, -172.0224F, 0.0F, 0.0F, -0.0436F));

		ModelPartData cube_r34 = main1.addChild("cube_r34", ModelPartBuilder.create().uv(59, 176).cuboid(-1.0F, 1.0F, -4.0F, 3.0F, 2.0F, 8.0F, new Dilation(0.0F))
				.uv(56, 45).cuboid(-1.0F, 3.0F, 1.0F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 166).cuboid(-1.0F, 3.0F, 2.0F, 3.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-62.4458F, -12.4257F, -166.0224F, 0.0F, 0.0F, -0.1309F));

		ModelPartData cube_r35 = main1.addChild("cube_r35", ModelPartBuilder.create().uv(132, 53).cuboid(-1.0F, 5.0F, 1.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(27, 213).cuboid(-1.0F, 3.0F, -1.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-62.4458F, -12.4257F, -167.0224F, 0.0F, 0.0F, -0.1309F));

		ModelPartData cube_r36 = main1.addChild("cube_r36", ModelPartBuilder.create().uv(343, 90).cuboid(-1.0F, 1.0F, 10.0F, 3.0F, 22.0F, 7.0F, new Dilation(0.0F))
				.uv(35, 12).cuboid(-1.0F, 2.0F, -21.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(16, 213).cuboid(-1.0F, 1.0F, -21.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F))
				.uv(347, 212).cuboid(-1.0F, 1.0F, -23.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
				.uv(237, 309).cuboid(-1.0F, 1.0F, -25.0F, 3.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(88, 11).cuboid(-1.0F, 1.0F, -26.0F, 3.0F, 10.0F, 1.0F, new Dilation(0.0F))
				.uv(175, 182).cuboid(-1.0F, 1.0F, -47.0F, 3.0F, 22.0F, 21.0F, new Dilation(0.0F))
				.uv(470, 346).cuboid(-1.0F, -1.0F, -6.0F, 3.0F, 2.0F, 23.0F, new Dilation(0.0F))
				.uv(90, 59).cuboid(-1.0F, -1.0F, -12.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 449).cuboid(-1.0F, -1.0F, -47.0F, 3.0F, 2.0F, 35.0F, new Dilation(0.0F)), ModelTransform.of(-62.4458F, -12.4257F, -172.0224F, 0.0F, 0.0F, -0.1309F));

		ModelPartData cube_r37 = main1.addChild("cube_r37", ModelPartBuilder.create().uv(343, 90).cuboid(-1.0F, -2.0F, -47.0F, 3.0F, 4.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(-62.4815F, -15.2411F, -172.0224F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r38 = main1.addChild("cube_r38", ModelPartBuilder.create().uv(516, 530).cuboid(-1.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(-62.1116F, -17.8805F, -172.0224F, 0.0F, 0.0F, 0.3491F));

		ModelPartData cube_r39 = main1.addChild("cube_r39", ModelPartBuilder.create().uv(134, 530).cuboid(-1.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(-60.9651F, -20.2865F, -172.0224F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r40 = main1.addChild("cube_r40", ModelPartBuilder.create().uv(0, 530).cuboid(-1.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(-59.1603F, -22.1759F, -172.0224F, 0.0F, 0.0F, 1.0036F));

		ModelPartData cube_r41 = main1.addChild("cube_r41", ModelPartBuilder.create().uv(528, 249).cuboid(-1.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(-56.786F, -23.3867F, -172.0224F, 0.0F, 0.0F, 1.309F));

		ModelPartData cube_r42 = main1.addChild("cube_r42", ModelPartBuilder.create().uv(116, 182).cuboid(-1.0F, -31.0F, -36.0F, 3.0F, 32.0F, 53.0F, new Dilation(0.0F))
				.uv(462, 346).cuboid(-1.0F, -31.0F, -47.0F, 3.0F, 32.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(-54.113F, -23.8703F, -172.0224F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r43 = main1.addChild("cube_r43", ModelPartBuilder.create().uv(0, 166).cuboid(-2.0F, -56.0F, -36.0F, 3.0F, 57.0F, 53.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-2.0F, -56.0F, -47.0F, 3.0F, 57.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(32.113F, -23.8703F, -172.0224F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r44 = main1.addChild("cube_r44", ModelPartBuilder.create().uv(528, 93).cuboid(-2.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(34.786F, -23.3867F, -172.0224F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r45 = main1.addChild("cube_r45", ModelPartBuilder.create().uv(446, 526).cuboid(-2.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(37.1603F, -22.1759F, -172.0224F, 0.0F, 0.0F, -1.0036F));

		ModelPartData cube_r46 = main1.addChild("cube_r46", ModelPartBuilder.create().uv(312, 526).cuboid(-2.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(38.9651F, -20.2865F, -172.0224F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r47 = main1.addChild("cube_r47", ModelPartBuilder.create().uv(525, 0).cuboid(-2.0F, -2.0F, -47.0F, 3.0F, 3.0F, 64.0F, new Dilation(0.0F)), ModelTransform.of(40.1116F, -17.8805F, -172.0224F, 0.0F, 0.0F, -0.3491F));

		ModelPartData cube_r48 = main1.addChild("cube_r48", ModelPartBuilder.create().uv(232, 182).cuboid(-6.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(31.786F, -23.3867F, -172.0224F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r49 = main1.addChild("cube_r49", ModelPartBuilder.create().uv(0, 350).cuboid(-6.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(34.1603F, -22.1759F, -172.0224F, 0.0F, 0.0F, -1.0036F));

		ModelPartData cube_r50 = main1.addChild("cube_r50", ModelPartBuilder.create().uv(91, 410).cuboid(-6.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(35.9651F, -20.2865F, -172.0224F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r51 = main1.addChild("cube_r51", ModelPartBuilder.create().uv(382, 526).cuboid(-6.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(37.4815F, -15.2411F, -172.0224F, 0.0F, 0.0F, -0.0436F));

		ModelPartData cube_r52 = main1.addChild("cube_r52", ModelPartBuilder.create().uv(278, 309).cuboid(-6.0F, -1.0F, 10.0F, 7.0F, 25.0F, 4.0F, new Dilation(0.0F))
				.uv(595, 0).cuboid(-6.0F, -2.0F, -34.0F, 7.0F, 1.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(37.2717F, -12.4333F, -172.0224F, 0.0F, 0.0F, 0.1309F));

		ModelPartData cube_r53 = main1.addChild("cube_r53", ModelPartBuilder.create().uv(433, 593).cuboid(-2.0F, -3.0F, -34.0F, 4.0F, 4.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(28.2871F, -24.7194F, -170.4513F, 0.0F, 0.0F, -1.7017F));

		ModelPartData cube_r54 = main1.addChild("cube_r54", ModelPartBuilder.create().uv(0, 597).cuboid(-1.0F, -3.0F, -34.0F, 3.0F, 4.0F, 49.0F, new Dilation(0.0F)), ModelTransform.of(-50.2871F, -25.7194F, -170.4513F, 0.0F, 0.0F, 1.7017F));

		ModelPartData cube_r55 = main1.addChild("cube_r55", ModelPartBuilder.create().uv(278, 309).cuboid(-2.0F, -3.0F, -34.0F, 3.0F, 4.0F, 29.0F, new Dilation(0.0F)), ModelTransform.of(27.3283F, -28.2979F, -170.4513F, 0.0F, 0.0F, -1.9635F));

		ModelPartData cube_r56 = main1.addChild("cube_r56", ModelPartBuilder.create().uv(343, 90).cuboid(-1.0F, -3.0F, -34.0F, 3.0F, 4.0F, 29.0F, new Dilation(0.0F)), ModelTransform.of(-49.4588F, -28.3065F, -170.4513F, 0.0F, 0.0F, 1.9635F));

		ModelPartData cube_r57 = main1.addChild("cube_r57", ModelPartBuilder.create().uv(0, 299).cuboid(-1.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(-53.786F, -23.3867F, -172.0224F, 0.0F, 0.0F, 1.309F));

		ModelPartData cube_r58 = main1.addChild("cube_r58", ModelPartBuilder.create().uv(282, 593).cuboid(-1.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(-56.1603F, -22.1759F, -172.0224F, 0.0F, 0.0F, 1.0036F));

		ModelPartData cube_r59 = main1.addChild("cube_r59", ModelPartBuilder.create().uv(586, 530).cuboid(-1.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(-57.9651F, -20.2865F, -172.0224F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r60 = main1.addChild("cube_r60", ModelPartBuilder.create().uv(220, 555).cuboid(-1.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(-59.1116F, -17.8805F, -172.0224F, 0.0F, 0.0F, 0.3491F));

		ModelPartData cube_r61 = main1.addChild("cube_r61", ModelPartBuilder.create().uv(70, 530).cuboid(-1.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(-59.4815F, -15.2411F, -172.0224F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r62 = main1.addChild("cube_r62", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, 1.0F, 10.0F, 7.0F, 22.0F, 4.0F, new Dilation(0.0F))
				.uv(403, 378).cuboid(-1.0F, -2.0F, -5.0F, 7.0F, 3.0F, 19.0F, new Dilation(0.0F))
				.uv(294, 233).cuboid(-1.0F, -2.0F, -34.0F, 7.0F, 3.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-59.2717F, -12.4333F, -172.0224F, 0.0F, 0.0F, -0.1309F));

		ModelPartData cube_r63 = main1.addChild("cube_r63", ModelPartBuilder.create().uv(413, 93).cuboid(-6.0F, -2.0F, -34.0F, 7.0F, 3.0F, 48.0F, new Dilation(0.0F)), ModelTransform.of(37.1116F, -17.8805F, -172.0224F, 0.0F, 0.0F, -0.3491F));

		ModelPartData cube_r64 = main1.addChild("cube_r64", ModelPartBuilder.create().uv(437, 256).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(-51.1603F, -21.7593F, -87.0371F, 0.0F, 0.0F, 1.0036F));

		ModelPartData cube_r65 = main1.addChild("cube_r65", ModelPartBuilder.create().uv(434, 3).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(-52.9651F, -19.8699F, -87.0371F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r66 = main1.addChild("cube_r66", ModelPartBuilder.create().uv(0, 410).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(-54.1116F, -17.4639F, -87.0371F, 0.0F, 0.0F, 0.3491F));

		ModelPartData cube_r67 = main1.addChild("cube_r67", ModelPartBuilder.create().uv(226, 401).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(-54.4815F, -14.8245F, -87.0371F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r68 = main1.addChild("cube_r68", ModelPartBuilder.create().uv(135, 398).cuboid(-1.0F, -2.0F, -70.0F, 2.0F, 3.0F, 87.0F, new Dilation(0.0F)), ModelTransform.of(-54.2717F, -12.0167F, -87.0371F, 0.0F, 0.0F, -0.1309F));

		ModelPartData cube_r69 = main1.addChild("cube_r69", ModelPartBuilder.create().uv(343, 0).cuboid(-2.0F, -2.0F, -19.0F, 3.0F, 3.0F, 37.0F, new Dilation(0.0F)), ModelTransform.of(32.4815F, -13.2812F, -52.4808F, -0.0872F, -0.0038F, -0.0435F));

		ModelPartData cube_r70 = main1.addChild("cube_r70", ModelPartBuilder.create().uv(112, 309).cuboid(-2.0F, -2.0F, -19.0F, 3.0F, 3.0F, 37.0F, new Dilation(0.0F)), ModelTransform.of(32.1116F, -15.8805F, -52.0224F, -0.082F, -0.0298F, -0.3478F));

		ModelPartData cube_r71 = main1.addChild("cube_r71", ModelPartBuilder.create().uv(0, 410).cuboid(-2.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(30.9651F, -18.2499F, -51.6046F, -0.0693F, -0.0531F, -0.6527F));

		ModelPartData cube_r72 = main1.addChild("cube_r72", ModelPartBuilder.create().uv(346, 288).cuboid(-2.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(29.1603F, -20.1106F, -51.2766F, -0.047F, -0.0736F, -1.0018F));

		ModelPartData cube_r73 = main1.addChild("cube_r73", ModelPartBuilder.create().uv(155, 125).cuboid(-2.0F, -2.0F, 13.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(91, 461).cuboid(-2.0F, -2.0F, -19.0F, 3.0F, 3.0F, 32.0F, new Dilation(0.0F)), ModelTransform.of(32.2717F, -10.5161F, -52.9683F, -0.0865F, 0.0114F, 0.1304F));

		ModelPartData cube_r74 = main1.addChild("cube_r74", ModelPartBuilder.create().uv(58, 0).cuboid(-1.0F, 0.0F, 15.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-54.2717F, -10.5161F, -57.9683F, -0.0865F, -0.0114F, -0.1304F));

		ModelPartData cube_r75 = main1.addChild("cube_r75", ModelPartBuilder.create().uv(0, 312).cuboid(-1.0F, -2.0F, 13.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(197, 606).cuboid(-1.0F, -2.0F, -19.0F, 3.0F, 3.0F, 32.0F, new Dilation(0.0F)), ModelTransform.of(-54.2717F, -10.5161F, -52.9683F, -0.0865F, -0.0114F, -0.1304F));

		ModelPartData cube_r76 = main1.addChild("cube_r76", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -2.0F, 13.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(226, 401).cuboid(-1.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(-54.4815F, -13.2812F, -52.4808F, -0.0872F, 0.0038F, 0.0435F));

		ModelPartData cube_r77 = main1.addChild("cube_r77", ModelPartBuilder.create().uv(226, 440).cuboid(-1.0F, -2.0F, -19.0F, 2.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(-54.1116F, -15.8805F, -52.0224F, -0.082F, 0.0298F, 0.3478F));

		ModelPartData cube_r78 = main1.addChild("cube_r78", ModelPartBuilder.create().uv(347, 205).cuboid(-1.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(-52.9651F, -18.2499F, -51.6046F, -0.0693F, 0.0531F, 0.6527F));

		ModelPartData cube_r79 = main1.addChild("cube_r79", ModelPartBuilder.create().uv(347, 166).cuboid(-1.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(-51.1603F, -20.1106F, -51.2766F, -0.047F, 0.0736F, 1.0018F));

		ModelPartData cube_r80 = main1.addChild("cube_r80", ModelPartBuilder.create().uv(25, 166).cuboid(-1.0F, -2.0F, 5.0F, 3.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(-54.2717F, -5.7569F, -17.4876F, -0.1731F, -0.0227F, -0.1289F));

		ModelPartData cube_r81 = main1.addChild("cube_r81", ModelPartBuilder.create().uv(89, 213).cuboid(-1.0F, -2.0F, 3.0F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(104, 49).cuboid(-1.0F, -2.0F, 5.0F, 3.0F, 3.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-54.4815F, -8.5221F, -17.0F, -0.1744F, 0.0076F, 0.043F));

		ModelPartData cube_r82 = main1.addChild("cube_r82", ModelPartBuilder.create().uv(85, 22).cuboid(-1.0F, 1.0F, -17.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(59, 166).cuboid(-1.0F, 1.0F, -19.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(301, 253).cuboid(-1.0F, -2.0F, -19.0F, 2.0F, 3.0F, 19.0F, new Dilation(0.0F))
				.uv(71, 186).cuboid(-1.0F, 2.0F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(347, 194).cuboid(-1.0F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
				.uv(29, 0).cuboid(-1.0F, -2.0F, 3.0F, 3.0F, 3.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-54.1116F, -11.1214F, -16.5417F, -0.1642F, 0.0594F, 0.3442F));

		ModelPartData cube_r83 = main1.addChild("cube_r83", ModelPartBuilder.create().uv(434, 39).cuboid(-1.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(-51.1603F, -15.3515F, -15.7958F, -0.0945F, 0.147F, 0.9966F));

		ModelPartData cube_r84 = main1.addChild("cube_r84", ModelPartBuilder.create().uv(346, 327).cuboid(-2.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(29.1603F, -15.3515F, -15.7958F, -0.0945F, -0.147F, -0.9966F));

		ModelPartData cube_r85 = main1.addChild("cube_r85", ModelPartBuilder.create().uv(434, 0).cuboid(-2.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(30.9651F, -13.4908F, -16.1239F, -0.139F, -0.1059F, -0.6471F));

		ModelPartData cube_r86 = main1.addChild("cube_r86", ModelPartBuilder.create().uv(437, 273).cuboid(-1.0F, -2.0F, -19.0F, 3.0F, 3.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(-52.9651F, -13.4908F, -16.1239F, -0.139F, 0.1059F, 0.6471F));

		ModelPartData cube_r87 = main1.addChild("cube_r87", ModelPartBuilder.create().uv(35, 331).cuboid(0.0F, 0.0F, -18.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
				.uv(29, 2).cuboid(1.0F, -2.0F, -18.0F, 0.0F, 2.0F, 15.0F, new Dilation(0.0F))
				.uv(29, 3).cuboid(1.0F, -2.0F, -3.0F, 0.0F, 2.0F, 7.0F, new Dilation(0.0F))
				.uv(249, 327).cuboid(0.0F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
				.uv(237, 309).cuboid(-2.0F, -2.0F, 4.0F, 3.0F, 3.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(32.1116F, -11.1214F, -16.5417F, -0.1642F, -0.0594F, -0.3442F));

		ModelPartData cube_r88 = main1.addChild("cube_r88", ModelPartBuilder.create().uv(29, 9).cuboid(1.0F, -1.0F, 1.0F, 0.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 22).cuboid(1.0F, -2.0F, 0.0F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(1.0F, -2.0F, 4.0F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(132, 0).cuboid(-2.0F, -2.0F, 5.0F, 3.0F, 3.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(32.4815F, -8.5221F, -17.0F, -0.1744F, -0.0076F, -0.043F));

		ModelPartData cube_r89 = main1.addChild("cube_r89", ModelPartBuilder.create().uv(155, 330).cuboid(-2.0F, -2.0F, 3.0F, 3.0F, 3.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(32.2717F, -5.5833F, -16.5028F, -0.1731F, 0.0227F, 0.1289F));

		ModelPartData cube_r90 = main1.addChild("cube_r90", ModelPartBuilder.create().uv(296, 309).cuboid(-2.0F, -2.0F, 5.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(343, 123).cuboid(-2.0F, -2.0F, 7.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(31.7234F, -2.7686F, -16.9991F, -0.1705F, 0.0376F, 0.215F));

		ModelPartData cube_r91 = main1.addChild("cube_r91", ModelPartBuilder.create().uv(208, 309).cuboid(-1.0F, -14.0F, 7.0F, 2.0F, 21.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(31.562F, 3.9726F, -16.9918F, -0.0045F, 0.0223F, -0.1329F));

		ModelPartData cube_r92 = main1.addChild("cube_r92", ModelPartBuilder.create().uv(49, 0).cuboid(-1.0F, -4.0F, 7.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(31.0F, 2.0F, -17.0F, -0.1731F, 0.0227F, 0.1289F));

		ModelPartData cube_r93 = main1.addChild("cube_r93", ModelPartBuilder.create().uv(524, 492).cuboid(-90.0F, -7.0F, -1.0F, 86.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(36.0F, 0.7194F, -0.0145F, 2.2689F, 0.0F, 0.0F));

		ModelPartData cube_r94 = main1.addChild("cube_r94", ModelPartBuilder.create().uv(528, 160).cuboid(-91.0F, -7.0F, -2.0F, 88.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(36.0F, 10.8192F, 0.4264F, 0.9599F, 0.0F, 0.0F));

		ModelPartData lights = main1.addChild("lights", ModelPartBuilder.create().uv(156, 45).cuboid(53.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(59, 186).cuboid(48.0F, -23.0F, 86.0F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(100, 58).cuboid(38.0F, -23.0F, 86.0F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(156, 15).cuboid(46.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(156, 0).cuboid(43.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(147, 49).cuboid(36.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 121).cuboid(-12.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(122, 49).cuboid(-9.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(32, 60).cuboid(-7.0F, -23.0F, 86.0F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(138, 0).cuboid(-2.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 60).cuboid(-17.0F, -23.0F, 86.0F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(144, 15).cuboid(-19.0F, -25.0F, 86.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 84).cuboid(-15.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(143, 198).cuboid(-10.0F, -25.0F, -133.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 91).cuboid(-11.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 98).cuboid(-5.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 105).cuboid(-21.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(202, 198).cuboid(-20.0F, -25.0F, -133.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 56).cuboid(48.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 60).cuboid(49.0F, -25.0F, -133.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 63).cuboid(54.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 70).cuboid(38.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 77).cuboid(44.0F, -28.0F, -133.0F, 3.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(16, 60).cuboid(39.0F, -25.0F, -133.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 213).cuboid(-30.0F, -44.0F, 10.0F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(347, 166).cuboid(-29.0F, -44.0F, 11.0F, 6.0F, 5.0F, 2.0F, new Dilation(0.0F))
				.uv(99, 213).cuboid(-27.0F, -43.0F, 13.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(159, 198).cuboid(59.0F, -43.0F, 13.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(343, 139).cuboid(59.0F, -44.0F, 11.0F, 6.0F, 5.0F, 2.0F, new Dilation(0.0F))
				.uv(94, 182).cuboid(59.0F, -44.0F, 10.0F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(132, 49).cuboid(-23.0F, -40.0F, 10.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(18, 0).cuboid(57.0F, -40.0F, 10.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(320, 183).cuboid(-28.0F, -30.0F, -35.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F))
				.uv(209, 268).cuboid(62.0F, -30.0F, -35.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F))
				.uv(70, 49).cuboid(7.0F, -13.0F, -134.0F, 22.0F, 8.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 51).cuboid(7.0F, -13.0F, 89.0F, 22.0F, 8.0F, 1.0F, new Dilation(0.0F))
				.uv(294, 233).cuboid(53.0F, -7.0F, 84.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
				.uv(30, 339).cuboid(53.0F, -13.4641F, 84.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
				.uv(147, 49).cuboid(-19.0F, -7.0F, 84.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
				.uv(248, 270).cuboid(-19.0F, -13.4641F, 84.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-29.0F, 15.0F, -89.0F));

		ModelPartData cube_r95 = lights.addChild("cube_r95", ModelPartBuilder.create().uv(294, 182).cuboid(-3.0F, 2.7321F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-18.0F, -7.7321F, 92.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r96 = lights.addChild("cube_r96", ModelPartBuilder.create().uv(280, 270).cuboid(0.7321F, -4.7321F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-18.0F, -7.7321F, 92.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r97 = lights.addChild("cube_r97", ModelPartBuilder.create().uv(264, 270).cuboid(0.0F, -5.4641F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-18.0F, -7.7321F, 92.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r98 = lights.addChild("cube_r98", ModelPartBuilder.create().uv(232, 270).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-17.0F, -13.4641F, 85.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r99 = lights.addChild("cube_r99", ModelPartBuilder.create().uv(347, 187).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-15.2679F, -12.4641F, 85.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r100 = lights.addChild("cube_r100", ModelPartBuilder.create().uv(347, 180).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-14.2679F, -8.7321F, 85.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r101 = lights.addChild("cube_r101", ModelPartBuilder.create().uv(347, 173).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-15.2679F, -7.0F, 85.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r102 = lights.addChild("cube_r102", ModelPartBuilder.create().uv(232, 190).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-17.0F, -6.0F, 85.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r103 = lights.addChild("cube_r103", ModelPartBuilder.create().uv(84, 182).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-19.0F, -6.0F, 85.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r104 = lights.addChild("cube_r104", ModelPartBuilder.create().uv(122, 49).cuboid(-2.7321F, 1.7321F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-18.0F, -7.7321F, 92.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r105 = lights.addChild("cube_r105", ModelPartBuilder.create().uv(343, 132).cuboid(-3.0F, 2.7321F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(54.0F, -7.7321F, 92.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r106 = lights.addChild("cube_r106", ModelPartBuilder.create().uv(343, 79).cuboid(0.7321F, -4.7321F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(54.0F, -7.7321F, 92.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r107 = lights.addChild("cube_r107", ModelPartBuilder.create().uv(92, 339).cuboid(0.0F, -5.4641F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(54.0F, -7.7321F, 92.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r108 = lights.addChild("cube_r108", ModelPartBuilder.create().uv(325, 242).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(55.0F, -13.4641F, 85.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r109 = lights.addChild("cube_r109", ModelPartBuilder.create().uv(324, 264).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(56.7321F, -12.4641F, 85.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r110 = lights.addChild("cube_r110", ModelPartBuilder.create().uv(155, 316).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(57.7321F, -8.7321F, 85.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r111 = lights.addChild("cube_r111", ModelPartBuilder.create().uv(256, 309).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(56.7321F, -7.0F, 85.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r112 = lights.addChild("cube_r112", ModelPartBuilder.create().uv(155, 309).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(55.0F, -6.0F, 85.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r113 = lights.addChild("cube_r113", ModelPartBuilder.create().uv(294, 240).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(53.0F, -6.0F, 85.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r114 = lights.addChild("cube_r114", ModelPartBuilder.create().uv(294, 189).cuboid(-2.7321F, 1.7321F, -8.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(54.0F, -7.7321F, 92.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData group1 = main1.addChild("group1", ModelPartBuilder.create().uv(232, 233).cuboid(41.0F, -19.0F, 98.0F, 18.0F, 11.0F, 26.0F, new Dilation(0.0F))
				.uv(70, 0).cuboid(2.0F, -19.0F, 98.0F, 18.0F, 11.0F, 26.0F, new Dilation(0.0F))
				.uv(140, 225).cuboid(-15.1326F, -8.0017F, 199.3535F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(116, 225).cuboid(64.8674F, -8.0017F, 199.3535F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(116, 166).cuboid(-23.1326F, -8.0017F, 47.3535F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(259, 325).cuboid(72.0F, -23.0F, 164.0F, 2.0F, 4.0F, 4.0F, new Dilation(0.0F))
				.uv(70, 37).cuboid(72.0F, -20.0F, 164.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(333, 342).cuboid(-14.0F, -23.0F, 164.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.0F))
				.uv(317, 401).cuboid(14.0F, -26.0F, 11.0F, 29.0F, 26.0F, 36.0F, new Dilation(0.0F))
				.uv(438, 182).cuboid(-20.0F, -35.0F, -9.0F, 100.0F, 26.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 504).cuboid(-18.0F, -12.0F, -12.0F, 96.0F, 10.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 518).cuboid(-18.0F, -28.0F, -11.0F, 96.0F, 10.0F, 2.0F, new Dilation(0.0F))
				.uv(156, 19).cuboid(29.0F, -22.0F, 207.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(147, 53).cuboid(29.0F, -24.0F, 207.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(154, 24).cuboid(29.0F, -23.0F, 207.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(122, 53).cuboid(29.0F, -30.0F, -10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 125).cuboid(29.0F, -31.0F, -10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(144, 19).cuboid(29.0F, -32.0F, -10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(153, 410).cuboid(26.0F, -21.0F, 97.0F, 9.0F, 13.0F, 25.0F, new Dilation(0.0F))
				.uv(437, 312).cuboid(26.0F, -24.0F, 99.0F, 9.0F, 3.0F, 25.0F, new Dilation(0.0F))
				.uv(112, 309).cuboid(24.0F, -36.0F, 127.0F, 12.0F, 28.0F, 6.0F, new Dilation(0.0F))
				.uv(320, 192).cuboid(9.0F, -29.0F, 128.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(48, 51).cuboid(9.0F, -33.0F, 128.0F, 3.0F, 4.0F, 5.0F, new Dilation(0.0F))
				.uv(21, 25).cuboid(29.0F, -56.0F, 115.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(70, 58).cuboid(25.0F, -55.0F, 115.0F, 10.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(62, 370).cuboid(58.0F, -3.0F, -16.0F, 3.0F, 3.0F, 17.0F, new Dilation(0.0F))
				.uv(0, 370).cuboid(-1.0F, -3.0F, -16.0F, 3.0F, 3.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(-41.0F, 13.0F, -210.0F));

		ModelPartData cube_r115 = group1.addChild("cube_r115", ModelPartBuilder.create().uv(8, 314).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0926F, -27.6014F, 129.0F, 0.0F, 0.0F, 0.3054F));

		ModelPartData cube_r116 = group1.addChild("cube_r116", ModelPartBuilder.create().uv(246, 233).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.4068F, -28.9021F, 129.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r117 = group1.addChild("cube_r117", ModelPartBuilder.create().uv(62, 312).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5408F, -31.1342F, 129.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r118 = group1.addChild("cube_r118", ModelPartBuilder.create().uv(49, 10).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.9535F, -33.9983F, 129.0F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r119 = group1.addChild("cube_r119", ModelPartBuilder.create().uv(39, 213).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(19.0465F, -33.9983F, 129.0F, 0.0F, 0.0F, -1.5272F));

		ModelPartData cube_r120 = group1.addChild("cube_r120", ModelPartBuilder.create().uv(70, 314).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.4592F, -31.1342F, 129.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r121 = group1.addChild("cube_r121", ModelPartBuilder.create().uv(256, 316).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(16.5932F, -28.9021F, 129.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r122 = group1.addChild("cube_r122", ModelPartBuilder.create().uv(182, 320).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(13.9074F, -27.6014F, 129.0F, 0.0F, 0.0F, -0.3054F));

		ModelPartData cube_r123 = group1.addChild("cube_r123", ModelPartBuilder.create().uv(528, 316).cuboid(-21.0F, -8.0F, -6.0F, 80.0F, 16.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -27.0F, 137.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r124 = group1.addChild("cube_r124", ModelPartBuilder.create().uv(359, 492).cuboid(-19.0F, -19.0F, -36.0F, 74.0F, 17.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -43.3307F, 82.3157F, 1.6144F, 0.0F, 0.0F));

		ModelPartData cube_r125 = group1.addChild("cube_r125", ModelPartBuilder.create().uv(0, 121).cuboid(-19.0F, -19.0F, -26.0F, 74.0F, 19.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -26.0F, 83.0F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r126 = group1.addChild("cube_r126", ModelPartBuilder.create().uv(222, 309).cuboid(-1.0F, -21.0F, -3.0F, 2.0F, 21.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 57.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r127 = group1.addChild("cube_r127", ModelPartBuilder.create().uv(116, 182).cuboid(-1.0F, -17.0F, -3.0F, 1.0F, 17.0F, 4.0F, new Dilation(0.0F))
				.uv(56, 17).cuboid(-1.0F, -11.0F, 1.0F, 1.0F, 11.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 128.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r128 = group1.addChild("cube_r128", ModelPartBuilder.create().uv(332, 166).cuboid(-1.0F, -20.0F, -3.0F, 1.0F, 20.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 124.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r129 = group1.addChild("cube_r129", ModelPartBuilder.create().uv(343, 0).cuboid(-1.0F, -23.0F, -3.0F, 1.0F, 23.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 115.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r130 = group1.addChild("cube_r130", ModelPartBuilder.create().uv(0, 299).cuboid(-1.0F, -18.0F, 5.0F, 1.0F, 18.0F, 19.0F, new Dilation(0.0F))
				.uv(132, 0).cuboid(-1.0F, -15.0F, 1.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 30.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r131 = group1.addChild("cube_r131", ModelPartBuilder.create().uv(150, 0).cuboid(0.0F, -15.0F, 1.0F, 1.0F, 7.0F, 4.0F, new Dilation(0.0F))
				.uv(62, 299).cuboid(0.0F, -18.0F, 5.0F, 1.0F, 18.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 30.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r132 = group1.addChild("cube_r132", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -24.0F, -3.0F, 1.0F, 24.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 61.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r133 = group1.addChild("cube_r133", ModelPartBuilder.create().uv(208, 309).cuboid(-1.0F, -24.0F, -3.0F, 1.0F, 24.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 61.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r134 = group1.addChild("cube_r134", ModelPartBuilder.create().uv(0, 166).cuboid(-1.0F, -24.0F, -3.0F, 1.0F, 24.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 92.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r135 = group1.addChild("cube_r135", ModelPartBuilder.create().uv(56, 31).cuboid(0.0F, -11.0F, 1.0F, 1.0F, 11.0F, 3.0F, new Dilation(0.0F))
				.uv(126, 182).cuboid(0.0F, -17.0F, -3.0F, 1.0F, 17.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 128.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r136 = group1.addChild("cube_r136", ModelPartBuilder.create().uv(333, 309).cuboid(0.0F, -20.0F, -3.0F, 1.0F, 20.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 124.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r137 = group1.addChild("cube_r137", ModelPartBuilder.create().uv(343, 40).cuboid(0.0F, -23.0F, -3.0F, 1.0F, 23.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 115.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r138 = group1.addChild("cube_r138", ModelPartBuilder.create().uv(59, 166).cuboid(0.0F, -24.0F, -3.0F, 1.0F, 24.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 92.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r139 = group1.addChild("cube_r139", ModelPartBuilder.create().uv(188, 345).cuboid(-1.0F, -24.0F, -3.0F, 2.0F, 24.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -34.0F, 88.0F, 0.0873F, 0.0F, 0.0436F));

		ModelPartData cube_r140 = group1.addChild("cube_r140", ModelPartBuilder.create().uv(346, 327).cuboid(-1.0F, -24.0F, -3.0F, 2.0F, 24.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 88.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r141 = group1.addChild("cube_r141", ModelPartBuilder.create().uv(311, 342).cuboid(-1.0F, -21.0F, -3.0F, 2.0F, 21.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(69.0F, -34.0F, 57.0F, 0.0873F, 0.0F, -0.0436F));

		ModelPartData cube_r142 = group1.addChild("cube_r142", ModelPartBuilder.create().uv(186, 330).cuboid(-1.0F, -2.0F, -39.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-21.4815F, -34.3407F, 24.6959F, 0.1744F, -0.0076F, 0.043F));

		ModelPartData cube_r143 = group1.addChild("cube_r143", ModelPartBuilder.create().uv(263, 288).cuboid(-1.0F, -2.0F, -40.0F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-21.1116F, -36.9801F, 24.6959F, 0.1642F, -0.0594F, 0.3442F));

		ModelPartData cube_r144 = group1.addChild("cube_r144", ModelPartBuilder.create().uv(10, 166).cuboid(-1.0F, 1.0F, -38.0F, 3.0F, 20.0F, 2.0F, new Dilation(0.0F))
				.uv(269, 195).cuboid(-1.0F, -1.0F, -38.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-21.4458F, -31.5253F, 24.6959F, 0.1731F, 0.0227F, -0.1289F));

		ModelPartData cube_r145 = group1.addChild("cube_r145", ModelPartBuilder.create().uv(237, 325).cuboid(-1.0F, -2.0F, -43.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-15.786F, -42.4863F, 24.6959F, 0.0456F, -0.1685F, 1.3051F));

		ModelPartData cube_r146 = group1.addChild("cube_r146", ModelPartBuilder.create().uv(326, 290).cuboid(-1.0F, -2.0F, -42.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-18.1603F, -41.2754F, 24.6959F, 0.0945F, -0.147F, 0.9966F));

		ModelPartData cube_r147 = group1.addChild("cube_r147", ModelPartBuilder.create().uv(232, 182).cuboid(-1.0F, -2.0F, -41.0F, 3.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-19.9651F, -39.386F, 24.6959F, 0.139F, -0.1059F, 0.6471F));

		ModelPartData cube_r148 = group1.addChild("cube_r148", ModelPartBuilder.create().uv(91, 410).cuboid(-1.0F, -31.0F, -43.0F, 3.0F, 32.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-13.113F, -42.9699F, 24.6959F, 0.0F, -0.1745F, 1.5708F));

		ModelPartData cube_r149 = group1.addChild("cube_r149", ModelPartBuilder.create().uv(259, 195).cuboid(-2.0F, -1.0F, -38.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 166).cuboid(-2.0F, 1.0F, -38.0F, 3.0F, 20.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(81.4458F, -31.5253F, 24.6959F, 0.1731F, -0.0227F, 0.1289F));

		ModelPartData cube_r150 = group1.addChild("cube_r150", ModelPartBuilder.create().uv(155, 330).cuboid(-2.0F, -2.0F, -39.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(81.4815F, -34.3407F, 24.6959F, 0.1744F, 0.0076F, -0.043F));

		ModelPartData cube_r151 = group1.addChild("cube_r151", ModelPartBuilder.create().uv(147, 267).cuboid(-2.0F, -2.0F, -40.0F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(81.1116F, -36.9801F, 24.6959F, 0.1642F, 0.0594F, -0.3442F));

		ModelPartData cube_r152 = group1.addChild("cube_r152", ModelPartBuilder.create().uv(147, 37).cuboid(-2.0F, -2.0F, -41.0F, 3.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(79.9651F, -39.386F, 24.6959F, 0.139F, 0.1059F, -0.6471F));

		ModelPartData cube_r153 = group1.addChild("cube_r153", ModelPartBuilder.create().uv(325, 233).cuboid(-2.0F, -2.0F, -42.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(78.1603F, -41.2754F, 24.6959F, 0.0945F, 0.147F, -0.9966F));

		ModelPartData cube_r154 = group1.addChild("cube_r154", ModelPartBuilder.create().uv(311, 220).cuboid(-2.0F, -2.0F, -43.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(75.786F, -42.4863F, 24.6959F, 0.0456F, 0.1685F, -1.3051F));

		ModelPartData cube_r155 = group1.addChild("cube_r155", ModelPartBuilder.create().uv(134, 49).cuboid(-2.0F, -56.0F, -43.0F, 3.0F, 57.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(73.113F, -42.9699F, 24.6959F, 0.0F, 0.1745F, -1.5708F));

		ModelPartData cube_r156 = group1.addChild("cube_r156", ModelPartBuilder.create().uv(404, 484).cuboid(-5.0F, -5.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -3.0017F, 11.4041F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r157 = group1.addChild("cube_r157", ModelPartBuilder.create().uv(317, 476).cuboid(-5.0F, -5.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -8.7615F, 11.5968F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r158 = group1.addChild("cube_r158", ModelPartBuilder.create().uv(317, 468).cuboid(-5.0F, -5.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -14.3431F, 13.0316F, -0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r159 = group1.addChild("cube_r159", ModelPartBuilder.create().uv(462, 450).cuboid(-5.0F, -5.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -19.359F, 15.6513F, -0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r160 = group1.addChild("cube_r160", ModelPartBuilder.create().uv(462, 442).cuboid(-5.0F, -5.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -23.1233F, 19.5737F, -1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r161 = group1.addChild("cube_r161", ModelPartBuilder.create().uv(438, 241).cuboid(-5.0F, -5.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -24.9121F, 25.0521F, -1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r162 = group1.addChild("cube_r162", ModelPartBuilder.create().uv(438, 233).cuboid(-5.0F, -6.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -24.7816F, 35.6969F, 1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r163 = group1.addChild("cube_r163", ModelPartBuilder.create().uv(438, 225).cuboid(-5.0F, -6.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -22.7813F, 41.1236F, 1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r164 = group1.addChild("cube_r164", ModelPartBuilder.create().uv(438, 217).cuboid(-5.0F, -6.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -18.6217F, 44.7819F, 0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r165 = group1.addChild("cube_r165", ModelPartBuilder.create().uv(438, 209).cuboid(-5.0F, -6.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -13.4368F, 47.1486F, 0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r166 = group1.addChild("cube_r166", ModelPartBuilder.create().uv(116, 174).cuboid(-5.0F, -6.0F, -1.0F, 106.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-18.1326F, -7.7852F, 48.3772F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r167 = group1.addChild("cube_r167", ModelPartBuilder.create().uv(202, 190).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -7.7852F, 200.3772F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r168 = group1.addChild("cube_r168", ModelPartBuilder.create().uv(202, 182).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -13.4368F, 199.1486F, 0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r169 = group1.addChild("cube_r169", ModelPartBuilder.create().uv(143, 190).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -18.6217F, 196.7819F, 0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r170 = group1.addChild("cube_r170", ModelPartBuilder.create().uv(143, 182).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -22.7813F, 193.1236F, 1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r171 = group1.addChild("cube_r171", ModelPartBuilder.create().uv(25, 180).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -24.7816F, 187.6969F, 1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r172 = group1.addChild("cube_r172", ModelPartBuilder.create().uv(84, 174).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -24.9121F, 177.0521F, -1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r173 = group1.addChild("cube_r173", ModelPartBuilder.create().uv(84, 166).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -23.1233F, 171.5737F, -1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r174 = group1.addChild("cube_r174", ModelPartBuilder.create().uv(138, 155).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -19.359F, 167.6513F, -0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r175 = group1.addChild("cube_r175", ModelPartBuilder.create().uv(138, 147).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -14.3431F, 165.0316F, -0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r176 = group1.addChild("cube_r176", ModelPartBuilder.create().uv(134, 113).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -8.7615F, 163.5968F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r177 = group1.addChild("cube_r177", ModelPartBuilder.create().uv(29, 19).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(69.8674F, -3.0017F, 163.4041F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r178 = group1.addChild("cube_r178", ModelPartBuilder.create().uv(308, 288).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -24.9121F, 177.0521F, -1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r179 = group1.addChild("cube_r179", ModelPartBuilder.create().uv(83, 307).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -23.1233F, 171.5737F, -1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r180 = group1.addChild("cube_r180", ModelPartBuilder.create().uv(21, 307).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -14.3431F, 165.0316F, -0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r181 = group1.addChild("cube_r181", ModelPartBuilder.create().uv(83, 299).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -19.359F, 167.6513F, -0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r182 = group1.addChild("cube_r182", ModelPartBuilder.create().uv(21, 299).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -8.7615F, 163.5968F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r183 = group1.addChild("cube_r183", ModelPartBuilder.create().uv(294, 219).cuboid(-5.0F, -5.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -3.0017F, 163.4041F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r184 = group1.addChild("cube_r184", ModelPartBuilder.create().uv(192, 267).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -24.7816F, 187.6969F, 1.4399F, 0.0F, 0.0F));

		ModelPartData cube_r185 = group1.addChild("cube_r185", ModelPartBuilder.create().uv(256, 220).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -22.7813F, 193.1236F, 1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r186 = group1.addChild("cube_r186", ModelPartBuilder.create().uv(232, 220).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -18.6217F, 196.7819F, 0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r187 = group1.addChild("cube_r187", ModelPartBuilder.create().uv(199, 225).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -13.4368F, 199.1486F, 0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r188 = group1.addChild("cube_r188", ModelPartBuilder.create().uv(175, 225).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.1326F, -7.7852F, 200.3772F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r189 = group1.addChild("cube_r189", ModelPartBuilder.create().uv(344, 593).cuboid(-64.0F, -21.0F, -1.0F, 68.0F, 21.0F, 1.0F, new Dilation(0.0F))
				.uv(70, 0).cuboid(4.0F, -21.0F, -3.0F, 5.0F, 21.0F, 4.0F, new Dilation(0.0F))
				.uv(232, 233).cuboid(-69.0F, -21.0F, -3.0F, 5.0F, 21.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(60.0F, -56.2647F, 49.2896F, 1.8326F, 0.0F, 0.0F));

		ModelPartData cube_r190 = group1.addChild("cube_r190", ModelPartBuilder.create().uv(549, 458).cuboid(-64.0F, -23.0F, -1.0F, 68.0F, 23.0F, 1.0F, new Dilation(0.0F))
				.uv(294, 182).cuboid(4.0F, -21.0F, -15.0F, 5.0F, 21.0F, 16.0F, new Dilation(0.0F))
				.uv(232, 182).cuboid(-69.0F, -21.0F, -16.0F, 5.0F, 21.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(60.0F, -50.8558F, 29.0883F, 1.9199F, 0.0F, 0.0F));

		ModelPartData cube_r191 = group1.addChild("cube_r191", ModelPartBuilder.create().uv(155, 309).cuboid(-1.0F, -16.0F, -16.0F, 5.0F, 4.0F, 17.0F, new Dilation(0.0F))
				.uv(525, 67).cuboid(4.0F, -16.0F, -15.0F, 73.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -48.4604F, 11.0791F, 2.4435F, 0.0F, 0.0F));

		ModelPartData cube_r192 = group1.addChild("cube_r192", ModelPartBuilder.create().uv(524, 509).cuboid(-1.0F, -16.0F, -16.0F, 73.0F, 4.0F, 17.0F, new Dilation(0.0F))
				.uv(0, 350).cuboid(72.0F, -16.0F, -15.0F, 5.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -49.9828F, 15.0716F, 2.3126F, 0.0F, 0.0F));

		ModelPartData cube_r193 = group1.addChild("cube_r193", ModelPartBuilder.create().uv(196, 509).cuboid(-1.0F, -16.0F, -16.0F, 73.0F, 4.0F, 17.0F, new Dilation(0.0F))
				.uv(62, 350).cuboid(72.0F, -16.0F, -15.0F, 5.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -49.747F, 19.9051F, 2.0944F, 0.0F, 0.0F));

		ModelPartData cube_r194 = group1.addChild("cube_r194", ModelPartBuilder.create().uv(204, 530).cuboid(-1.0F, -21.0F, -3.0F, 78.0F, 21.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -59.9113F, 69.9705F, 1.7453F, 0.0F, 0.0F));

		ModelPartData cube_r195 = group1.addChild("cube_r195", ModelPartBuilder.create().uv(532, 346).cuboid(-1.0F, -21.0F, -3.0F, 78.0F, 21.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -60.8131F, 90.8205F, 1.6144F, 0.0F, 0.0F));

		ModelPartData cube_r196 = group1.addChild("cube_r196", ModelPartBuilder.create().uv(532, 371).cuboid(-1.0F, -21.0F, -3.0F, 78.0F, 21.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -58.9857F, 111.6098F, 1.4835F, 0.0F, 0.0F));

		ModelPartData cube_r197 = group1.addChild("cube_r197", ModelPartBuilder.create().uv(532, 396).cuboid(-1.0F, -7.0F, -3.0F, 78.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -57.7815F, 118.417F, 1.3963F, 0.0F, 0.0F));

		ModelPartData cube_r198 = group1.addChild("cube_r198", ModelPartBuilder.create().uv(586, 581).cuboid(-64.0F, -9.0F, -1.0F, 68.0F, 9.0F, 1.0F, new Dilation(0.0F))
				.uv(259, 182).cuboid(4.0F, -9.0F, -3.0F, 5.0F, 9.0F, 4.0F, new Dilation(0.0F))
				.uv(62, 299).cuboid(-69.0F, -9.0F, -3.0F, 5.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(60.0F, -36.0F, 135.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r199 = group1.addChild("cube_r199", ModelPartBuilder.create().uv(0, 147).cuboid(-64.0F, -9.0F, -1.0F, 68.0F, 9.0F, 1.0F, new Dilation(0.0F))
				.uv(175, 182).cuboid(4.0F, -9.0F, -3.0F, 5.0F, 9.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 299).cuboid(-69.0F, -9.0F, -3.0F, 5.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(60.0F, -44.124F, 131.6606F, 0.6109F, 0.0F, 0.0F));

		ModelPartData cube_r200 = group1.addChild("cube_r200", ModelPartBuilder.create().uv(0, 157).cuboid(-64.0F, -4.0F, -1.0F, 68.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(175, 195).cuboid(4.0F, -4.0F, -3.0F, 5.0F, 4.0F, 4.0F, new Dilation(0.0F))
				.uv(324, 219).cuboid(-69.0F, -4.0F, -3.0F, 5.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(60.0F, -51.2766F, 126.7088F, 0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r201 = group1.addChild("cube_r201", ModelPartBuilder.create().uv(528, 170).cuboid(-64.0F, -7.0F, -1.0F, 68.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(182, 309).cuboid(4.0F, -7.0F, -3.0F, 5.0F, 7.0F, 4.0F, new Dilation(0.0F))
				.uv(324, 253).cuboid(-69.0F, -7.0F, -3.0F, 5.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(60.0F, -53.7117F, 123.5354F, 0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r202 = group1.addChild("cube_r202", ModelPartBuilder.create().uv(116, 187).cuboid(-1.0F, -11.0F, -128.0F, 2.0F, 10.0F, 112.0F, new Dilation(0.0F))
				.uv(232, 166).cuboid(-1.0F, -1.0F, -128.0F, 2.0F, 11.0F, 111.0F, new Dilation(0.0F)), ModelTransform.of(-12.1777F, -13.1833F, 181.0062F, 0.0F, 0.0F, -0.0873F));

		ModelPartData cube_r203 = group1.addChild("cube_r203", ModelPartBuilder.create().uv(0, 166).cuboid(-1.0F, -11.0F, -129.0F, 2.0F, 21.0F, 112.0F, new Dilation(0.0F)), ModelTransform.of(72.1777F, -13.1833F, 181.0062F, 0.0F, 0.0F, 0.0873F));

		ModelPartData cube_r204 = group1.addChild("cube_r204", ModelPartBuilder.create().uv(154, 267).cuboid(-14.0F, -2.0F, 7.0F, 12.0F, 4.0F, 7.0F, new Dilation(0.0F))
				.uv(116, 267).cuboid(-53.0F, -2.0F, 7.0F, 12.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(58.0F, -53.7668F, 54.6329F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r205 = group1.addChild("cube_r205", ModelPartBuilder.create().uv(232, 288).cuboid(-14.0F, -2.0F, 7.0F, 12.0F, 4.0F, 7.0F, new Dilation(0.0F))
				.uv(270, 288).cuboid(25.0F, -2.0F, 7.0F, 12.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(19.0F, -56.7668F, 89.6329F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r206 = group1.addChild("cube_r206", ModelPartBuilder.create().uv(525, 28).cuboid(-1.0F, -2.0F, -3.0F, 4.0F, 4.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(21.4836F, -38.8514F, 94.9488F, -1.3002F, -0.2527F, -0.0692F));

		ModelPartData cube_r207 = group1.addChild("cube_r207", ModelPartBuilder.create().uv(525, 0).cuboid(-3.0F, -2.0F, -3.0F, 4.0F, 4.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(0.5164F, -38.8514F, 94.9488F, -1.3002F, 0.2527F, 0.0692F));

		ModelPartData cube_r208 = group1.addChild("cube_r208", ModelPartBuilder.create().uv(112, 349).cuboid(-17.0F, -2.0F, -5.0F, 18.0F, 4.0F, 26.0F, new Dilation(0.0F))
				.uv(598, 276).cuboid(22.0F, -2.0F, -5.0F, 18.0F, 4.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(19.0F, -38.7668F, 94.6329F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r209 = group1.addChild("cube_r209", ModelPartBuilder.create().uv(343, 123).cuboid(-1.0F, -2.0F, -4.0F, 4.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(21.4836F, -17.327F, 103.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r210 = group1.addChild("cube_r210", ModelPartBuilder.create().uv(278, 342).cuboid(-3.0F, -2.0F, -4.0F, 4.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(0.5164F, -17.327F, 103.0F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r211 = group1.addChild("cube_r211", ModelPartBuilder.create().uv(444, 526).cuboid(-3.0F, -2.0F, -3.0F, 4.0F, 4.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(39.5164F, -38.8514F, 94.9488F, -1.3002F, 0.2527F, 0.0692F));

		ModelPartData cube_r212 = group1.addChild("cube_r212", ModelPartBuilder.create().uv(528, 93).cuboid(-1.0F, -2.0F, -3.0F, 4.0F, 4.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(60.4836F, -38.8514F, 94.9488F, -1.3002F, -0.2527F, -0.0692F));

		ModelPartData cube_r213 = group1.addChild("cube_r213", ModelPartBuilder.create().uv(437, 346).cuboid(-1.0F, -2.0F, -4.0F, 4.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(60.4836F, -17.327F, 103.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r214 = group1.addChild("cube_r214", ModelPartBuilder.create().uv(462, 378).cuboid(-3.0F, -2.0F, -4.0F, 4.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(39.5164F, -17.327F, 103.0F, 0.0F, 0.0F, 0.2618F));
		return TexturedModelData.of(modelData, 1024, 1024);
	}
	@Override
	public void setAngles(VehicleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		poseStack.push();
		float angleInRadians = (float) Math.PI; // 180 degrees
		Quaternionf rotation = new Quaternionf();
		rotation.rotateY(angleInRadians);
		poseStack.multiply(rotation);
		float scale = 0.43f;
		poseStack.scale(scale,scale,scale);
		poseStack.translate(0, -0.8, 0.8);
		main1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		poseStack.pop();
	}
}