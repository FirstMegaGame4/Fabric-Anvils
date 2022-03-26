package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FABYGBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.FATechRebornBlocks;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;

public class FabricAnvilsClient implements ClientModInitializer {

    public static int anvilXpLimit;
    public static boolean xpLimitOnClient;

    @Override
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {

        FAUtils.setCutout(FAMinecraftBlocks.DAMAGED_GOLDEN_ANVIL);

        FAUtils.setCutout(FAMinecraftBlocks.CHIPPED_DIAMOND_ANVIL);
        FAUtils.setCutout(FAMinecraftBlocks.DAMAGED_DIAMOND_ANVIL);

        FAUtils.setCutout(FAMinecraftBlocks.CHIPPED_NETHERITE_ANVIL);
        FAUtils.setCutout(FAMinecraftBlocks.DAMAGED_NETHERITE_ANVIL);

        if (FabricLoader.getInstance().isModLoaded("byg")) {
            FAUtils.setCutout(FABYGBlocks.CHIPPED_AMETRINE_ANVIL);
            FAUtils.setCutout(FABYGBlocks.DAMAGED_AMETRINE_ANVIL);

            FAUtils.setCutout(FABYGBlocks.CHIPPED_PENDORITE_ANVIL);
            FAUtils.setCutout(FABYGBlocks.DAMAGED_PENDORITE_ANVIL);

            FAUtils.setTranslucent(FABYGBlocks.AMETRINE_ANVIL);
            FAUtils.setTranslucent(FABYGBlocks.CHIPPED_AMETRINE_ANVIL);
            FAUtils.setTranslucent(FABYGBlocks.DAMAGED_AMETRINE_ANVIL);
        }

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            FAUtils.setCutout(FATechRebornBlocks.TIN_ANVIL);
            FAUtils.setCutout(FATechRebornBlocks.CHIPPED_TIN_ANVIL);
            FAUtils.setCutout(FATechRebornBlocks.DAMAGED_TIN_ANVIL);
        }

        ClientPlayNetworking.registerGlobalReceiver(FAUtils.FAIdentifier("anvilxplimit"), (client, handler, buf, responseSender) -> {
            anvilXpLimit = buf.readInt();
            xpLimitOnClient = true;
        });
    }
}
