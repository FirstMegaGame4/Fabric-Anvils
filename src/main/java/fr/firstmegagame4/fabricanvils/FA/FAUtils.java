package fr.firstmegagame4.fabricanvils.FA;

import fr.firstmegagame4.fabricanvils.AnvilItem;
import fr.firstmegagame4.fabricanvils.FA.Items.FAItemGroup;
import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class FAUtils {

    public static String modIdentifier = "fabricanvils";

    public static Identifier FAIdentifier(String path) {
        return new Identifier(modIdentifier, path);
    }

    public static boolean isModLoaded(String modIdentifier) {
        return FabricLoader.getInstance().isModLoaded(modIdentifier);
    }

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
        Registry.register(Registries.BLOCK, FAIdentifier(blockId), block);
        Registry.register(Registries.ITEM, FAIdentifier(blockId), blockItem);

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
            return (CustomAnvil) (((AnvilItem) Registries.ITEM.get(FAIdentifier(originId + "/" + intactAnvilId))).getBlock());
        }
        else if (anvilId.startsWith("damaged")) {
            String chippedAnvilId = "chipped_" + anvilId.split("damaged_")[1];
            Optional<Item> anvilItem = Registries.ITEM.getOrEmpty(FAIdentifier(originId + "/" + chippedAnvilId));
            if (anvilItem.isPresent()) return (CustomAnvil) ((AnvilItem) anvilItem.get()).getBlock();
            else {
                String intactAnvilId = anvilId.split("damaged_")[1];
                return (CustomAnvil) (((AnvilItem) Registries.ITEM.get(FAIdentifier(originId + "/" + intactAnvilId))).getBlock());
            }
        }
        else return null;
    }

}
