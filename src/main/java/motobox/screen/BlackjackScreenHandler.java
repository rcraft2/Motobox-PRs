package motobox.screen;

import motobox.Motobox;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class BlackjackScreenHandler extends ScreenHandler {
    private final ScreenHandlerContext context;

    public BlackjackScreenHandler(int syncId, PlayerInventory playerInv) {
        this(syncId, playerInv, ScreenHandlerContext.EMPTY);
    }

    public BlackjackScreenHandler(int syncId, PlayerInventory playerInv, ScreenHandlerContext context) {
        super(Motobox.BLACKJACK_SCREEN, syncId);
        this.context = context;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
