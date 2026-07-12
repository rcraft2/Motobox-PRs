package minecrafttransportsimulator.guis.instances;

import minecrafttransportsimulator.baseclasses.ColorRGB;
import minecrafttransportsimulator.entities.instances.EntityVehicleF_Physics;
import minecrafttransportsimulator.guis.components.AGUIBase;
import minecrafttransportsimulator.guis.components.GUIComponentButton;
import minecrafttransportsimulator.guis.components.GUIComponentLabel;
import minecrafttransportsimulator.mcinterface.InterfaceManager;
import minecrafttransportsimulator.packets.instances.PacketVehiclePurchaseRequest;
import minecrafttransportsimulator.rendering.RenderText.TextAlignment;
import minecrafttransportsimulator.systems.ConfigSystem;

/**
 * GUI shown when a player attempts to enter an unowned vehicle's driver seat.
 * Lets the player choose to purchase/claim the vehicle or cancel.
 * Money deduction logic can be added later by hooking into {@link PacketVehiclePurchaseRequest}.
 */
public class GUIVehiclePurchase extends AGUIBase {

    private final EntityVehicleF_Physics vehicle;

    public GUIVehiclePurchase(EntityVehicleF_Physics vehicle) {
        super();
        this.vehicle = vehicle;
    }

    @Override
    public void setupComponents() {
        super.setupComponents();

        int centerX = guiLeft + getWidth() / 2;
        double price = ConfigSystem.getVehiclePrice(vehicle);

        // Title
        addComponent(new GUIComponentLabel(centerX, guiTop + 20, ColorRGB.WHITE,
                "Purchase Vehicle?", TextAlignment.CENTERED, 1.0F));

        // Vehicle UUID line (useful until money system is added)
        addComponent(new GUIComponentLabel(centerX, guiTop + 40, ColorRGB.LIGHT_GRAY,
                "ID: " + vehicle.uniqueUUID, TextAlignment.CENTERED, 0.6F));

        // Config-driven price line. Money deduction logic can use this same value later.
        addComponent(new GUIComponentLabel(centerX, guiTop + 56, ColorRGB.WHITE,
            "Price: " + (long) price, TextAlignment.CENTERED, 0.9F));

        // Purchase button
        addComponent(new GUIComponentButton(this, guiLeft + getWidth() / 2 - 110, guiTop + 80, 100, 20, "Purchase") {
            @Override
            public void onClicked(boolean leftSide) {
                InterfaceManager.packetInterface.sendToServer(new PacketVehiclePurchaseRequest(vehicle));
                close();
            }
        });

        // Cancel button
        addComponent(new GUIComponentButton(this, guiLeft + getWidth() / 2 + 10, guiTop + 80, 100, 20, "Cancel") {
            @Override
            public void onClicked(boolean leftSide) {
                close();
            }
        });
    }

    @Override
    public int getWidth() {
        return 250;
    }

    @Override
    public int getHeight() {
        return 120;
    }

    @Override
    public boolean renderBackground() {
        return true;
    }

    @Override
    public boolean capturesPlayer() {
        return true;
    }
}
