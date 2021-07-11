package com.bambam01.realstars.blocks.surface;

import com.bambam01.realstars.RealStars;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.ArrayList;
import java.util.Random;

public class StarSurface extends Block {

    protected int fireDuration = 0;


    public StarSurface() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(Blocks.air);
    }

    protected boolean canSilkHarvest()
    {
        return false;
    }


    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(x + 0.01, y + 0.01, z + 0.01, x + 0.99, y + 0.99, z + 0.99);
    }


    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity entity) {
        if(entity instanceof EntityLivingBase){
            entity.attackEntityFrom(new DamageSource("starSurface"), RealStars.config.surfaceDamage);
            entity.setFire(this.fireDuration);
        }
    }


}
