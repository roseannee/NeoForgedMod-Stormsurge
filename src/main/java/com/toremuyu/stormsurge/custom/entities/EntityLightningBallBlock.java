package com.toremuyu.stormsurge.custom.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;

public abstract class EntityLightningBallBlock extends BlockEntity {
    public EntityLightningBallBlock(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
