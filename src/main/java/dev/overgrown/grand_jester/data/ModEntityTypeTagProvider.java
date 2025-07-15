package dev.overgrown.grand_jester.data;

import dev.overgrown.grand_jester.GrandJester;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ModEntityTypeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Create tag key for mocked_mobs
        TagKey<EntityType<?>> mockedMobsTag = TagKey.of(RegistryKeys.ENTITY_TYPE, GrandJester.identifier("mocked_mobs"));
        FabricTagBuilder builder = getOrCreateTagBuilder(mockedMobsTag);

        // Add all hostile mobs with optional entries
        addOptional(builder, EntityType.BLAZE);
        addOptional(builder, EntityType.CAVE_SPIDER);
        addOptional(builder, EntityType.CREEPER);
        addOptional(builder, EntityType.DROWNED);
        addOptional(builder, EntityType.ELDER_GUARDIAN);
        addOptional(builder, EntityType.ENDERMAN);
        addOptional(builder, EntityType.ENDERMITE);
        addOptional(builder, EntityType.EVOKER);
        addOptional(builder, EntityType.GHAST);
        addOptional(builder, EntityType.GUARDIAN);
        addOptional(builder, EntityType.HOGLIN);
        addOptional(builder, EntityType.HUSK);
        addOptional(builder, EntityType.ILLUSIONER);
        addOptional(builder, EntityType.MAGMA_CUBE);
        addOptional(builder, EntityType.PHANTOM);
        addOptional(builder, EntityType.PIGLIN);
        addOptional(builder, EntityType.PIGLIN_BRUTE);
        addOptional(builder, EntityType.PILLAGER);
        addOptional(builder, EntityType.RAVAGER);
        addOptional(builder, EntityType.SHULKER);
        addOptional(builder, EntityType.SILVERFISH);
        addOptional(builder, EntityType.SKELETON);
        addOptional(builder, EntityType.SLIME);
        addOptional(builder, EntityType.SPIDER);
        addOptional(builder, EntityType.STRAY);
        addOptional(builder, EntityType.VEX);
        addOptional(builder, EntityType.VINDICATOR);
        addOptional(builder, EntityType.WARDEN);
        addOptional(builder, EntityType.WITCH);
        addOptional(builder, EntityType.WITHER);
        addOptional(builder, EntityType.WITHER_SKELETON);
        addOptional(builder, EntityType.ZOGLIN);
        addOptional(builder, EntityType.ZOMBIE);
        addOptional(builder, EntityType.ZOMBIE_VILLAGER);
        addOptional(builder, EntityType.ZOMBIFIED_PIGLIN);
    }

    // Helper method to add entity types as optional entries
    private void addOptional(FabricTagBuilder builder, EntityType<?> entityType) {
        Identifier id = Registries.ENTITY_TYPE.getId(entityType);
        builder.addOptional(id);
    }
}