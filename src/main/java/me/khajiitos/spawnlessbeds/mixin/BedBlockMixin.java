package me.khajiitos.spawnlessbeds.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.CollisionGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(BedBlock.class)
public class BedBlockMixin {

    @Inject(at = @At("HEAD"), method = "findStandUpPosition", cancellable = true)
    private static void findStandUpPosition(EntityType<?> p_49459_, CollisionGetter p_49460_, BlockPos p_49461_, float p_49462_, CallbackInfoReturnable<Optional<Vec3>> cir) {
        cir.setReturnValue(Optional.empty());
    }
}
