package motobox.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import io.netty.buffer.Unpooled;
import motobox.Motobox;
import motobox.block.entity.WorkLaptop;
import motobox.block.entity.WorkLaptopEntity;
import motobox.networking.ModMessages;
import motobox.util.IEntityDataSaver;
import motobox.util.MoneyData;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
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

public class WorkLaptopScreen extends HandledScreen<WorkLaptopScreenHandler> {
    private static final Identifier TEXTURE = Motobox.id("textures/gui/work_laptop_screen.png");

    ButtonWidget low;
    ButtonWidget mid;
    ButtonWidget high;
    ButtonWidget corp;
    ButtonWidget collect;
    ButtonWidget sell;

    ButtonWidget buy;
    public WorkLaptopScreen(WorkLaptopScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeBoolean(false);
        buf.writeBlockPos(this.handler.blockEntity.getPos());
        ClientPlayNetworking.send(ModMessages.LAPTOP_ID, buf);
        titleY = 1000;
        playerInventoryTitleY = 1000;
        // Use the builder method to create the button
        low = ButtonWidget.builder(Text.of("Low"), btn -> this.onButtonClick(4, 2000, 30))
                .dimensions(this.x + 10, this.y + 10, 100, 20)
                .build();
        mid = ButtonWidget.builder(Text.of("Mid"), btn -> this.onButtonClick(4, 10000, 200))
                .dimensions(this.x + 10, this.y + 35, 100, 20)
                .build();
        high = ButtonWidget.builder(Text.of("High"), btn -> this.onButtonClick(4, 20000, 500))
                .dimensions(this.x + 10, this.y + 85, 100, 20)
                .build();
        corp = ButtonWidget.builder(Text.of("Corp"), btn -> this.onButtonClick(4, 100000, 2000))
                .dimensions(this.x + 10, this.y + 60, 100, 20)
                .build();
        buy = ButtonWidget.builder(Text.of("Buy"), btn -> this.onButtonClick(1, 100000, 2000))
                .dimensions(this.x + 10, this.y + 60, 100, 20)
                .build();
        collect = ButtonWidget.builder(Text.of("Collect"), btn -> this.onButtonClick(2, 0, 0))
                .dimensions(this.x + 10, this.y + 10, 100, 20)
                .build();
        sell = ButtonWidget.builder(Text.of("Sell"), btn -> this.onButtonClick(3, 0, 0))
                .dimensions(this.x + 10, this.y + 35, 100, 20)
                .build();
        /*if (MinecraftClient.getInstance().player != null) {
            ServerPlayNetworking.send(MinecraftClient.getInstance().player, ModMessages.LAPTOP_SYNC_ID, )
        }*/
        if (this.handler.blockEntity.isBusiness) {
            this.addDrawableChild(collect);
            this.addDrawableChild(sell);
        }
        else if (this.handler.blockEntity.isSetup) {
            this.addDrawableChild(buy);
        }
        else {
            this.addDrawableChild(low);
            this.addDrawableChild(mid);
            this.addDrawableChild(high);
            this.addDrawableChild(corp);
        }

    }

    private void onButtonClick(int but, double cost, float value) {
        if (but == 1) {
            if (this.handler.blockEntity.rate == 30) {
                cost = 2000;
            } else if (this.handler.blockEntity.rate == 200) {
                cost = 10000;
            } else if (this.handler.blockEntity.rate == 500) {
                cost = 20000;
            } else {
                cost = 100000;
            }
            if (((IEntityDataSaver)MinecraftClient.getInstance().player).getPersistentData().getFloat("money") >= cost) {
                PacketByteBuf buf = PacketByteBufs.create();
                buf.writeDouble(-cost);
                ClientPlayNetworking.send(ModMessages.MONEY_ID, buf);
                this.remove(buy);
                this.addDrawableChild(collect);
                this.addDrawableChild(sell);
                this.handler.blockEntity.isBusiness = true;
                this.handler.blockEntity.owner = MinecraftClient.getInstance().player.getUuid();
                this.handler.blockEntity.lastCheck = Instant.now().getEpochSecond();
                this.handler.onButtonClick(MinecraftClient.getInstance().player, but);
            }
        }
        if (but ==2) {
            double amount = ((Instant.now().getEpochSecond() - this.handler.blockEntity.lastCheck) / 3600.00) * this.handler.blockEntity.rate;
            if (amount > (this.handler.blockEntity.rate * 24)) {
                amount = this.handler.blockEntity.rate * 24;
            }
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeDouble(amount);
            ClientPlayNetworking.send(ModMessages.MONEY_ID, buf);
            this.handler.blockEntity.lastCheck = Instant.now().getEpochSecond();
            this.handler.onButtonClick(MinecraftClient.getInstance().player, but);
            MinecraftClient.getInstance().player.sendMessage(Text.literal(String.format("Recieved $" + amount)));
        }
        if (but == 3) {
            PacketByteBuf buf = PacketByteBufs.create();
            if (this.handler.blockEntity.rate == 30) {
                buf.writeDouble(2000);
            } else if (this.handler.blockEntity.rate == 200) {
                buf.writeDouble(10000);
            } else if (this.handler.blockEntity.rate == 500) {
                buf.writeDouble(20000);
            } else {
                buf.writeDouble(100000);
            }
            ClientPlayNetworking.send(ModMessages.MONEY_ID, buf);
            this.handler.blockEntity.rate = 0f;
            this.remove(collect);
            this.remove(sell);
            this.handler.blockEntity.isBusiness = false;
            this.handler.blockEntity.lastCheck = Instant.now().getEpochSecond();
            this.handler.onButtonClick(MinecraftClient.getInstance().player, but);
        }
        if (but == 4) {
            this.remove(low);
            this.remove(mid);
            this.remove(high);
            this.remove(corp);
            this.addDrawableChild(buy);

            this.handler.blockEntity.isSetup = true;
            this.handler.blockEntity.rate = value;
            this.handler.onButtonClick(MinecraftClient.getInstance().player, but);
        }
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        x = (width - backgroundWidth) /2;
        y = (height - backgroundHeight) /2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);

    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
        int cost;
        if (this.handler.blockEntity.rate == 30) {
            cost = 2000;
        } else if (this.handler.blockEntity.rate == 200) {
            cost = 10000;
        } else if (this.handler.blockEntity.rate == 500) {
            cost = 20000;
        } else {
            cost = 100000;
        }
        if (!this.handler.blockEntity.isBusiness && this.handler.blockEntity.isSetup) {
            context.drawText(this.textRenderer, "Cost: $" + cost, this.x+10, this.y +10, 0xFFFFFF, false);
            context.drawText(this.textRenderer, "Rate: $" + this.handler.blockEntity.rate + "/hr", this.x+10, this.y +35, 0xFFFFFF, false);
        }
    }
}
