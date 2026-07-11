// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package motobox.vehicle.render.frame;

import motobox.Motobox;
import motobox.entity.VehicleEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;

public class veloce_e1 extends EntityModel<VehicleEntity> {
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Motobox.id("frame_veloce_e1"), "main");
	private final ModelPart frame;

	public veloce_e1(EntityRendererFactory.Context context) {
		this(context.getPart(MODEL_LAYER));
	}

	private veloce_e1(ModelPart root) {
		super(RenderLayer::getEntityTranslucent);
		this.frame = root.getChild("frame");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData frame = modelPartData.addChild("frame", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData details = frame.addChild("details", ModelPartBuilder.create().uv(122, 210).cuboid(31.1F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 210).cuboid(31.1F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(196, 210).cuboid(-0.1F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(200, 210).cuboid(-0.1F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-16.0F, -2.0F, 9.0F));

		ModelPartData interior = frame.addChild("interior", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = interior.addChild("cube_r1", ModelPartBuilder.create().uv(90, 210).cuboid(4.0F, -2.5F, -1.9F, 10.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -13.0F, -8.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r2 = interior.addChild("cube_r2", ModelPartBuilder.create().uv(130, 159).cuboid(-11.0F, -1.5F, -2.0F, 26.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -13.0F, -8.0F, 0.2182F, 0.0F, 0.0F));

		ModelPartData back = frame.addChild("back", ModelPartBuilder.create().uv(84, 108).cuboid(-2.4749F, -9.3731F, -12.2333F, 30.0F, 6.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 153).cuboid(-1.4749F, -10.3731F, -13.2333F, 28.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(46, 175).cuboid(5.5251F, -8.3731F, -3.7333F, 14.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 179).cuboid(-1.682F, 0.7F, -3.7678F, 29.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(118, 212).cuboid(27.2322F, -3.8F, -11.9404F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(196, 212).cuboid(-3.182F, -3.8F, -11.9404F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(162, 119).cuboid(-2.4749F, -3.8F, -3.2333F, 30.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-12.5251F, -6.1269F, 42.2333F));

		ModelPartData cube_r3 = back.addChild("cube_r3", ModelPartBuilder.create().uv(172, 199).cuboid(0.0F, 0.7F, -3.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r4 = back.addChild("cube_r4", ModelPartBuilder.create().uv(156, 199).cuboid(-1.0F, 0.7F, -3.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(25.0503F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r5 = back.addChild("cube_r5", ModelPartBuilder.create().uv(160, 199).cuboid(-1.2929F, 1.2F, -12.9656F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(28.5251F, -10.822F, -2.1779F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r6 = back.addChild("cube_r6", ModelPartBuilder.create().uv(168, 199).cuboid(0.2929F, 1.2F, -12.9656F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.779F, -5.0F, 7.4347F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r7 = back.addChild("cube_r7", ModelPartBuilder.create().uv(164, 199).cuboid(-1.2929F, 1.2F, -12.9656F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(19.2713F, -5.0F, 7.4347F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r8 = back.addChild("cube_r8", ModelPartBuilder.create().uv(124, 123).cuboid(-28.0F, -2.3F, -8.6F, 30.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(25.5251F, 0.1269F, -3.2333F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r9 = back.addChild("cube_r9", ModelPartBuilder.create().uv(176, 188).cuboid(-26.5F, -5.4F, -2.0F, 27.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(25.5251F, -6.8731F, 0.7667F, 0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r10 = back.addChild("cube_r10", ModelPartBuilder.create().uv(178, 230).cuboid(52.5F, -13.0F, 20.0F, 1.0F, 14.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 157).cuboid(30.5778F, -13.0F, 20.0F, 22.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(214, 223).cuboid(29.5778F, -13.0F, 20.0F, 1.0F, 14.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 159).cuboid(28.5778F, -18.0F, 19.0F, 26.0F, 19.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-29.0138F, -34.9141F, -40.8061F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r11 = back.addChild("cube_r11", ModelPartBuilder.create().uv(186, 29).cuboid(-57.5F, -13.0F, 20.0F, 28.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(40.034F, -46.9846F, -40.8061F, -1.5708F, 0.0F, -0.5236F));

		ModelPartData cube_r12 = back.addChild("cube_r12", ModelPartBuilder.create().uv(90, 199).cuboid(-53.5F, -13.0F, 20.0F, 24.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(54.064F, -25.9141F, -43.8061F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r13 = back.addChild("cube_r13", ModelPartBuilder.create().uv(210, 232).cuboid(52.5F, -13.0F, 20.0F, 1.0F, 14.0F, 1.0F, new Dilation(0.0F))
		.uv(144, 231).cuboid(29.5778F, -13.0F, 20.0F, 1.0F, 14.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-29.0138F, -23.8407F, -63.9266F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r14 = back.addChild("cube_r14", ModelPartBuilder.create().uv(74, 236).cuboid(52.5F, -13.0F, -21.0F, 1.0F, 14.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-31.4434F, -23.8407F, -12.8581F, 0.9599F, -0.1309F, 0.0F));

		ModelPartData cube_r15 = back.addChild("cube_r15", ModelPartBuilder.create().uv(12, 235).cuboid(-53.5F, -13.0F, -21.0F, 1.0F, 14.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(56.4936F, -23.8407F, -12.8581F, 0.9599F, 0.1309F, 0.0F));

		ModelPartData cube_r16 = back.addChild("cube_r16", ModelPartBuilder.create().uv(240, 212).cuboid(52.5F, -10.0F, -21.0F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-29.0138F, -17.8407F, -12.5401F, 0.6981F, 0.0F, -0.0436F));

		ModelPartData cube_r17 = back.addChild("cube_r17", ModelPartBuilder.create().uv(218, 212).cuboid(52.5F, -10.0F, -21.0F, 1.0F, 27.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-27.4118F, 18.8512F, -29.8294F, -1.1781F, 0.0F, -0.0436F));

		ModelPartData cube_r18 = back.addChild("cube_r18", ModelPartBuilder.create().uv(192, 217).cuboid(-53.5F, -10.0F, -21.0F, 1.0F, 27.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(52.462F, 18.8512F, -29.8294F, -1.1781F, 0.0F, 0.0436F));

		ModelPartData cube_r19 = back.addChild("cube_r19", ModelPartBuilder.create().uv(214, 238).cuboid(-53.5F, -10.0F, -21.0F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(54.064F, -17.8407F, -12.5401F, 0.6981F, 0.0F, 0.0436F));

		ModelPartData cube_r20 = back.addChild("cube_r20", ModelPartBuilder.create().uv(0, 197).cuboid(52.5F, -13.0F, 20.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-30.0138F, -32.9141F, -40.8061F, -1.5708F, 0.0F, -0.0436F));

		ModelPartData cube_r21 = back.addChild("cube_r21", ModelPartBuilder.create().uv(90, 182).cuboid(-53.5F, -13.0F, 20.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(55.064F, -32.9141F, -40.8061F, -1.5708F, 0.0F, 0.0436F));

		ModelPartData cube_r22 = back.addChild("cube_r22", ModelPartBuilder.create().uv(238, 71).cuboid(-50.0F, -0.4999F, 19.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(234, 119).cuboid(-58.0F, -0.4999F, 19.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(234, 71).cuboid(-66.0F, -0.4999F, 19.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(70.064F, -35.9141F, -40.8061F, -1.5708F, 0.0F, 0.0F));

		ModelPartData left = frame.addChild("left", ModelPartBuilder.create().uv(20, 216).cuboid(22.0175F, 1.5F, -40.0362F, 2.0F, 4.0F, 8.0F, new Dilation(0.0F))
		.uv(236, 162).cuboid(13.5302F, 5.5F, -37.429F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(234, 238).cuboid(14.0516F, 1.5F, -36.7297F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(182, 240).cuboid(13.6072F, 2.0F, -37.125F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(240, 21).cuboid(14.5F, -2.7F, -35.6F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(40, 222).cuboid(13.1072F, 0.5F, -33.3362F, 10.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(204, 55).cuboid(13.1072F, 0.5F, -20.2651F, 15.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 74).cuboid(14.0175F, 4.5F, -20.3362F, 2.0F, 2.0F, 32.0F, new Dilation(0.0F))
		.uv(68, 33).cuboid(14.5175F, -4.5F, -20.3362F, 2.0F, 9.0F, 32.0F, new Dilation(0.0F))
		.uv(130, 177).cuboid(14.5175F, -5.5F, -9.3362F, 2.0F, 1.0F, 21.0F, new Dilation(0.0F))
		.uv(104, 239).cuboid(14.5175F, -5.235F, -19.8086F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(242, 142).cuboid(14.5F, -4.0F, -21.0723F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(242, 125).cuboid(14.5F, -4.0F, -22.0723F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(226, 119).cuboid(14.5F, -4.0F, -23.0723F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 226).cuboid(14.5F, -4.0F, -30.0723F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(242, 176).cuboid(14.5F, -4.0F, -32.6F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 243).cuboid(14.5F, -4.0F, -31.6F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(226, 198).cuboid(14.5F, -4.0F, -30.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 232).cuboid(13.1072F, 0.5F, 11.0927F, 7.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 222).cuboid(13.1072F, 0.5F, 24.1638F, 10.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 241).cuboid(14.5F, -6.0F, 23.4276F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(128, 239).cuboid(14.5F, -6.0F, 24.4276F, 1.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(242, 108).cuboid(14.5F, -6.0F, 22.4276F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(242, 181).cuboid(14.5F, -6.0F, 21.4276F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(222, 212).cuboid(14.5F, -6.0F, 13.9277F, 1.0F, 3.0F, 8.0F, new Dilation(0.0F))
		.uv(186, 0).cuboid(14.5175F, -6.5F, 13.1638F, 2.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(242, 114).cuboid(14.5F, -6.0F, 12.9F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(156, 241).cuboid(14.5F, -6.0F, 10.9F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(156, 227).cuboid(14.5F, -4.0F, 13.9F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-29.5175F, -9.0F, 5.8362F));

		ModelPartData cube_r23 = left.addChild("cube_r23", ModelPartBuilder.create().uv(40, 230).cuboid(28.5F, -15.0F, 19.0F, 3.0F, 16.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-12.7548F, -29.4324F, 20.7306F, -2.0508F, -0.0873F, 0.0F));

		ModelPartData cube_r24 = left.addChild("cube_r24", ModelPartBuilder.create().uv(230, 7).cuboid(28.8F, -12.6999F, 18.43F, 1.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-8.0213F, -37.041F, -3.4089F, -1.6842F, -0.0436F, 0.1745F));

		ModelPartData cube_r25 = left.addChild("cube_r25", ModelPartBuilder.create().uv(96, 229).cuboid(28.5F, -15.0F, 19.0F, 3.0F, 16.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-12.6271F, -30.212F, 19.2708F, -1.9635F, -0.0873F, 0.0F));

		ModelPartData cube_r26 = left.addChild("cube_r26", ModelPartBuilder.create().uv(136, 231).cuboid(28.5F, -14.0F, 19.0F, 3.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-12.0213F, -30.212F, 21.7859F, -1.9635F, 0.0F, 0.0F));

		ModelPartData cube_r27 = left.addChild("cube_r27", ModelPartBuilder.create().uv(218, 98).cuboid(26.5F, -5.5F, 22.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-22.4825F, -2.735F, -14.3086F, 0.0F, 0.5672F, 0.0F));

		ModelPartData cube_r28 = left.addChild("cube_r28", ModelPartBuilder.create().uv(148, 199).cuboid(26.5F, -4.5F, 21.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-18.4825F, -2.735F, -22.3086F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r29 = left.addChild("cube_r29", ModelPartBuilder.create().uv(232, 177).cuboid(28.5F, -7.0F, 19.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-13.4825F, -20.735F, -25.3086F, -1.0123F, 0.0698F, 0.0F));

		ModelPartData cube_r30 = left.addChild("cube_r30", ModelPartBuilder.create().uv(34, 232).cuboid(28.5F, -14.0F, 19.0F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-13.4825F, -21.735F, -25.3086F, -1.0123F, 0.0698F, 0.0F));

		ModelPartData cube_r31 = left.addChild("cube_r31", ModelPartBuilder.create().uv(236, 169).cuboid(21.5F, -1.5F, 15.8F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(116, 239).cuboid(19.5F, -1.5F, 16.5F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(232, 198).cuboid(22.5F, -1.5F, 15.5F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(196, 239).cuboid(16.5F, -1.5F, 17.5F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.9825F, 2.6527F, -52.1723F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r32 = left.addChild("cube_r32", ModelPartBuilder.create().uv(210, 63).cuboid(-2.0F, -5.5F, -10.0F, 2.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(19.8208F, -4.0251F, 33.1638F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r33 = left.addChild("cube_r33", ModelPartBuilder.create().uv(136, 87).cuboid(-2.0F, -3.5F, -8.3F, 28.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(16.5175F, 3.0F, 33.1638F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r34 = left.addChild("cube_r34", ModelPartBuilder.create().uv(62, 123).cuboid(-2.0F, -4.5F, -29.0F, 2.0F, 1.0F, 29.0F, new Dilation(0.0F)), ModelTransform.of(16.5175F, -2.0043F, 13.3601F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r35 = left.addChild("cube_r35", ModelPartBuilder.create().uv(166, 217).cuboid(27.9001F, -5.5F, -16.5888F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-14.7928F, -10.1694F, 36.5403F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r36 = left.addChild("cube_r36", ModelPartBuilder.create().uv(222, 230).cuboid(27.9001F, -7.5F, -16.5888F, 7.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-14.7928F, -18.6243F, 22.1283F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r37 = left.addChild("cube_r37", ModelPartBuilder.create().uv(232, 92).cuboid(27.9001F, -5.5F, -16.5888F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-14.7928F, -14.412F, 3.9589F, 2.3562F, 0.0F, 0.0F));

		ModelPartData cube_r38 = left.addChild("cube_r38", ModelPartBuilder.create().uv(232, 86).cuboid(27.9001F, -5.5F, 15.5888F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-14.7928F, -14.412F, -12.1312F, -2.3562F, 0.0F, 0.0F));

		ModelPartData cube_r39 = left.addChild("cube_r39", ModelPartBuilder.create().uv(240, 189).cuboid(-34.9001F, -5.0F, 20.5888F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 223).cuboid(-56.7207F, -5.0F, 20.5888F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(120, 231).cuboid(-60.7207F, -7.5F, 15.5888F, 7.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(73.8279F, -18.6243F, -30.3006F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r40 = left.addChild("cube_r40", ModelPartBuilder.create().uv(48, 241).cuboid(-34.9001F, -5.0F, 20.5888F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(240, 193).cuboid(-56.7207F, -5.0F, 20.5888F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(73.8279F, -18.6243F, 14.6994F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r41 = left.addChild("cube_r41", ModelPartBuilder.create().uv(92, 216).cuboid(27.9001F, -5.5F, 15.5888F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-14.7928F, -10.1694F, -44.7127F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r42 = left.addChild("cube_r42", ModelPartBuilder.create().uv(236, 155).cuboid(22.5001F, -2.5F, 13.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-12.0592F, 8.0F, -41.9495F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r43 = left.addChild("cube_r43", ModelPartBuilder.create().uv(140, 212).cuboid(15.0F, -2.5F, 13.0F, 8.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-4.5417F, 8.0F, -44.6857F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r44 = left.addChild("cube_r44", ModelPartBuilder.create().uv(210, 86).cuboid(20.7F, -4.5F, 12.7F, 3.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-3.4825F, 6.0F, -43.8362F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r45 = left.addChild("cube_r45", ModelPartBuilder.create().uv(230, 0).cuboid(18.7F, -3.5F, 14.25F, 5.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.4825F, 6.0F, -43.8362F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r46 = left.addChild("cube_r46", ModelPartBuilder.create().uv(238, 230).cuboid(23.65F, -4.5F, 12.25F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-12.3618F, 6.0F, -40.1521F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r47 = left.addChild("cube_r47", ModelPartBuilder.create().uv(222, 223).cuboid(18.7F, -4.5F, 13.7F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-6.6436F, 6.0F, -43.7498F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r48 = left.addChild("cube_r48", ModelPartBuilder.create().uv(0, 235).cuboid(22.15F, -4.5F, 12.25F, 2.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-10.4825F, 6.0F, -40.8362F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r49 = left.addChild("cube_r49", ModelPartBuilder.create().uv(202, 129).cuboid(27.4F, -4.0F, 14.8F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-17.2023F, 6.0F, -41.661F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r50 = left.addChild("cube_r50", ModelPartBuilder.create().uv(228, 98).cuboid(14.5F, -0.2F, 14.4F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.1676F, -18.6638F, -33.4737F, -1.309F, 0.3491F, 0.0873F));

		ModelPartData cube_r51 = left.addChild("cube_r51", ModelPartBuilder.create().uv(18, 228).cuboid(14.5F, -0.2F, 14.4F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.9799F, -4.7431F, -44.2291F, 0.0F, 0.3491F, 0.0873F));

		ModelPartData cube_r52 = left.addChild("cube_r52", ModelPartBuilder.create().uv(220, 107).cuboid(14.5F, -4.7F, 14.4F, 8.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.0506F, 2.0F, -44.1723F, 0.0F, 0.3491F, 0.0F));

		ModelPartData right = frame.addChild("right", ModelPartBuilder.create().uv(0, 214).cuboid(-24.0175F, 1.5F, -40.0362F, 2.0F, 4.0F, 8.0F, new Dilation(0.0F))
		.uv(62, 236).cuboid(-14.5302F, 5.5F, -37.429F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(78, 238).cuboid(-15.0516F, 1.5F, -36.7297F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 240).cuboid(-14.6072F, 2.0F, -37.125F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 240).cuboid(-15.5F, -2.7F, -35.6F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(218, 190).cuboid(-23.1072F, 0.5F, -33.3362F, 10.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(204, 47).cuboid(-29.1072F, 0.5F, -20.2651F, 16.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 74).cuboid(-16.0175F, 4.5F, -20.3362F, 2.0F, 2.0F, 32.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-16.5175F, -4.5F, -20.3362F, 2.0F, 9.0F, 32.0F, new Dilation(0.0F))
		.uv(0, 175).cuboid(-16.5175F, -5.5F, -9.3362F, 2.0F, 1.0F, 21.0F, new Dilation(0.0F))
		.uv(34, 197).cuboid(-16.5175F, -5.235F, -19.8086F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(242, 81).cuboid(-15.5F, -4.0F, -21.0723F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(136, 223).cuboid(-15.5F, -4.0F, -22.0723F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(218, 198).cuboid(-15.5F, -4.0F, -23.0723F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(196, 223).cuboid(-15.5F, -4.0F, -30.0723F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(166, 212).cuboid(-15.5F, -4.0F, -32.6F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(162, 219).cuboid(-15.5F, -4.0F, -31.6F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(118, 179).cuboid(-15.5F, -4.0F, -30.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(106, 223).cuboid(-22.1072F, 0.5F, 11.0927F, 9.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(188, 136).cuboid(-43.1072F, 1.9142F, 9.5785F, 27.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 0).cuboid(-31.6072F, 1.9142F, -16.4215F, 4.0F, 5.0F, 26.0F, new Dilation(0.0F))
		.uv(204, 31).cuboid(-39.1072F, 1.9142F, -9.4215F, 4.0F, 5.0F, 11.0F, new Dilation(0.0F))
		.uv(124, 195).cuboid(-38.1072F, 2.9142F, -10.4215F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 203).cuboid(-27.1072F, 1.9142F, -7.4215F, 9.0F, 5.0F, 8.0F, new Dilation(0.0F))
		.uv(8, 243).cuboid(-30.1072F, -1.0858F, -8.4215F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(162, 241).cuboid(-30.6072F, -3.0858F, -8.9215F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 222).cuboid(-23.1072F, 0.5F, 24.1638F, 10.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(218, 240).cuboid(-15.5F, -6.0F, 23.4276F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 238).cuboid(-15.5F, -6.0F, 24.4276F, 1.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(242, 102).cuboid(-15.5F, -6.0F, 22.4276F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(242, 120).cuboid(-15.5F, -6.0F, 21.4276F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 164).cuboid(-15.5F, -6.0F, 13.9277F, 1.0F, 3.0F, 8.0F, new Dilation(0.0F))
		.uv(46, 182).cuboid(-16.5175F, -6.5F, 13.1638F, 2.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(242, 75).cuboid(-15.5F, -6.0F, 12.9F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(204, 63).cuboid(-15.5F, -6.0F, 10.9F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(222, 198).cuboid(-15.5F, -4.0F, 13.9F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(29.5175F, -9.0F, 5.8362F));

		ModelPartData cube_r53 = right.addChild("cube_r53", ModelPartBuilder.create().uv(148, 227).cuboid(-31.5F, -15.0F, 19.0F, 3.0F, 16.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(12.7548F, -29.4324F, 20.7306F, -2.0508F, 0.0873F, 0.0F));

		ModelPartData cube_r54 = right.addChild("cube_r54", ModelPartBuilder.create().uv(80, 229).cuboid(-29.8F, -12.6999F, 18.43F, 1.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(8.0213F, -37.041F, -3.4089F, -1.6842F, 0.0436F, -0.1745F));

		ModelPartData cube_r55 = right.addChild("cube_r55", ModelPartBuilder.create().uv(182, 223).cuboid(-31.5F, -15.0F, 19.0F, 3.0F, 16.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(12.6271F, -30.212F, 19.2708F, -1.9635F, 0.0873F, 0.0F));

		ModelPartData cube_r56 = right.addChild("cube_r56", ModelPartBuilder.create().uv(170, 230).cuboid(-31.5F, -14.0F, 19.0F, 3.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(12.0213F, -30.212F, 21.7859F, -1.9635F, 0.0F, 0.0F));

		ModelPartData cube_r57 = right.addChild("cube_r57", ModelPartBuilder.create().uv(210, 98).cuboid(-29.5F, -5.5F, 22.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.4825F, -2.735F, -14.3086F, 0.0F, -0.5672F, 0.0F));

		ModelPartData cube_r58 = right.addChild("cube_r58", ModelPartBuilder.create().uv(140, 199).cuboid(-29.5F, -4.5F, 21.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(18.4825F, -2.735F, -22.3086F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r59 = right.addChild("cube_r59", ModelPartBuilder.create().uv(232, 74).cuboid(-29.5F, -7.0F, 19.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(13.4825F, -20.735F, -25.3086F, -1.0123F, -0.0698F, 0.0F));

		ModelPartData cube_r60 = right.addChild("cube_r60", ModelPartBuilder.create().uv(124, 179).cuboid(-30.5F, -14.0F, 19.0F, 2.0F, 15.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(13.4825F, -21.735F, -25.3086F, -1.0123F, -0.0698F, 0.0F));

		ModelPartData cube_r61 = right.addChild("cube_r61", ModelPartBuilder.create().uv(236, 148).cuboid(-22.5F, -1.5F, 15.8F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(222, 238).cuboid(-21.5F, -1.5F, 16.5F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(196, 232).cuboid(-24.5F, -1.5F, 15.5F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(230, 16).cuboid(-19.5F, -1.5F, 17.5F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.9825F, 2.6527F, -52.1723F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r62 = right.addChild("cube_r62", ModelPartBuilder.create().uv(208, 201).cuboid(0.0F, -5.5F, -10.0F, 2.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-19.8208F, -4.0251F, 33.1638F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r63 = right.addChild("cube_r63", ModelPartBuilder.create().uv(136, 73).cuboid(-26.0F, -3.5F, -8.3F, 28.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(-16.5175F, 3.0F, 33.1638F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r64 = right.addChild("cube_r64", ModelPartBuilder.create().uv(0, 123).cuboid(0.0F, -4.5F, -29.0F, 2.0F, 1.0F, 29.0F, new Dilation(0.0F)), ModelTransform.of(-16.5175F, -2.0043F, 13.3601F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r65 = right.addChild("cube_r65", ModelPartBuilder.create().uv(66, 216).cuboid(-39.9001F, -5.5F, -16.5888F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.7928F, -10.1694F, 36.5403F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r66 = right.addChild("cube_r66", ModelPartBuilder.create().uv(176, 177).cuboid(-59.9001F, -7.5F, -16.5888F, 27.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.7928F, -20.2858F, 13.3291F, 2.0944F, 0.0F, 0.0F));

		ModelPartData cube_r67 = right.addChild("cube_r67", ModelPartBuilder.create().uv(186, 21).cuboid(-53.9001F, -7.5F, -16.5888F, 26.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.7928F, -18.6243F, 22.1283F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r68 = right.addChild("cube_r68", ModelPartBuilder.create().uv(188, 142).cuboid(-53.9001F, -5.5F, -16.5888F, 26.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.7928F, -14.412F, 3.9589F, 2.3562F, 0.0F, 0.0F));

		ModelPartData cube_r69 = right.addChild("cube_r69", ModelPartBuilder.create().uv(130, 169).cuboid(-55.9001F, -7.5F, -16.5888F, 29.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.7928F, -14.412F, 3.8589F, 2.3562F, 0.0F, 0.0F));

		ModelPartData cube_r70 = right.addChild("cube_r70", ModelPartBuilder.create().uv(230, 119).cuboid(-45.9001F, 1.4F, -30.8888F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(118, 210).cuboid(-47.4001F, 0.4F, -30.8888F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(204, 71).cuboid(-44.4001F, 0.4F, -30.8888F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 243).cuboid(-43.4001F, -1.1F, -30.8888F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(242, 223).cuboid(-48.4001F, -1.1F, -30.8888F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(108, 179).cuboid(-47.4001F, 2.9F, -30.8888F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 31).cuboid(-47.4001F, -2.1F, -30.8888F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(22.7928F, -9.5858F, 20.7673F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r71 = right.addChild("cube_r71", ModelPartBuilder.create().uv(242, 71).cuboid(-46.4001F, -2.1F, -31.1888F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(22.7928F, -7.5858F, 20.7673F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r72 = right.addChild("cube_r72", ModelPartBuilder.create().uv(242, 16).cuboid(-45.9001F, 1.5F, -29.1888F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(22.7928F, -7.5858F, 16.7673F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r73 = right.addChild("cube_r73", ModelPartBuilder.create().uv(232, 205).cuboid(-45.9001F, -2.5F, -29.1888F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(15.7928F, 12.4142F, 22.7673F, -0.3491F, 0.0F, 0.0F));

		ModelPartData cube_r74 = right.addChild("cube_r74", ModelPartBuilder.create().uv(228, 102).cuboid(-49.9001F, -8.5F, -25.6888F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(68, 203).cuboid(-51.9001F, -5.5F, -25.6888F, 9.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.7928F, 3.4142F, 25.7673F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r75 = right.addChild("cube_r75", ModelPartBuilder.create().uv(230, 129).cuboid(-34.9001F, -5.5F, 15.5888F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.7928F, -14.412F, -12.1312F, -2.3562F, 0.0F, 0.0F));

		ModelPartData cube_r76 = right.addChild("cube_r76", ModelPartBuilder.create().uv(104, 231).cuboid(-34.9001F, -7.5F, 15.5888F, 7.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.7928F, -18.6243F, -30.3006F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r77 = right.addChild("cube_r77", ModelPartBuilder.create().uv(40, 216).cuboid(-39.9001F, -5.5F, 15.5888F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.7928F, -10.1694F, -44.7127F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r78 = right.addChild("cube_r78", ModelPartBuilder.create().uv(236, 55).cuboid(-23.5001F, -2.5F, 13.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(12.0592F, 8.0F, -41.9495F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r79 = right.addChild("cube_r79", ModelPartBuilder.create().uv(170, 210).cuboid(-23.0F, -2.5F, 13.0F, 8.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(4.5417F, 8.0F, -44.6857F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r80 = right.addChild("cube_r80", ModelPartBuilder.create().uv(210, 74).cuboid(-23.7F, -4.5F, 12.7F, 3.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(3.4825F, 6.0F, -43.8362F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r81 = right.addChild("cube_r81", ModelPartBuilder.create().uv(62, 229).cuboid(-23.7F, -3.5F, 14.25F, 5.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(6.4825F, 6.0F, -43.8362F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r82 = right.addChild("cube_r82", ModelPartBuilder.create().uv(238, 45).cuboid(-24.65F, -4.5F, 12.25F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(12.3618F, 6.0F, -40.1521F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r83 = right.addChild("cube_r83", ModelPartBuilder.create().uv(162, 223).cuboid(-23.7F, -4.5F, 13.7F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(6.6436F, 6.0F, -43.7498F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r84 = right.addChild("cube_r84", ModelPartBuilder.create().uv(234, 63).cuboid(-24.15F, -4.5F, 12.25F, 2.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(10.4825F, 6.0F, -40.8362F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r85 = right.addChild("cube_r85", ModelPartBuilder.create().uv(200, 101).cuboid(-36.4F, -4.0F, 14.8F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(17.2023F, 6.0F, -41.661F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r86 = right.addChild("cube_r86", ModelPartBuilder.create().uv(126, 227).cuboid(-22.5F, -0.2F, 14.4F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.1676F, -18.6638F, -33.4737F, -1.309F, -0.3491F, -0.0873F));

		ModelPartData cube_r87 = right.addChild("cube_r87", ModelPartBuilder.create().uv(220, 115).cuboid(-22.5F, -0.2F, 14.4F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(3.9799F, -4.7431F, -44.2291F, 0.0F, -0.3491F, -0.0873F));

		ModelPartData cube_r88 = right.addChild("cube_r88", ModelPartBuilder.create().uv(140, 219).cuboid(-22.5F, -4.7F, 14.4F, 8.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.0506F, 2.0F, -44.1723F, 0.0F, -0.3491F, 0.0F));

		ModelPartData front = frame.addChild("front", ModelPartBuilder.create().uv(0, 0).cuboid(-31.5F, 4.5F, 32.5F, 31.0F, 1.0F, 32.0F, new Dilation(0.0F))
		.uv(124, 136).cuboid(-26.0F, -5.5F, 20.5F, 20.0F, 11.0F, 12.0F, new Dilation(0.0F))
		.uv(188, 148).cuboid(-24.0F, 3.5F, 12.5F, 16.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(90, 201).cuboid(-22.5F, 3.5F, 12.0F, 13.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(190, 158).cuboid(-24.0F, -0.5F, 13.8F, 16.0F, 4.0F, 7.0F, new Dilation(0.0F))
		.uv(170, 201).cuboid(-21.5F, -0.5F, 12.8F, 11.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(190, 169).cuboid(-24.0F, 0.0F, 12.3F, 16.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(136, 101).cuboid(-30.0F, -7.235F, 33.0276F, 28.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(176, 190).cuboid(-23.5F, -4.7F, 14.5F, 15.0F, 5.0F, 6.0F, new Dilation(0.0F))
		.uv(132, 201).cuboid(-22.5F, -4.7F, 14.2F, 13.0F, 5.0F, 6.0F, new Dilation(0.0F))
		.uv(234, 31).cuboid(-23.5F, -4.7F, 14.2F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(234, 38).cuboid(-9.5F, -4.7F, 14.2F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, -7.0F, -47.0F));

		ModelPartData cube_r89 = front.addChild("cube_r89", ModelPartBuilder.create().uv(156, 230).cuboid(22.5F, -4.7F, 14.2F, 1.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-32.4157F, -5.2424F, 0.0F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r90 = front.addChild("cube_r90", ModelPartBuilder.create().uv(48, 230).cuboid(-23.5F, -4.7F, 14.2F, 1.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.4157F, -5.2424F, 0.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r91 = front.addChild("cube_r91", ModelPartBuilder.create().uv(202, 122).cuboid(-24.0F, -1.5F, 15.5F, 15.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.6527F, 0.6638F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r92 = front.addChild("cube_r92", ModelPartBuilder.create().uv(0, 108).cuboid(-30.0F, -1.5F, 7.5F, 29.0F, 2.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.9541F, 12.7363F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r93 = front.addChild("cube_r93", ModelPartBuilder.create().uv(46, 177).cuboid(-22.5F, -2.5F, 13.0F, 13.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0083F, 4.201F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r94 = front.addChild("cube_r94", ModelPartBuilder.create().uv(162, 107).cuboid(-26.0F, -11.2F, -17.5F, 20.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 86.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r95 = front.addChild("cube_r95", ModelPartBuilder.create().uv(0, 164).cuboid(-26.0F, -10.2F, -17.5F, 20.0F, 2.0F, 9.0F, new Dilation(0.0F))
		.uv(76, 153).cuboid(-26.0F, -9.2F, -19.5F, 20.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(136, 31).cuboid(-26.0F, -8.2F, -20.5F, 20.0F, 7.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 85.0F, 0.0873F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
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
		float scale = 1.45f;
		poseStack.scale(scale,scale,scale);
		poseStack.translate(-0.5, -1.2, -0.01);
		frame.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		poseStack.pop();
	}
	}