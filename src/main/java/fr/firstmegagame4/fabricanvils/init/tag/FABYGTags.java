package fr.firstmegagame4.fabricanvils.init.tag;

import fr.firstmegagame4.fabricanvils.FabricAnvils;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class FABYGTags {

	public static final TagKey<Block> PENDORITE_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("byg/pendorite_anvils"));
	public static final TagKey<Block> AMETRINE_ANVILS = TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId("byg/ametrine_anvils"));
}
