package motobox.util.network;

import motobox.util.AUtils;
import motobox.util.IEntityDataSaver;
import motobox.util.MoneyData;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class MoneyC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buffer, PacketSender response) {
        //float money = MoneyData.addMoney((IEntityDataSaver) player, 500f);
        MoneyData.addMoney((IEntityDataSaver) player, buffer.readDouble());
    }
}
