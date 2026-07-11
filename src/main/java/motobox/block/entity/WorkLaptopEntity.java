package motobox.block.entity;

import io.netty.buffer.Unpooled;
import motobox.block.MotoboxBlocks;
import motobox.entity.MotoboxEntities;
import motobox.networking.ModMessages;
import motobox.screen.WorkLaptopScreenHandler;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.MinecraftClient;
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
import java.util.UUID;

public class WorkLaptopEntity extends BlockEntity implements ExtendedScreenHandlerFactory {
    protected final PropertyDelegate propertyDelegate;
    public float rate = 0f;
    public long lastCheck = 6456456;
    public boolean isBusiness = false;

    public boolean isSetup = false;
    public UUID owner = new UUID(565464,6456456);


    public WorkLaptopEntity(BlockPos pos, BlockState state) {
        super(MotoboxBlocks.LAPTOP_BLOCK_ENTITY, pos, state);
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
        return Text.literal("Work Laptop");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new WorkLaptopScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    @Override
    public void cancelRemoval() {
        super.cancelRemoval();
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putUuid("owner", owner);
        nbt.putBoolean("owned", isBusiness);
        nbt.putFloat("rate", rate);
        nbt.putLong("check", lastCheck);
        nbt.putBoolean("setup", isSetup);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
       // play.readNbt(nbt.getCompound("owner"));
        isBusiness = nbt.getBoolean("owned");
        owner = nbt.getUuid("owner");
        rate = nbt.getFloat("rate");
        lastCheck = nbt.getLong("check");
        isSetup = nbt.getBoolean("setup");
    }
}
