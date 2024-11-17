package com.toremuyu.stormsurge.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.toremuyu.stormsurge.custom.entities.EntityLightningBallBlock;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.*;

public class LightningBallRenderer<T extends EntityLightningBallBlock> implements BlockEntityRenderer<T> {
    public LightningBallRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(T t, float v, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int i1) {}
}
