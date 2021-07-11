package com.bambam01.realstars.blocks.cores;

import com.bambam01.realstars.RealStars;

public class YellowGiantCore extends StarCore {

    private static final String name = "yellowgiantcore";

    public YellowGiantCore(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
        this.fireDuration = RealStars.config.yellowGiantFireDuration;

    }
}
