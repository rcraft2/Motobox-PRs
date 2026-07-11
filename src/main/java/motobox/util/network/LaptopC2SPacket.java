package motobox.util.network;

import io.netty.buffer.Unpooled;
import motobox.block.entity.WorkLaptopEntity;
import motobox.networking.ModMessages;
import motobox.util.IEntityDataSaver;
import motobox.util.MoneyData;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.UUID;

public class LaptopC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender response) {
        //float money = MoneyData.addMoney((IEntityDataSaver) player, 500f);
        //MoneyData.addMoney((IEntityDataSaver) player, buffer.readDouble());
        boolean doUpdate = buf.readBoolean();
        BlockPos pos = buf.readBlockPos();
        if (doUpdate) {
            float rate = buf.readFloat();
            boolean isBusiness = buf.readBoolean();
            long lastCheck = buf.readLong();
            UUID owner = buf.readUuid();
            boolean isSetup = buf.readBoolean();

            server.execute(() -> {
                World world = server.getWorld(player.getWorld().getRegistryKey());
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof WorkLaptopEntity workLaptop) {
                    workLaptop.rate = rate;
                    workLaptop.isBusiness = isBusiness;
                    workLaptop.lastCheck = lastCheck;
                    workLaptop.owner = owner;
                    workLaptop.isSetup = isSetup;
                    workLaptop.markDirty();
                }
            });
        }
        else {
            server.execute(() -> {
                PacketByteBuf buffer = new PacketByteBuf(Unpooled.buffer());
                World world = server.getWorld(player.getWorld().getRegistryKey());
                buffer.writeBlockPos(pos);
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof WorkLaptopEntity workLaptop) {
                    buffer.writeFloat(workLaptop.rate);
                    buffer.writeBoolean(workLaptop.isBusiness);
                    buffer.writeLong(workLaptop.lastCheck);
                    buffer.writeUuid(workLaptop.owner);
                    buffer.writeBoolean(workLaptop.isSetup);
                    ServerPlayNetworking.send(player, ModMessages.LAPTOP_SYNC_ID, buffer);
                }
            });
        }
    }
}
