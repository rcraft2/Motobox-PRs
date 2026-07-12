package minecrafttransportsimulator.packets.instances;

import io.netty.buffer.ByteBuf;
import minecrafttransportsimulator.entities.instances.EntityVehicleF_Physics;
import minecrafttransportsimulator.mcinterface.AWrapperWorld;
import minecrafttransportsimulator.mcinterface.InterfaceManager;
import minecrafttransportsimulator.mcinterface.IWrapperPlayer;
import minecrafttransportsimulator.packets.components.APacketEntityInteract;
import minecrafttransportsimulator.systems.ConfigSystem;
import minecrafttransportsimulator.systems.LanguageSystem;
import minecrafttransportsimulator.systems.MoneySystem;

/**
 * Sent client→server when a player confirms a vehicle purchase from the {@link GUIVehiclePurchase} screen.
 * The server validates funds, deducts cost, grants ownership, and broadcasts the entity state.
 */
public class PacketVehiclePurchaseRequest extends APacketEntityInteract<EntityVehicleF_Physics, IWrapperPlayer> {

    public PacketVehiclePurchaseRequest(EntityVehicleF_Physics vehicle) {
        super(vehicle, minecrafttransportsimulator.mcinterface.InterfaceManager.clientInterface.getClientPlayer());
    }

    public PacketVehiclePurchaseRequest(ByteBuf buf) {
        super(buf);
    }

    @Override
    protected boolean handle(AWrapperWorld world, EntityVehicleF_Physics vehicle, IWrapperPlayer player) {
        // Client receives the rebroadcast of this packet.  Apply authoritative ownership state only.
        if (world.isClient()) {
            if (vehicle.ownerUUID == null) {
                vehicle.grantDriverAccess(player.getID());
            }
            return false;
        }

        // Only grant ownership if the vehicle is still unowned.
        if (vehicle.ownerUUID == null) {
            int price = (int) Math.max(0L, Math.round(ConfigSystem.getVehiclePrice(vehicle)));
            int balance = MoneySystem.processLoginAndGetBalance(player);

            if (!MoneySystem.trySpend(player, price)) {
                player.displayChatMessage(LanguageSystem.INTERACT_VEHICLE_PURCHASE_FUNDS, price, balance);
                InterfaceManager.packetInterface.sendToPlayer(new PacketPlayerMoneyUpdate(player, MoneySystem.getBalance(player)), player);
                return false;
            }

            vehicle.grantDriverAccess(player.getID());
            player.displayChatMessage(LanguageSystem.INTERACT_VEHICLE_PURCHASE_SUCCESS, price);
            InterfaceManager.packetInterface.sendToPlayer(new PacketPlayerMoneyUpdate(player, MoneySystem.getBalance(player)), player);
            return true; // broadcast updated vehicle state to all clients
        }
        return false;
    }
}
