package com.toremuyu.stormsurge.custom.tiles;

import com.toremuyu.stormsurge.custom.entities.EntityLightningBallBlock;
import com.toremuyu.stormsurge.init.EntitiesSS;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TileLightningBall extends EntityLightningBallBlock{
    public TileLightningBall(BlockPos pos, BlockState state) {
        super(EntitiesSS.LIGHTNING_BALL_TYPE, pos, state);
    }
}
