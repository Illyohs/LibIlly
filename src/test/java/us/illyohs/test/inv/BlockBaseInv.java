package us.illyohs.test.inv;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.libilly.block.BlockBase;

public class BlockBaseInv extends BlockBase implements ITileEntityProvider {

    public BlockBaseInv(Material material, String name, float hardness, float resistance, float light, boolean tick, CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileInv();
    }
}
