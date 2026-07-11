package motobox.networking;

import motobox.util.network.*;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class ModMessages {
    public static final Identifier MONEY_ID = new Identifier("motobox", "working");
    public static final Identifier ROULETTE_MONEY_ID = new Identifier("motobox", "roulette_money");
    public static final Identifier MONEY_SYNC_ID = new Identifier("motobox", "money_sync");
    public static final Identifier LAPTOP_ID = new Identifier("motobox", "laptop");
    public static final Identifier LAPTOP_SYNC_ID = new Identifier("motobox", "laptop_sync");
    public static final Identifier OWNCAR_ID = new Identifier("motobox", "owncar");
    public static final Identifier OWNCAR_SYNC_ID = new Identifier("motobox", "owncar_sync");
    public static final Identifier DAILY_OBJECTIVE_ID = new Identifier("motobox", "daily_objective");


    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(MONEY_ID, MoneyC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(ROULETTE_MONEY_ID, RouletteMoneyC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(LAPTOP_ID, LaptopC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(OWNCAR_ID, OwnCarC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(DAILY_OBJECTIVE_ID, DailyObjectiveC2SPacket::receive);
    }

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(MONEY_SYNC_ID, MoneyS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(LAPTOP_SYNC_ID, LaptopS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(OWNCAR_SYNC_ID, OwnCarS2CPacket::receive);
    }

}
