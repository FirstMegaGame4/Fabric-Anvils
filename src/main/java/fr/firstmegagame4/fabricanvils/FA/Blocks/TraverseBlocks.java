package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvils.NormalWoodAnvil;

public class TraverseBlocks implements BlocksInit {

    public static CustomAnvil FIR_ANVIL;

    @Override
    public String getModId() {
        return "traverse";
    }

    @Override
    public BlocksInit init() {
        FIR_ANVIL = new NormalWoodAnvil();

        return this;
    }

    public void register() {
        this.registerModAnvil("fir_anvil", FIR_ANVIL);
    }

    public void registerClient() {
    }

}
