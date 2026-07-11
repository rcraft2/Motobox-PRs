package motobox.entity.custom;

import motobox.entity.client.GunAttackGoal;
import motobox.persistent.CustomEntityStateManager;
import motobox.util.IEntityDataSaver;
import motobox.util.MoneyData;
import motobox.util.myBulletUtil;
import net.elidhan.anim_guns.entity.projectile.BulletProjectileEntity;
import net.elidhan.anim_guns.item.ModItems;
import net.elidhan.anim_guns.sound.ModSounds;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.*;

public class GangEntity extends SkeletonEntity {
    private GunAttackGoal<GangEntity> gunAttackGoal;
    public GangEntity(EntityType<? extends GangEntity> entityType, World world) {
        super(entityType, world);
        gunAttackGoal = new GunAttackGoal(this, 1.0, 20, 15.0F);
    }

    @Override
    protected void initEquipment(Random random, LocalDifficulty localDifficulty) {
        super.initEquipment(random, localDifficulty);
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(ModItems.MACHINE_PISTOL));
        this.setEquipmentDropChance(EquipmentSlot.MAINHAND, 0.0F);  // Prevents item from dropping

        // Force sync with the client
        this.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
    }

    public static DefaultAttributeContainer.Builder createGangAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 40)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2);
    }

   @Override
    protected boolean isAffectedByDaylight() {
        return false;
    }

    @Override
    public boolean canUseRangedWeapon(RangedWeaponItem weapon) {
        return weapon == ModItems.MACHINE_PISTOL;
    }

    @Override
    public void attack(LivingEntity target, float pullProgress) {
        /*System.out.println("attackingg");
        BulletProjectileEntity bullet = new BulletProjectileEntity((LivingEntity) this, this.getWorld(), 5f, 1);
        double d = target.getX() - this.getX();
        double e = target.getBodyY(0.3333333333333333) - bullet.getY();
        double f = target.getZ() - this.getZ();
        double g = Math.sqrt(d * d + f * f);
        bullet.setVelocity(d, e + g * 0.20000000298023224, f, 1.6F, (float)(14 - this.getWorld().getDifficulty().getId() * 4));
        this.playSound(ModSounds.SMG_MACHINEPISTOL, 1.0F, 1.0F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.getWorld().spawnEntity(bullet);*/
        if (!this.getWorld().isClient()) {
            float[] bulletSpread = new float[]{2.5f, 5f};
            for (int i = 0; i < 1; i++) {
                BulletProjectileEntity bullet = new BulletProjectileEntity(this, this.getWorld(), 1f, 1);

                bullet.setPosition(this.getX(), this.getEyeY(), this.getZ());

                java.util.Random random1 = new java.util.Random();
                Vec3d vertiSpread = myBulletUtil.vertiSpread(this, (random1.nextFloat(-bulletSpread[0] * 5, bulletSpread[0] * 5)));
                Vec3d horiSpread = myBulletUtil.horiSpread(this, (random1.nextFloat(-bulletSpread[1] * 5, bulletSpread[1] * 5)));

                Vec3d result = this.getRotationVector().add(vertiSpread).add(horiSpread);

                bullet.setVelocity(result.getX(), result.getY(), result.getZ(), 20, 0);
                bullet.setBaseVel(bullet.getVelocity());
                bullet.setOwner(this);
                this.playSound(ModSounds.SMG_MACHINEPISTOL, 1.0F, 1.0F / (this.getRandom().nextFloat() * 0.4F + 0.8F));

                this.getWorld().spawnEntity(bullet);
            }
        }
    }

    @Override
    public void updateAttackType() {
        if (this.getWorld() != null && !this.getWorld().isClient) {
            int i = 20;
            if (this.getWorld().getDifficulty() != Difficulty.HARD) {
                i = 40;
            }
            gunAttackGoal = new GunAttackGoal(this, 1.0, 20, 15.0F);
            this.gunAttackGoal.setAttackInterval(i);
            this.goalSelector.add(4, this.gunAttackGoal);
        }
    }



    @Override
    public void onKilledBy(LivingEntity attacker) {
        super.onKilledBy(attacker);

        if (attacker instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) attacker;
            if (!player.isCreative()) {
                MoneyData.addMoney((IEntityDataSaver) player, 200);
            } else {
                player.sendMessage(Text.literal("Must be in survival to earn money!"));
            }

        }
    }

    @Override
    public void onDeath(DamageSource source) {
        super.onDeath(source);  // Call the parent class's onDeath method
        if (!this.getWorld().isClient) {
            if (CustomEntityStateManager.getEntityCount(this.getCommandSource().getWorld()) > 0) {
                CustomEntityStateManager.decrementEntityCount(this.getCommandSource().getWorld());
            }
        }

        // Custom behavior on death
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, NbtCompound entityNbt) {
       if (spawnReason != SpawnReason.EVENT) {
            // Cancel or modify spawn conditions
            this.discard();  // Remove the entity if conditions are not met
        }
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    @Override
    public boolean onKilledOther(ServerWorld world, LivingEntity killedEntity) {
        super.onKilledOther(world, killedEntity);

        if (killedEntity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) killedEntity;

            MoneyData.addMoney((IEntityDataSaver) player, -150);

            // You can also trigger other events, spawn mobs, etc.
        }
        return false;
    }







}
