/**
 *  Copyright (C) 2015, Anthony Anderson(Illyohs) 
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *  USA
 */
package us.illyohs.libilly.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class AirBlock extends BaseBlock {

    /**
     * @param material
     * @param name
     * @param hardness
     * @param resistance
     * @param light
     * @param tick
     * @param isBlockAir
     * @param tab
     */
    public AirBlock(Material material, String name, float hardness, float resistance, float light, boolean tick,
            boolean isBlockAir, CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
    }

    public AirBlock(Material material, String name, float hardness, float resistance, float light, boolean tick,
            boolean isBlockAir) {
        super(material, name, hardness, resistance, light, tick);
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return null;
    }

    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state) {
        return null;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

}
