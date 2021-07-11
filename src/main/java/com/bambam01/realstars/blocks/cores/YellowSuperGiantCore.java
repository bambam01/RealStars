package com.bambam01.realstars.blocks.cores;

import com.bambam01.realstars.RealStars;

public class YellowSuperGiantCore extends StarCore {

    private static final String name = "yellowsupergiantcore";

    public YellowSuperGiantCore(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
        this.fireDuration = RealStars.config.yellowSuperGiantFireDuration;

    }
}
