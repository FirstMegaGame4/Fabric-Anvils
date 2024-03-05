package fr.firstmegagame4.fabricanvils.init;

import fr.firstmegagame4.fabricanvils.FabricAnvils;
import fr.firstmegagame4.fabricanvils.init.item.AnvilItem;
import fr.firstmegagame4.fabricanvils.init.item.FAItemGroup;
import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.function.Supplier;

public class FAUtils {

	public static void setCutout(Block block) {
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
	}

	public static void setTranslucent(Block block) {
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
	}

	public static void registerAnvil(String origin, String blockId, CustomAnvil block) {
		registerBlock(origin + "/" + blockId, block, block.getItem());
	}

	public static void registerBlock(String blockId, Block block, BlockItem blockItem) {
		Registry.register(Registries.BLOCK, FabricAnvils.createId(blockId), block);
		Registry.register(Registries.ITEM, FabricAnvils.createId(blockId), blockItem);

		FAItemGroup.registerItem(blockItem);
	}

	@Nullable
	public static CustomAnvil nextAnvil(CustomAnvil anvil) {
		BlockState nextAnvilState = anvil.getStateOnLanding(anvil.getDefaultState());
		if (nextAnvilState != null) return (CustomAnvil) nextAnvilState.getBlock();
		else return null;
	}

	public static CustomAnvil previousAnvil(CustomAnvil anvil) {
		String originId = Registries.ITEM.getId(anvil.getItem()).getPath().split("/")[0];
		String anvilId = Registries.ITEM.getId(anvil.getItem()).getPath().split("/")[1];

		if (anvilId.startsWith("chipped")) {
			String intactAnvilId = anvilId.split("chipped_")[1];
			return (CustomAnvil) (((AnvilItem) Registries.ITEM.get(FabricAnvils.createId(originId + "/" + intactAnvilId))).getBlock());
		} else if (anvilId.startsWith("damaged")) {
			String chippedAnvilId = "chipped_" + anvilId.split("damaged_")[1];
			Optional<Item> anvilItem = Registries.ITEM.getOrEmpty(FabricAnvils.createId(originId + "/" + chippedAnvilId));
			if (anvilItem.isPresent()) return (CustomAnvil) ((AnvilItem) anvilItem.get()).getBlock();
			else {
				String intactAnvilId = anvilId.split("damaged_")[1];
				return (CustomAnvil) (((AnvilItem) Registries.ITEM.get(FabricAnvils.createId(originId + "/" + intactAnvilId))).getBlock());
			}
		} else return null;
	}

	// before moving to the mmodding library stuff
	public static class PredicatedForBeing<T> {

		private final Supplier<T> initializer;

		private T value = null;

		public PredicatedForBeing(Supplier<T> initializer) {
			this.initializer = initializer;
		}

		public void initialize() {
			this.value = initializer.get();
		}

		public T get() {
			return this.value;
		}
	}
}
