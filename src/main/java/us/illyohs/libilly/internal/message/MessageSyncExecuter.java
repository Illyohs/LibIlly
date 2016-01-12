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
package us.illyohs.libilly.internal.message;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import io.netty.buffer.ByteBuf;

public class MessageSyncExecuter implements IMessage, IMessageHandler<MessageSyncExecuter, IMessage> {


    public void fromBytes(ByteBuf buf) {
        // TODO Auto-generated method stub
        
    }
    
    public void toBytes(ByteBuf buf) {
        // TODO Auto-generated method stub
        
    }
    
    public IMessage onMessage(MessageSyncExecuter message, MessageContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }


}
