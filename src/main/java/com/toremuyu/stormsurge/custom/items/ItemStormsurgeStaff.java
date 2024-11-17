package com.toremuyu.stormsurge.custom.items;

import com.toremuyu.stormsurge.Stormsurge;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemStormsurgeStaff extends Item {
    public ItemStormsurgeStaff() {
        super(new Properties()
                .stacksTo(1)
                .durability(5));
        Stormsurge.MOD_TAB.add(this);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        tooltipComponents.add(Component.translatable("tooltip.stormsurge.stormsurge_staff"));
        super.appendHoverText(stack, level, tooltipComponents, isAdvanced);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
}
