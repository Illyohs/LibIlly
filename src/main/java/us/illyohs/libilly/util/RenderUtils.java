/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.libilly.util;

import java.awt.Color;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;

public class RenderUtils {
    
    public static void bindTexture(ResourceLocation texture) {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
    } 
    
    public static void renderItemsBlocks(Block block, ResourceLocation texture) {
        Item item = Item.getItemFromBlock(block);
        FMLClientHandler.instance().getClient().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(texture.getResourceDomain() + ":" + texture.getResourcePath()));
    }

    public static void renderFloatingTexts(String text, int x, int y, int z, boolean shadow) {
        FMLClientHandler.instance().getClient().fontRendererObj.drawString(text, x, y, z, shadow);
    }

    public static void renderItem(ItemStack item) {
        FMLClientHandler.instance().getClient().getRenderItem().renderItemModel(item);
    }
    
    public static void renderFloatingTexts(String text, double x, double y, double z, boolean shadow) {
        FMLClientHandler.instance().getClient().fontRendererObj.drawString(text, (int)x, (int)y, (int)z, shadow);
	}

}