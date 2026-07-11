package motobox.util;

import motobox.networking.ModMessages;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class MoneyData {
    public static double addMoney(IEntityDataSaver player, double amount) {
        NbtCompound nbt = player.getPersistentData();
        double money = nbt.getDouble("money");

        money = money + amount;
        nbt.putDouble("money", money);
        syncMoney(money, (ServerPlayerEntity) player);
        return money;
    }

    public static double removeMoney(IEntityDataSaver player, double amount) {
        NbtCompound nbt = player.getPersistentData();
        double money = nbt.getDouble("money");

        money = money - amount;
        nbt.putDouble("money", money);
        syncMoney(money, (ServerPlayerEntity) player);
        return money;
    }

    public static void syncMoney(double money, ServerPlayerEntity player) {
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeDouble(money);
        ServerPlayNetworking.send(player, ModMessages.MONEY_SYNC_ID, buf);

    }
}
