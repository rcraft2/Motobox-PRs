package motobox.entity.custom;

import motobox.entity.MotoboxEntities;
import motobox.item.MotoboxItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class FootballEntity extends Entity {

    private static final TrackedData<Boolean> GROUNDED = DataTracker.registerData(FootballEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    private static final float GRAVITY = 0.04f;
    private static final float AIR_DRAG = 0.99f;
    private static final float GROUND_FRICTION = 0.9f;
    private static final float BOUNCE_FACTOR = 0.45f;
    private static final float BOUNCE_HORIZONTAL_LOSS = 0.6f;
    private static final float MIN_BOUNCE_VEL = 0.08f;

    private Entity owner;

    public FootballEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    public FootballEntity(World world, LivingEntity owner) {
        super(MotoboxEntities.FOOTBALL, world);
        this.owner = owner;
        this.setPosition(owner.getX(), owner.getEyeY() - 0.1, owner.getZ());
    }

    /** Create a placed (grounded) football at the given position */
    public FootballEntity(World world, double x, double y, double z) {
        super(MotoboxEntities.FOOTBALL, world);
        this.setPosition(x, y, z);
        this.setGrounded(true);
    }

    @Override
    protected void initDataTracker() {
        this.dataTracker.startTracking(GROUNDED, false);
    }

    public boolean isGrounded() {
        return this.dataTracker.get(GROUNDED);
    }

    public void setGrounded(boolean grounded) {
        this.dataTracker.set(GROUNDED, grounded);
    }

    public Entity getOwner() {
        return this.owner;
    }

    // ---- Throw setup ----

    public void setVelocity(Entity user, float pitch, float yaw, float roll, float speed, float divergence) {
        float f = -net.minecraft.util.math.MathHelper.sin(yaw * 0.017453292f) * net.minecraft.util.math.MathHelper.cos(pitch * 0.017453292f);
        float g = -net.minecraft.util.math.MathHelper.sin((pitch + roll) * 0.017453292f);
        float h = net.minecraft.util.math.MathHelper.cos(yaw * 0.017453292f) * net.minecraft.util.math.MathHelper.cos(pitch * 0.017453292f);
        Vec3d vel = new Vec3d(f, g, h).normalize().multiply(speed);
        this.setVelocity(vel);
        double hLen = vel.horizontalLength();
        this.setYaw((float)(net.minecraft.util.math.MathHelper.atan2(vel.x, vel.z) * (180.0 / Math.PI)));
        this.setPitch((float)(net.minecraft.util.math.MathHelper.atan2(vel.y, hLen) * (180.0 / Math.PI)));
        this.prevYaw = this.getYaw();
        this.prevPitch = this.getPitch();
    }

    // ---- Tick / Physics ----

    @Override
    public void tick() {
        super.tick();

        if (this.isGrounded()) {
            // Grounded balls don't move, just sit there
            this.setVelocity(Vec3d.ZERO);
            return;
        }

        Vec3d vel = this.getVelocity();

        // Projectile hit detection (entities)
        HitResult hitResult = ProjectileUtil.getEntityCollision(this.getWorld(), this,
                this.getPos(), this.getPos().add(vel),
                this.getBoundingBox().stretch(vel).expand(0.25),
                entity -> entity instanceof PlayerEntity && entity != this.owner);
        if (hitResult != null && hitResult.getType() == HitResult.Type.ENTITY) {
            onEntityHit((EntityHitResult) hitResult);
            return;
        }

        // Apply gravity
        vel = vel.add(0, -GRAVITY, 0);
        // Air drag
        vel = new Vec3d(vel.x * AIR_DRAG, vel.y, vel.z * AIR_DRAG);

        this.setVelocity(vel);
        this.move(MovementType.SELF, vel);

        // Ground / block collision handling
        if (this.isOnGround() || this.horizontalCollision) {
            handleBounce();
        }

        // Update rotation to follow velocity
        double hLen = vel.horizontalLength();
        if (hLen > 0.01) {
            this.setYaw((float) (net.minecraft.util.math.MathHelper.atan2(vel.x, vel.z) * (180.0 / Math.PI)));
            this.setPitch((float) (net.minecraft.util.math.MathHelper.atan2(vel.y, hLen) * (180.0 / Math.PI)));
        }
    }

    private void handleBounce() {
        Vec3d vel = this.getVelocity();

        if (this.isOnGround()) {
            if (Math.abs(vel.y) > MIN_BOUNCE_VEL) {
                // Bounce
                this.setVelocity(vel.x * BOUNCE_HORIZONTAL_LOSS, -vel.y * BOUNCE_FACTOR, vel.z * BOUNCE_HORIZONTAL_LOSS);
            } else {
                // Apply ground friction, slow to a stop
                Vec3d friction = new Vec3d(vel.x * GROUND_FRICTION, 0, vel.z * GROUND_FRICTION);
                if (friction.horizontalLength() < 0.01) {
                    // Ball has stopped — become grounded
                    this.setVelocity(Vec3d.ZERO);
                    this.setGrounded(true);
                } else {
                    this.setVelocity(friction);
                }
            }
        }

        if (this.horizontalCollision) {
            // Wall bounce
            this.setVelocity(vel.x * -0.5, vel.y, vel.z * -0.5);
        }
    }

    // ---- Interaction: catch / pick up / kick ----

    @Override
    public ActionResult interact(PlayerEntity player, Hand hand) {
        if (!this.getWorld().isClient) {
            if (this.isGrounded()) {
                // Grounded ball: check if player is running — kick it
                Vec3d playerVel = player.getVelocity();
                double speed = playerVel.horizontalLength();

                if (speed > 0.05) {
                    // Kick! Power scales with player speed
                    float kickPower = (float) Math.min(speed * 8.0, 2.5);
                    Vec3d lookDir = player.getRotationVector();
                    Vec3d kickVel = new Vec3d(lookDir.x * kickPower, 0.3 + kickPower * 0.15, lookDir.z * kickPower);
                    this.setVelocity(kickVel);
                    this.setGrounded(false);
                    this.owner = player;
                    this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(),
                            SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK, SoundCategory.PLAYERS, 0.8f, 0.9f);
                    return ActionResult.SUCCESS;
                }

                // Standing still near grounded ball: pick it up
                pickUp(player);
                return ActionResult.SUCCESS;
            } else {
                // Moving ball: catch it
                pickUp(player);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.SUCCESS;
    }

    private void onEntityHit(EntityHitResult entityHitResult) {
        Entity hit = entityHitResult.getEntity();
        if (hit instanceof PlayerEntity player && !this.getWorld().isClient) {
            // Player catches the ball
            pickUp(player);
        }
    }

    private void pickUp(PlayerEntity player) {
        ItemStack stack = new ItemStack(MotoboxItems.FOOTBALL);
        if (!player.getInventory().insertStack(stack)) {
            player.dropItem(stack, false);
        }
        this.getWorld().playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS, 0.4f, 1.0f);
        this.discard();
    }

    // ---- Rendering helpers ----

    @Override
    public boolean canHit() {
        return true;
    }

    @Override
    public boolean isCollidable() {
        return true;
    }

    // ---- NBT ----

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        this.setGrounded(nbt.getBoolean("Grounded"));
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        nbt.putBoolean("Grounded", this.isGrounded());
    }
}
