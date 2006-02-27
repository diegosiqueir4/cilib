/*
 * StandardAcceleration.java
 * 
 * Created on Mar 2, 2004
 * 
 * Copyright (C) 2004 - CIRG@UP 
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science 
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA 
 */
package net.sourceforge.cilib.PSO;


/**
 * @author espeer
 */
public class ConstantAcceleration implements VelocityComponent {

    public ConstantAcceleration() {
        acceleration = 1.496180;
    }
    
    public double get() {
        return acceleration;
    }
    
    /**
     * @return Returns the acceleration.
     */
    public double getAcceleration() {
        return acceleration;
    }

    /**
     * @param acceleration The acceleration to set.
     */
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    
    private double acceleration;
}