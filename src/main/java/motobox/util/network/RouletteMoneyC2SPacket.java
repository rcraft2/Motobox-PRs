package motobox.util.network;

import motobox.util.IEntityDataSaver;
import motobox.util.MoneyData;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

public class RouletteMoneyC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buffer, PacketSender response) {
        double amount = buffer.readDouble();
        MoneyData.addMoney((IEntityDataSaver) player, amount);
    }
}
