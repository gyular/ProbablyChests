package org.cloudwarp.probablychests.world.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.floatprovider.ConstantFloatProvider;
import net.minecraft.util.math.floatprovider.FloatProvider;
import net.minecraft.util.math.floatprovider.UniformFloatProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.minecraft.world.gen.placementmodifier.*;
import org.cloudwarp.probablychests.ProbablyChests;

public class PCFeatures {
	private static final Feature<PCChestFeatureConfig> PC_CHEST = new PCChestFeature(PCChestFeatureConfig.CODEC);

	public static final RegistryEntry<ConfiguredFeature<PCChestFeatureConfig, ?>> LUSH_CHEST =
			ConfiguredFeatures.register("lush_chest", PC_CHEST, new PCChestFeatureConfig(UniformFloatProvider.create(0f,1f)));

	public static final RegistryEntry<PlacedFeature> LUSH_CHEST_PLACED = PlacedFeatures.register("lush_chest_placed",
			LUSH_CHEST, CountPlacementModifier.of(2), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE,
			EnvironmentScanPlacementModifier.of(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.IS_AIR, 12),
			BiomePlacementModifier.of());
	//RarityFilterPlacementModifier.of(4)
	//

	public static void init(){
		Registry.register(Registry.FEATURE, new Identifier(ProbablyChests.MOD_ID, "pc_chest"), PC_CHEST);
	}
}
