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

import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;

import net.minecraftforge.fml.common.eventhandler.Event;

@Deprecated
public class PosExecuterEvent extends Event {

    public enum Actions {
        ACTIVATE, PLACE, DESTROY
    }

    public String     modid;
    public String     name;
    public int        radius;
    public ExePos     exePos;
    public Actions    actions;

    public PosExecuterEvent(String modid, String name, int radius, ExePos pos, EnumFacing facing, Actions actions) {
        this.modid = modid;
        this.name = name;
        this.radius = radius;
        this.exePos = pos;
        this.actions = actions;
    }

}
