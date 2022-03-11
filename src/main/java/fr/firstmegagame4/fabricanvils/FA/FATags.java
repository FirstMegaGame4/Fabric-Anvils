package fr.firstmegagame4.fabricanvils.FA;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FATags {
    public static final TagKey<Block> FABRICANVILS = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabricanvils", "fabricanvils"));
    public static final TagKey<Block> WOODEN_ANVILS = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabricanvils", "wooden_anvils"));
    public static final TagKey<Block> STONE_ANVILS = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabricanvils", "stone_anvils"));
    public static final TagKey<Block> GOLDEN_ANVILS = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabricanvils", "minecraft/golden_anvils"));
    public static final TagKey<Block> COPPER_ANVILS = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabricanvils", "minecraft/copper_anvils"));
    public static final TagKey<Block> DIAMOND_ANVILS = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabricanvils", "minecraft/diamond_anvils"));
    public static final TagKey<Block> NETHERITE_ANVILS = TagKey.of(Registry.BLOCK_KEY, new Identifier("fabricanvils", "minecraft/netherite_anvils"));
}
