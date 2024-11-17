package com.toremuyu.stormsurge;

import com.toremuyu.stormsurge.init.ItemsSS;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.zeith.hammerlib.api.items.CreativeTab;
import org.zeith.hammerlib.core.adapter.LanguageAdapter;
import org.zeith.hammerlib.proxy.HLConstants;

@Mod(Stormsurge.MOD_ID)
public class Stormsurge
{
	public static final String MOD_ID = "stormsurge";
	
	@CreativeTab.RegisterTab
	public static final CreativeTab MOD_TAB = new CreativeTab(id("root"),
			builder -> builder
					.icon(() -> ItemsSS.STORMSURGE_STAFF.getDefaultInstance())
					.withTabsBefore(HLConstants.HL_TAB.id())
	);
	
	public Stormsurge()
	{
		LanguageAdapter.registerMod(MOD_ID);
	}
	
	public static ResourceLocation id(String path)
	{
		return new ResourceLocation(MOD_ID, path);
	}
}