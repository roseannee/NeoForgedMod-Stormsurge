package com.toremuyu.stormsurge.custom.entities;

import com.toremuyu.stormsurge.init.ItemsSS;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.*;

public class EntityLightningBallProjectile extends ThrowableItemProjectile {
    private final Vec3 startPosition;
    private int lifeTime;

    public EntityLightningBallProjectile(Level level, LivingEntity livingEntity) {
        super(EntityType.SNOWBALL, livingEntity, level);

        this.startPosition = this.position();
        this.lifeTime = 100;
        this.setNoGravity(true);
    }

    @Override
    protected Item getDefaultItem() {
        return ItemsSS.STORMSURGE_STAFF;
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);

        if (result.getType() == HitResult.Type.BLOCK) {
            spawnLightningBolt(((ServerLevel) this.level()), BlockPos.containing(result.getLocation()));
        } else if (result.getType() == HitResult.Type.ENTITY) {
            spawnLightningBolt(((ServerLevel) this.level()), BlockPos.containing(result.getLocation()));
        }
        this.discard();
    }

    private void spawnLightningBolt(ServerLevel level, BlockPos pos) {
        EntityType.LIGHTNING_BOLT.spawn(level, pos, MobSpawnType.TRIGGERED);
    }

    @Override
    public void tick() {
        super.tick();

        this.lifeTime--;

        if (this.position().distanceTo(this.startPosition) > 20 || this.lifeTime <= 0) {
            this.discard();
        }
    }
}
