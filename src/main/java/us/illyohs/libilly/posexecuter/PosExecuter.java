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
package us.illyohs.libilly.posexecuter;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;

public class PosExecuter {

    protected String           name;
    protected int              posX;
    protected int              posY;
    protected int              posZ;
    protected boolean          isPersistent;
    protected ResourceLocation resource;

    /**
     * 
     * @param name
     */
    public PosExecuter(String name) {
        this.name = name;
    }
    
    /**
     * @param name
     * @param posX
     * @param posY
     * @param posZ
     * @param dorenderer
     * @param isPersistent
     */
    public PosExecuter(String name, int posX, int posY, int posZ, boolean dorenderer, boolean isPersistent, ResourceLocation location) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.isPersistent = isPersistent;
        this.resource = location;
    }
    
    /**
     * 
     * @param name
     * @param pos
     * @param dorenderer
     * @param isPersistent
     * @param location
     */
    public PosExecuter(String name, BlockPos pos, boolean dorenderer, boolean isPersistent, ResourceLocation location) {
        this.name = name;
        this.posX = pos.getX();
        this.posY = pos.getY();
        this.posZ = pos.getZ();
        this.isPersistent = isPersistent;
        this.resource = location;
    }

    public void executeOnRightClick(EntityPlayer player) {

    }

    public void executeOnEntityCollied(Entity entity) {

    }

    public void readFromNBT(NBTTagCompound tag) {

    }

    public void writeToNBT(NBTTagCompound tag) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosZ() {
        return posZ;
    }

    public void setPosZ(int posZ) {
        this.posZ = posZ;
    }

    public boolean isPersistent() {
        return isPersistent;
    }

    public void setPersistent(boolean isPersistent) {
        this.isPersistent = isPersistent;
    }
    
    public ResourceLocation getResource() {
        return resource;
    }
    
    public void setResource(ResourceLocation resource) {
        this.resource = resource;
    }

}
