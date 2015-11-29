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
package us.illyohs.libilly.posexecutor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class PosExecuter {

    protected String  name;
    protected int     posX;
    protected int     posY;
    protected int     posZ;
    protected boolean doRenderer;
    protected boolean isPersistent;

    /**
     * @param name
     * @param posX
     * @param posY
     * @param posZ
     * @param dorenderer
     * @param isPersistent
     */
    public PosExecuter(String name, int posX, int posY, int posZ, boolean dorenderer, boolean isPersistent) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.doRenderer = dorenderer;
        this.isPersistent = isPersistent;
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

    public boolean doRenderer() {
        return doRenderer;
    }

    public void setDorenderer(boolean doRenderer) {
        this.doRenderer = doRenderer;
    }

    public boolean isPersistent() {
        return isPersistent;
    }

    public void setPersistent(boolean isPersistent) {
        this.isPersistent = isPersistent;
    }

}
