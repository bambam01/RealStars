package com.bambam01.realstars;


import net.minecraftforge.common.config.Configuration;

public class Config {
    public float coreDamage;
    public float surfaceDamage;
    public boolean spawnCoreLava;
    public float coreExplosionSize;
    public double coreExplosionChance;

    public int redDwarfFireDuration;
    public int orangeDwarfFireDuration;
    public int yellowGiantFireDuration;
    public int yellowSuperGiantFireDuration;



    private final String CATEGORY_GENERAL = "general";

    public Configuration config;


    public Config(Configuration config) {
        this.config = config;
        this.load();
    }

    public void load() {
        config.load();
        this.coreDamage = (float) config.get(CATEGORY_GENERAL, "CoreDamage", 16.0).getDouble();
        this.surfaceDamage = (float) config.get(CATEGORY_GENERAL, "SurfaceDamage", 8.0).getDouble();
        this.spawnCoreLava = config.get(CATEGORY_GENERAL, "SpawnCoreLava", true).getBoolean();
        this.coreExplosionSize = (float) config.get(CATEGORY_GENERAL, "CoreExplosionSize", 4.0).getDouble();
        this.coreExplosionChance = config.get(CATEGORY_GENERAL, "CoreExplosionChance", 0.5, "how often does an explosion occur, 1.0 = always, 0.0 = never, 0.5 = 50%").setMaxValue(1.0).setMinValue(0.0).getDouble();

        this.redDwarfFireDuration = config.get(CATEGORY_GENERAL, "redDwarfFireDuration", 2).getInt();
        this.orangeDwarfFireDuration = config.get(CATEGORY_GENERAL, "orangeDwarfFireDuration", 3).getInt();
        this.yellowGiantFireDuration = config.get(CATEGORY_GENERAL, "yellowGiantFireDuration", 4).getInt();
        this.yellowSuperGiantFireDuration = config.get(CATEGORY_GENERAL, "yellowSuperGiantFireDuration", 5).getInt();

        if (config.hasChanged()) {
            config.save();
        }

    }
}
