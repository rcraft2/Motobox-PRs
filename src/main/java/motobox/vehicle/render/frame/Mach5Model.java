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

public class Mach5Model extends EntityModel<VehicleEntity> {
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("frame_mach5"), "main");
	private final ModelPart main1;
	public Mach5Model(EntityRendererFactory.Context root) {
		super(RenderLayer::getEntityTranslucent);
		this.main1 = root.getPart(MODEL_LAYER).getChild("bone");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(212, 58).cuboid(20.8162F, 1.8238F, -21.7333F, 1.0F, 8.0F, 21.0F, new Dilation(0.0F))
				.uv(218, 331).cuboid(18.8162F, 1.8238F, -22.7333F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
				.uv(152, 342).cuboid(20.377F, -0.5463F, 4.0755F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(12, 342).cuboid(20.377F, 3.3504F, 7.2872F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(224, 294).cuboid(9.8162F, 0.5639F, -21.3208F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(294, 330).cuboid(8.8162F, 5.1789F, -18.1193F, 3.0F, 4.0F, 9.0F, new Dilation(0.0F))
				.uv(280, 217).cuboid(20.8162F, 4.1789F, -46.1193F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
				.uv(68, 327).cuboid(20.8162F, 4.1789F, -38.1193F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 346).cuboid(20.8162F, 4.1789F, -37.1193F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(212, 87).cuboid(-2.1838F, 1.8238F, -21.7333F, 1.0F, 8.0F, 21.0F, new Dilation(0.0F))
				.uv(18, 346).cuboid(-2.1838F, 4.1789F, -38.1193F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(22, 346).cuboid(-2.1838F, 4.1789F, -37.1193F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(72, 332).cuboid(-2.1838F, 4.1789F, -46.1193F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
				.uv(72, 315).cuboid(6.8162F, 0.5639F, -21.3208F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(336, 81).cuboid(6.8162F, 1.5639F, -21.3208F, 6.0F, 6.0F, 3.0F, new Dilation(0.0F))
				.uv(162, 342).cuboid(-1.7446F, -0.5463F, 4.0755F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(48, 342).cuboid(-4.7446F, 3.3504F, 7.2872F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 332).cuboid(-1.1838F, 1.8238F, -22.7333F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
				.uv(258, 190).cuboid(-1.1838F, 3.1789F, -19.1193F, 22.0F, 2.0F, 6.0F, new Dilation(0.0F))
				.uv(336, 345).cuboid(8.8162F, 1.1789F, -17.1193F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(344, 34).cuboid(7.8162F, 0.1789F, -17.1193F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(336, 136).cuboid(-3.1838F, 9.1789F, -26.1193F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
				.uv(256, 0).cuboid(7.8162F, 5.1789F, -18.1193F, 1.0F, 4.0F, 9.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-3.1838F, 9.1789F, -26.1193F, 25.0F, 1.0F, 30.0F, new Dilation(0.0F))
				.uv(336, 217).cuboid(21.8162F, 9.1789F, -26.1193F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-14.8162F, 11.8211F, 7.1193F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(180, 333).cuboid(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
				.uv(312, 287).cuboid(7.0F, -0.5F, -2.0F, 14.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.6476F, 0.0199F, 0.0045F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(212, 48).cuboid(-6.0F, -0.5F, -7.0F, 23.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(4.0269F, 2.8545F, -1.8003F, 1.4768F, 0.0F, -0.0117F));

		ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(276, 43).cuboid(1.5F, -0.5F, -4.0F, 19.0F, 2.0F, 5.0F, new Dilation(0.0F))
				.uv(334, 147).cuboid(-2.5F, -0.5F, -4.0F, 4.0F, 3.0F, 6.0F, new Dilation(0.0F))
				.uv(160, 333).cuboid(20.6216F, -0.5F, -4.0F, 4.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 4.4454F, 17.0783F, 1.0036F, 0.0F, 0.0F));

		ModelPartData cube_r4 = bone.addChild("cube_r4", ModelPartBuilder.create().uv(302, 132).cuboid(-2.5F, -1.5F, 2.0F, 3.0F, 1.0F, 14.0F, new Dilation(0.0F))
				.uv(184, 278).cuboid(1.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F))
				.uv(0, 256).cuboid(0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 22.0F, new Dilation(0.0F))
				.uv(252, 228).cuboid(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
				.uv(300, 253).cuboid(-1.5F, -2.5F, 4.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
				.uv(300, 235).cuboid(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
				.uv(48, 233).cuboid(-1.5F, -0.5F, -7.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(19.3162F, 6.773F, -40.1296F, -0.2182F, -0.3054F, 0.0F));

		ModelPartData cube_r5 = bone.addChild("cube_r5", ModelPartBuilder.create().uv(40, 279).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(19.3162F, 6.773F, -40.1296F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r6 = bone.addChild("cube_r6", ModelPartBuilder.create().uv(300, 296).cuboid(0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
				.uv(96, 255).cuboid(0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
				.uv(300, 217).cuboid(0.5F, -2.5F, 4.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
				.uv(0, 279).cuboid(-2.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F))
				.uv(256, 58).cuboid(-1.5F, -0.5F, -6.0F, 1.0F, 1.0F, 22.0F, new Dilation(0.0F))
				.uv(252, 252).cuboid(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
				.uv(302, 117).cuboid(-0.5F, -1.5F, 2.0F, 3.0F, 1.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(0.3162F, 6.773F, -40.1296F, -0.2182F, 0.3054F, 0.0F));

		ModelPartData cube_r7 = bone.addChild("cube_r7", ModelPartBuilder.create().uv(300, 81).cuboid(-5.5F, -2.5F, 5.0F, 1.0F, 2.0F, 17.0F, new Dilation(0.0F))
				.uv(276, 0).cuboid(-4.5F, -2.5F, 2.0F, 1.0F, 2.0F, 20.0F, new Dilation(0.0F))
				.uv(232, 204).cuboid(-3.5F, -1.5F, -1.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
				.uv(54, 206).cuboid(-2.5F, -0.5F, -4.0F, 1.0F, 1.0F, 26.0F, new Dilation(0.0F))
				.uv(156, 298).cuboid(-6.5F, -2.5F, 7.0F, 1.0F, 2.0F, 17.0F, new Dilation(0.0F))
				.uv(36, 299).cuboid(4.5F, -2.5F, 7.0F, 1.0F, 2.0F, 17.0F, new Dilation(0.0F))
				.uv(0, 299).cuboid(3.5F, -2.5F, 5.0F, 1.0F, 2.0F, 17.0F, new Dilation(0.0F))
				.uv(260, 103).cuboid(2.5F, -2.5F, 2.0F, 1.0F, 2.0F, 20.0F, new Dilation(0.0F))
				.uv(204, 232).cuboid(1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
				.uv(0, 205).cuboid(0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 26.0F, new Dilation(0.0F))
				.uv(148, 84).cuboid(-1.5F, -0.5F, -9.0F, 1.0F, 1.0F, 31.0F, new Dilation(0.0F))
				.uv(148, 20).cuboid(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 31.0F, new Dilation(0.0F)), ModelTransform.of(10.3162F, 6.2342F, -47.3429F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r8 = bone.addChild("cube_r8", ModelPartBuilder.create().uv(212, 13).cuboid(-11.5F, -2.0F, -4.5F, 23.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(10.18F, 7.8163F, -2.971F, -0.0063F, 0.0F, -0.0432F));

		ModelPartData cube_r9 = bone.addChild("cube_r9", ModelPartBuilder.create().uv(162, 140).cuboid(-2.5F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(336, 90).cuboid(-2.5F, 0.5F, -0.5F, 6.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(14.3162F, 1.0639F, -19.8208F, 0.0F, -0.48F, 0.0F));

		ModelPartData cube_r10 = bone.addChild("cube_r10", ModelPartBuilder.create().uv(126, 28).cuboid(-2.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(136, 331).cuboid(-2.5F, 0.5F, -0.5F, 9.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(18.1455F, 1.4904F, -16.6429F, -0.2226F, -0.8967F, 0.2819F));

		ModelPartData cube_r11 = bone.addChild("cube_r11", ModelPartBuilder.create().uv(212, 26).cuboid(-10.0F, -1.5F, -5.5F, 20.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(9.8162F, 9.6789F, 9.3807F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r12 = bone.addChild("cube_r12", ModelPartBuilder.create().uv(318, 330).cuboid(3.5F, -4.5F, -5.0F, 1.0F, 5.0F, 9.0F, new Dilation(0.0F))
				.uv(232, 256).cuboid(22.5F, -4.5F, -5.0F, 1.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(-3.6838F, 8.9195F, -28.8877F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r13 = bone.addChild("cube_r13", ModelPartBuilder.create().uv(118, 279).cuboid(-0.5F, -3.5F, -3.5F, 1.0F, 5.0F, 11.0F, new Dilation(0.0F))
				.uv(168, 317).cuboid(18.5F, -3.5F, -3.5F, 1.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.3162F, 7.6547F, 6.7628F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r14 = bone.addChild("cube_r14", ModelPartBuilder.create().uv(224, 315).cuboid(0.5F, -1.5F, -5.0F, 1.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(118, 298).cuboid(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(300, 314).cuboid(21.5F, -1.5F, -5.0F, 1.0F, 2.0F, 14.0F, new Dilation(0.0F))
				.uv(80, 279).cuboid(22.5F, -0.5F, -9.0F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(-1.6838F, 7.3164F, -42.2986F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r15 = bone.addChild("cube_r15", ModelPartBuilder.create().uv(0, 342).cuboid(-4.5F, -5.0F, 1.5F, 5.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(228, 341).cuboid(20.0583F, -5.0F, 1.5F, 5.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.4629F, 3.8631F, -29.3811F, 2.6616F, 0.0F, 0.0F));

		ModelPartData cube_r16 = bone.addChild("cube_r16", ModelPartBuilder.create().uv(294, 343).cuboid(-1.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(304, 343).cuboid(22.0583F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.4629F, 8.2617F, -33.9257F, 2.9671F, 0.0F, 0.0F));

		ModelPartData cube_r17 = bone.addChild("cube_r17", ModelPartBuilder.create().uv(302, 186).cuboid(-4.5F, -3.0F, -0.5F, 5.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(300, 271).cuboid(20.0583F, -3.0F, -0.5F, 5.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.4629F, 3.8631F, -29.3811F, 1.9199F, 0.0F, 0.0F));

		ModelPartData cube_r18 = bone.addChild("cube_r18", ModelPartBuilder.create().uv(302, 179).cuboid(-0.5F, -1.5F, -10.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
				.uv(142, 340).cuboid(-0.5F, -1.5F, -5.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.8949F, 7.573F, -35.5002F, -0.0982F, -0.2275F, -0.3528F));

		ModelPartData cube_r19 = bone.addChild("cube_r19", ModelPartBuilder.create().uv(132, 340).cuboid(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.8949F, 7.3105F, -35.3129F, 0.0267F, -0.1806F, -0.3782F));

		ModelPartData cube_r20 = bone.addChild("cube_r20", ModelPartBuilder.create().uv(0, 318).cuboid(-0.5F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(-2.8906F, 5.6479F, -43.7202F, -2.9485F, 0.0149F, -1.7114F));

		ModelPartData cube_r21 = bone.addChild("cube_r21", ModelPartBuilder.create().uv(144, 278).cuboid(-1.0F, 0.0F, -7.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(-1.9569F, 6.1789F, -45.0389F, -0.2182F, -0.1309F, 0.0F));

		ModelPartData cube_r22 = bone.addChild("cube_r22", ModelPartBuilder.create().uv(110, 0).cuboid(-11.0F, -0.5F, -10.0F, 22.0F, 1.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(9.8162F, 1.6789F, 10.8807F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r23 = bone.addChild("cube_r23", ModelPartBuilder.create().uv(160, 331).cuboid(4.5F, -3.0F, 1.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(246, 346).cuboid(6.5F, -3.0F, 0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 346).cuboid(2.5F, 2.0F, 3.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(342, 345).cuboid(4.5F, 2.0F, 3.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(242, 346).cuboid(4.5F, -3.0F, 0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(330, 328).cuboid(4.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(238, 346).cuboid(5.5F, -3.0F, 0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(256, 103).cuboid(5.5F, -2.0F, 0.5F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.3162F, 2.1789F, -13.6193F, -1.2217F, 0.0F, 0.0F));

		ModelPartData cube_r24 = bone.addChild("cube_r24", ModelPartBuilder.create().uv(200, 344).cuboid(-0.5F, -1.5F, 0.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.3162F, 2.2636F, -10.9281F, -2.0944F, 0.0F, 0.0F));

		ModelPartData cube_r25 = bone.addChild("cube_r25", ModelPartBuilder.create().uv(148, 52).cuboid(-3.5F, -0.5F, 0.0F, 1.0F, 1.0F, 31.0F, new Dilation(0.0F))
				.uv(68, 142).cuboid(-2.5F, -0.5F, -5.0F, 1.0F, 1.0F, 33.0F, new Dilation(0.0F))
				.uv(74, 105).cuboid(-1.5F, -0.5F, -10.0F, 1.0F, 1.0F, 36.0F, new Dilation(0.0F))
				.uv(0, 105).cuboid(-0.5F, -0.5F, -14.0F, 1.0F, 1.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(6.4891F, 3.0931F, -41.6116F, 0.2289F, -0.0667F, -0.828F));

		ModelPartData cube_r26 = bone.addChild("cube_r26", ModelPartBuilder.create().uv(336, 49).cuboid(-4.5F, -0.5F, 4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
				.uv(28, 318).cuboid(-3.5F, -0.5F, 0.0F, 1.0F, 1.0F, 12.0F, new Dilation(0.0F))
				.uv(192, 314).cuboid(-2.5F, -0.5F, -3.0F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F))
				.uv(258, 168).cuboid(-1.5F, -0.5F, -8.0F, 1.0F, 1.0F, 21.0F, new Dilation(0.0F))
				.uv(178, 204).cuboid(-0.5F, -0.5F, -13.0F, 1.0F, 2.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(-1.6838F, 2.4221F, -38.2017F, 0.124F, 0.1231F, -0.7777F));

		ModelPartData cube_r27 = bone.addChild("cube_r27", ModelPartBuilder.create().uv(336, 233).cuboid(-2.0F, -3.5F, -1.5F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-1.734F, 2.7089F, -28.0902F, 0.0214F, -0.0742F, -1.4885F));

		ModelPartData cube_r28 = bone.addChild("cube_r28", ModelPartBuilder.create().uv(338, 336).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-4.8186F, 3.0987F, -26.1973F, 0.0214F, -0.0742F, -1.4885F));

		ModelPartData cube_r29 = bone.addChild("cube_r29", ModelPartBuilder.create().uv(342, 200).cuboid(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.3194F, 2.1008F, -21.7757F, -0.2783F, -0.6896F, 0.4815F));

		ModelPartData cube_r30 = bone.addChild("cube_r30", ModelPartBuilder.create().uv(338, 215).cuboid(-1.0F, -1.0F, 1.5F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.1751F, 1.8825F, -25.6754F, -0.1328F, -0.5528F, 0.5985F));

		ModelPartData cube_r31 = bone.addChild("cube_r31", ModelPartBuilder.create().uv(336, 107).cuboid(-4.5F, -0.5F, -3.0F, 4.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-1.6954F, 1.3476F, -23.0789F, -0.307F, -0.2975F, -0.7373F));

		ModelPartData cube_r32 = bone.addChild("cube_r32", ModelPartBuilder.create().uv(324, 293).cuboid(-4.5F, 0.5F, -1.5F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.8296F, 1.2107F, -23.4327F, 0.0475F, -0.644F, 0.4966F));

		ModelPartData cube_r33 = bone.addChild("cube_r33", ModelPartBuilder.create().uv(318, 209).cuboid(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-2.8009F, 2.7667F, -21.3539F, -0.094F, -0.1068F, -0.6534F));

		ModelPartData cube_r34 = bone.addChild("cube_r34", ModelPartBuilder.create().uv(130, 295).cuboid(7.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.3343F, 8.5395F, -25.8766F, -0.1995F, -0.1802F, -0.6777F));

		ModelPartData cube_r35 = bone.addChild("cube_r35", ModelPartBuilder.create().uv(336, 307).cuboid(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.3203F, 2.1856F, -25.6951F, -0.1323F, 0.0976F, -0.8026F));

		ModelPartData cube_r36 = bone.addChild("cube_r36", ModelPartBuilder.create().uv(72, 317).cuboid(-0.5F, 3.5F, 1.0F, 1.0F, 1.0F, 14.0F, new Dilation(0.0F))
				.uv(302, 100).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F))
				.uv(80, 298).cuboid(-0.5F, 1.5F, -5.0F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(258, 146).cuboid(-0.5F, 0.5F, -9.0F, 1.0F, 1.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(-1.6838F, 2.4221F, -38.2017F, 0.124F, 0.1231F, -0.7777F));

		ModelPartData cube_r37 = bone.addChild("cube_r37", ModelPartBuilder.create().uv(336, 115).cuboid(-2.5F, -0.5F, -1.0F, 3.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(2.594F, 1.6131F, -23.258F, 0.0873F, 0.0F, -0.3054F));

		ModelPartData cube_r38 = bone.addChild("cube_r38", ModelPartBuilder.create().uv(334, 165).cuboid(-6.5F, -0.5F, 12.5F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
				.uv(318, 26).cuboid(-5.5F, -0.5F, 8.5F, 1.0F, 1.0F, 12.0F, new Dilation(0.0F))
				.uv(314, 179).cuboid(-4.5F, -0.5F, 4.5F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F))
				.uv(276, 22).cuboid(-3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 20.0F, new Dilation(0.0F))
				.uv(156, 232).cuboid(-2.5F, -0.5F, -4.5F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
				.uv(200, 175).cuboid(-1.5F, -0.5F, -9.5F, 1.0F, 1.0F, 28.0F, new Dilation(0.0F))
				.uv(74, 68).cuboid(-0.5F, -0.5F, -17.5F, 1.0F, 1.0F, 36.0F, new Dilation(0.0F))
				.uv(54, 318).cuboid(6.5F, -0.5F, 12.5F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
				.uv(318, 0).cuboid(5.5F, -0.5F, 8.5F, 1.0F, 1.0F, 12.0F, new Dilation(0.0F))
				.uv(302, 147).cuboid(4.5F, -0.5F, 4.5F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F))
				.uv(260, 125).cuboid(3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 20.0F, new Dilation(0.0F))
				.uv(108, 231).cuboid(2.5F, -0.5F, -4.5F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F))
				.uv(200, 146).cuboid(1.5F, -0.5F, -9.5F, 1.0F, 1.0F, 28.0F, new Dilation(0.0F))
				.uv(0, 31).cuboid(0.5F, -0.5F, -17.5F, 1.0F, 1.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(9.3162F, 2.94F, -39.6952F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r39 = bone.addChild("cube_r39", ModelPartBuilder.create().uv(336, 300).cuboid(-0.5F, -1.5F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
				.uv(336, 293).cuboid(21.6216F, -1.5F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 1.0719F, 20.2275F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r40 = bone.addChild("cube_r40", ModelPartBuilder.create().uv(84, 342).cuboid(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(272, 198).cuboid(21.6216F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 0.5975F, 20.2346F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r41 = bone.addChild("cube_r41", ModelPartBuilder.create().uv(50, 331).cuboid(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
				.uv(28, 331).cuboid(21.6216F, -0.5F, -6.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, -0.3115F, 19.1512F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r42 = bone.addChild("cube_r42", ModelPartBuilder.create().uv(330, 67).cuboid(-0.5F, -1.5F, -4.0F, 1.0F, 3.0F, 11.0F, new Dilation(0.0F))
				.uv(318, 195).cuboid(21.6216F, -1.5F, -4.0F, 1.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 1.2405F, 13.8251F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r43 = bone.addChild("cube_r43", ModelPartBuilder.create().uv(336, 241).cuboid(-0.5F, -1.5F, -5.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-3.6018F, 4.0817F, 17.4057F, -1.2572F, -0.0927F, 2.996F));

		ModelPartData cube_r44 = bone.addChild("cube_r44", ModelPartBuilder.create().uv(122, 340).cuboid(0.5F, -4.5F, -3.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.4079F, 2.1828F, 11.6302F, -1.2572F, -0.0927F, 2.996F));

		ModelPartData cube_r45 = bone.addChild("cube_r45", ModelPartBuilder.create().uv(320, 344).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.3602F, 3.9777F, 12.2984F, -1.2636F, -0.0495F, 3.0401F));

		ModelPartData cube_r46 = bone.addChild("cube_r46", ModelPartBuilder.create().uv(314, 344).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.6426F, 3.5316F, 9.6554F, -1.4879F, 0.004F, 3.1284F));

		ModelPartData cube_r47 = bone.addChild("cube_r47", ModelPartBuilder.create().uv(344, 281).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.3557F, 2.3675F, 11.7421F, -1.2636F, -0.0495F, 3.0837F));

		ModelPartData cube_r48 = bone.addChild("cube_r48", ModelPartBuilder.create().uv(344, 276).cuboid(1.5F, -3.0F, -1.5F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.4762F, 1.4744F, 7.6502F, -1.5752F, 0.0028F, 3.1281F));

		ModelPartData cube_r49 = bone.addChild("cube_r49", ModelPartBuilder.create().uv(330, 314).cuboid(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(-2.1865F, 2.0788F, 14.0224F, -0.3379F, 0.0419F, -0.2908F));

		ModelPartData cube_r50 = bone.addChild("cube_r50", ModelPartBuilder.create().uv(38, 346).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.2314F, 0.7699F, 7.7123F, 1.6197F, -0.1435F, -2.7127F));

		ModelPartData cube_r51 = bone.addChild("cube_r51", ModelPartBuilder.create().uv(66, 346).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.9173F, 0.6254F, 7.7928F, 1.7781F, -0.1466F, -2.544F));

		ModelPartData cube_r52 = bone.addChild("cube_r52", ModelPartBuilder.create().uv(254, 346).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.949F, 0.469F, 6.611F, 1.4501F, 0.0916F, -2.4922F));

		ModelPartData cube_r53 = bone.addChild("cube_r53", ModelPartBuilder.create().uv(262, 346).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.8693F, 0.5227F, 7.4726F, 1.5625F, 0.003F, -1.6994F));

		ModelPartData cube_r54 = bone.addChild("cube_r54", ModelPartBuilder.create().uv(346, 192).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.9769F, 0.396F, 6.5255F, 1.5546F, 0.0892F, -1.5259F));

		ModelPartData cube_r55 = bone.addChild("cube_r55", ModelPartBuilder.create().uv(346, 190).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.9793F, 0.5257F, 5.5774F, 1.5071F, 0.0884F, -1.6133F));

		ModelPartData cube_r56 = bone.addChild("cube_r56", ModelPartBuilder.create().uv(62, 346).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.9754F, 0.8259F, 4.6709F, 1.3861F, 0.077F, -2.5414F));

		ModelPartData cube_r57 = bone.addChild("cube_r57", ModelPartBuilder.create().uv(346, 188).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0083F, 0.6964F, 4.6748F, 1.4128F, 0.075F, -1.7435F));

		ModelPartData cube_r58 = bone.addChild("cube_r58", ModelPartBuilder.create().uv(338, 342).cuboid(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.4501F, 0.5031F, 8.8669F, -0.1593F, 0.0132F, -0.1331F));

		ModelPartData cube_r59 = bone.addChild("cube_r59", ModelPartBuilder.create().uv(134, 176).cuboid(-0.5F, -2.5F, -0.5F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.7603F, 0.7415F, 5.5891F, -1.7826F, -0.061F, -2.4818F));

		ModelPartData cube_r60 = bone.addChild("cube_r60", ModelPartBuilder.create().uv(30, 346).cuboid(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.3348F, 1.3866F, 5.0883F, -1.8425F, 0.0822F, -2.7479F));

		ModelPartData cube_r61 = bone.addChild("cube_r61", ModelPartBuilder.create().uv(344, 271).cuboid(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.5184F, 1.7878F, 6.8183F, -1.8363F, 0.0218F, -3.0711F));

		ModelPartData cube_r62 = bone.addChild("cube_r62", ModelPartBuilder.create().uv(234, 345).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.6657F, 3.0449F, 7.8946F, -1.8351F, 0.0104F, -3.1132F));

		ModelPartData cube_r63 = bone.addChild("cube_r63", ModelPartBuilder.create().uv(344, 30).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.6078F, 3.3535F, 4.8649F, -2.0086F, -0.0791F, -3.1046F));

		ModelPartData cube_r64 = bone.addChild("cube_r64", ModelPartBuilder.create().uv(346, 186).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0961F, 1.0683F, 3.8002F, -1.9237F, 0.0893F, -2.4903F));

		ModelPartData cube_r65 = bone.addChild("cube_r65", ModelPartBuilder.create().uv(346, 184).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.2383F, 1.2949F, 2.8183F, -1.9719F, 0.0019F, -2.7137F));

		ModelPartData cube_r66 = bone.addChild("cube_r66", ModelPartBuilder.create().uv(184, 346).cuboid(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.5916F, 0.2112F, 3.5266F, -1.9429F, 0.278F, -2.6103F));

		ModelPartData cube_r67 = bone.addChild("cube_r67", ModelPartBuilder.create().uv(346, 182).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.5798F, 0.7787F, 3.6642F, -1.7008F, 0.1986F, -1.8749F));

		ModelPartData cube_r68 = bone.addChild("cube_r68", ModelPartBuilder.create().uv(90, 273).cuboid(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.2771F, 0.509F, 5.9958F, -1.5708F, 0.0436F, -1.5708F));

		ModelPartData cube_r69 = bone.addChild("cube_r69", ModelPartBuilder.create().uv(228, 345).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.7771F, 0.6931F, 3.596F, -1.5708F, 0.2182F, -1.5708F));

		ModelPartData cube_r70 = bone.addChild("cube_r70", ModelPartBuilder.create().uv(338, 328).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F))
				.uv(92, 332).cuboid(21.6216F, -0.5F, -1.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 0.8327F, 1.3647F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r71 = bone.addChild("cube_r71", ModelPartBuilder.create().uv(330, 344).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.7771F, 0.9776F, 2.7578F, -1.5708F, 0.4363F, -1.5708F));

		ModelPartData cube_r72 = bone.addChild("cube_r72", ModelPartBuilder.create().uv(346, 180).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.6036F, 1.0929F, 2.8116F, -1.7101F, 0.4149F, -1.9056F));

		ModelPartData cube_r73 = bone.addChild("cube_r73", ModelPartBuilder.create().uv(180, 346).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.1511F, 1.2942F, 2.9054F, -1.9776F, 0.1624F, -2.7825F));

		ModelPartData cube_r74 = bone.addChild("cube_r74", ModelPartBuilder.create().uv(344, 6).cuboid(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.687F, 0.5641F, 2.565F, -2.0071F, 0.0F, -3.1416F));

		ModelPartData cube_r75 = bone.addChild("cube_r75", ModelPartBuilder.create().uv(270, 342).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.5629F, 5.337F, -25.1813F, 0.0F, 0.0F, -2.1817F));

		ModelPartData cube_r76 = bone.addChild("cube_r76", ModelPartBuilder.create().uv(260, 342).cuboid(-3.5F, 0.0F, -0.5F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(342, 202).cuboid(20.0583F, 0.0F, -0.5F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.4629F, 3.8631F, -29.3811F, 1.309F, 0.0F, 0.0F));

		ModelPartData cube_r77 = bone.addChild("cube_r77", ModelPartBuilder.create().uv(258, 198).cuboid(-3.5F, 0.0F, -0.5F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(108, 225).cuboid(20.0583F, 0.0F, -0.5F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.4629F, 4.4066F, -26.787F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r78 = bone.addChild("cube_r78", ModelPartBuilder.create().uv(344, 26).cuboid(-2.5F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(344, 14).cuboid(20.0583F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.4629F, 6.8415F, -25.3464F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r79 = bone.addChild("cube_r79", ModelPartBuilder.create().uv(232, 270).cuboid(-1.5F, -0.5F, -1.0F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(232, 228).cuboid(22.6216F, -0.5F, -1.0F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.2446F, 7.3088F, 14.9065F, -1.3963F, 0.0F, 0.0F));

		ModelPartData cube_r80 = bone.addChild("cube_r80", ModelPartBuilder.create().uv(342, 195).cuboid(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.687F, 3.5641F, 9.565F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r81 = bone.addChild("cube_r81", ModelPartBuilder.create().uv(344, 324).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.687F, 4.7779F, 4.4993F, 0.6109F, 0.0F, 0.0F));

		ModelPartData cube_r82 = bone.addChild("cube_r82", ModelPartBuilder.create().uv(344, 22).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.687F, 5.2611F, 2.467F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r83 = bone.addChild("cube_r83", ModelPartBuilder.create().uv(336, 257).cuboid(-0.5F, 0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
				.uv(336, 250).cuboid(21.6216F, 0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 1.0719F, 20.2275F, 1.0036F, 0.0F, 0.0F));

		ModelPartData cube_r84 = bone.addChild("cube_r84", ModelPartBuilder.create().uv(102, 317).cuboid(-0.5F, -24.5F, -2.0F, 1.0F, 29.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.817F, 7.3472F, -0.2082F, 1.5708F, 0.0F, -0.1745F));

		ModelPartData cube_r85 = bone.addChild("cube_r85", ModelPartBuilder.create().uv(262, 296).cuboid(-0.5F, -0.5F, -11.0F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(280, 198).cuboid(21.6216F, -0.5F, -11.0F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, -1.0463F, 16.0755F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r86 = bone.addChild("cube_r86", ModelPartBuilder.create().uv(344, 36).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.3752F, 5.2611F, 0.1983F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r87 = bone.addChild("cube_r87", ModelPartBuilder.create().uv(0, 176).cuboid(-0.5F, -0.5F, -15.0F, 4.0F, 1.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(-4.003F, 5.2611F, -7.9124F, 0.0F, 0.0F, -0.9163F));

		ModelPartData cube_r88 = bone.addChild("cube_r88", ModelPartBuilder.create().uv(130, 30).cuboid(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.9121F, 5.3675F, -17.0024F, 0.0666F, -0.2079F, -1.7959F));

		ModelPartData cube_r89 = bone.addChild("cube_r89", ModelPartBuilder.create().uv(254, 330).cuboid(-0.5F, -0.5F, -3.0F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(-4.287F, 4.3729F, -19.8728F, -0.2464F, 0.0142F, -1.4835F));

		ModelPartData cube_r90 = bone.addChild("cube_r90", ModelPartBuilder.create().uv(344, 3).cuboid(-2.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(344, 0).cuboid(21.6216F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 8.8745F, 3.6509F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r91 = bone.addChild("cube_r91", ModelPartBuilder.create().uv(336, 311).cuboid(-3.5F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(336, 144).cuboid(21.6216F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 7.038F, 3.8927F, 1.309F, 0.0F, 0.0F));

		ModelPartData cube_r92 = bone.addChild("cube_r92", ModelPartBuilder.create().uv(72, 342).cuboid(-3.5F, -1.5F, -1.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(36, 342).cuboid(21.6216F, -1.5F, -1.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 5.827F, 4.7806F, 0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r93 = bone.addChild("cube_r93", ModelPartBuilder.create().uv(60, 342).cuboid(-3.5F, -1.5F, -1.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(24, 342).cuboid(21.6216F, -1.5F, -1.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 5.0922F, 6.4507F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r94 = bone.addChild("cube_r94", ModelPartBuilder.create().uv(336, 129).cuboid(-3.5F, -1.5F, -2.5F, 4.0F, 2.0F, 4.6919F, new Dilation(0.0F))
				.uv(336, 122).cuboid(21.6216F, -1.5F, -2.5F, 4.0F, 2.0F, 4.6919F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 5.4804F, 11.5726F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r95 = bone.addChild("cube_r95", ModelPartBuilder.create().uv(330, 324).cuboid(-2.5F, -1.5F, 0.5F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(54, 327).cuboid(21.6216F, -1.5F, 0.5F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.2446F, 5.0496F, 12.5626F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r96 = bone.addChild("cube_r96", ModelPartBuilder.create().uv(112, 317).cuboid(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 13.0F, new Dilation(0.0F))
				.uv(302, 67).cuboid(21.6216F, -0.5F, -6.0F, 1.0F, 1.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(-1.2446F, 1.2405F, 13.8251F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r97 = bone.addChild("cube_r97", ModelPartBuilder.create().uv(212, 342).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.022F, 2.0368F, 0.127F, 0.6912F, 0.0653F, 0.0374F));

		ModelPartData cube_r98 = bone.addChild("cube_r98", ModelPartBuilder.create().uv(232, 274).cuboid(-2.0F, -1.0F, 0.5F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.1751F, 1.8825F, -25.6754F, 0.0475F, -0.644F, 0.4966F));

		ModelPartData cube_r99 = bone.addChild("cube_r99", ModelPartBuilder.create().uv(112, 331).cuboid(-6.5F, 0.5F, -0.5F, 9.0F, 6.0F, 3.0F, new Dilation(0.0F))
				.uv(126, 26).cuboid(-5.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.487F, 1.4904F, -16.6429F, -0.2226F, 0.8967F, -0.2819F));

		ModelPartData cube_r100 = bone.addChild("cube_r100", ModelPartBuilder.create().uv(336, 58).cuboid(-3.5F, 0.5F, -0.5F, 6.0F, 6.0F, 3.0F, new Dilation(0.0F))
				.uv(148, 140).cuboid(-3.5F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.3162F, 1.0639F, -19.8208F, 0.0F, 0.48F, 0.0F));

		ModelPartData cube_r101 = bone.addChild("cube_r101", ModelPartBuilder.create().uv(280, 343).cuboid(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.6728F, 6.7534F, -24.5604F, -2.8849F, -0.1258F, 2.781F));

		ModelPartData cube_r102 = bone.addChild("cube_r102", ModelPartBuilder.create().uv(200, 116).cuboid(-0.5F, -0.5F, -12.5F, 1.0F, 1.0F, 29.0F, new Dilation(0.0F)), ModelTransform.of(-3.0118F, 9.5599F, -12.8075F, 0.0F, 0.0F, -0.6981F));

		ModelPartData cube_r103 = bone.addChild("cube_r103", ModelPartBuilder.create().uv(280, 330).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.8222F, 6.2881F, -25.6661F, -1.6344F, -1.3578F, -1.8609F));

		ModelPartData cube_r104 = bone.addChild("cube_r104", ModelPartBuilder.create().uv(326, 344).cuboid(0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.9849F, 4.0292F, -27.1262F, -1.3726F, 0.1542F, 2.5707F));

		ModelPartData cube_r105 = bone.addChild("cube_r105", ModelPartBuilder.create().uv(58, 346).cuboid(0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.2104F, 5.6155F, -30.7656F, -1.5272F, 0.0019F, 3.0107F));

		ModelPartData cube_r106 = bone.addChild("cube_r106", ModelPartBuilder.create().uv(42, 346).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.7574F, 4.5643F, -32.3419F, -2.0068F, 0.0663F, 2.9503F));

		ModelPartData cube_r107 = bone.addChild("cube_r107", ModelPartBuilder.create().uv(26, 346).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.426F, 5.5074F, -33.1241F, -1.66F, 1.1514F, -1.8988F));

		ModelPartData cube_r108 = bone.addChild("cube_r108", ModelPartBuilder.create().uv(218, 341).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.7314F, 5.1789F, -36.4297F, 0.0437F, -0.1819F, 0.1668F));

		ModelPartData cube_r109 = bone.addChild("cube_r109", ModelPartBuilder.create().uv(312, 271).cuboid(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(-3.0235F, 4.6789F, -43.2365F, 0.1745F, 0.0F, -1.6144F));

		ModelPartData cube_r110 = bone.addChild("cube_r110", ModelPartBuilder.create().uv(272, 276).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(0.3162F, 6.773F, -40.1296F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r111 = bone.addChild("cube_r111", ModelPartBuilder.create().uv(0, 232).cuboid(-0.5F, -0.5F, -10.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(6.5586F, 4.1789F, -41.1796F, 0.1555F, -0.1536F, -0.7974F));

		ModelPartData cube_r112 = bone.addChild("cube_r112", ModelPartBuilder.create().uv(46, 257).cuboid(0.0F, -1.0F, -9.0F, 1.0F, 1.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(-0.1838F, 5.1789F, -40.1193F, 0.1128F, 0.2368F, 0.4498F));

		ModelPartData cube_r113 = bone.addChild("cube_r113", ModelPartBuilder.create().uv(72, 299).cuboid(-0.5F, -1.5F, -0.5F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(15.2104F, -3.2339F, 2.0257F, 1.5232F, 0.334F, 1.312F));

		ModelPartData cube_r114 = bone.addChild("cube_r114", ModelPartBuilder.create().uv(224, 278).cuboid(-0.5F, -1.5F, 0.5F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(13.5874F, -2.3863F, 1.7591F, 1.3909F, 0.2978F, 0.9654F));

		ModelPartData cube_r115 = bone.addChild("cube_r115", ModelPartBuilder.create().uv(196, 116).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(13.8735F, -2.4156F, 1.7822F, 1.3066F, 0.1867F, 0.5553F));

		ModelPartData cube_r116 = bone.addChild("cube_r116", ModelPartBuilder.create().uv(108, 206).cuboid(1.0F, -3.0F, -1.0F, 1.0F, 15.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(11.978F, 1.0368F, 2.127F, 1.2148F, 0.0378F, 0.065F));

		ModelPartData cube_r117 = bone.addChild("cube_r117", ModelPartBuilder.create().uv(232, 276).cuboid(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(21.5894F, 6.1789F, -45.0389F, -0.2182F, 0.1309F, 0.0F));

		ModelPartData cube_r118 = bone.addChild("cube_r118", ModelPartBuilder.create().uv(124, 195).cuboid(-0.5F, -1.5F, -10.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
				.uv(112, 340).cuboid(-0.5F, -1.5F, -5.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(23.5273F, 7.573F, -35.5002F, -0.0982F, 0.2275F, 0.3528F));

		ModelPartData cube_r119 = bone.addChild("cube_r119", ModelPartBuilder.create().uv(92, 340).cuboid(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(23.5273F, 7.3105F, -35.3129F, 0.0267F, 0.1806F, 0.3782F));

		ModelPartData cube_r120 = bone.addChild("cube_r120", ModelPartBuilder.create().uv(240, 340).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(24.3639F, 5.1789F, -36.4297F, 0.0437F, 0.1819F, -0.1668F));

		ModelPartData cube_r121 = bone.addChild("cube_r121", ModelPartBuilder.create().uv(10, 346).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0584F, 5.5074F, -33.1241F, -1.66F, -1.1514F, 1.8988F));

		ModelPartData cube_r122 = bone.addChild("cube_r122", ModelPartBuilder.create().uv(50, 346).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.6078F, 0.8259F, 4.6709F, 1.3861F, -0.077F, 2.5414F));

		ModelPartData cube_r123 = bone.addChild("cube_r123", ModelPartBuilder.create().uv(34, 346).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.8638F, 0.7699F, 7.7123F, 1.6197F, 0.1435F, 2.7127F));

		ModelPartData cube_r124 = bone.addChild("cube_r124", ModelPartBuilder.create().uv(54, 346).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.5498F, 0.6254F, 7.7928F, 1.7781F, 0.1466F, 2.544F));

		ModelPartData cube_r125 = bone.addChild("cube_r125", ModelPartBuilder.create().uv(258, 346).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.5018F, 0.5227F, 7.4726F, 1.5625F, -0.003F, 1.6994F));

		ModelPartData cube_r126 = bone.addChild("cube_r126", ModelPartBuilder.create().uv(250, 346).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.5815F, 0.469F, 6.611F, 1.4501F, -0.0916F, 2.4922F));

		ModelPartData cube_r127 = bone.addChild("cube_r127", ModelPartBuilder.create().uv(346, 178).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.6093F, 0.396F, 6.5255F, 1.5546F, -0.0892F, 1.5259F));

		ModelPartData cube_r128 = bone.addChild("cube_r128", ModelPartBuilder.create().uv(176, 346).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.6117F, 0.5257F, 5.5774F, 1.5071F, -0.0884F, 1.6133F));

		ModelPartData cube_r129 = bone.addChild("cube_r129", ModelPartBuilder.create().uv(172, 346).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.6407F, 0.6964F, 4.6748F, 1.4128F, -0.075F, 1.7435F));

		ModelPartData cube_r130 = bone.addChild("cube_r130", ModelPartBuilder.create().uv(342, 206).cuboid(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(22.0826F, 0.5031F, 8.8669F, -0.1593F, -0.0132F, 0.1331F));

		ModelPartData cube_r131 = bone.addChild("cube_r131", ModelPartBuilder.create().uv(250, 340).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.2122F, 0.7787F, 3.6642F, -1.7008F, -0.1986F, 1.8749F));

		ModelPartData cube_r132 = bone.addChild("cube_r132", ModelPartBuilder.create().uv(156, 340).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.236F, 1.0929F, 2.8116F, -1.7101F, -0.4149F, 1.9056F));

		ModelPartData cube_r133 = bone.addChild("cube_r133", ModelPartBuilder.create().uv(246, 270).cuboid(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.9095F, 0.509F, 5.9958F, -1.5708F, -0.0436F, 1.5708F));

		ModelPartData cube_r134 = bone.addChild("cube_r134", ModelPartBuilder.create().uv(318, 39).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.4095F, 0.6931F, 3.596F, -1.5708F, -0.2182F, 1.5708F));

		ModelPartData cube_r135 = bone.addChild("cube_r135", ModelPartBuilder.create().uv(296, 55).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.4095F, 0.9776F, 2.7578F, -1.5708F, -0.4363F, 1.5708F));

		ModelPartData cube_r136 = bone.addChild("cube_r136", ModelPartBuilder.create().uv(146, 20).cuboid(0.5F, -2.5F, -0.5F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.3928F, 0.7415F, 5.5891F, -1.7826F, 0.061F, 2.4818F));

		ModelPartData cube_r137 = bone.addChild("cube_r137", ModelPartBuilder.create().uv(78, 346).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.7285F, 1.0683F, 3.8002F, -1.9237F, -0.0893F, 2.4903F));

		ModelPartData cube_r138 = bone.addChild("cube_r138", ModelPartBuilder.create().uv(70, 346).cuboid(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.224F, 0.2112F, 3.5266F, -1.9429F, -0.278F, 2.6103F));

		ModelPartData cube_r139 = bone.addChild("cube_r139", ModelPartBuilder.create().uv(14, 346).cuboid(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.9673F, 1.3866F, 5.0883F, -1.8425F, -0.0822F, 2.7479F));

		ModelPartData cube_r140 = bone.addChild("cube_r140", ModelPartBuilder.create().uv(74, 346).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.8708F, 1.2949F, 2.8183F, -1.9719F, -0.0019F, 2.7137F));

		ModelPartData cube_r141 = bone.addChild("cube_r141", ModelPartBuilder.create().uv(152, 340).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.7835F, 1.2942F, 2.9054F, -1.9776F, -0.1624F, 2.7825F));

		ModelPartData cube_r142 = bone.addChild("cube_r142", ModelPartBuilder.create().uv(180, 339).cuboid(-1.5F, -4.5F, -3.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(23.0403F, 2.1828F, 11.6302F, -1.2572F, 0.0927F, -2.996F));

		ModelPartData cube_r143 = bone.addChild("cube_r143", ModelPartBuilder.create().uv(22, 337).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(23.9927F, 3.9777F, 12.2984F, -1.2636F, 0.0495F, -3.0401F));

		ModelPartData cube_r144 = bone.addChild("cube_r144", ModelPartBuilder.create().uv(240, 331).cuboid(-0.5F, -1.5F, -5.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(23.2342F, 4.0817F, 17.4057F, -1.2572F, 0.0927F, -2.996F));

		ModelPartData cube_r145 = bone.addChild("cube_r145", ModelPartBuilder.create().uv(294, 325).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(23.9882F, 2.3675F, 11.7421F, -1.2636F, 0.0495F, -3.0837F));

		ModelPartData cube_r146 = bone.addChild("cube_r146", ModelPartBuilder.create().uv(22, 332).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.275F, 3.5316F, 9.6554F, -1.4879F, -0.004F, -3.1284F));

		ModelPartData cube_r147 = bone.addChild("cube_r147", ModelPartBuilder.create().uv(294, 320).cuboid(-2.5F, -3.0F, -1.5F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(22.1086F, 1.4744F, 7.6502F, -1.5752F, -0.0028F, -3.1281F));

		ModelPartData cube_r148 = bone.addChild("cube_r148", ModelPartBuilder.create().uv(294, 315).cuboid(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.1508F, 1.7878F, 6.8183F, -1.8363F, -0.0218F, 3.0711F));

		ModelPartData cube_r149 = bone.addChild("cube_r149", ModelPartBuilder.create().uv(208, 344).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.2981F, 3.0449F, 7.8946F, -1.8351F, -0.0104F, 3.1132F));

		ModelPartData cube_r150 = bone.addChild("cube_r150", ModelPartBuilder.create().uv(344, 18).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(24.2403F, 3.3535F, 4.8649F, -2.0086F, 0.0791F, 3.1046F));

		ModelPartData cube_r151 = bone.addChild("cube_r151", ModelPartBuilder.create().uv(172, 342).cuboid(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(24.3195F, 0.5641F, 2.565F, -2.0071F, 0.0F, 3.1416F));

		ModelPartData cube_r152 = bone.addChild("cube_r152", ModelPartBuilder.create().uv(190, 342).cuboid(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(24.3195F, 3.5641F, 9.565F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r153 = bone.addChild("cube_r153", ModelPartBuilder.create().uv(246, 228).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.3195F, 4.7779F, 4.4993F, 0.6109F, 0.0F, 0.0F));

		ModelPartData cube_r154 = bone.addChild("cube_r154", ModelPartBuilder.create().uv(344, 10).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(24.3195F, 5.2611F, 2.467F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r155 = bone.addChild("cube_r155", ModelPartBuilder.create().uv(136, 174).cuboid(-3.5F, -0.5F, -15.0F, 4.0F, 1.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(23.6354F, 5.2611F, -7.9124F, 0.0F, 0.0F, 0.9163F));

		ModelPartData cube_r156 = bone.addChild("cube_r156", ModelPartBuilder.create().uv(192, 330).cuboid(-1.5F, -0.5F, -3.0F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(23.9194F, 4.3729F, -19.8728F, -0.2464F, -0.0142F, 1.4835F));

		ModelPartData cube_r157 = bone.addChild("cube_r157", ModelPartBuilder.create().uv(118, 222).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.0076F, 5.2611F, 0.1983F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r158 = bone.addChild("cube_r158", ModelPartBuilder.create().uv(126, 30).cuboid(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(23.5445F, 5.3675F, -17.0024F, 0.0666F, 0.2079F, 1.7959F));

		ModelPartData cube_r159 = bone.addChild("cube_r159", ModelPartBuilder.create().uv(250, 342).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(24.1953F, 5.337F, -25.1813F, 0.0F, 0.0F, 2.1817F));

		ModelPartData cube_r160 = bone.addChild("cube_r160", ModelPartBuilder.create().uv(336, 225).cuboid(1.0F, -3.5F, -1.5F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(21.3664F, 2.7089F, -28.0902F, 0.0214F, 0.0742F, 1.4885F));

		ModelPartData cube_r161 = bone.addChild("cube_r161", ModelPartBuilder.create().uv(338, 209).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(24.451F, 3.0987F, -26.1973F, 0.0214F, 0.0742F, 1.4885F));

		ModelPartData cube_r162 = bone.addChild("cube_r162", ModelPartBuilder.create().uv(280, 337).cuboid(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.3053F, 6.7534F, -24.5604F, -2.8849F, 0.1258F, -2.781F));

		ModelPartData cube_r163 = bone.addChild("cube_r163", ModelPartBuilder.create().uv(196, 132).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.4546F, 6.2881F, -25.6661F, -1.6344F, 1.3578F, 1.8609F));

		ModelPartData cube_r164 = bone.addChild("cube_r164", ModelPartBuilder.create().uv(144, 26).cuboid(-1.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.6173F, 4.0292F, -27.1262F, -1.3726F, -0.1542F, -2.5707F));

		ModelPartData cube_r165 = bone.addChild("cube_r165", ModelPartBuilder.create().uv(46, 346).cuboid(-1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(23.8428F, 5.6155F, -30.7656F, -1.5272F, -0.0019F, -3.0107F));

		ModelPartData cube_r166 = bone.addChild("cube_r166", ModelPartBuilder.create().uv(314, 195).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.3898F, 4.5643F, -32.3419F, -2.0068F, -0.0663F, -2.9503F));

		ModelPartData cube_r167 = bone.addChild("cube_r167", ModelPartBuilder.create().uv(140, 317).cuboid(-0.5F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(22.523F, 5.6479F, -43.7202F, -2.9485F, -0.0149F, 1.7114F));

		ModelPartData cube_r168 = bone.addChild("cube_r168", ModelPartBuilder.create().uv(192, 298).cuboid(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(22.6559F, 4.6789F, -43.2365F, 0.1745F, 0.0F, 1.6144F));

		ModelPartData cube_r169 = bone.addChild("cube_r169", ModelPartBuilder.create().uv(136, 142).cuboid(2.5F, -0.5F, 0.0F, 1.0F, 1.0F, 31.0F, new Dilation(0.0F))
				.uv(0, 142).cuboid(1.5F, -0.5F, -5.0F, 1.0F, 1.0F, 33.0F, new Dilation(0.0F))
				.uv(74, 31).cuboid(0.5F, -0.5F, -10.0F, 1.0F, 1.0F, 36.0F, new Dilation(0.0F))
				.uv(0, 68).cuboid(-0.5F, -0.5F, -14.0F, 1.0F, 1.0F, 36.0F, new Dilation(0.0F)), ModelTransform.of(13.1434F, 3.0931F, -41.6116F, 0.2289F, 0.0667F, 0.828F));

		ModelPartData cube_r170 = bone.addChild("cube_r170", ModelPartBuilder.create().uv(148, 116).cuboid(-0.5F, -0.5F, -10.0F, 1.0F, 1.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(13.0738F, 4.1789F, -41.1796F, 0.1555F, 0.1536F, 0.7974F));

		ModelPartData cube_r171 = bone.addChild("cube_r171", ModelPartBuilder.create().uv(192, 13).cuboid(-0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(17.0385F, 1.6131F, -23.258F, 0.0873F, 0.0F, 0.3054F));

		ModelPartData cube_r172 = bone.addChild("cube_r172", ModelPartBuilder.create().uv(312, 293).cuboid(-0.5F, 0.5F, -1.5F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.8028F, 1.2107F, -23.4327F, 0.0475F, 0.644F, -0.4966F));

		ModelPartData cube_r173 = bone.addChild("cube_r173", ModelPartBuilder.create().uv(200, 342).cuboid(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.3131F, 2.1008F, -21.7757F, -0.2783F, 0.6896F, -0.4815F));

		ModelPartData cube_r174 = bone.addChild("cube_r174", ModelPartBuilder.create().uv(188, 140).cuboid(-4.0F, -1.0F, 1.5F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.8075F, 1.8825F, -25.6754F, -0.1328F, 0.5528F, -0.5985F));

		ModelPartData cube_r175 = bone.addChild("cube_r175", ModelPartBuilder.create().uv(176, 140).cuboid(-3.0F, -1.0F, 0.5F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.8075F, 1.8825F, -25.6754F, 0.0475F, 0.644F, -0.4966F));

		ModelPartData cube_r176 = bone.addChild("cube_r176", ModelPartBuilder.create().uv(334, 174).cuboid(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(22.9527F, 2.1856F, -25.6951F, -0.1323F, -0.0976F, 0.8026F));

		ModelPartData cube_r177 = bone.addChild("cube_r177", ModelPartBuilder.create().uv(276, 50).cuboid(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(22.4333F, 2.7667F, -21.3539F, -0.094F, 0.1068F, 0.6534F));

		ModelPartData cube_r178 = bone.addChild("cube_r178", ModelPartBuilder.create().uv(118, 295).cuboid(-11.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(29.9668F, 8.5395F, -25.8766F, -0.1995F, 0.1802F, 0.6777F));

		ModelPartData cube_r179 = bone.addChild("cube_r179", ModelPartBuilder.create().uv(336, 99).cuboid(0.5F, -0.5F, -3.0F, 4.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(21.3279F, 1.3476F, -23.0789F, -0.307F, 0.2975F, 0.7373F));

		ModelPartData cube_r180 = bone.addChild("cube_r180", ModelPartBuilder.create().uv(254, 315).cuboid(-0.5F, 3.5F, 1.0F, 1.0F, 1.0F, 14.0F, new Dilation(0.0F))
				.uv(302, 50).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F))
				.uv(224, 296).cuboid(-0.5F, 1.5F, -5.0F, 1.0F, 1.0F, 18.0F, new Dilation(0.0F))
				.uv(144, 256).cuboid(-0.5F, 0.5F, -9.0F, 1.0F, 1.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(21.3162F, 2.4221F, -38.2017F, 0.124F, -0.1231F, 0.7777F));

		ModelPartData cube_r181 = bone.addChild("cube_r181", ModelPartBuilder.create().uv(334, 156).cuboid(3.5F, -0.5F, 4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
				.uv(318, 13).cuboid(2.5F, -0.5F, 0.0F, 1.0F, 1.0F, 12.0F, new Dilation(0.0F))
				.uv(302, 163).cuboid(1.5F, -0.5F, -3.0F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F))
				.uv(188, 256).cuboid(0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 21.0F, new Dilation(0.0F))
				.uv(124, 203).cuboid(-0.5F, -0.5F, -13.0F, 1.0F, 2.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(21.3162F, 2.4221F, -38.2017F, 0.124F, -0.1231F, 0.7777F));

		ModelPartData cube_r182 = bone.addChild("cube_r182", ModelPartBuilder.create().uv(64, 176).cuboid(-0.5F, -0.5F, -12.5F, 1.0F, 1.0F, 29.0F, new Dilation(0.0F)), ModelTransform.of(22.6442F, 9.5599F, -12.8075F, 0.0F, 0.0F, 0.6981F));

		ModelPartData cube_r183 = bone.addChild("cube_r183", ModelPartBuilder.create().uv(256, 81).cuboid(-1.0F, -1.0F, -9.0F, 1.0F, 1.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(19.8162F, 5.1789F, -40.1193F, 0.1128F, -0.2368F, -0.4498F));

		ModelPartData cube_r184 = bone.addChild("cube_r184", ModelPartBuilder.create().uv(324, 39).cuboid(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(21.8189F, 2.0788F, 14.0224F, -0.3379F, -0.0419F, 0.2908F));

		ModelPartData cube_r185 = bone.addChild("cube_r185", ModelPartBuilder.create().uv(284, 315).cuboid(-0.5F, -24.5F, -2.0F, 1.0F, 29.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(23.4495F, 7.3472F, -0.2082F, 1.5708F, 0.0F, 0.1745F));

		ModelPartData cube_r186 = bone.addChild("cube_r186", ModelPartBuilder.create().uv(118, 206).cuboid(-0.5F, -7.5F, -0.5F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(15.9599F, -1.3523F, 7.7258F, -1.5181F, 0.3365F, 1.5879F));

		ModelPartData cube_r187 = bone.addChild("cube_r187", ModelPartBuilder.create().uv(90, 257).cuboid(-1.5F, -1.5F, -0.5F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.422F, -3.2339F, 2.0257F, 1.5232F, -0.334F, -1.312F));

		ModelPartData cube_r188 = bone.addChild("cube_r188", ModelPartBuilder.create().uv(102, 233).cuboid(-1.5F, -1.5F, 0.5F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.045F, -2.3863F, 1.7591F, 1.3909F, -0.2978F, -0.9654F));

		ModelPartData cube_r189 = bone.addChild("cube_r189", ModelPartBuilder.create().uv(96, 233).cuboid(-1.5F, -1.5F, -0.5F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.759F, -2.4156F, 1.7822F, 1.3066F, -0.1867F, -0.5553F));

		ModelPartData cube_r190 = bone.addChild("cube_r190", ModelPartBuilder.create().uv(192, 0).cuboid(-11.5F, -2.0F, -4.5F, 23.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(9.4524F, 7.8163F, -2.971F, -0.0063F, 0.0F, 0.0432F));

		ModelPartData cube_r191 = bone.addChild("cube_r191", ModelPartBuilder.create().uv(212, 38).cuboid(-17.0F, -0.5F, -7.0F, 23.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(15.6055F, 2.8545F, -1.8003F, 1.4768F, 0.0F, 0.0117F));

		ModelPartData cube_r192 = bone.addChild("cube_r192", ModelPartBuilder.create().uv(96, 249).cuboid(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
				.uv(110, 20).cuboid(-21.0F, -0.5F, -2.0F, 14.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(19.6324F, 0.0F, 0.0F, 0.6476F, -0.0199F, -0.0045F));

		ModelPartData cube_r193 = bone.addChild("cube_r193", ModelPartBuilder.create().uv(110, 26).cuboid(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(15.6363F, -0.8632F, -0.9543F, 1.2148F, -0.0378F, 0.0223F));

		ModelPartData cube_r194 = bone.addChild("cube_r194", ModelPartBuilder.create().uv(124, 176).cuboid(-2.0F, -3.0F, -1.0F, 1.0F, 15.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(19.6544F, 1.0368F, 2.127F, 1.2148F, -0.0378F, -0.065F));

		ModelPartData cube_r195 = bone.addChild("cube_r195", ModelPartBuilder.create().uv(296, 50).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(21.6544F, 2.0368F, 0.127F, 0.6912F, -0.0653F, -0.0374F));
		return TexturedModelData.of(modelData, 512, 512);
	}
	@Override
	public void setAngles(VehicleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		poseStack.push();
		/*float angleInRadians = (float) Math.PI; // 180 degrees
		Quaternionf rotation = new Quaternionf();
		rotation.rotateY(angleInRadians);
		poseStack.multiply(rotation);*/
		float scale = 1.75f;
		poseStack.scale(scale,scale,scale);
		poseStack.translate(0, -1.22, -0.2);
		main1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		poseStack.pop();
	}
}