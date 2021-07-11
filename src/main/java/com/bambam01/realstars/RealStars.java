package com.bambam01.realstars;

import com.bambam01.realstars.blocks.ModBlocks;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = RealStars.MODID, version = RealStars.VERSION)
public class RealStars
{
    public static final String MODID = "realstars";
    public static final String VERSION = "1.0";
    public static Config config;


    public static CreativeTabs cTab = new CreativeTabs("Real Stars") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.yellowSuperGiantCore);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        config = new Config(new Configuration(event.getSuggestedConfigurationFile()));
        ModBlocks.init();



    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
