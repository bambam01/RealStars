package com.bambam01.realstars.blocks.surface;

import com.bambam01.realstars.RealStars;

public class RedDwarfSurface extends StarSurface {

    private static final String name = "reddwarfsurface";

    public RedDwarfSurface(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
        this.fireDuration = RealStars.config.redDwarfFireDuration;

    }
}
