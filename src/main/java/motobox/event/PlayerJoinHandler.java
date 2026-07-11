package motobox.event;

import motobox.networking.ModMessages;
import motobox.util.DailyObjectives;
import motobox.util.AUtils;
import motobox.util.MoneyData;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import motobox.util.IEntityDataSaver;
import net.minecraft.text.Text;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Duration;
import java.time.temporal.TemporalField;

public class PlayerJoinHandler{
    private static final LocalDate MILLION_BONUS_DATE = LocalDate.of(2026, 3, 19);
    private static final String MILLION_BONUS_CLAIMED_KEY = "million_bonus_claimed_date";

    public static void register() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            ServerPlayerEntity player = handler.getPlayer();

            Instant now = Instant.now();
            ServerTickEvents.END_SERVER_TICK.register(new ServerTickEvents.EndTick() {
                private int ticks = 0;
                private boolean hasSynced = false;

                @Override
                public void onEndTick(MinecraftServer server) {
                    if (hasSynced) {
                        return;
                    }
                    ticks++;
                    if (ticks > 20) { // Wait 20 ticks (1 second) before syncing
                        long time = now.getEpochSecond();
                        LocalDate today = LocalDate.now();
                        String todayKey = today.toString();

                        DailyObjectives.ensureForToday(player);

                        // One-time bonus for today only.
                        if (today.equals(MILLION_BONUS_DATE)) {
                            IEntityDataSaver dataSaver = (IEntityDataSaver) player;
                            String claimedDate = dataSaver.getPersistentData().getString(MILLION_BONUS_CLAIMED_KEY);
                            if (!todayKey.equals(claimedDate)) {
                                MoneyData.addMoney(dataSaver, 1_000_000);
                                dataSaver.getPersistentData().putString(MILLION_BONUS_CLAIMED_KEY, todayKey);
                                player.sendMessage(Text.literal("Today bonus: Awarded $1,000,000!"));
                            }
                        }

                        /*if (time < 1726184398 && player.getName().equals(Text.literal("rjcraft14"))) {
                            //((IEntityDataSaver)player).getPersistentData().putInt("trophy", 1);
                            IEntityDataSaver play = (IEntityDataSaver) player;
                            NbtList list = play.getPersistentData().getList("ownedcars", 8);
                            list.add(NbtString.of("motobox:frame_veloce_v8"));
                            list.add(NbtString.of("motobox:vrd_engine"));
                            play.getPersistentData().put("ownedcars", list);
                        }*/
                        if (time < 1728259199 && ((IEntityDataSaver)player).getPersistentData().getLong("timeJoined") < 1728172799) {
                            MoneyData.addMoney((IEntityDataSaver) player, 55555);
                            ((IEntityDataSaver)player).getPersistentData().putLong("timeJoined", time);
                            player.sendMessage(Text.literal("Happy Empire Day! Awarded: $55,555"));
                            IEntityDataSaver play = (IEntityDataSaver) player;
                            NbtList list = play.getPersistentData().getList("ownedcars", 8);
                            list.add(NbtString.of("motobox:frame_mach5"));
                            play.getPersistentData().put("ownedcars", list);
                            if (player.getName().equals(Text.literal("rjcraft14"))) {
                                list.add(NbtString.of("motobox:frame_veloce_v8"));
                                list.add(NbtString.of("motobox:vrd_engine"));
                            }
                            play.getPersistentData().put("ownedcars", list);
                        }
                        if (time - ((IEntityDataSaver)player).getPersistentData().getLong("timeJoined") >= 86400) {
                            MoneyData.addMoney((IEntityDataSaver) player, 1000);
                            ((IEntityDataSaver)player).getPersistentData().putLong("timeJoined", time);
                            player.sendMessage(Text.literal("Awarded $1000 for joining!"));
                        }
                        else {
                            MoneyData.addMoney((IEntityDataSaver) player, 0);
                        }
                        hasSynced = true;
                       // ServerTickEvents.END_SERVER_TICK.unregister(this); // Unregister after syncing
                    }
                }
            });
            //ClientPlayNetworking.send(ModMessages.MONEY_ID, PacketByteBufs.create());

        });
    }


}
