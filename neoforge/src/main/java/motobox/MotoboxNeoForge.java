package motobox;

import motobox.registry.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MotoboxNeoForge.MOD_ID)
public class MotoboxNeoForge {
    public static final String MOD_ID = "motobox";

    public MotoboxNeoForge(IEventBus modBus) {
        ModBlocks.register(modBus);
    }
}
