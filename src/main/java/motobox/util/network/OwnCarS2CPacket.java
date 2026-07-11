package motobox.util.network;

import motobox.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;

public class OwnCarS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buffer, PacketSender response) {
        IEntityDataSaver player = (IEntityDataSaver) client.player;
        client.player.sendMessage(Text.literal("In s to c"));
        if (player != null) {
            client.player.sendMessage(Text.literal("player not null"));
            int size = buffer.getInt(0);
            NbtList list = new NbtList();
            for (int i = 0; i < size; i ++) {
                list.add(NbtString.of(buffer.readString()));
            }
            client.player.sendMessage(Text.literal("putting the list into client"));
            player.getPersistentData().put("ownedcars", list);
        }
    }
}
