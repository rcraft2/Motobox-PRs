package motobox.screen;

import motobox.Motobox;
import motobox.block.entity.SlotMachineEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class SlotMachineScreenHandler extends ScreenHandler {
    public final SlotMachineEntity blockEntity;

    public SlotMachineScreenHandler(int syncId, PlayerInventory inv, PacketByteBuf buf) {
        this(syncId, inv, inv.player.getWorld().getBlockEntity(buf.readBlockPos()), new ArrayPropertyDelegate(2));
    }

    public SlotMachineScreenHandler(int syncId, PlayerInventory inv, BlockEntity blockEntity, PropertyDelegate prop) {
        super(Motobox.SLOT_SCREEN, syncId);
        this.blockEntity = (SlotMachineEntity) blockEntity;
    }


    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {

        //return super.onButtonClick(player, id);
        player.sendMessage(Text.literal("yippeee"));
        return true;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
