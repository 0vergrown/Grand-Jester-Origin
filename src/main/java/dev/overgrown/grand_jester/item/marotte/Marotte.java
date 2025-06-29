package dev.overgrown.grand_jester.item.marotte;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

import java.util.UUID;

public class Marotte extends SwordItem {
    // UUIDs for the attribute modifiers
    private static final UUID REACH_MODIFIER_ID = UUID.fromString("7f7dbdb2-0d0e-11ee-be56-0242ac120002");
    private static final UUID ATTACK_RANGE_MODIFIER_ID = UUID.fromString("7f7dbdb2-0d0e-11ee-be56-0242ac120003");

    // Attribute identifiers
    private static final Identifier REACH_ATTRIBUTE_ID = new Identifier("reach-entity-attributes", "reach");
    private static final Identifier ATTACK_RANGE_ATTRIBUTE_ID = new Identifier("reach-entity-attributes", "attack_range");

    public Marotte(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        // Apply attributes when in either hand
        if (slot == EquipmentSlot.MAINHAND || slot == EquipmentSlot.OFFHAND) {
            Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);

            // Get the attributes from the registry
            EntityAttribute reachAttribute = Registries.ATTRIBUTE.get(REACH_ATTRIBUTE_ID);
            EntityAttribute attackRangeAttribute = Registries.ATTRIBUTE.get(ATTACK_RANGE_ATTRIBUTE_ID);

            // Create mutable copy of the modifiers
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
            builder.putAll(modifiers);

            // Add reach attribute if available
            if (reachAttribute != null) {
                builder.put(reachAttribute, new EntityAttributeModifier(
                        REACH_MODIFIER_ID,
                        "Marotte reach bonus",
                        1.5,
                        EntityAttributeModifier.Operation.ADDITION
                ));
            }

            // Add attack range attribute if available
            if (attackRangeAttribute != null) {
                builder.put(attackRangeAttribute, new EntityAttributeModifier(
                        ATTACK_RANGE_MODIFIER_ID,
                        "Marotte attack range bonus",
                        1.5,
                        EntityAttributeModifier.Operation.ADDITION
                ));
            }

            return builder.build();
        }
        return super.getAttributeModifiers(slot);
    }
}