package motobox.persistent;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.PersistentState;

public class CustomEntityStateManager {

    // Get or create the CustomEntityState for a specific world
    public static CustomEntityState getOrCreate(ServerWorld world) {
        return world.getPersistentStateManager().getOrCreate(
                CustomEntityState::fromNbt,         // Method to load from NBT
                CustomEntityState::new,             // Method to create a new instance
                "custom_entity_count"               // The unique key to save the data
        );
    }

    // Increment the custom entity count in the world
    public static void incrementEntityCount(ServerWorld world) {
        CustomEntityState state = getOrCreate(world);
        state.incrementEntityCount();
    }

    // Decrement the custom entity count in the world
    public static void decrementEntityCount(ServerWorld world) {
        CustomEntityState state = getOrCreate(world);
        state.decrementEntityCount();
    }

    // Get the current count of custom entities
    public static int getEntityCount(ServerWorld world) {
        CustomEntityState state = getOrCreate(world);
        return state.getEntityCount();
    }
}