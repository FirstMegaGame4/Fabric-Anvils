package fr.firstmegagame4.fabricanvils.FA;

import fr.firstmegagame4.fabricanvils.AnvilItem;
import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;
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
        Registry.register(Registry.BLOCK, FAIdentifier(blockId), block);
        Registry.register(Registry.ITEM, FAIdentifier(blockId), blockItem);
    }

    @Nullable
    public static CustomAnvil nextAnvil(CustomAnvil anvil) {
        BlockState nextAnvilState = anvil.getStateOnLanding(anvil.getDefaultState());
        if (nextAnvilState != null) return (CustomAnvil) nextAnvilState.getBlock();
        else return null;
    }

    public static CustomAnvil previousAnvil(CustomAnvil anvil) {
        String originId = Registry.ITEM.getId(anvil.getItem()).getPath().split("/")[0];
        String anvilId = Registry.ITEM.getId(anvil.getItem()).getPath().split("/")[1];

        if (anvilId.startsWith("chipped")) {
            String intactAnvilId = anvilId.split("chipped_")[1];
            return (CustomAnvil) (((AnvilItem) Registry.ITEM.get(FAIdentifier(originId + "/" + intactAnvilId))).getBlock());
        }
        else if (anvilId.startsWith("damaged")) {
            String chippedAnvilId = "chipped_" + anvilId.split("damaged_")[1];
            Optional<Item> anvilItem = Registry.ITEM.getOrEmpty(FAIdentifier(originId + "/" + chippedAnvilId));
            if (anvilItem.isPresent()) return (CustomAnvil) ((AnvilItem) anvilItem.get()).getBlock();
            else {
                String intactAnvilId = anvilId.split("damaged_")[1];
                return (CustomAnvil) (((AnvilItem) Registry.ITEM.get(FAIdentifier(originId + "/" + intactAnvilId))).getBlock());
            }
        }
        else return null;
    }

}
