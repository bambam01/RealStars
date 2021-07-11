package com.bambam01.realstars.blocks.cores;

import com.bambam01.realstars.RealStars;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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

public class StarCore extends Block {

    protected int fireDuration = 0;

    public StarCore() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(Blocks.air);
    }


    @Override
    public void harvestBlock(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_) {
        p_149636_2_.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
        p_149636_2_.addExhaustion(0.025F);

        if (this.canSilkHarvest(p_149636_1_, p_149636_2_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_) && EnchantmentHelper.getSilkTouchModifier(p_149636_2_))
        {
            ArrayList<ItemStack> items = new ArrayList<ItemStack>();
            ItemStack itemstack = this.createStackedBlock(p_149636_6_);

            if (itemstack != null)
            {
                items.add(itemstack);
            }

            ForgeEventFactory.fireBlockHarvesting(items, p_149636_1_, this, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_, 0, 1.0f, true, p_149636_2_);
            for (ItemStack is : items)
            {
                this.dropBlockAsItem(p_149636_1_, p_149636_3_, p_149636_4_ + 1, p_149636_5_, is);
            }
        }
        else
        {
            harvesters.set(p_149636_2_);
            int i1 = EnchantmentHelper.getFortuneModifier(p_149636_2_);
            this.dropBlockAsItem(p_149636_1_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_, i1);
            harvesters.set(null);
        }
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }


    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(x + 0.01, y + 0.01, z + 0.01, x + 0.99, y + 0.99, z + 0.99);
    }

    @Override
    public void onBlockDestroyedByExplosion(World p_149723_1_, int p_149723_2_, int p_149723_3_, int p_149723_4_, Explosion p_149723_5_) {
        this.onDestroyed(p_149723_1_, p_149723_2_, p_149723_3_, p_149723_4_);
    }

    @Override
    public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_) {
        this.onDestroyed(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_);
    }

    public void onDestroyed(World world, int x, int y, int z){
        if(RealStars.config.spawnCoreLava){
            world.setBlock(x,y,z, Blocks.flowing_lava, 8,3);
        }

        if(!world.isRemote && (Math.random() < RealStars.config.coreExplosionChance || RealStars.config.coreExplosionChance == 1.0 )) {
            world.newExplosion(null, x, y, z, RealStars.config.coreExplosionSize, true, false);
        }
    }

    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity entity) {
        if(entity instanceof EntityLivingBase){
            entity.attackEntityFrom(new DamageSource("starCore"), RealStars.config.coreDamage);
            entity.setFire(this.fireDuration);
        }
    }


}
