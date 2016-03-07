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

import us.illyohs.libilly.util.ExePos;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

@Deprecated
public class PosExecuter {

    protected String           id;
    protected int              radius;
    protected boolean          isPersistent;
    protected ResourceLocation resource;
    protected ExePos           exePos;

    /**
     * 
     * @param id
     */
    public PosExecuter(String id) {
        this.id = id;
    }
    
    /**
     * 
     * @param id
     * @param exePos
     * @param radius
     * @param dorenderer
     * @param isPersistent
     * @param location
     */
    public PosExecuter(String id, ExePos exePos, int radius, boolean dorenderer, boolean isPersistent, ResourceLocation location) {
        this.id = id;
        this.exePos = exePos;
        this.radius = radius;
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
        return id;
    }

    public void setName(String name) {
        this.id = name;
    }
    
    public ExePos getExePos() {
        return exePos;
    }
    
    public void setExePos(ExePos exePos) {
        this.exePos = exePos;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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
