package org.cloudwarp.mobscarecrow.blockentities;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import org.cloudwarp.mobscarecrow.registry.ModBlocks;

public class SkeletonScarecrowBigBlockEntity extends BlockEntity {
	public SkeletonScarecrowBigBlockEntity (BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
