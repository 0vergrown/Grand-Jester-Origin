package dev.overgrown.grand_jester.item;

import dev.overgrown.grand_jester.GrandJester;
import dev.overgrown.grand_jester.item.jester_hat.JesterHat;
import dev.overgrown.grand_jester.item.marotte.Marotte;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ModItems {

    public static void registerItems() {
        Registry.register(Registries.ITEM, GrandJester.identifier("jester_hat"), JESTER_HAT);
        Registry.register(Registries.ITEM, GrandJester.identifier("marotte"), MAROTTE);
        Registry.register(Registries.ITEM, GrandJester.identifier("patchwork_cloak"), PATCHWORK_CLOAK);
    }

    // Jester Hat
    public static final Item JESTER_HAT = new JesterHat(
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON)
    );

    // Marotte
    public static final Marotte MAROTTE = new Marotte(
            ToolMaterials.WOOD,
            3,
            -2.4F,
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.RARE)
    );

    // Patchwork Cloak (chestplate armor)
    public static final ArmorItem PATCHWORK_CLOAK = new ArmorItem(
            ModArmorMaterials.PATCHWORK_CLOAK,
            ArmorItem.Type.CHESTPLATE,
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON)
    );
}