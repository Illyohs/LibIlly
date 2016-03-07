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
package us.illyohs.libilly.internal.handler;

import com.google.common.collect.ImmutableList;

import us.illyohs.libilly.internal.LibIlly;
import us.illyohs.libilly.util.BlockUtils;

import net.minecraftforge.fml.common.event.FMLInterModComms.IMCMessage;

public class IMCHandler {
    
    public static void processMessages(ImmutableList<IMCMessage> messageslist) {
        for (IMCMessage message : messageslist) {
            if (message.key.equalsIgnoreCase("unSafeTPBlock") && message.isStringMessage()) {
                String blockname = message.getStringValue();
                LibIlly.instance.listunsafe.add(BlockUtils.getBlockFromName(blockname));
            }
        }
    }

}
