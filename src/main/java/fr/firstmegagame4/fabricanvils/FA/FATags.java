package fr.firstmegagame4.fabricanvils.FA;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class FATags {
    public static final TagKey<Block> FABRICANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("fabricanvils"));
    public static final TagKey<Block> WOODEN_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("wooden_anvils"));
    public static final TagKey<Block> STONE_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("stone_anvils"));
    public static final TagKey<Block> FRAGILE_METAL_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("fragile_metal_anvils"));
    public static final TagKey<Block> INFERIOR_METAL_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("inferior_metal_anvils"));
    public static final TagKey<Block> METAL_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("metal_anvils"));
    public static final TagKey<Block> SUPERIOR_METAL_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("superior_metal_anvils"));
    public static final TagKey<Block> ADVANCED_METAL_ANVILS = TagKey.of(Registry.BLOCK_KEY, FAUtils.FAIdentifier("advanced_metal_anvils"));
}
