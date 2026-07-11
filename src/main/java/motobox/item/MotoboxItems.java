package motobox.item;

import immersive_aircraft.item.DyeableAircraftItem;
import motobox.Motobox;
import motobox.common.ToFloatFunctionImpl;
import motobox.entity.MotoboxEntities;
import motobox.entity.planes.TexanPlaneEntity;
import motobox.util.EntityRenderHelper;
import motobox.util.SimpleMapContentRegistry;
import motobox.vehicle.attachment.FrontAttachmentType;
import motobox.vehicle.attachment.RearAttachmentType;
import motobox.vehicle.render.VehicleRenderer;
import motobox.vehicle.render.item.ItemRenderableVehicle;
import motobox.vehicle.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.Model;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.DyeColor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public enum MotoboxItems {
    ;
    public static final Item HAMMER = register("hammer", new HammerItem(new Item.Settings()));
    public static final Item VEHICLE = register("vehicle", new VehicleItem(new Item.Settings().maxCount(1)));
    public static final VehicleFrameItem VEHICLE_FRAME = register("vehicle_frame", new VehicleFrameItem(new Item.Settings().maxCount(16)));
    public static final VehicleWheelItem VEHICLE_WHEEL = register("vehicle_wheel", new VehicleWheelItem(new Item.Settings()));
    public static final VehicleEngineItem VEHICLE_ENGINE = register("vehicle_engine", new VehicleEngineItem(new Item.Settings().maxCount(16)));
    public static final FrontAttachmentItem FRONT_ATTACHMENT = register("front_attachment", new FrontAttachmentItem(new Item.Settings().maxCount(1)));
    public static final RearAttachmentItem REAR_ATTACHMENT = register("rear_attachment", new RearAttachmentItem(new Item.Settings().maxCount(1)));

    public static final Item FOOTBALL = register("football", new FootballItem(new Item.Settings().maxCount(16)));

    // Vehicle Dye Items
    public static final Item VEHICLE_DYE_WHITE = register("vehicle_dye_white", new VehicleDyeItem(DyeColor.WHITE, new Item.Settings()));
    public static final Item VEHICLE_DYE_ORANGE = register("vehicle_dye_orange", new VehicleDyeItem(DyeColor.ORANGE, new Item.Settings()));
    public static final Item VEHICLE_DYE_MAGENTA = register("vehicle_dye_magenta", new VehicleDyeItem(DyeColor.MAGENTA, new Item.Settings()));
    public static final Item VEHICLE_DYE_LIGHT_BLUE = register("vehicle_dye_light_blue", new VehicleDyeItem(DyeColor.LIGHT_BLUE, new Item.Settings()));
    public static final Item VEHICLE_DYE_YELLOW = register("vehicle_dye_yellow", new VehicleDyeItem(DyeColor.YELLOW, new Item.Settings()));
    public static final Item VEHICLE_DYE_LIME = register("vehicle_dye_lime", new VehicleDyeItem(DyeColor.LIME, new Item.Settings()));
    public static final Item VEHICLE_DYE_PINK = register("vehicle_dye_pink", new VehicleDyeItem(DyeColor.PINK, new Item.Settings()));
    public static final Item VEHICLE_DYE_GRAY = register("vehicle_dye_gray", new VehicleDyeItem(DyeColor.GRAY, new Item.Settings()));
    public static final Item VEHICLE_DYE_LIGHT_GRAY = register("vehicle_dye_light_gray", new VehicleDyeItem(DyeColor.LIGHT_GRAY, new Item.Settings()));
    public static final Item VEHICLE_DYE_CYAN = register("vehicle_dye_cyan", new VehicleDyeItem(DyeColor.CYAN, new Item.Settings()));
    public static final Item VEHICLE_DYE_PURPLE = register("vehicle_dye_purple", new VehicleDyeItem(DyeColor.PURPLE, new Item.Settings()));
    public static final Item VEHICLE_DYE_BLUE = register("vehicle_dye_blue", new VehicleDyeItem(DyeColor.BLUE, new Item.Settings()));
    public static final Item VEHICLE_DYE_BROWN = register("vehicle_dye_brown", new VehicleDyeItem(DyeColor.BROWN, new Item.Settings()));
    public static final Item VEHICLE_DYE_GREEN = register("vehicle_dye_green", new VehicleDyeItem(DyeColor.GREEN, new Item.Settings()));
    public static final Item VEHICLE_DYE_RED = register("vehicle_dye_red", new VehicleDyeItem(DyeColor.RED, new Item.Settings()));
    public static final Item VEHICLE_DYE_BLACK = register("vehicle_dye_black", new VehicleDyeItem(DyeColor.BLACK, new Item.Settings()));

    public static Item TEXAN_PLANE_ITEM;

    public static void init() {
        if (TEXAN_PLANE_ITEM == null) {
            try {
                TEXAN_PLANE_ITEM = new_register("texan_plane", () -> new DyeableAircraftItem(new Item.Settings().maxCount(1), world -> new TexanPlaneEntity(MotoboxEntities.TEXAN_ENTITY, world)));
            } catch (Throwable t) {
                // Fallback prevents hard-crash if immersive-aircraft registration is not ready yet.
                TEXAN_PLANE_ITEM = register("texan_plane", new Item(new Item.Settings().maxCount(1)));
            }
        }

        VehicleItem.addPrefabs(
                new VehiclePrefab(Motobox.id("truck"), VehicleFrame.TRUCK, VehicleWheel.SLEEK_RED_OFFROAD, VehicleEngine.DIESEL_FOUR_CYLINDER_ENGINE),
                new VehiclePrefab(Motobox.id("motorbike"), VehicleFrame.MOTORBIKE, VehicleWheel.MOTORBIKE, VehicleEngine.MOTORBIKE_ENGINE),
                new VehiclePrefab(Motobox.id("rusty_car"), VehicleFrame.RUSTY_CAR, VehicleWheel.RUSTY_STEEL, VehicleEngine.DIESEL_FOUR_CYLINDER_ENGINE)
        );
    }


    @Environment(EnvType.CLIENT)
    private static EntityRendererFactory.Context cachedCtx;
    @Environment(EnvType.CLIENT)
    private static final Map<VehicleFrame, Model> frameModelPool = new HashMap<>();
    @Environment(EnvType.CLIENT)
    private static final Map<VehicleWheel, Model> wheelModelPool = new HashMap<>();
    @Environment(EnvType.CLIENT)
    private static final Map<VehicleEngine, Model> engineModelPool = new HashMap<>();
    @Environment(EnvType.CLIENT)
    private static final Map<RearAttachmentType<?>, Model> rearAttModelPool = new HashMap<>();
    @Environment(EnvType.CLIENT)
    private static final Map<FrontAttachmentType<?>, Model> frontAttModelPool = new HashMap<>();

    private static final VehicleData reader = new VehicleData();

    @Environment(EnvType.CLIENT)
    public static void initClient() {
        var itemVehicle = new ItemRenderableVehicle(reader);
        EntityRenderHelper.registerContextListener(ctx -> {
            cachedCtx = ctx;
            rearAttModelPool.clear();
        });

        BuiltinItemRendererRegistry.INSTANCE.register(VEHICLE, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            if (cachedCtx != null) {
                reader.read(stack.getOrCreateSubNbt("Vehicle"));
                float wheelDist = reader.getFrame().model().lengthPx().getFloat() / 16;
                float scale = 1;
                scale /= wheelDist * 0.77f;
                matrices.push();
                matrices.scale(scale, scale, scale);
                VehicleRenderer.render(matrices, vertexConsumers, light, overlay, MinecraftClient.getInstance().getTickDelta(), cachedCtx, itemVehicle);
                matrices.pop();
            }
        });
        VEHICLE_FRAME.registerItemRenderer(
                pooledModelProvider(t -> t.model().model().apply(cachedCtx), frameModelPool),
                t -> t.model().texture(), (ToFloatFunctionImpl<VehicleFrame>) (t) -> 1 / ((t.model().lengthPx().getFloat() / 16) * 0.77f)
        );
        VEHICLE_WHEEL.registerItemRenderer(
                pooledModelProvider(t -> t.model().model().apply(cachedCtx), wheelModelPool),
                t -> t.model().texture(), (ToFloatFunctionImpl<VehicleWheel>) t -> 6 / t.model().radius()
        );
        VEHICLE_ENGINE.registerItemRenderer(
                pooledModelProvider(t -> t.model().model().apply(cachedCtx), engineModelPool),
                t -> t.model().texture(), (ToFloatFunctionImpl<VehicleEngine>) t -> 1
        );
        REAR_ATTACHMENT.registerItemRenderer(
                pooledModelProvider(t -> t.model().model().apply(cachedCtx), rearAttModelPool),
                t -> t.model().texture(), (ToFloatFunctionImpl<RearAttachmentType<?>>) t -> t.model().scale().getFloat()
        );
        FRONT_ATTACHMENT.registerItemRenderer(
                pooledModelProvider(t -> t.model().model().apply(cachedCtx), frontAttModelPool),
                t -> t.model().texture(), (ToFloatFunctionImpl<FrontAttachmentType<?>>) t -> t.model().scale()
        );
    }

    private static <T extends SimpleMapContentRegistry.Identifiable> Function<T, Model> pooledModelProvider(Function<T, Model> provider, Map<T, Model> pool) {
        return t -> {
            if (!pool.containsKey(t)) {
                var model = provider.apply(t);
                pool.put(t, model);
                return model;
            }
            return pool.get(t);
        };
    }

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Motobox.id(name), item);
    }

    private static Item new_register(String name, Supplier<Item> itemSupplier) {
        return Registry.register(Registries.ITEM, Motobox.id(name), itemSupplier.get());
    }
}
