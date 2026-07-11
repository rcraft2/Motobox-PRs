package motobox.item;

import motobox.Motobox;
import motobox.entity.VehicleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;

public class VehicleDyeItem extends Item implements VehicleInteractable {
    private final DyeColor color;

    public VehicleDyeItem(DyeColor color, Settings settings) {
        super(settings);
        this.color = color;
    }

    @Override
    public ActionResult interactVehicle(ItemStack stack, PlayerEntity player, Hand hand, VehicleEntity vehicle) {
        // Only dyeable frames
        boolean isDyeableFrame = vehicle.getFrame().model().modelId().equals(Motobox.id("frame_veloce_v8"));
        
        if (!isDyeableFrame) {
            return ActionResult.PASS;
        }

        if (player.getWorld().isClient()) {
            return ActionResult.SUCCESS;
        }

        // Convert DyeColor to RGB integer
        float[] components = this.color.getColorComponents();
        int red = Math.round(components[0] * 255);
        int green = Math.round(components[1] * 255);
        int blue = Math.round(components[2] * 255);
        int color = (red << 16) | (green << 8) | blue;

        // Apply color to vehicle
        vehicle.setColor(color);
        vehicle.playHitSound();

        // Consume one dye
        if (!player.isCreative()) {
            stack.decrement(1);
        }

        return ActionResult.SUCCESS;
    }
}
