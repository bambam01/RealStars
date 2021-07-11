package com.bambam01.realstars.blocks.cores;

import com.bambam01.realstars.RealStars;

public class RedDwarfCore extends StarCore {

    private static final String name = "reddwarfcore";

    public RedDwarfCore(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
    }
}
