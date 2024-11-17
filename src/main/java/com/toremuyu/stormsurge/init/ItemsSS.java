package com.toremuyu.stormsurge.init;

import com.toremuyu.stormsurge.custom.items.ItemStormsurgeStaff;
import net.minecraft.world.item.Items;
import org.zeith.hammerlib.annotations.*;
import org.zeith.hammerlib.event.recipe.RegisterRecipesEvent;

@SimplyRegister
public interface ItemsSS {
    @RegistryName("stormsurge_staff")
    ItemStormsurgeStaff STORMSURGE_STAFF = new ItemStormsurgeStaff();

    static void recipes(RegisterRecipesEvent event) {
        event.shaped()
                .shape(" nd", " dn", "s  ")
                .map('d', Items.DIAMOND)
                .map('n', Items.IRON_NUGGET)
                .map('s', Items.STICK)
                .result(ItemsSS.STORMSURGE_STAFF)
                .register();
    }
}
