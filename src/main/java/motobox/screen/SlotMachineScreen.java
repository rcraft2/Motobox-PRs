package motobox.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import motobox.Motobox;
import motobox.block.entity.SlotMachine;
import motobox.block.entity.SlotMachineEntity;
import motobox.networking.ModMessages;
import motobox.util.IEntityDataSaver;
import motobox.util.MoneyData;
import motobox.util.network.DailyObjectiveC2SPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.time.Instant;
import java.util.Random;

public class SlotMachineScreen extends HandledScreen<SlotMachineScreenHandler> {
    private static final Identifier TEXTURE = Motobox.id("textures/gui/slot_screen.png");
    ButtonWidget button;
    private boolean isPlaying = false;
    int one = 1;
    int two = 1;
    int three =1;
    private int iteration = 0;

    public SlotMachineScreen(SlotMachineScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleY = 1000;
        playerInventoryTitleY = 1000;
        backgroundWidth = 128;
        backgroundHeight = 256;
        button = ButtonWidget.builder(Text.of("Play"), btn -> this.onButtonClick())
                .dimensions(138, this.y + 10, 20, 20)
                .build();
        this.addDrawableChild(button);

    }

    public void onButtonClick() {
        this.remove(button);
        isPlaying = true;
        iteration = 0;
        one = new Random().nextInt(5);
        two = new Random().nextInt(5);
        three = new Random().nextInt(5);
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeDouble(-5.0);
        ClientPlayNetworking.send(ModMessages.MONEY_ID, buf);

    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        x = (width - backgroundWidth) /2;
        y = (height - backgroundHeight) /2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
        if (isPlaying) {
            renderSlots(context);
        }

    }

    private void renderSlots(DrawContext ctx) {
        if (iteration <= 100) {
            int iter = iteration;
            if (iteration > 4) {
                iter = iteration -5;
            }
            ctx.drawTexture(TEXTURE, this.x + 10, this.y +200, 162, (19+(64*iter))/2, 32, 32);
            ctx.drawTexture(TEXTURE, this.x + 45, this.y +200, 162, (19+(64*(iter+1)))/2, 32, 32);
            ctx.drawTexture(TEXTURE, this.x + 80, this.y +200, 162, (19+(64*(iter+2)))/2, 32, 32);
            iteration++;
        }
        else {
            if (iteration > 200) {
                isPlaying = false;
                this.addDrawableChild(button);
                iteration = -1;
            }
            else if (iteration == 101) {
                if ((one == two) && one ==three) {
                    double amount = 100.0;
                    if (one == 4) {
                        amount = 300.0;
                    }
                    PacketByteBuf buf = PacketByteBufs.create();
                    buf.writeDouble(amount);
                    ClientPlayNetworking.send(ModMessages.MONEY_ID, buf);

                    PacketByteBuf objectiveBuf = PacketByteBufs.create();
                    objectiveBuf.writeString(DailyObjectiveC2SPacket.SLOT_WIN);
                    ClientPlayNetworking.send(ModMessages.DAILY_OBJECTIVE_ID, objectiveBuf);
                }
            }
            ctx.drawTexture(TEXTURE, this.x + 10, this.y +200, 162, (19+(64*one))/2, 32, 32);
            ctx.drawTexture(TEXTURE, this.x + 45, this.y +200, 162, (19+(64*(two)))/2, 32, 32);
            ctx.drawTexture(TEXTURE, this.x + 80, this.y +200, 162, (19+(64*(three)))/2, 32, 32);
            iteration++;

        }

    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
