package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.anvil.*;
import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.content.FAContentHandler;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.tuple.Pair;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

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
		pack.addProvider(FATags::new);
		pack.addProvider(FADefaultLang::new);
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
					if (!withoutSlash.startsWith("chipped") && !withoutSlash.startsWith("damaged") && inputs != null) {
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

	private static class FATags extends FabricTagProvider.BlockTagProvider {

		public FATags(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
			super(output, registriesFuture);
		}

		@Override
		protected void configure(RegistryWrapper.WrapperLookup arg) {
			Function<String, FATags.FabricTagBuilder> provider = s -> this.getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, FabricAnvils.createId(s)));
			this.initDedicatedTags(provider);
			for (ContentHolder holder : FAContentHandler.getContents()) {
				for (FAUtils.PredicatedForBeing<CustomAnvil> anvil : holder.getContent()) {
					Identifier identifier = Registries.BLOCK.getId(anvil.get());
					String withoutSlash = identifier.getPath().substring(identifier.getPath().lastIndexOf("/") + 1);
					if (!withoutSlash.startsWith("chipped") && !withoutSlash.startsWith("damaged")) {
						TagKey<Block> tag = TagKey.of(RegistryKeys.BLOCK, identifier.withPath(s -> s + "s"));
						this.forAnvilTag(this.getOrCreateTagBuilder(tag), holder.getModId(), withoutSlash, identifier);
						this.intoDedicatedTags(provider, anvil, tag);
					}
				}
			}
		}

		private void initDedicatedTags(Function<String, FATags.FabricTagBuilder> provider) {
			provider.apply("wooden_anvils");
			provider.apply("stone_anvils");
			provider.apply("fragile_metal_anvils");
			provider.apply("inferior_metal_anvils");
			provider.apply("metal_anvils");
			provider.apply("superior_metal_anvils");
			provider.apply("advanced_metal_anvils");
			provider.apply("more_advanced_metal_anvils");
			provider.apply("even_more_advanced_metal_anvils");
		}

		private void forAnvilTag(FATags.FabricTagBuilder builder, String modId, String withoutSlash, Identifier identifier) {
			builder.addOptional(identifier);
			Identifier chipped = identifier.withPath(modId + "/chipped_" + withoutSlash);
			if (Registries.BLOCK.containsId(chipped)) {
				builder.addOptional(chipped);
			}
			Identifier damaged = identifier.withPath(modId + "/damaged_" + withoutSlash);
			if (Registries.BLOCK.containsId(damaged)) {
				builder.addOptional(damaged);
			}
		}

		private void intoDedicatedTags(Function<String, FATags.FabricTagBuilder> provider, FAUtils.PredicatedForBeing<CustomAnvil> anvil, TagKey<Block> anvils) {
			if (anvil.get() instanceof WoodenAnvil) {
				provider.apply("wooden_anvils").addOptionalTag(anvils);
			}
			else if (anvil.get() instanceof StoneAnvil) {
				provider.apply("stone_anvils").addOptionalTag(anvils);
			}
			else if (anvil.get() instanceof FragileMetalAnvil) {
				provider.apply("fragile_metal_anvils").addOptionalTag(anvils);
			}
			else if (anvil.get() instanceof InferiorMetalAnvil) {
				provider.apply("inferior_metal_anvils").addOptionalTag(anvils);
			}
			else if (anvil.get() instanceof SuperiorMetalAnvil) {
				provider.apply("superior_metal_anvils").addOptionalTag(anvils);
			}
			else if (anvil.get() instanceof AdvancedMetalAnvil) {
				provider.apply("advanced_metal_anvils").addOptionalTag(anvils);
			}
			else if (anvil.get() instanceof MoreAdvancedMetalAnvil) {
				provider.apply("more_advanced_metal_anvils").addOptionalTag(anvils);
			}
			else if (anvil.get() instanceof EvenMoreAdvancedMetalAnvil) {
				provider.apply("even_more_advanced_metal_anvils").addOptionalTag(anvils);
			}
			else {
				provider.apply("metal_anvils").addOptionalTag(anvils);
			}
		}
	}

	private static class FADefaultLang extends FabricLanguageProvider {

		protected FADefaultLang(FabricDataOutput dataOutput) {
			super(dataOutput);
		}

		@Override
		public void generateTranslations(TranslationBuilder translationBuilder) {
			translationBuilder.add("itemGroup.fabricanvils.anvils", "Fabric Anvils");
			translationBuilder.add("plugin.fabricanvils.anvil_information", "Anvil Information");
			translationBuilder.add("plugin.fabricanvils.anvil_information.damaging_chance", "Damaging Chance");
			translationBuilder.add("plugin.fabricanvils.anvil_information.experience_limit", "Experience Limit");
			translationBuilder.add("plugin.fabricanvils.anvil_information.intact_anvil", "Intact Anvil");
			translationBuilder.add("plugin.fabricanvils.anvil_information.chipped_anvil", "Chipped Anvil");
			translationBuilder.add("plugin.fabricanvils.anvil_information.damaged_anvil", "Damaged Anvil");
			translationBuilder.add("plugin.fabricanvils.anvil_information.anvil_states", "Anvil States");
			translationBuilder.add("plugin.fabricanvils.anvil_information.next_anvil_state", "Next Anvil State");
			translationBuilder.add("plugin.fabricanvils.anvil_information.previous_anvil_state", "Previous Anvil State");
			translationBuilder.add("plugin.fabricanvils.anvil_information.first_anvil_state", "This anvil state is the first state of the anvil.");
			translationBuilder.add("plugin.fabricanvils.anvil_information.last_anvil_state", "This anvil state is the last state of the anvil.");
			for (ContentHolder holder : FAContentHandler.getContents()) {
				for (FAUtils.PredicatedForBeing<CustomAnvil> anvil : holder.getContent()) {
					translationBuilder.add(anvil.get(), this.pathToLang(Registries.BLOCK.getId(anvil.get()).getPath()));
				}
			}
		}

		private String pathToLang(String path) {
			String[] strings = path.substring(path.lastIndexOf("/") + 1).split("_");
			StringBuilder lang = new StringBuilder();
			for (String string : strings) {
				lang.append(String.valueOf(string.charAt(0)).toUpperCase()).append(string.substring(1)).append(" ");
			}
			lang.delete(lang.length() - 1, lang.length());
			return lang.toString();
		}
	}
}
