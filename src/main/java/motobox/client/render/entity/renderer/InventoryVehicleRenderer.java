package motobox.client.render.entity.renderer;

import com.mojang.datafixers.util.Pair;
import immersive_aircraft.Main;
import immersive_aircraft.WeaponRendererRegistry;
import motobox.client.render.entity.renderer.DyeableVehicleEntityRenderer;
import motobox.client.render.entity.renderer.utils.BBModelRenderer;
import immersive_aircraft.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.client.render.entity.weaponRenderer.WeaponRenderer;
import immersive_aircraft.entity.InventoryVehicleEntity;
import immersive_aircraft.entity.inventory.VehicleInventoryDescription;
import immersive_aircraft.entity.weapon.Weapon;
import immersive_aircraft.resources.bbmodel.BBFaceContainer;
import immersive_aircraft.resources.bbmodel.BBMesh;
import immersive_aircraft.resources.bbmodel.BBModel;
import immersive_aircraft.resources.bbmodel.BBObject;
import immersive_aircraft.util.Utils;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BannerItem;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.DyeColor;

public abstract class InventoryVehicleRenderer<T extends InventoryVehicleEntity> extends DyeableVehicleEntityRenderer<T> {
    public InventoryVehicleRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    public void renderLocal(T entity, float yaw, float tickDelta, MatrixStack matrixStack, MatrixStack.Entry peek, VertexConsumerProvider vertexConsumerProvider, int light, List<Integer> anims) {
        super.renderLocal(entity, yaw, tickDelta, matrixStack, peek, vertexConsumerProvider, light, anims);
        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        Iterator var9 = entity.getWeapons().values().iterator();

        label35:
        while(var9.hasNext()) {
            List<Weapon> weapons = (List)var9.next();
            Iterator var11 = weapons.iterator();

            while(true) {
                Weapon weapon;
                do {
                    if (!var11.hasNext()) {
                        continue label35;
                    }

                    weapon = (Weapon)var11.next();
                } while(weapon.getMount().blocking() && Main.firstPersonGetter.isFirstPerson() && player != null && entity.hasPassenger(player));

                WeaponRenderer<Weapon> renderer = WeaponRendererRegistry.get(weapon);
                if (renderer != null) {
                    renderer.render(entity, weapon, matrixStack, vertexConsumerProvider, light, tickDelta);
                }
            }
        }

    }

    public void renderBanners(BBModel model, BBObject ignoredObject, VertexConsumerProvider vertexConsumerProvider, T entity, MatrixStack matrixStack, int light, float ignoredTime, ModelPartRenderHandler<T> ignoredModelPartRenderer) {
        List<ItemStack> slots = entity.getSlots(VehicleInventoryDescription.BANNER);
        int i = 0;
        Iterator var11 = slots.iterator();

        while(var11.hasNext()) {
            ItemStack slot = (ItemStack)var11.next();
            if (!slot.isEmpty() && slot.getItem() instanceof BannerItem) {
                List<Pair<RegistryEntry<BannerPattern>, DyeColor>> patterns = Utils.parseBannerItem(slot);
                int var10001 = i++;
                BBObject bannerObject = (BBObject)model.objectsByName.get("banner_" + var10001);
                if (bannerObject instanceof BBFaceContainer) {
                    BBFaceContainer bannerContainer = (BBFaceContainer)bannerObject;
                    BBModelRenderer.renderBanner(bannerContainer, matrixStack, vertexConsumerProvider, light, true, patterns);
                }
            }
        }

    }

    public void renderSails(BBObject object, VertexConsumerProvider vertexConsumerProvider, T entity, MatrixStack matrixStack, int light, float time) {
        List<ItemStack> slots = entity.getSlots(VehicleInventoryDescription.DYE);
        ItemStack stack = (ItemStack)slots.stream().findFirst().orElse(ItemStack.EMPTY);
        Item var11 = stack.getItem();
        DyeColor color;
        if (var11 instanceof DyeItem item) {
            color = item.getColor();
        } else {
            color = DyeColor.WHITE;
        }

        float r = color.getColorComponents()[0];
        float g = color.getColorComponents()[1];
        float b = color.getColorComponents()[2];
        if (object instanceof BBMesh mesh) {
            BBModelRenderer.renderSailObject(mesh, matrixStack, vertexConsumerProvider, light, time, r, g, b, 1.0F);
        }

    }
}
