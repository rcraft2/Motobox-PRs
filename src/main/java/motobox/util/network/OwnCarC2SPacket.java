package motobox.util.network;

import io.netty.buffer.Unpooled;
import motobox.networking.ModMessages;
import motobox.util.AUtils;
import motobox.util.IEntityDataSaver;
import motobox.util.MoneyData;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class OwnCarC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buffer, PacketSender response) {
        //float money = MoneyData.addMoney((IEntityDataSaver) player, 500f);
        player.sendMessage(Text.literal("Checking if owned car"));
        if (buffer.readBoolean()) {
            player.sendMessage(Text.literal("Adding a car!"));
            NbtList list = ((IEntityDataSaver)player).getPersistentData().getList("ownedcars",8);
            list.add(NbtString.of(buffer.readString()));
            ((IEntityDataSaver)player).getPersistentData().put("ownedcars",list);
        }
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        int size = ((IEntityDataSaver)player).getPersistentData().getList("ownedcars",8).size();
        buf.writeInt(size);
        for (int i = 0; i < size; i ++) {
            buf.writeString(((IEntityDataSaver)player).getPersistentData().getList("ownedcars",8).getString(i));
        }
        player.sendMessage(Text.literal("Sedning back to client"));
        ServerPlayNetworking.send(player, ModMessages.OWNCAR_SYNC_ID,buf);
    }
}
