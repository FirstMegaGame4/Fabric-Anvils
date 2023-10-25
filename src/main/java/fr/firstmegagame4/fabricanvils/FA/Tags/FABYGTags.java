package fr.firstmegagame4.fabricanvils.FA.Tags;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class FABYGTags {
    public static final TagKey<Block> PENDORITE_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("byg/pendorite_anvils"));
    public static final TagKey<Block> AMETRINE_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("byg/ametrine_anvils"));
}
