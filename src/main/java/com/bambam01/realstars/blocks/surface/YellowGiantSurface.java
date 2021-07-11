package com.bambam01.realstars.blocks.surface;

import com.bambam01.realstars.RealStars;

public class YellowGiantSurface extends StarSurface {

    private static final String name = "yellowgiantsurface";

    public YellowGiantSurface(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
    }
}
