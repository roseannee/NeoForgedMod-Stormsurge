package com.toremuyu.stormsurge.init;

import com.toremuyu.stormsurge.client.render.LightningBallRenderer;
import com.toremuyu.stormsurge.custom.blocks.BlockLightningBall;
import com.toremuyu.stormsurge.custom.tiles.TileLightningBall;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.zeith.hammerlib.annotations.*;
import org.zeith.hammerlib.annotations.client.TileRenderer;
import org.zeith.hammerlib.api.forge.BlockAPI;

@SimplyRegister
public interface EntitiesSS {
    @RegistryName("lightning_ball")
    BlockLightningBall LIGHTNING_BALL = new BlockLightningBall();

    @RegistryName("lightning_ball")
    @TileRenderer(LightningBallRenderer.class)
    BlockEntityType<TileLightningBall> LIGHTNING_BALL_TYPE = BlockAPI.createBlockEntityType(TileLightningBall::new, LIGHTNING_BALL);

}
