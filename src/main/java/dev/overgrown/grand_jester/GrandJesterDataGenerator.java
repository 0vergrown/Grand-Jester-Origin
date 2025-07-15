package dev.overgrown.grand_jester;

import dev.overgrown.grand_jester.data.ModEntityTypeTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GrandJesterDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		// Register entity type tag provider
		pack.addProvider(ModEntityTypeTagProvider::new);
	}
}