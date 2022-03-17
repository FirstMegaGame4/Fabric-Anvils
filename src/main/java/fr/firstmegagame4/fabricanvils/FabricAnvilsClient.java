package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FABYGBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;

public class FabricAnvilsClient implements ClientModInitializer {

    public static int anvilXpLimit;
    public static boolean xpLimitOnClient;

    @Override
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(FAMinecraftBlocks.DAMAGED_GOLDEN_ANVIL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FAMinecraftBlocks.CHIPPED_DIAMOND_ANVIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FAMinecraftBlocks.DAMAGED_DIAMOND_ANVIL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FAMinecraftBlocks.CHIPPED_NETHERITE_ANVIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FAMinecraftBlocks.DAMAGED_NETHERITE_ANVIL, RenderLayer.getCutout());

        if (FabricLoader.getInstance().isModLoaded("byg")) {
            BlockRenderLayerMap.INSTANCE.putBlock(FABYGBlocks.CHIPPED_PENDORITE_ANVIL, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(FABYGBlocks.DAMAGED_PENDORITE_ANVIL, RenderLayer.getCutout());
        }

        ClientPlayNetworking.registerGlobalReceiver(FAUtils.FAIdentifier("anvilxplimit"), (client, handler, buf, responseSender) -> {
            anvilXpLimit = buf.readInt();
            xpLimitOnClient = true;
        });
    }
}
