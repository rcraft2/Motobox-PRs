package motobox.item;

import motobox.entity.custom.FootballEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class FootballItem extends Item implements GenericMotoboxItem {

    private static final int MAX_CHARGE_TICKS = 40; // 2 seconds max charge
    private static final float MIN_VELOCITY = 0.6f;
    private static final float MAX_VELOCITY = 2.5f;

    public FootballItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 72000;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player == null) return ActionResult.PASS;

        // Shift + right-click on a block: place the football on the ground
        if (player.isSneaking()) {
            World world = context.getWorld();
            if (!world.isClient) {
                BlockPos pos = context.getBlockPos();
                Direction side = context.getSide();
                double x = pos.getX() + 0.5 + side.getOffsetX() * 0.5;
                double y = pos.getY() + (side == Direction.UP ? 1.0 : 0.5 + side.getOffsetY() * 0.5);
                double z = pos.getZ() + 0.5 + side.getOffsetZ() * 0.5;

                FootballEntity football = new FootballEntity(world, x, y, z);
                world.spawnEntity(football);
            }

            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS,
                    0.5f, 1.2f);

            // Always consume the item
            context.getStack().decrement(1);
            return ActionResult.success(world.isClient);
        }

        return ActionResult.PASS;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // If sneaking, let useOnBlock handle it (this handles air-use case)
        if (user.isSneaking()) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!(user instanceof PlayerEntity player)) return;

        int chargeTime = getMaxUseTime(stack) - remainingUseTicks;
        float power = getThrowPower(chargeTime);

        if (!world.isClient) {
            FootballEntity football = new FootballEntity(world, player);
            football.setVelocity(player, player.getPitch(), player.getYaw(), 0.0f, power, 0.5f);
            world.spawnEntity(football);
        }

        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.PLAYERS,
                0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        // Always consume the item, even in creative
        stack.decrement(1);

        player.incrementStat(Stats.USED.getOrCreateStat(this));
    }

    private float getThrowPower(int chargeTime) {
        float charge = Math.min(chargeTime, MAX_CHARGE_TICKS) / (float) MAX_CHARGE_TICKS;
        return MIN_VELOCITY + (MAX_VELOCITY - MIN_VELOCITY) * charge;
    }
}
