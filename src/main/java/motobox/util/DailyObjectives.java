package motobox.util;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import java.time.LocalDate;

public final class DailyObjectives {
    public static final int REQUIRED_GANG_KILLS = 3;
    public static final int COMPLETE_REWARD = 20_000;

    private static final String DAY_KEY = "daily_objectives_day";
    private static final String GANG_KILLS_KEY = "daily_objectives_gang_kills";
    private static final String BLACKJACK_WIN_KEY = "daily_objectives_blackjack_win";
    private static final String SLOT_WIN_KEY = "daily_objectives_slot_win";
    private static final String REWARD_CLAIMED_KEY = "daily_objectives_reward_claimed";

    private DailyObjectives() {
    }

    public static void ensureForToday(ServerPlayerEntity player) {
        IEntityDataSaver dataSaver = (IEntityDataSaver) player;
        NbtCompound nbt = dataSaver.getPersistentData();

        String today = LocalDate.now().toString();
        String savedDay = nbt.getString(DAY_KEY);

        if (!today.equals(savedDay)) {
            nbt.putString(DAY_KEY, today);
            nbt.putInt(GANG_KILLS_KEY, 0);
            nbt.putBoolean(BLACKJACK_WIN_KEY, false);
            nbt.putBoolean(SLOT_WIN_KEY, false);
            nbt.putBoolean(REWARD_CLAIMED_KEY, false);
            player.sendMessage(Text.literal("Daily objectives reset."));
        }
    }

    public static void onGangMemberKill(ServerPlayerEntity player) {
        ensureForToday(player);

        NbtCompound nbt = ((IEntityDataSaver) player).getPersistentData();
        int currentKills = nbt.getInt(GANG_KILLS_KEY);
        if (currentKills < REQUIRED_GANG_KILLS) {
            currentKills++;
            nbt.putInt(GANG_KILLS_KEY, currentKills);
            player.sendMessage(Text.literal("Daily Objective: Gang members " + currentKills + "/" + REQUIRED_GANG_KILLS));
        }

        tryComplete(player);
    }

    public static void onBlackjackWin(ServerPlayerEntity player) {
        ensureForToday(player);

        NbtCompound nbt = ((IEntityDataSaver) player).getPersistentData();
        if (!nbt.getBoolean(BLACKJACK_WIN_KEY)) {
            nbt.putBoolean(BLACKJACK_WIN_KEY, true);
            player.sendMessage(Text.literal("Daily Objective complete: Win a blackjack game."));
        }

        tryComplete(player);
    }

    public static void onSlotMachineWin(ServerPlayerEntity player) {
        ensureForToday(player);

        NbtCompound nbt = ((IEntityDataSaver) player).getPersistentData();
        if (!nbt.getBoolean(SLOT_WIN_KEY)) {
            nbt.putBoolean(SLOT_WIN_KEY, true);
            player.sendMessage(Text.literal("Daily Objective complete: Win a slot game."));
        }

        tryComplete(player);
    }

    private static void tryComplete(ServerPlayerEntity player) {
        NbtCompound nbt = ((IEntityDataSaver) player).getPersistentData();

        if (nbt.getBoolean(REWARD_CLAIMED_KEY)) {
            return;
        }

        boolean gangDone = nbt.getInt(GANG_KILLS_KEY) >= REQUIRED_GANG_KILLS;
        boolean blackjackDone = nbt.getBoolean(BLACKJACK_WIN_KEY);
        boolean slotDone = nbt.getBoolean(SLOT_WIN_KEY);

        if (gangDone && blackjackDone && slotDone) {
            nbt.putBoolean(REWARD_CLAIMED_KEY, true);
            MoneyData.addMoney((IEntityDataSaver) player, COMPLETE_REWARD);
            player.sendMessage(Text.literal("Daily objectives complete! Awarded $" + COMPLETE_REWARD + "."));
        }
    }
}
