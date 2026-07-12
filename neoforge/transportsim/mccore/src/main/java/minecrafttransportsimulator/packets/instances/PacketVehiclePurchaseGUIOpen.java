package minecrafttransportsimulator.packets.instances;

import java.util.UUID;

import io.netty.buffer.ByteBuf;
import minecrafttransportsimulator.entities.instances.EntityVehicleF_Physics;
import minecrafttransportsimulator.guis.instances.GUIVehiclePurchase;
import minecrafttransportsimulator.mcinterface.AWrapperWorld;
import minecrafttransportsimulator.mcinterface.IWrapperPlayer;
import minecrafttransportsimulator.packets.components.APacketBase;
import minecrafttransportsimulator.packets.components.APacketPlayer;

/**
 * Sent from server to a specific player to open the vehicle purchase GUI.
 * The player is already known from the parent class; we additionally carry the vehicle UUID
 * so the client can look up the vehicle and pass it to the GUI.
 */
public class PacketVehiclePurchaseGUIOpen extends APacketPlayer {
    private final UUID vehicleUUID;

    public PacketVehiclePurchaseGUIOpen(IWrapperPlayer player, EntityVehicleF_Physics vehicle) {
        super(player);
        this.vehicleUUID = vehicle.uniqueUUID;
    }

    public PacketVehiclePurchaseGUIOpen(ByteBuf buf) {
        super(buf);
        this.vehicleUUID = APacketBase.readUUIDFromBuffer(buf);
    }

    @Override
    public void writeToBuffer(ByteBuf buf) {
        super.writeToBuffer(buf);
        APacketBase.writeUUIDToBuffer(vehicleUUID, buf);
    }

    @Override
    protected void handle(AWrapperWorld world, IWrapperPlayer player) {
        // Only runs on the client (sent directly to a specific player).
        EntityVehicleF_Physics vehicle = world.getEntity(vehicleUUID);
        if (vehicle != null) {
            new GUIVehiclePurchase(vehicle);
        }
    }
}
