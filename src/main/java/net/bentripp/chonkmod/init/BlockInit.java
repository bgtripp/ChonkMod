package net.bentripp.chonkmod.init;

import net.bentripp.chonkmod.ChonkMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ChonkMod.MOD_ID)
@Mod.EventBusSubscriber(modid = ChonkMod.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final Block chonk_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.CAKE).harvestTool(ToolType.AXE).hardnessAndResistance(0.7f, 15.0f).sound(SoundType.PLANT)).setRegistryName("chonk_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(chonk_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("chonk_block"));
	}
}
