package net.himeki.mcmtfabric.mixin;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import net.himeki.mcmtfabric.parallelised.fastutil.Long2ObjectConcurrentHashMap;
import net.himeki.mcmtfabric.parallelised.fastutil.LongConcurrentSortedSet;
import net.minecraft.world.entity.EntityLike;
import net.minecraft.world.entity.EntityTrackingSection;
import net.minecraft.world.entity.SectionedEntityCache;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SectionedEntityCache.class)
public abstract class SectionedEntityCacheMixin<T extends EntityLike> {

    @Shadow
    @Final
    private final Long2ObjectMap<EntityTrackingSection<T>> trackingSections = new Long2ObjectConcurrentHashMap<>();

//    @Shadow
//    @Final
//    private final LongSortedSet trackedPositions = new LongConcurrentSortedSet();
}