package motobox.screen;

import io.netty.buffer.Unpooled;
import motobox.Motobox;
import motobox.block.entity.WorkLaptopEntity;
import motobox.networking.ModMessages;
import motobox.util.network.LaptopC2SPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;
import java.util.UUID;

public class WorkLaptopScreenHandler extends ScreenHandler {
    public final WorkLaptopEntity blockEntity;

    public WorkLaptopScreenHandler(int syncId, PlayerInventory inv, PacketByteBuf buf) {
        this(syncId, inv, inv.player.getWorld().getBlockEntity(buf.readBlockPos()), new ArrayPropertyDelegate(2));
    }

    public WorkLaptopScreenHandler(int syncId, PlayerInventory inv, BlockEntity blockEntity, PropertyDelegate prop) {
        super(Motobox.LAPTOP_SCREEN, syncId);
        this.blockEntity = (WorkLaptopEntity) blockEntity;
    }


    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeBoolean(true);
        buf.writeBlockPos(this.blockEntity.getPos());
        buf.writeFloat(this.blockEntity.rate);
        buf.writeBoolean(this.blockEntity.isBusiness);
        buf.writeLong(this.blockEntity.lastCheck);
        buf.writeUuid(this.blockEntity.owner);
        buf.writeBoolean(this.blockEntity.isSetup);

        ClientPlayNetworking.send(ModMessages.LAPTOP_ID, buf);
        return true;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        if (blockEntity.isBusiness) {
            return player.getUuid().compareTo(blockEntity.owner) == 0;
        }
        return true;
    }

}
