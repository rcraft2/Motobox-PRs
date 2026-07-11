package motobox.util.network;

import motobox.block.entity.WorkLaptopEntity;
import motobox.networking.ModMessages;
import motobox.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.UUID;

public class LaptopS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender response) {
            BlockPos pos = buf.readBlockPos();
            float rate = buf.readFloat();
            boolean isBusiness = buf.readBoolean();
            long lastCheck = buf.readLong();
        UUID owner = buf.readUuid();
        boolean isSetup = buf.readBoolean();

            client.execute(() -> {
                World world = client.world;
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
}
