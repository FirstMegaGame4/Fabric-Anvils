package fr.firstmegagame4.fabricanvils.FA.Tags;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class FAMinecraftTags {
    public static final TagKey<Block> GOLDEN_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("minecraft/golden_anvils"));
    public static final TagKey<Block> COPPER_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("minecraft/copper_anvils"));
    public static final TagKey<Block> DIAMOND_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("minecraft/diamond_anvils"));
    public static final TagKey<Block> NETHERITE_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("minecraft/netherite_anvils"));
}
