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
package us.illyohs.libilly.block.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBase extends Fluid {
    
    public FluidBase(String name, ResourceLocation still, ResourceLocation flowing) {
        super(name, still, flowing);
        
    }
    
    public FluidBase(String name, ResourceLocation still, ResourceLocation flowing, int light, int density, int temp, int viscosity, boolean isGas) {
        super(name, still, flowing);
        this.setLuminosity(light);
        this.setDensity(density);
        this.setTemperature(temp);
        this.setViscosity(viscosity);
        this.setGaseous(isGas);
        
    }

}
