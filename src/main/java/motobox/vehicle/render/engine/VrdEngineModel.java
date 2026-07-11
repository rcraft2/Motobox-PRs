// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package motobox.vehicle.render.engine;


import motobox.Motobox;
import motobox.entity.VehicleEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;

public class VrdEngineModel extends EntityModel<VehicleEntity> {
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("vrd_engine"), "main");
	private final ModelPart engine;
	public VrdEngineModel(EntityRendererFactory.Context ctx) {
		this.engine = ctx.getPart(MODEL_LAYER).getChild("engine");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData engine = modelPartData.addChild("engine", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData tube4 = engine.addChild("tube4", ModelPartBuilder.create().uv(57, 56).cuboid(0.9674F, -2.6579F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9674F, -15.3421F, -6.0F));

		ModelPartData cube_r1 = tube4.addChild("cube_r1", ModelPartBuilder.create().uv(0, 24).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r2 = tube4.addChild("cube_r2", ModelPartBuilder.create().uv(25, 24).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.6147F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r3 = tube4.addChild("cube_r3", ModelPartBuilder.create().uv(0, 28).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.6799F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r4 = tube4.addChild("cube_r4", ModelPartBuilder.create().uv(25, 28).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.505F, 1.4277F, 0.0F, 0.0F, 0.0F, -0.8727F));

		ModelPartData cube_r5 = tube4.addChild("cube_r5", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.4398F, 1.4277F, 0.0F, 0.0F, 0.0F, 0.8727F));

		ModelPartData cube_r6 = tube4.addChild("cube_r6", ModelPartBuilder.create().uv(25, 32).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.9348F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData bone = engine.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(3.0F, 2.1924F, -13.0F, 10.0F, 9.0F, 15.0F, new Dilation(0.0F))
		.uv(8, 61).cuboid(15.1213F, -0.8076F, -11.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 58).cuboid(15.1213F, -0.8076F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(109, 0).cuboid(15.1213F, -1.8076F, -13.0F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, -0.8076F, -11.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(71, 19).cuboid(0.0F, -1.8076F, -13.0F, 1.0F, 1.0F, 15.0F, new Dilation(0.0F))
		.uv(0, 6).cuboid(0.0F, -0.8076F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, -14.1924F, 4.0F));

		ModelPartData cube_r7 = bone.addChild("cube_r7", ModelPartBuilder.create().uv(0, 24).cuboid(-1.0F, -4.0F, -1.0F, 5.0F, 8.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 5.1924F, -12.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r8 = bone.addChild("cube_r8", ModelPartBuilder.create().uv(135, 39).cuboid(-3.0F, 0.0F, -1.0F, 2.0F, 5.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(4.3576F, 5.5217F, -12.0F, 0.0F, 0.0F, -0.3054F));

		ModelPartData cube_r9 = bone.addChild("cube_r9", ModelPartBuilder.create().uv(135, 59).cuboid(-3.0F, 0.0F, -1.0F, 2.0F, 5.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(15.4572F, 6.7245F, -12.0F, 0.0F, 0.0F, 0.3054F));

		ModelPartData cube_r10 = bone.addChild("cube_r10", ModelPartBuilder.create().uv(25, 32).cuboid(-1.0F, -4.0F, -1.0F, 5.0F, 8.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(13.0F, 3.1924F, -12.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData tube = engine.addChild("tube", ModelPartBuilder.create().uv(25, 59).cuboid(0.9674F, -2.6579F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9674F, -15.3421F, 0.0F));

		ModelPartData cube_r11 = tube.addChild("cube_r11", ModelPartBuilder.create().uv(52, 18).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r12 = tube.addChild("cube_r12", ModelPartBuilder.create().uv(51, 0).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.6147F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r13 = tube.addChild("cube_r13", ModelPartBuilder.create().uv(52, 4).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.6799F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r14 = tube.addChild("cube_r14", ModelPartBuilder.create().uv(52, 8).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.505F, 1.4277F, 0.0F, 0.0F, 0.0F, -0.8727F));

		ModelPartData cube_r15 = tube.addChild("cube_r15", ModelPartBuilder.create().uv(52, 12).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.4398F, 1.4277F, 0.0F, 0.0F, 0.0F, 0.8727F));

		ModelPartData cube_r16 = tube.addChild("cube_r16", ModelPartBuilder.create().uv(0, 55).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.9348F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData engineside = engine.addChild("engineside", ModelPartBuilder.create().uv(23, 67).cuboid(12.0F, 7.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 67).cuboid(6.0F, 7.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 67).cuboid(12.0F, 4.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 67).cuboid(9.0F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 67).cuboid(3.0F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 67).cuboid(5.0F, 5.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -12.0F, 3.0F));

		ModelPartData cube_r17 = engineside.addChild("cube_r17", ModelPartBuilder.create().uv(0, 12).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(35, 12).cuboid(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-1.0F, -1.0F, -7.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(25, 36).cuboid(-1.0F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r18 = engineside.addChild("cube_r18", ModelPartBuilder.create().uv(11, 11).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3527F, -0.3326F, -0.7256F));

		ModelPartData cube_r19 = engineside.addChild("cube_r19", ModelPartBuilder.create().uv(11, 13).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5662F, -0.798F, 0.4154F, -0.1553F, -0.456F, -1.2293F));

		ModelPartData cube_r20 = engineside.addChild("cube_r20", ModelPartBuilder.create().uv(37, 30).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9737F, -0.47F, 0.2447F, 0.1339F, -0.4623F, -1.8642F));

		ModelPartData cube_r21 = engineside.addChild("cube_r21", ModelPartBuilder.create().uv(47, 25).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0978F, 4.6524F, -1.0448F, -0.118F, -0.0208F, 1.1658F));

		ModelPartData cube_r22 = engineside.addChild("cube_r22", ModelPartBuilder.create().uv(49, 0).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5054F, 4.6117F, -0.8558F, -0.092F, -0.0769F, 0.6445F));

		ModelPartData cube_r23 = engineside.addChild("cube_r23", ModelPartBuilder.create().uv(6, 12).cuboid(-3.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.8532F, 3.8992F, -0.6782F, -0.046F, -0.1106F, 0.1636F));

		ModelPartData cube_r24 = engineside.addChild("cube_r24", ModelPartBuilder.create().uv(31, 55).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -3.0F, -0.3527F, -0.3326F, -0.7256F));

		ModelPartData cube_r25 = engineside.addChild("cube_r25", ModelPartBuilder.create().uv(44, 55).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5662F, -0.798F, -2.5846F, -0.1553F, -0.456F, -1.2293F));

		ModelPartData cube_r26 = engineside.addChild("cube_r26", ModelPartBuilder.create().uv(59, 0).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9737F, -0.47F, -2.7553F, 0.1339F, -0.4623F, -1.8642F));

		ModelPartData cube_r27 = engineside.addChild("cube_r27", ModelPartBuilder.create().uv(60, 18).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0978F, 4.6524F, -4.0448F, -0.118F, -0.0208F, 1.1658F));

		ModelPartData cube_r28 = engineside.addChild("cube_r28", ModelPartBuilder.create().uv(48, 60).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5054F, 4.6117F, -3.8558F, -0.092F, -0.0769F, 0.6445F));

		ModelPartData cube_r29 = engineside.addChild("cube_r29", ModelPartBuilder.create().uv(8, 24).cuboid(-3.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.8532F, 3.8992F, -3.6782F, -0.046F, -0.1106F, 0.1636F));

		ModelPartData cube_r30 = engineside.addChild("cube_r30", ModelPartBuilder.create().uv(12, 61).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -6.0F, -0.3527F, -0.3326F, -0.7256F));

		ModelPartData cube_r31 = engineside.addChild("cube_r31", ModelPartBuilder.create().uv(61, 15).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5662F, -0.798F, -5.5846F, -0.1553F, -0.456F, -1.2293F));

		ModelPartData cube_r32 = engineside.addChild("cube_r32", ModelPartBuilder.create().uv(19, 61).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9737F, -0.47F, -5.7553F, 0.1339F, -0.4623F, -1.8642F));

		ModelPartData cube_r33 = engineside.addChild("cube_r33", ModelPartBuilder.create().uv(22, 62).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0978F, 4.6524F, -7.0448F, -0.118F, -0.0208F, 1.1658F));

		ModelPartData cube_r34 = engineside.addChild("cube_r34", ModelPartBuilder.create().uv(32, 62).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5054F, 4.6117F, -6.8558F, -0.092F, -0.0769F, 0.6445F));

		ModelPartData cube_r35 = engineside.addChild("cube_r35", ModelPartBuilder.create().uv(43, 0).cuboid(-3.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.8532F, 3.8992F, -6.6782F, -0.046F, -0.1106F, 0.1636F));

		ModelPartData cube_r36 = engineside.addChild("cube_r36", ModelPartBuilder.create().uv(8, 47).cuboid(-3.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.8532F, 3.8992F, -9.6782F, -0.046F, -0.1106F, 0.1636F));

		ModelPartData cube_r37 = engineside.addChild("cube_r37", ModelPartBuilder.create().uv(63, 0).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5054F, 4.6117F, -9.8558F, -0.092F, -0.0769F, 0.6445F));

		ModelPartData cube_r38 = engineside.addChild("cube_r38", ModelPartBuilder.create().uv(63, 25).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0978F, 4.6524F, -10.0448F, -0.118F, -0.0208F, 1.1658F));

		ModelPartData cube_r39 = engineside.addChild("cube_r39", ModelPartBuilder.create().uv(63, 56).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9737F, -0.47F, -8.7553F, 0.1339F, -0.4623F, -1.8642F));

		ModelPartData cube_r40 = engineside.addChild("cube_r40", ModelPartBuilder.create().uv(64, 2).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5662F, -0.798F, -8.5846F, -0.1553F, -0.456F, -1.2293F));

		ModelPartData cube_r41 = engineside.addChild("cube_r41", ModelPartBuilder.create().uv(64, 6).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -9.0F, -0.3527F, -0.3326F, -0.7256F));

		ModelPartData cube_r42 = engineside.addChild("cube_r42", ModelPartBuilder.create().uv(8, 0).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 34).cuboid(-2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 10).cuboid(-2.0F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(19, 47).cuboid(-2.0F, -1.0F, 8.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.5744F, 2.5247F, -9.0F, 0.0F, 0.0F, -2.138F));

		ModelPartData cube_r43 = engineside.addChild("cube_r43", ModelPartBuilder.create().uv(8, 6).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(33, 30).cuboid(-2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 6).cuboid(-2.0F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 38).cuboid(-2.0F, -1.0F, 8.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.7942F, 1.9509F, -9.0F, 0.0F, 0.0F, -1.5272F));

		ModelPartData cube_r44 = engineside.addChild("cube_r44", ModelPartBuilder.create().uv(8, 26).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 30).cuboid(-2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(33, 34).cuboid(-2.0F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 42).cuboid(-2.0F, -1.0F, 8.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.0853F, 1.5163F, -9.0F, 0.0F, 0.0F, -1.1345F));

		ModelPartData cube_r45 = engineside.addChild("cube_r45", ModelPartBuilder.create().uv(8, 49).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 53).cuboid(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(19, 53).cuboid(-1.0F, -1.0F, -7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(25, 55).cuboid(-1.0F, -1.0F, -10.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r46 = engineside.addChild("cube_r46", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.9216F, 5.5035F, 4.8992F, 0.4548F, -0.276F, -1.7033F));

		ModelPartData cube_r47 = engineside.addChild("cube_r47", ModelPartBuilder.create().uv(133, 90).cuboid(-2.0F, -1.0F, -8.0F, 2.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.0F, -3.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r48 = engineside.addChild("cube_r48", ModelPartBuilder.create().uv(41, 25).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(50, 44).cuboid(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 32).cuboid(-1.0F, -1.0F, -7.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(38, 59).cuboid(-1.0F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r49 = engineside.addChild("cube_r49", ModelPartBuilder.create().uv(64, 27).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, 0.0F, 0.0F, -0.3527F, 0.3326F, 0.7256F));

		ModelPartData cube_r50 = engineside.addChild("cube_r50", ModelPartBuilder.create().uv(64, 20).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.5662F, -0.798F, 0.4154F, -0.1553F, 0.456F, 1.2293F));

		ModelPartData cube_r51 = engineside.addChild("cube_r51", ModelPartBuilder.create().uv(64, 18).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.9737F, -0.47F, 0.2447F, 0.1339F, 0.4623F, 1.8642F));

		ModelPartData cube_r52 = engineside.addChild("cube_r52", ModelPartBuilder.create().uv(64, 14).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.0978F, 4.6524F, -1.0448F, -0.118F, 0.0208F, -1.1658F));

		ModelPartData cube_r53 = engineside.addChild("cube_r53", ModelPartBuilder.create().uv(64, 10).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.4946F, 4.6117F, -0.8558F, -0.092F, 0.0769F, -0.6445F));

		ModelPartData cube_r54 = engineside.addChild("cube_r54", ModelPartBuilder.create().uv(19, 51).cuboid(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1468F, 3.8992F, -0.6782F, -0.046F, 0.1106F, -0.1636F));

		ModelPartData cube_r55 = engineside.addChild("cube_r55", ModelPartBuilder.create().uv(8, 65).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, 0.0F, -3.0F, -0.3527F, 0.3326F, 0.7256F));

		ModelPartData cube_r56 = engineside.addChild("cube_r56", ModelPartBuilder.create().uv(4, 65).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.5662F, -0.798F, -2.5846F, -0.1553F, 0.456F, 1.2293F));

		ModelPartData cube_r57 = engineside.addChild("cube_r57", ModelPartBuilder.create().uv(0, 65).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.9737F, -0.47F, -2.7553F, 0.1339F, 0.4623F, 1.8642F));

		ModelPartData cube_r58 = engineside.addChild("cube_r58", ModelPartBuilder.create().uv(64, 36).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.0978F, 4.6524F, -4.0448F, -0.118F, 0.0208F, -1.1658F));

		ModelPartData cube_r59 = engineside.addChild("cube_r59", ModelPartBuilder.create().uv(64, 31).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.4946F, 4.6117F, -3.8558F, -0.092F, 0.0769F, -0.6445F));

		ModelPartData cube_r60 = engineside.addChild("cube_r60", ModelPartBuilder.create().uv(52, 22).cuboid(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1468F, 3.8992F, -3.6782F, -0.046F, 0.1106F, -0.1636F));

		ModelPartData cube_r61 = engineside.addChild("cube_r61", ModelPartBuilder.create().uv(31, 65).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, 0.0F, -6.0F, -0.3527F, 0.3326F, 0.7256F));

		ModelPartData cube_r62 = engineside.addChild("cube_r62", ModelPartBuilder.create().uv(27, 65).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.5662F, -0.798F, -5.5846F, -0.1553F, 0.456F, 1.2293F));

		ModelPartData cube_r63 = engineside.addChild("cube_r63", ModelPartBuilder.create().uv(23, 65).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.9737F, -0.47F, -5.7553F, 0.1339F, 0.4623F, 1.8642F));

		ModelPartData cube_r64 = engineside.addChild("cube_r64", ModelPartBuilder.create().uv(19, 65).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.0978F, 4.6524F, -7.0448F, -0.118F, 0.0208F, -1.1658F));

		ModelPartData cube_r65 = engineside.addChild("cube_r65", ModelPartBuilder.create().uv(12, 65).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.4946F, 4.6117F, -6.8558F, -0.092F, 0.0769F, -0.6445F));

		ModelPartData cube_r66 = engineside.addChild("cube_r66", ModelPartBuilder.create().uv(57, 25).cuboid(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1468F, 3.8992F, -6.6782F, -0.046F, 0.1106F, -0.1636F));

		ModelPartData cube_r67 = engineside.addChild("cube_r67", ModelPartBuilder.create().uv(58, 36).cuboid(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.1468F, 3.8992F, -9.6782F, -0.046F, 0.1106F, -0.1636F));

		ModelPartData cube_r68 = engineside.addChild("cube_r68", ModelPartBuilder.create().uv(65, 62).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(17.4946F, 4.6117F, -9.8558F, -0.092F, 0.0769F, -0.6445F));

		ModelPartData cube_r69 = engineside.addChild("cube_r69", ModelPartBuilder.create().uv(38, 66).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.0978F, 4.6524F, -10.0448F, -0.118F, 0.0208F, -1.1658F));

		ModelPartData cube_r70 = engineside.addChild("cube_r70", ModelPartBuilder.create().uv(48, 66).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.9737F, -0.47F, -8.7553F, 0.1339F, 0.4623F, 1.8642F));

		ModelPartData cube_r71 = engineside.addChild("cube_r71", ModelPartBuilder.create().uv(63, 66).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.5662F, -0.798F, -8.5846F, -0.1553F, 0.456F, 1.2293F));

		ModelPartData cube_r72 = engineside.addChild("cube_r72", ModelPartBuilder.create().uv(66, 65).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, 0.0F, -9.0F, -0.3527F, 0.3326F, 0.7256F));

		ModelPartData cube_r73 = engineside.addChild("cube_r73", ModelPartBuilder.create().uv(60, 10).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 20).cuboid(1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(38, 62).cuboid(1.0F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(63, 58).cuboid(1.0F, -1.0F, 8.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(19.5744F, 2.5247F, -9.0F, 0.0F, 0.0F, 2.138F));

		ModelPartData cube_r74 = engineside.addChild("cube_r74", ModelPartBuilder.create().uv(60, 6).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(44, 60).cuboid(1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 62).cuboid(1.0F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(42, 64).cuboid(1.0F, -1.0F, 8.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.7942F, 1.9509F, -9.0F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r75 = engineside.addChild("cube_r75", ModelPartBuilder.create().uv(60, 2).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(57, 60).cuboid(1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(61, 62).cuboid(1.0F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(57, 64).cuboid(1.0F, -1.0F, 8.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.0853F, 1.5163F, -9.0F, 0.0F, 0.0F, 1.1345F));

		ModelPartData cube_r76 = engineside.addChild("cube_r76", ModelPartBuilder.create().uv(38, 55).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(46, 56).cuboid(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 57).cuboid(-1.0F, -1.0F, -7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(19, 57).cuboid(-1.0F, -1.0F, -10.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r77 = engineside.addChild("cube_r77", ModelPartBuilder.create().uv(0, 6).cuboid(0.0F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(19.9216F, 5.5035F, 4.8992F, 0.4548F, 0.276F, 1.7033F));

		ModelPartData cube_r78 = engineside.addChild("cube_r78", ModelPartBuilder.create().uv(133, 108).cuboid(0.0F, -1.0F, -8.0F, 2.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, 4.0F, -3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData pipe2 = engine.addChild("pipe2", ModelPartBuilder.create().uv(114, 54).cuboid(0.866F, 2.2321F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(114, 36).cuboid(0.866F, -0.5F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.866F, -7.2321F, 0.0F));

		ModelPartData cube_r79 = pipe2.addChild("cube_r79", ModelPartBuilder.create().uv(95, 55).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		ModelPartData cube_r80 = pipe2.addChild("cube_r80", ModelPartBuilder.create().uv(95, 73).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.866F, 0.0F, 0.0F, 0.0F, 2.0944F));

		ModelPartData cube_r81 = pipe2.addChild("cube_r81", ModelPartBuilder.create().uv(95, 91).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.866F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r82 = pipe2.addChild("cube_r82", ModelPartBuilder.create().uv(0, 101).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.7321F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r83 = pipe2.addChild("cube_r83", ModelPartBuilder.create().uv(105, 18).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.866F, 3.2321F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r84 = pipe2.addChild("cube_r84", ModelPartBuilder.create().uv(76, 108).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 0.0F, 0.0F, 0.0F, 0.0F, -2.618F));

		ModelPartData cube_r85 = pipe2.addChild("cube_r85", ModelPartBuilder.create().uv(19, 109).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(3.2321F, 0.866F, 0.0F, 0.0F, 0.0F, -2.0944F));

		ModelPartData cube_r86 = pipe2.addChild("cube_r86", ModelPartBuilder.create().uv(95, 109).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.2321F, 0.866F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r87 = pipe2.addChild("cube_r87", ModelPartBuilder.create().uv(38, 110).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 2.7321F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r88 = pipe2.addChild("cube_r88", ModelPartBuilder.create().uv(57, 111).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(1.866F, 3.2321F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData pipe6 = engine.addChild("pipe6", ModelPartBuilder.create().uv(51, 67).cuboid(0.866F, 2.2321F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(67, 49).cuboid(0.866F, -0.5F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.866F, -10.2321F, 0.0F));

		ModelPartData cube_r89 = pipe6.addChild("cube_r89", ModelPartBuilder.create().uv(68, 63).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		ModelPartData cube_r90 = pipe6.addChild("cube_r90", ModelPartBuilder.create().uv(27, 67).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.866F, 0.0F, 0.0F, 0.0F, 2.0944F));

		ModelPartData cube_r91 = pipe6.addChild("cube_r91", ModelPartBuilder.create().uv(31, 67).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.866F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r92 = pipe6.addChild("cube_r92", ModelPartBuilder.create().uv(67, 37).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.7321F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r93 = pipe6.addChild("cube_r93", ModelPartBuilder.create().uv(67, 39).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.866F, 3.2321F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r94 = pipe6.addChild("cube_r94", ModelPartBuilder.create().uv(0, 69).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 0.0F, 0.0F, 0.0F, 0.0F, -2.618F));

		ModelPartData cube_r95 = pipe6.addChild("cube_r95", ModelPartBuilder.create().uv(67, 41).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.2321F, 0.866F, 0.0F, 0.0F, 0.0F, -2.0944F));

		ModelPartData cube_r96 = pipe6.addChild("cube_r96", ModelPartBuilder.create().uv(67, 43).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.2321F, 0.866F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r97 = pipe6.addChild("cube_r97", ModelPartBuilder.create().uv(67, 45).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 2.7321F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r98 = pipe6.addChild("cube_r98", ModelPartBuilder.create().uv(67, 47).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.866F, 3.2321F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData pipe5 = engine.addChild("pipe5", ModelPartBuilder.create().uv(68, 61).cuboid(0.866F, 2.2321F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(61, 68).cuboid(0.866F, -0.5F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.866F, -7.2321F, 0.0F));

		ModelPartData cube_r99 = pipe5.addChild("cube_r99", ModelPartBuilder.create().uv(4, 69).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		ModelPartData cube_r100 = pipe5.addChild("cube_r100", ModelPartBuilder.create().uv(67, 51).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.866F, 0.0F, 0.0F, 0.0F, 2.0944F));

		ModelPartData cube_r101 = pipe5.addChild("cube_r101", ModelPartBuilder.create().uv(67, 56).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.866F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r102 = pipe5.addChild("cube_r102", ModelPartBuilder.create().uv(67, 58).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.7321F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r103 = pipe5.addChild("cube_r103", ModelPartBuilder.create().uv(66, 67).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.866F, 3.2321F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r104 = pipe5.addChild("cube_r104", ModelPartBuilder.create().uv(8, 69).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 0.0F, 0.0F, 0.0F, 0.0F, -2.618F));

		ModelPartData cube_r105 = pipe5.addChild("cube_r105", ModelPartBuilder.create().uv(38, 68).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.2321F, 0.866F, 0.0F, 0.0F, 0.0F, -2.0944F));

		ModelPartData cube_r106 = pipe5.addChild("cube_r106", ModelPartBuilder.create().uv(42, 68).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.2321F, 0.866F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r107 = pipe5.addChild("cube_r107", ModelPartBuilder.create().uv(46, 68).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 2.7321F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r108 = pipe5.addChild("cube_r108", ModelPartBuilder.create().uv(57, 68).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.866F, 3.2321F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData pipe4 = engine.addChild("pipe4", ModelPartBuilder.create().uv(19, 73).cuboid(0.866F, 2.2321F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(71, 1).cuboid(0.866F, -0.5F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(1.134F, -14.2321F, 0.0F));

		ModelPartData cube_r109 = pipe4.addChild("cube_r109", ModelPartBuilder.create().uv(33, 7).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		ModelPartData cube_r110 = pipe4.addChild("cube_r110", ModelPartBuilder.create().uv(0, 47).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.866F, 0.0F, 0.0F, 0.0F, 2.0944F));

		ModelPartData cube_r111 = pipe4.addChild("cube_r111", ModelPartBuilder.create().uv(48, 38).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.866F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r112 = pipe4.addChild("cube_r112", ModelPartBuilder.create().uv(52, 0).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.7321F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r113 = pipe4.addChild("cube_r113", ModelPartBuilder.create().uv(52, 18).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.866F, 3.2321F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r114 = pipe4.addChild("cube_r114", ModelPartBuilder.create().uv(19, 55).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 0.0F, 0.0F, 0.0F, 0.0F, -2.618F));

		ModelPartData cube_r115 = pipe4.addChild("cube_r115", ModelPartBuilder.create().uv(38, 56).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(3.2321F, 0.866F, 0.0F, 0.0F, 0.0F, -2.0944F));

		ModelPartData cube_r116 = pipe4.addChild("cube_r116", ModelPartBuilder.create().uv(57, 57).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.2321F, 0.866F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r117 = pipe4.addChild("cube_r117", ModelPartBuilder.create().uv(0, 65).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 2.7321F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r118 = pipe4.addChild("cube_r118", ModelPartBuilder.create().uv(67, 36).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(1.866F, 3.2321F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData pipe = engine.addChild("pipe", ModelPartBuilder.create().uv(133, 19).cuboid(0.866F, 2.2321F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(76, 126).cuboid(0.866F, -0.5F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(5.134F, -7.2321F, 0.0F));

		ModelPartData cube_r119 = pipe.addChild("cube_r119", ModelPartBuilder.create().uv(124, 1).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		ModelPartData cube_r120 = pipe.addChild("cube_r120", ModelPartBuilder.create().uv(0, 119).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.866F, 0.0F, 0.0F, 0.0F, 2.0944F));

		ModelPartData cube_r121 = pipe.addChild("cube_r121", ModelPartBuilder.create().uv(114, 108).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.866F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r122 = pipe.addChild("cube_r122", ModelPartBuilder.create().uv(114, 90).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.7321F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r123 = pipe.addChild("cube_r123", ModelPartBuilder.create().uv(114, 72).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.866F, 3.2321F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r124 = pipe.addChild("cube_r124", ModelPartBuilder.create().uv(114, 126).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 0.0F, 0.0F, 0.0F, 0.0F, -2.618F));

		ModelPartData cube_r125 = pipe.addChild("cube_r125", ModelPartBuilder.create().uv(19, 127).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(3.2321F, 0.866F, 0.0F, 0.0F, 0.0F, -2.0944F));

		ModelPartData cube_r126 = pipe.addChild("cube_r126", ModelPartBuilder.create().uv(95, 127).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.2321F, 0.866F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r127 = pipe.addChild("cube_r127", ModelPartBuilder.create().uv(38, 128).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 2.7321F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r128 = pipe.addChild("cube_r128", ModelPartBuilder.create().uv(57, 129).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(1.866F, 3.2321F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData pipe3 = engine.addChild("pipe3", ModelPartBuilder.create().uv(95, 37).cuboid(0.866F, 2.2321F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(57, 93).cuboid(0.866F, -0.5F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.866F, -14.2321F, 0.0F));

		ModelPartData cube_r129 = pipe3.addChild("cube_r129", ModelPartBuilder.create().uv(38, 74).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		ModelPartData cube_r130 = pipe3.addChild("cube_r130", ModelPartBuilder.create().uv(57, 75).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.866F, 0.0F, 0.0F, 0.0F, 2.0944F));

		ModelPartData cube_r131 = pipe3.addChild("cube_r131", ModelPartBuilder.create().uv(76, 54).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.866F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r132 = pipe3.addChild("cube_r132", ModelPartBuilder.create().uv(76, 72).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.7321F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData cube_r133 = pipe3.addChild("cube_r133", ModelPartBuilder.create().uv(0, 83).cuboid(-1.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.866F, 3.2321F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r134 = pipe3.addChild("cube_r134", ModelPartBuilder.create().uv(86, 19).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 0.0F, 0.0F, 0.0F, 0.0F, -2.618F));

		ModelPartData cube_r135 = pipe3.addChild("cube_r135", ModelPartBuilder.create().uv(90, 0).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(3.2321F, 0.866F, 0.0F, 0.0F, 0.0F, -2.0944F));

		ModelPartData cube_r136 = pipe3.addChild("cube_r136", ModelPartBuilder.create().uv(76, 90).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.2321F, 0.866F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r137 = pipe3.addChild("cube_r137", ModelPartBuilder.create().uv(19, 91).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(2.7321F, 2.7321F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData cube_r138 = pipe3.addChild("cube_r138", ModelPartBuilder.create().uv(38, 92).cuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(1.866F, 3.2321F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData tube3 = engine.addChild("tube3", ModelPartBuilder.create().uv(58, 27).cuboid(0.9674F, -2.6579F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9674F, -15.3421F, 3.0F));

		ModelPartData cube_r139 = tube3.addChild("cube_r139", ModelPartBuilder.create().uv(33, 26).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r140 = tube3.addChild("cube_r140", ModelPartBuilder.create().uv(35, 0).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.6147F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r141 = tube3.addChild("cube_r141", ModelPartBuilder.create().uv(35, 4).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.6799F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r142 = tube3.addChild("cube_r142", ModelPartBuilder.create().uv(35, 8).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.505F, 1.4277F, 0.0F, 0.0F, 0.0F, -0.8727F));

		ModelPartData cube_r143 = tube3.addChild("cube_r143", ModelPartBuilder.create().uv(41, 28).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.4398F, 1.4277F, 0.0F, 0.0F, 0.0F, 0.8727F));

		ModelPartData cube_r144 = tube3.addChild("cube_r144", ModelPartBuilder.create().uv(43, 2).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.9348F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData tube2 = engine.addChild("tube2", ModelPartBuilder.create().uv(0, 59).cuboid(0.9674F, -2.6579F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9674F, -15.3421F, -3.0F));

		ModelPartData cube_r145 = tube2.addChild("cube_r145", ModelPartBuilder.create().uv(0, 47).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r146 = tube2.addChild("cube_r146", ModelPartBuilder.create().uv(49, 25).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.6147F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r147 = tube2.addChild("cube_r147", ModelPartBuilder.create().uv(50, 30).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.6799F, 2.9081F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r148 = tube2.addChild("cube_r148", ModelPartBuilder.create().uv(50, 36).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.505F, 1.4277F, 0.0F, 0.0F, 0.0F, -0.8727F));

		ModelPartData cube_r149 = tube2.addChild("cube_r149", ModelPartBuilder.create().uv(50, 40).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.4398F, 1.4277F, 0.0F, 0.0F, 0.0F, 0.8727F));

		ModelPartData cube_r150 = tube2.addChild("cube_r150", ModelPartBuilder.create().uv(0, 51).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.9348F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(VehicleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		matrices.push();
		float scale = 0.7f;
		matrices.scale(scale,scale,scale);
		matrices.translate(0, -1.4, 0);
		engine.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}
}