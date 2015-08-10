package com.ReignOfMagic.gtfo.block;


import com.ReignOfMagic.gtfo.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreCitrine extends Block
{
    public BlockOreCitrine()
    {
        super(Material.rock);
        setBlockName(Reference.MOD_ID + "_" + "oreCitrine");
        setBlockTextureName(Reference.MOD_ID + ":" + "oreCitrine");

        // setCreativeTab(CreativeTabs.tabBlock);
    }
}

/*
public class BlockOreCitrine extends BlockGTFO
{

    public final static Block genericDirt

  public BlockOreCitrine()
    {
        super();
        this.setBlockName("oreCitrine");
        this.setBlockTextureName("oreCitrine");
    }
    */

