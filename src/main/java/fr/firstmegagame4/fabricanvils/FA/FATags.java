package fr.firstmegagame4.fabricanvils.FA;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class FATags {
    public static final TagKey<Block> FABRICANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("fabricanvils"));
    public static final TagKey<Block> WOODEN_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("wooden_anvils"));
    public static final TagKey<Block> STONE_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("stone_anvils"));
    public static final TagKey<Block> FRAGILE_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("fragile_metal_anvils"));
    public static final TagKey<Block> INFERIOR_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("inferior_metal_anvils"));
    public static final TagKey<Block> METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("metal_anvils"));
    public static final TagKey<Block> SUPERIOR_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("superior_metal_anvils"));
    public static final TagKey<Block> ADVANCED_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("advanced_metal_anvils"));
    public static final TagKey<Block> MORE_ADVANCED_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("more_advanced_metal_anvils"));
    public static final TagKey<Block> EVEN_MORE_ADVANCED_METAL_ANVILS = TagKey.of(RegistryKeys.BLOCK, FAUtils.FAIdentifier("even_more_advanced_metal_anvils"));
}
