package net.bentripp.chonkmod.init;

import net.bentripp.chonkmod.ChonkMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChonkMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ChonkMod.MOD_ID)
public class ItemInit { 
	
	public static final Item chonk_wand = null;
	public static final Item chonk_sword = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("chonk_wand"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("chonk_sword"));
		
	}
}