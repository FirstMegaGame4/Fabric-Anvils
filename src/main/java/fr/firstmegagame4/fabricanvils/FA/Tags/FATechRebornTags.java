package fr.firstmegagame4.fabricanvils.FA.Tags;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class FATechRebornTags {
    public static final TagKey<Block> TIN_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("techreborn/tin_anvils"));
}
