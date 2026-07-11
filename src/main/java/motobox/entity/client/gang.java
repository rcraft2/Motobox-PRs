// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package motobox.entity.client;

import motobox.entity.custom.GangEntity;
import net.elidhan.anim_guns.item.ModItems;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.CrossbowPosing;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import org.joml.Quaternionf;

import javax.swing.text.Document;

public class gang<T extends GangEntity> extends BipedEntityModel<T> {
//	private final ModelPart bb_main;
private final ModelPart head;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart body;

	public gang(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.body = root.getChild("body");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = BipedEntityModel.getModelData(Dilation.NONE, 0.0F);
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.5F, -6.8F, -4.5F, 9.0F, 2.0F, 9.0F, new Dilation(0.0F))
				.uv(27, 0).cuboid(-3.5F, -7.8F, -3.5F, 7.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(0, 11).cuboid(-4.0F, -30.0F, -4.0F, 8.0F, 6.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create().uv(40, 8).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create().uv(28, 37).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(12, 37).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.9F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(0, 25).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, 12.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(24, 21).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(0, 11).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.634F, 2.366F, -2.0F, 1.0472F, 1.5708F, 0.0F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(0, 7).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.366F, 2.366F, -2.0F, -1.0472F, 1.5708F, 0.0F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -1.5321F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.666F, 3.2321F, -2.0F, -1.5708F, 1.5708F, 0.0F));

		ModelPartData cube_r5 = body.addChild("cube_r5", ModelPartBuilder.create().uv(3, 3).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.366F, 1.366F, -2.0F, -0.5236F, 1.5708F, 0.0F));

		ModelPartData cube_r6 = body.addChild("cube_r6", ModelPartBuilder.create().uv(4, 11).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.7321F, 1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r7 = body.addChild("cube_r7", ModelPartBuilder.create().uv(4, 0).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.634F, 1.366F, -2.0F, 0.5236F, 1.5708F, 0.0F));

		ModelPartData cube_r8 = body.addChild("cube_r8", ModelPartBuilder.create().uv(3, 6).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	public void animateModel(T mobEntity, float f, float g, float h) {
		this.rightArmPose = ArmPose.EMPTY;
		this.leftArmPose = ArmPose.EMPTY;
		ItemStack itemStack = mobEntity.getStackInHand(Hand.MAIN_HAND);
		if (itemStack.isOf(ModItems.MACHINE_PISTOL) && mobEntity.isAttacking()) {
			if (mobEntity.getMainArm() == Arm.RIGHT) {
				this.rightArmPose = ArmPose.BOW_AND_ARROW;
			} else {
				this.leftArmPose = ArmPose.BOW_AND_ARROW;
			}
		}

		super.animateModel(mobEntity, f, g, h);
	}
	@Override
	public void setAngles(T mobEntity, float f, float g, float h, float i, float j) {
		super.setAngles(mobEntity, f, g, h, i, j);
		ItemStack itemStack = mobEntity.getMainHandStack();
		if (mobEntity.isAttacking() && (itemStack.isEmpty() || !itemStack.isOf(ModItems.MACHINE_PISTOL))) {
			float k = MathHelper.sin(this.handSwingProgress * 3.1415927F);
			float l = MathHelper.sin((1.0F - (1.0F - this.handSwingProgress) * (1.0F - this.handSwingProgress)) * 3.1415927F);
			this.rightArm.roll = 0.0F;
			this.leftArm.roll = 0.0F;
			this.rightArm.yaw = -(0.1F - k * 0.6F);
			this.leftArm.yaw = 0.1F - k * 0.6F;
			this.rightArm.pitch = -1.5707964F;
			this.leftArm.pitch = -1.5707964F;
			ModelPart var10000 = this.rightArm;
			var10000.pitch -= k * 1.2F - l * 0.4F;
			var10000 = this.leftArm;
			var10000.pitch -= k * 1.2F - l * 0.4F;
			CrossbowPosing.swingArms(this.rightArm, this.leftArm, h);
		}

	}

	public void setArmAngle(Arm arm, MatrixStack matrices) {
		float f = arm == Arm.RIGHT ? 1.0F : -1.0F;
		ModelPart modelPart = this.getArm(arm);
		modelPart.pivotX += f;
		modelPart.rotate(matrices);
		modelPart.pivotX -= f;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
	//	bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.push();
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		right_arm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		left_arm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		left_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		right_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	/*@Override
	public ModelPart getPart() {
		return bb_main;
	}*/
}