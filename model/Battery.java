package model;

import java.util.ArrayList;

/**
 * Batterie
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Battery {
    
    private double energyLevel;
    
    public Battery(){
        energyLevel = 1;
    }
    
    public void decreaseEnergyLevel(){
        energyLevel -= 0.1;
    }
    
    public double getEnergyLevel() {
        return energyLevel;
    }
    
    @Override
    public String toString() {
        return "Battery [energyLevel=" + energyLevel + "]";
    }

}
