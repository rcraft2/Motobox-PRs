package minecrafttransportsimulator.packets.instances;

import io.netty.buffer.ByteBuf;
import minecrafttransportsimulator.mcinterface.AWrapperWorld;
import minecrafttransportsimulator.mcinterface.IWrapperPlayer;
import minecrafttransportsimulator.packets.components.APacketPlayer;
import minecrafttransportsimulator.systems.MoneySystem;

public class PacketPlayerMoneyUpdate extends APacketPlayer {
    private final int balance;

    public PacketPlayerMoneyUpdate(IWrapperPlayer player, int balance) {
        super(player);
        this.balance = balance;
    }

    public PacketPlayerMoneyUpdate(ByteBuf buf) {
        super(buf);
        this.balance = buf.readInt();
    }

    @Override
    public void writeToBuffer(ByteBuf buf) {
        super.writeToBuffer(buf);
        buf.writeInt(balance);
    }

    @Override
    protected void handle(AWrapperWorld world, IWrapperPlayer player) {
        MoneySystem.setClientBalance(balance);
    }
}