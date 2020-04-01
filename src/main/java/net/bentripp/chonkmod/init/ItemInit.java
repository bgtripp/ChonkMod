package net.bentripp.chonkmod.init;

import java.util.function.Supplier;

import net.bentripp.chonkmod.ChonkMod;
import net.bentripp.chonkmod.ChonkMod.ChonkItemGroup;
import net.minecraft.item.Food;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChonkMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ChonkMod.MOD_ID)
public class ItemInit { 
	
	public static final Item chonk_glob = null;
	public static final Item chonk_nugget = null;
	
	public static final Item chonk_wand = null;
	public static final Item chonk_sword = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new Item(new Item.Properties().group(ChonkItemGroup.instance)).setRegistryName("chonk_glob"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChonkItemGroup.instance).food(new Food.Builder().hunger(9).saturation(1.2f).effect(new EffectInstance(Effects.INVISIBILITY, 6000, 5),  1).build())).setRegistryName("chonk_nugget"));

		event.getRegistry().register(new Item(new Item.Properties().group(ChonkItemGroup.instance)).setRegistryName("chonk_wand"));
		event.getRegistry().register(new SwordItem(ModItemTier.CHONK, 7, 2.0f, new Item.Properties().group(ChonkItemGroup.instance)).setRegistryName("chonk_sword"));

	}
	
	public enum ModItemTier implements IItemTier {
		CHONK(4, 500, 8.0f, 7.0f, 250, () -> {
			return Ingredient.fromItems(Items.IRON_BARS);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public float getAttackDamage() {
			// TODO Auto-generated method stub
			return this.attackDamage;
		}

		@Override
		public float getEfficiency() {
			// TODO Auto-generated method stub
			return this.efficiency;
		}

		@Override
		public int getEnchantability() {
			// TODO Auto-generated method stub
			return this.enchantability;
		}

		@Override
		public int getHarvestLevel() {
			// TODO Auto-generated method stub
			return this.harvestLevel;
		}

		@Override
		public int getMaxUses() {
			// TODO Auto-generated method stub
			return this.maxUses;
		}

		@Override
		public Ingredient getRepairMaterial() {
			// TODO Auto-generated method stub
			return this.repairMaterial.getValue();
		}
	}
}