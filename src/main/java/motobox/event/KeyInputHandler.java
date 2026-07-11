package motobox.event;

import motobox.networking.ModMessages;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.network.PacketByteBuf;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_MOTO = "key.category.moto.bindings";
    public static final String KEY_REFRESH_MONEY_MOTO = "key.moto.refresh.money";

    public static KeyBinding moneyRe;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (moneyRe.wasPressed()) {
                PacketByteBuf buf = PacketByteBufs.create();
                buf.writeDouble(0);
                ClientPlayNetworking.send(ModMessages.MONEY_ID, buf);
            }
        });
    }

    public static void register() {
        moneyRe = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_REFRESH_MONEY_MOTO,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_F12,
                KEY_CATEGORY_MOTO
        ));

        registerKeyInputs();
    }
}
