package minecrafttransportsimulator.systems;

import minecrafttransportsimulator.mcinterface.AWrapperWorld;
import minecrafttransportsimulator.mcinterface.IWrapperNBT;
import minecrafttransportsimulator.mcinterface.IWrapperPlayer;
import minecrafttransportsimulator.mcinterface.InterfaceManager;

public final class MoneySystem {
    private static final String MONEY_DATA_KEY = "money_data";
    private static final String BALANCE_KEY = "balance";
    private static final String LAST_BONUS_KEY = "last_bonus_time";
    private static final int STARTING_BALANCE = 30000;
    private static final int DAILY_BONUS = 5000;
    private static final long DAILY_BONUS_INTERVAL_MS = 24L * 60L * 60L * 1000L;

    private static int clientBalance;

    private MoneySystem() {
    }

    public static int processLoginAndGetBalance(IWrapperPlayer player) {
        AWrapperWorld world = player.getWorld();
        IWrapperNBT moneyData = world.getData(MONEY_DATA_KEY);
        if (moneyData == null) {
            moneyData = InterfaceManager.coreInterface.getNewNBTWrapper();
        }

        String playerKey = player.getID().toString();
        IWrapperNBT playerData = moneyData.getData(playerKey);
        long now = System.currentTimeMillis();
        boolean modified = false;

        if (playerData == null) {
            playerData = InterfaceManager.coreInterface.getNewNBTWrapper();
            playerData.setInteger(BALANCE_KEY, STARTING_BALANCE);
            playerData.setDouble(LAST_BONUS_KEY, now);
            moneyData.setData(playerKey, playerData);
            modified = true;
        } else {
            double lastBonusTime = playerData.getDouble(LAST_BONUS_KEY);
            if (lastBonusTime == 0) {
                playerData.setDouble(LAST_BONUS_KEY, now);
                modified = true;
            } else if (now - (long) lastBonusTime >= DAILY_BONUS_INTERVAL_MS) {
                playerData.setInteger(BALANCE_KEY, playerData.getInteger(BALANCE_KEY) + DAILY_BONUS);
                playerData.setDouble(LAST_BONUS_KEY, now);
                modified = true;
            }
        }

        if (modified) {
            world.setData(MONEY_DATA_KEY, moneyData);
        }

        return playerData.getInteger(BALANCE_KEY);
    }

    public static int getBalance(IWrapperPlayer player) {
        AWrapperWorld world = player.getWorld();
        IWrapperNBT moneyData = world.getData(MONEY_DATA_KEY);
        if (moneyData == null) {
            return 0;
        }

        IWrapperNBT playerData = moneyData.getData(player.getID().toString());
        return playerData != null ? playerData.getInteger(BALANCE_KEY) : 0;
    }

    public static boolean trySpend(IWrapperPlayer player, int amount) {
        if (amount <= 0) {
            return true;
        }

        AWrapperWorld world = player.getWorld();
        IWrapperNBT moneyData = world.getData(MONEY_DATA_KEY);
        if (moneyData == null) {
            moneyData = InterfaceManager.coreInterface.getNewNBTWrapper();
        }

        String playerKey = player.getID().toString();
        IWrapperNBT playerData = moneyData.getData(playerKey);
        if (playerData == null) {
            // Initialize first-time players consistently with login handling.
            playerData = InterfaceManager.coreInterface.getNewNBTWrapper();
            playerData.setInteger(BALANCE_KEY, STARTING_BALANCE);
            playerData.setDouble(LAST_BONUS_KEY, System.currentTimeMillis());
            moneyData.setData(playerKey, playerData);
        }

        int balance = playerData.getInteger(BALANCE_KEY);
        if (balance < amount) {
            world.setData(MONEY_DATA_KEY, moneyData);
            return false;
        }

        playerData.setInteger(BALANCE_KEY, balance - amount);
        moneyData.setData(playerKey, playerData);
        world.setData(MONEY_DATA_KEY, moneyData);
        return true;
    }

    public static int addMoney(IWrapperPlayer player, int amount) {
        if (amount <= 0) {
            return getBalance(player);
        }

        AWrapperWorld world = player.getWorld();
        IWrapperNBT moneyData = world.getData(MONEY_DATA_KEY);
        if (moneyData == null) {
            moneyData = InterfaceManager.coreInterface.getNewNBTWrapper();
        }

        String playerKey = player.getID().toString();
        IWrapperNBT playerData = moneyData.getData(playerKey);
        if (playerData == null) {
            playerData = InterfaceManager.coreInterface.getNewNBTWrapper();
            playerData.setInteger(BALANCE_KEY, STARTING_BALANCE);
            playerData.setDouble(LAST_BONUS_KEY, System.currentTimeMillis());
        }

        int newBalance = playerData.getInteger(BALANCE_KEY) + amount;
        playerData.setInteger(BALANCE_KEY, newBalance);
        moneyData.setData(playerKey, playerData);
        world.setData(MONEY_DATA_KEY, moneyData);
        return newBalance;
    }

    public static void setClientBalance(int balance) {
        clientBalance = balance;
    }

    public static String getFormattedClientBalance() {
        return String.format("$%,d", clientBalance);
    }
}