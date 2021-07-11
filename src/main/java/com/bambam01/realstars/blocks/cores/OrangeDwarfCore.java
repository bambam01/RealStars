package com.bambam01.realstars.blocks.cores;

import com.bambam01.realstars.RealStars;

public class OrangeDwarfCore extends StarCore {

    private static final String name = "orangedwarfcore";

    public OrangeDwarfCore(){
        super();
        setBlockName(name);
        setBlockTextureName(RealStars.MODID + ":" + name);
    }
}
