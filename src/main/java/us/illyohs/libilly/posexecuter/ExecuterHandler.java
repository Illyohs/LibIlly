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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import us.illyohs.libilly.util.PosRegisterException;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ExecuterHandler {

    public static ExecuterHandler  instance;
    
    private HashMap<PosExecuter, String> exePosReg = new HashMap<PosExecuter, String>();
    /**
     * 
     */
    public ExecuterHandler() {
        MinecraftForge.EVENT_BUS.register(this);

    }

    public static ExecuterHandler getInstance() {
        if (instance == null) {
            return new ExecuterHandler();
        }
        return instance;
    }

    public void registerPosExecuter(String modid, PosExecuter executer) {
        exePosReg.put(executer, modid);
    }
    
    @SubscribeEvent
    public void posEvents(PosExecuterEvent event) {
        
    }
    

}
