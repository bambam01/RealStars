package com.bambam01.realstars.blocks.surface;

import com.bambam01.realstars.RealStars;

public class OrangeDwarfSurface extends StarSurface {

    private static final String name = "orangedwarfsurface";

    public OrangeDwarfSurface(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
        this.fireDuration = RealStars.config.orangeDwarfFireDuration;

    }
}
