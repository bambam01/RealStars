package com.bambam01.realstars.blocks.cores;

import com.bambam01.realstars.RealStars;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class RedDwarfCore extends StarCore {

    private static final String name = "reddwarfcore";

    public RedDwarfCore(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
        this.fireDuration = RealStars.config.redDwarfFireDuration;
    }

    @Override
    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity entity) {
        super.onEntityCollidedWithBlock(p_149670_1_, p_149670_2_, p_149670_3_, p_149670_4_, entity);
        if(entity instanceof EntityLivingBase){
            entity.attackEntityFrom(new DamageSource("starCore"), RealStars.config.coreDamage);
        }
    }
}
