package dev.overgrown.grand_jester.item;

import dev.overgrown.grand_jester.GrandJester;
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

    // Jester Hat (leather helmet stats)
    public static final ArmorItem JESTER_HAT = new ArmorItem(
            ArmorMaterials.LEATHER,
            ArmorItem.Type.HELMET,
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON)
    );

    // Marotte (sword item)
    public static final SwordItem MAROTTE = new SwordItem(
            ToolMaterials.WOOD, // Same stats as wooden sword
            3,                  // Attack damage bonus
            -2.4F,              // Attack speed modifier
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.RARE)
    );

    // Patchwork Cloak (chestplate armor)
    public static final ArmorItem PATCHWORK_CLOAK = new ArmorItem(
            ArmorMaterials.LEATHER,
            ArmorItem.Type.CHESTPLATE,
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON)
    );
}