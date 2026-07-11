package motobox.block.entity;

import motobox.block.MotoboxBlocks;
import motobox.entity.MotoboxEntities;
import motobox.screen.SlotMachineScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import java.time.Instant;

public class SlotMachineEntity extends BlockEntity implements ExtendedScreenHandlerFactory {
    protected final PropertyDelegate propertyDelegate;
    public float rate = 0f;
    public long lastCheck;
    public boolean isBusiness = false;

    public SlotMachineEntity(BlockPos pos, BlockState state) {
        super(MotoboxBlocks.SLOT_MACHINE_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return 0;
            }

            @Override
            public void set(int index, int value) {

            }

            @Override
            public int size() {
                return 0;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);

    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Slot Machine");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new SlotMachineScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
    }
}
