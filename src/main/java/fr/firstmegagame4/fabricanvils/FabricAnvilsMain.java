package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.Blocks.BYGBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.BlocksInit;
import fr.firstmegagame4.fabricanvils.FA.Blocks.MinecraftBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.TechRebornBlocks;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class FabricAnvilsMain implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("fabricanvils");

	public static final ItemGroup FABRICANVILS_GROUP = FabricItemGroupBuilder.build(
			new Identifier(FAUtils.modIdentifier, "anvils"),
			() -> new ItemStack(MinecraftBlocks.BIRCH_ANVIL.getItem())
	);

	@Override
	public void onInitialize() {

		LOGGER.info("Fabric Anvils, by FirstMegaGame4");

		Arrays.stream(new BlocksInit[] {
				new MinecraftBlocks(),
				new BYGBlocks(),
				new TechRebornBlocks(),
		}).forEach(blocks -> {if (FAUtils.isModLoaded(blocks.getModId())) blocks.init().register();});
	}
}
