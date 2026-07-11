package motobox.util.network;

import motobox.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;

public class MoneyS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buffer, PacketSender response) {
        if (client.player != null) {
            ((IEntityDataSaver) client.player).getPersistentData().putDouble("money", buffer.readDouble());
        }
    }
}
