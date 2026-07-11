package motobox.util.network;

import motobox.util.DailyObjectives;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

public class DailyObjectiveC2SPacket {
    public static final String BLACKJACK_WIN = "blackjack_win";
    public static final String SLOT_WIN = "slot_win";

    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buffer, PacketSender response) {
        String objective = buffer.readString();

        server.execute(() -> {
            if (BLACKJACK_WIN.equals(objective)) {
                DailyObjectives.onBlackjackWin(player);
            } else if (SLOT_WIN.equals(objective)) {
                DailyObjectives.onSlotMachineWin(player);
            }
        });
    }
}
