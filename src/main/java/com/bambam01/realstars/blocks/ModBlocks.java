package com.bambam01.realstars.blocks;

import com.bambam01.realstars.RealStars;
import com.bambam01.realstars.blocks.cores.*;
import com.bambam01.realstars.blocks.surface.OrangeDwarfSurface;
import com.bambam01.realstars.blocks.surface.RedDwarfSurface;
import com.bambam01.realstars.blocks.surface.YellowGiantSurface;
import com.bambam01.realstars.blocks.surface.YellowSuperGiantSurface;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    public static Block redDwarfCore;
    public static Block orangeDwarfCore;
    public static Block yellowGiantCore;
    public static Block yellowSuperGiantCore;

    public static Block redDwarfSurface;
    public static Block orangeDwarfSurface;
    public static Block yellowGiantSurface;
    public static Block yellowSuperGiantSurface;

    public static void init() {
        redDwarfCore = new RedDwarfCore();
        GameRegistry.registerBlock(redDwarfCore, "reddwarfcore").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);
        orangeDwarfCore = new OrangeDwarfCore();
        GameRegistry.registerBlock(orangeDwarfCore, "orangedwarfcore").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);
        yellowGiantCore = new YellowGiantCore();
        GameRegistry.registerBlock(yellowGiantCore, "yellowgiantcore").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);
        yellowSuperGiantCore = new YellowSuperGiantCore();
        GameRegistry.registerBlock(yellowSuperGiantCore, "yellowsupergiantcore").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);

        redDwarfSurface = new RedDwarfSurface();
        GameRegistry.registerBlock(redDwarfSurface, "reddwarfsurface").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);
        orangeDwarfSurface = new OrangeDwarfSurface();
        GameRegistry.registerBlock(orangeDwarfSurface, "orangedwarfsurface").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);
        yellowGiantSurface = new YellowGiantSurface();
        GameRegistry.registerBlock(yellowGiantSurface, "yellowgiantsurface").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);
        yellowSuperGiantSurface = new YellowSuperGiantSurface();
        GameRegistry.registerBlock(yellowSuperGiantSurface, "yellowsupergiantsurface").setHardness(50.0F).setResistance(2000.0F).setLightLevel(1.0F).setCreativeTab(RealStars.cTab);

    }
}
