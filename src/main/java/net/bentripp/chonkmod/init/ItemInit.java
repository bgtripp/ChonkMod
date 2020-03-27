package net.bentripp.chonkmod.init;

import net.bentripp.chonkmod.ChonkMod;
import net.bentripp.chonkmod.ChonkMod.ChonkItemGroup;
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
	public static final Item chonk_glob = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new Item(new Item.Properties().group(ChonkItemGroup.instance)).setRegistryName("chonk_wand"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChonkItemGroup.instance)).setRegistryName("chonk_sword"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChonkItemGroup.instance)).setRegistryName("chonk_glob"));

	}
}