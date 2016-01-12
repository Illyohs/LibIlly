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
package us.illyohs.test.posex;

import us.illyohs.libilly.posexecuter.IExecuterRenderer;
import us.illyohs.libilly.posexecuter.PosExecuter;
import us.illyohs.libilly.util.ExePos;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TestPosExecuterRenederer extends PosExecuter implements IExecuterRenderer {


    /**
     * @param id
     * @param exePos
     * @param radius
     * @param dorenderer
     * @param isPersistent
     * @param location
     */
    public TestPosExecuterRenederer(String id, ExePos exePos, int radius, boolean dorenderer, boolean isPersistent, ResourceLocation location) {
        super(id, exePos, radius, dorenderer, isPersistent, location);
        // TODO Auto-generated constructor stub
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void renderExecuter(double x, double y, double z, int tick) {
        // TODO Auto-generated method stub
        
    }

}
