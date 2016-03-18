/**
 *  Copyright (C) 2016, Anthony Anderson(Illyohs) 
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
package us.illyohs.libilly.util;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import us.illyohs.libilly.internal.LibIlly;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

import net.minecraft.util.EnumFacing;

public class PlayerUtils {

    public static void teleportPlayer(EntityPlayer player, BlockPos pos) {
        player.setPositionAndUpdate(pos.getX() + .5, pos.getY(), pos.getZ() + .5);
    }

    public static void teleportPlayer(EntityPlayer player, BlockPos pos, int dem) {
        player.changeDimension(dem);
        teleportPlayer(player, pos);
    }

    public static void safeTeleportPlayer(EntityPlayer player, EntityPlayer playerMessager, BlockPos pos, String message) {
        int maxWorldHight = player.getEntityWorld().getHeight();

        for (int tries = 0; tries < 100; tries++) {
            if ((pos.getY() < maxWorldHight && pos.getY() > 0) && player.getEntityWorld().getBlockState(pos).getBlock() == Blocks.air
                    && player.getEntityWorld().getBlockState(pos.up(1)).getBlock() == Blocks.air) {
                for (int down = 1; down < 20; down++) {
                    Block blocks = player.getEntityWorld().getBlockState(pos.down(down)).getBlock();
                    if (blocks != Blocks.air) {
                        if (LibIlly.instance.listunsafe.contains(blocks)) {
                            break;
                        } else if (BlockUtils.isBlockSolid(player.worldObj, pos, EnumFacing.UP)) {
                            player.setPositionAndUpdate(pos.getX() + .5, pos.getY(), pos.getZ() + .5);
                        }
                    } 
                }
            }
        }
        player.addChatComponentMessage(new TextComponentString(message));
    }
    
    public static void safeTeleportPlayer(EntityPlayer player, EntityPlayer playerMessager, BlockPos pos, int dem, String message) {
        player.changeDimension(dem);
        int maxWorldHight = player.getEntityWorld().getHeight();

        for (int tries = 0; tries < 100; tries++) {
            if ((pos.getY() < maxWorldHight && pos.getY() > 0) && player.getEntityWorld().getBlockState(pos).getBlock() == Blocks.air
                    && player.getEntityWorld().getBlockState(pos.up(1)).getBlock() == Blocks.air) {
                for (int down = 1; down < 20; down++) {
                    Block blocks = player.getEntityWorld().getBlockState(pos.down(down)).getBlock();
                    if (blocks != Blocks.air) {
                        if (LibIlly.instance.listunsafe.contains(blocks)) {
                            break;
                        } else if (BlockUtils.isBlockSolid(player.worldObj, pos, EnumFacing.UP)) {
                            player.setPositionAndUpdate(pos.getX() + .5, pos.getY(), pos.getZ() + .5);
                        }
                    } 
                }
            }
        }
        player.addChatComponentMessage(new TextComponentString(message));
    }

}
