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
package us.illyohs.libilly.internal;

import java.util.ArrayList;
import java.util.List;

import us.illyohs.libilly.internal.handler.IMCHandler;
import us.illyohs.libilly.posexecuter.ExecuterHandler;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = LibIlly.MOD_ID,
    name = LibIlly.MOD_NAME,
    version = LibIlly.VERSION,
    acceptedMinecraftVersions = "1.8",
    dependencies = "required-after:Forge@[11.14.4,)"
    )
public class LibIlly {

    public static final String MOD_ID   = "LibIlly";
    public static final String MOD_NAME = "LibIlly";
    public static final String VERSION  = "@VERSION@";
    public static final String UPDOOTURL = "";
    
    public List<Block> listunsafe = new ArrayList<Block>();
    
    @Instance(MOD_ID)
    public static LibIlly instance;
    
    /**
     * 
     */
    public LibIlly() {
        listunsafe.add(Blocks.lava);
        listunsafe.add(Blocks.flowing_lava);
        listunsafe.add(Blocks.fire);
        listunsafe.add(Blocks.cactus);
    }
    ExecuterHandler executerHandler;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        event.getModMetadata().modId = LibIlly.MOD_ID;
        event.getModMetadata().name = LibIlly.MOD_NAME;
        event.getModMetadata().version = LibIlly.VERSION;

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
//        executerHandler = new ExecuterHandler();

    }
    
    public void interComeGet(IMCEvent event) {
        IMCHandler.processMessages(event.getMessages());
    }

}
