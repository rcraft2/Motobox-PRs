package motobox.entity.planes;

import immersive_aircraft.entity.AircraftEntity;
import immersive_aircraft.entity.AirplaneEntity;
import immersive_aircraft.entity.misc.Trail;
import motobox.Motobox;
import motobox.entity.MotoboxEntities;
import motobox.item.MotoboxItems;
import net.minecraft.entity.EntityData;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.ArrayList;
import java.util.List;

public class TexanPlaneEntity extends AirplaneEntity {
    public List<Integer> animations;

    public TexanPlaneEntity(EntityType<? extends AircraftEntity> entityType, World world) {
        super(entityType, world, true);
        animations = new ArrayList<>();
        animations.add(2);
    }


    @Override
    public Item asItem() {
        return MotoboxItems.TEXAN_PLANE_ITEM;
    }

    private final List<Trail> trails = List.of(new Trail(60), new Trail(60), new Trail(30), new Trail(30));

    @Override
    public List<Trail> getTrails() {
        return trails;
    }

    protected void trail(Matrix4f transform, int index, float x, float y, float z, float thickness) {
        Vector4f p0 = transformPosition(transform, x, y - thickness, z);
        Vector4f p1 = transformPosition(transform, x, y + thickness, z);
        Vec3d vel = this.getVelocity();
        if (Double.isFinite(vel.x) && Double.isFinite(vel.y) && Double.isFinite(vel.z)) {
            float trailStrength = Math.max(0.0f, Math.min(1.0f, (float) (Math.sqrt(vel.length()) * (0.5f + (pressingInterpolatedX.getSmooth() * x) * 0.025f) - 0.25f)));
            getTrails().get(index).add(p0, p1, trailStrength);
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getWorld().isClient) {
            if (this.hasPassengers() && !animations.contains(0)) {
                animations.clear();
                animations.add(0);
            }
            boolean isMoving = this.getVelocity().lengthSquared() > 0.1;
            if (this.hasPassengers() && !animations.contains(1) && isMoving) {
                animations.clear();
                animations.add(1);
            }
            if (this.hasPassengers() && this.getVelocity().lengthSquared() > 4 && !animations.contains(2)) {
                animations.remove(Integer.valueOf(3));
                animations.add(2);
            }
            if (this.hasPassengers() && this.getVelocity().lengthSquared() <= 4 && !animations.contains(3)) {
                animations.remove(Integer.valueOf(2));
                animations.add(3);
            }
            if (!this.hasPassengers()) {
                animations.clear();
            }
            System.out.println(animations);

        }
        if (Float.isNaN(this.getYaw()) || Float.isNaN(this.getPitch()) || Float.isNaN(this.getRoll())) {
            System.err.println("NaN detected in TexanPlaneEntity rotation! Resetting.");
            this.setYaw(0.0F);
            this.setPitch(0.0F);
        }
    }

    @Override
    public double getZoom() {
        return 12.0;
    }
}