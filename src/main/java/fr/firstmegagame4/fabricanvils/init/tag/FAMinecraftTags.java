package fr.firstmegagame4.fabricanvils.init.tag;

import fr.firstmegagame4.fabricanvils.FabricAnvils;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class FAMinecraftTags {

	public static final TagKey<Block> GOLDEN_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("minecraft/golden_anvils"));
	public static final TagKey<Block> COPPER_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("minecraft/copper_anvils"));
	public static final TagKey<Block> DIAMOND_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("minecraft/diamond_anvils"));
	public static final TagKey<Block> NETHERITE_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("minecraft/netherite_anvils"));
}
