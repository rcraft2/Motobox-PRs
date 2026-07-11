package motobox.persistent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.PersistentState;

public class CustomEntityState extends PersistentState {
    private int customEntityCount = 0;

    // Method to increase the custom entity count
    public void incrementEntityCount() {
        this.customEntityCount++;
        this.markDirty(); // Marks the data as needing to be saved
    }

    // Method to decrease the custom entity count
    public void decrementEntityCount() {
        this.customEntityCount--;
        this.markDirty(); // Marks the data as needing to be saved
    }

    // Method to get the current count
    public int getEntityCount() {
        return this.customEntityCount;
    }

    // Saving the data to NBT
    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putInt("CustomEntityCount", customEntityCount);
        return nbt;
    }

    // Loading the data from NBT
    public static CustomEntityState fromNbt(NbtCompound nbt) {
        CustomEntityState state = new CustomEntityState();
        state.customEntityCount = nbt.getInt("CustomEntityCount");
        return state;
    }
}