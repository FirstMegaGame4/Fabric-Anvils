package fr.firstmegagame4.fabricanvils.init;

import fr.firstmegagame4.fabricanvils.FabricAnvils;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class FATags {

	public static final TagKey<Block> FABRICANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("fabricanvils"));
	public static final TagKey<Block> WOODEN_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("wooden_anvils"));
	public static final TagKey<Block> STONE_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("stone_anvils"));
	public static final TagKey<Block> FRAGILE_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("fragile_metal_anvils"));
	public static final TagKey<Block> INFERIOR_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("inferior_metal_anvils"));
	public static final TagKey<Block> METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("metal_anvils"));
	public static final TagKey<Block> SUPERIOR_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("superior_metal_anvils"));
	public static final TagKey<Block> ADVANCED_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("advanced_metal_anvils"));
	public static final TagKey<Block> MORE_ADVANCED_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("more_advanced_metal_anvils"));
	public static final TagKey<Block> EVEN_MORE_ADVANCED_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("even_more_advanced_metal_anvils"));
}
