package com.bambam01.realstars.blocks.surface;

import com.bambam01.realstars.RealStars;

public class YellowSuperGiantSurface extends StarSurface {

    private static final String name = "yellowsupergiantsurface";

    public YellowSuperGiantSurface() {
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
        this.fireDuration = RealStars.config.yellowSuperGiantFireDuration;

    }
}
