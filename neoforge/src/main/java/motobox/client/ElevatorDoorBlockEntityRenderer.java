package motobox.client;

import com.mojang.blaze3d.vertex.PoseStack;
import motobox.MotoboxNeoForge;
import motobox.block.entity.ElevatorDoorBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import org.joml.AxisAngle4f;
import org.joml.Quaternionf;

public class ElevatorDoorBlockEntityRenderer implements BlockEntityRenderer<ElevatorDoorBlockEntity> {
    private static final ResourceLocation TEXTURE = ResourceLocation.withDefaultNamespace("textures/block/iron_block.png");

    private final ElevatorDoorModel model;

    public ElevatorDoorBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.model = new ElevatorDoorModel(ElevatorDoorModel.createLayerDefinition().bakeRoot());
    }

    @Override
    public void render(ElevatorDoorBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int light, int overlay) {
        Direction facing = blockEntity.getBlockState().getValue(HorizontalDirectionalBlock.FACING);

        poseStack.pushPose();
        poseStack.translate(0.5D, 0.0D, 0.5D);
        poseStack.mulPose(new Quaternionf(new AxisAngle4f((float) Math.toRadians(-facing.toYRot()), 0.0F, 1.0F, 0.0F)));
        poseStack.translate(0.0D, 0.0D, -0.5D);

        this.model.setOpenProgress(blockEntity.getOpenProgress(partialTick));
        this.model.render(poseStack, bufferSource.getBuffer(RenderType.entityCutout(TEXTURE)), light, overlay);
        poseStack.popPose();
    }
}