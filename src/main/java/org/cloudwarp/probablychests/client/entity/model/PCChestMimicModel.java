package org.cloudwarp.probablychests.client.entity.model;

import net.minecraft.util.Identifier;
import org.cloudwarp.probablychests.ProbablyChests;
import org.cloudwarp.probablychests.entity.PCChestMimic;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PCChestMimicModel extends AnimatedGeoModel<PCChestMimic> {

	private static final Identifier MODEL_IDENTIFIER = new Identifier(ProbablyChests.MOD_ID, "geo/pc_chest_mimic.json");
	private static final Identifier ANIMATION_IDENTIFIER = new Identifier(ProbablyChests.MOD_ID, "animations/pc_chest_mimic.animation.json");
	private Identifier TEXTURE_IDENTIFIER;

	public PCChestMimicModel (String texture) {
		TEXTURE_IDENTIFIER = new Identifier(ProbablyChests.MOD_ID, "textures/entity/" + texture + ".png");
	}

	@Override
	public Identifier getTextureLocation (PCChestMimic entity) {
		return TEXTURE_IDENTIFIER;
	}

	@Override
	public Identifier getModelLocation (PCChestMimic entity) {
		return MODEL_IDENTIFIER;
	}

	@Override
	public Identifier getAnimationFileLocation (PCChestMimic entity) {
		return ANIMATION_IDENTIFIER;
	}
}