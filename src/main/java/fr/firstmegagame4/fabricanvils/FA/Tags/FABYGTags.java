package fr.firstmegagame4.fabricanvils.FA.Tags;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class FABYGTags {
    public static final TagKey<Block> PENDORITE_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("byg/pendorite_anvils"));
    public static final TagKey<Block> AMETRINE_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("byg/ametrine_anvils"));
}
