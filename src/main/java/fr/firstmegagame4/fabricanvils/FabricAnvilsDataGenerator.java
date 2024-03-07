package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.content.FAContentHandler;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.tuple.Pair;

import java.util.function.Consumer;

public class FabricAnvilsDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		// Initialize Remaining Content For Data Generation
		for (ContentHolder holder : FAContentHandler.getContents()) {
			if (!FabricLoader.getInstance().isModLoaded(holder.getModId())) {
				holder.init();
				holder.register();
			}
		}
		pack.addProvider(FABlockLootTables::new);
		pack.addProvider(FARecipes::new);
	}

	private static class FABlockLootTables extends FabricBlockLootTableProvider {

		private FABlockLootTables(FabricDataOutput dataOutput) {
			super(dataOutput);
		}

		@Override
		public void generate() {
			for (ContentHolder holder : FAContentHandler.getContents()) {
				BlockLootTableGenerator generator = this.withConditions(DefaultResourceConditions.allModsLoaded(holder.getModId()));
				for (FAUtils.PredicatedForBeing<CustomAnvil> anvil : holder.getContent()) {
					generator.addDrop(anvil.get());
				}
			}
		}
	}

	private static class FARecipes extends FabricRecipeProvider {

		private FARecipes(FabricDataOutput output) {
			super(output);
		}

		@Override
		public void generate(Consumer<RecipeJsonProvider> exporter) {
			for (ContentHolder holder : FAContentHandler.getContents()) {
				Consumer<RecipeJsonProvider> generator = this.withConditions(exporter, DefaultResourceConditions.allModsLoaded(holder.getModId()));
				for (FAUtils.PredicatedForBeing<CustomAnvil> anvil : holder.getContent()) {
					String path = Registries.BLOCK.getId(anvil.get()).getPath();
					String name = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("_"));
					String withoutSlash = path.substring(path.lastIndexOf("/") + 1);
					Pair<String, String> inputs = holder.getRule().apply(anvil.get(), name);
					if (!withoutSlash.contains("chipped") && !withoutSlash.contains("damaged") && inputs != null) {
						IdentifierShapedRecipeJsonBuilder.create(RecipeCategory.MISC, anvil.get().getItem())
								.pattern("MMM")
								.pattern(" S ")
								.pattern("SSS")
								.input('M', new Identifier(holder.getModId(), inputs.getLeft()))
								.input('S', new Identifier(holder.getModId(), inputs.getRight()))
								.offerTo(generator);
					}
				}
			}
		}
	}
}
