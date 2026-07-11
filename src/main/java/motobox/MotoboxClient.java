package motobox;

import motobox.block.MotoboxBlocks;
import motobox.block.entity.render.ElevatorDoorBlockEntityRenderer;
import motobox.block.entity.render.SlotMachineRenderer;
import motobox.block.entity.render.VehicleAssemblerBlockEntityRenderer;
import motobox.block.entity.render.Work_Laptop_Renderer;
import motobox.client.TexanPlaneEntityRenderer;
import motobox.entity.MotoboxEntities;
import motobox.entity.VehicleEntity;
import motobox.entity.client.GangRenderer;
import motobox.entity.client.ModModelLayers;
import motobox.entity.client.gang;
import motobox.entity.ufo.UfoInput;
import motobox.event.KeyInputHandler;
import motobox.item.MotoboxItems;
import motobox.networking.ModMessages;
import motobox.particle.MotoboxParticles;
import motobox.render.MotoboxModels;
import motobox.resource.MotoboxAssets;
import motobox.screen.MechanicTableScreen;
// import motobox.screen.RouletteTableScreen;
import motobox.screen.BlackjackScreen;
import motobox.screen.SingleSlotScreen;
import motobox.screen.SlotMachineScreen;
import motobox.screen.VehicleHud;
import motobox.screen.WorkLaptopScreen;
import motobox.util.AUtils;
import motobox.util.IEntityDataSaver;
import motobox.util.network.PayloadPackets;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;

public class MotoboxClient implements ClientModInitializer {
    @SuppressWarnings("deprecation")
    @Override
    public void onInitializeClient() {
        MotoboxModels.init();
        MotoboxBlocks.initClient();
        MotoboxItems.initClient();
        MotoboxEntities.initClient();
        MotoboxParticles.initClient();
        PayloadPackets.initClient();
        ModMessages.registerS2CPackets();
        KeyInputHandler.register();

        MotoboxAssets.setup();

        HandledScreens.register(Motobox.MECHANIC_SCREEN, MechanicTableScreen::new);
        HandledScreens.register(Motobox.LAPTOP_SCREEN, WorkLaptopScreen::new);
        HandledScreens.register(Motobox.SLOT_SCREEN, SlotMachineScreen::new);
        HandledScreens.register(Motobox.SINGLE_SLOT_SCREEN, SingleSlotScreen::new);
        HandledScreens.register(Motobox.BLACKJACK_SCREEN, BlackjackScreen::new);
        // HandledScreens.register(Motobox.ROULETTE_TABLE_SCREEN, RouletteTableScreen::new);
        BlockRenderLayerMap.INSTANCE.putBlock(MotoboxBlocks.RACE_TROPHY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MotoboxBlocks.MODERN_LAMP_1, RenderLayer.getTranslucent());

        HudRenderCallback.EVENT.register((matrices, delta) -> {
            var client = MinecraftClient.getInstance();
            var player = client.player;
            if (player == null) {
                return;
            }

            if (player.getVehicle() instanceof VehicleEntity vehicle) {
                VehicleHud.render(matrices, player, vehicle, delta);
            }

            double money = ((IEntityDataSaver) player).getPersistentData().getDouble("money");
            int color = 0xFFFFFF;
            int screenWidth = client.getWindow().getScaledWidth();
            String moneyText = "$" + AUtils.DEC_TWO_PLACES.format(money);
            int textWidth = client.textRenderer.getWidth(Text.literal(moneyText));
            matrices.drawText(client.textRenderer, Text.literal(moneyText), screenWidth - 20 - textWidth, 20, color, true);
        });

        BlockRenderLayerMap.INSTANCE.putBlock(MotoboxBlocks.VEHICLE_ASSEMBLER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MotoboxBlocks.WORK_LAPTOP, RenderLayer.getCutout());
       // BlockRenderLayerMap.INSTANCE.putBlock(MotoboxBlocks.SLOT_MACHINE, RenderLayer.getCutout());

        BlockEntityRendererRegistry.register(MotoboxBlocks.VEHICLE_ASSEMBLER_BLOCK_ENTITY, VehicleAssemblerBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(MotoboxBlocks.ELEVATOR_DOOR_BLOCK_ENTITY, ElevatorDoorBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(MotoboxBlocks.LAPTOP_BLOCK_ENTITY, Work_Laptop_Renderer::new);
        BlockEntityRendererRegistry.register(MotoboxBlocks.SLOT_MACHINE_ENTITY, SlotMachineRenderer::new);

       // ShaderProgramManager.getInstance().registerShader(new Identifier("yourmodid", "vehicle"), VertexFormats.POSITION_TEXTURE);

        EntityRendererRegistry.register(MotoboxEntities.GANG_MEMBER, GangRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GANG, gang::getTexturedModelData);

        EntityRendererRegistry.register(MotoboxEntities.TEXAN_ENTITY, (context) -> new TexanPlaneEntityRenderer(context));

        UfoInput.registerKeybinds();
    }
}
