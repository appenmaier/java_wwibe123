package model;

import java.util.ArrayList;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class FlashLight extends Light {
    
    // version 1.0: private boolean isShining;
    // version 1.0: private boolean isOn;
    private Battery battery;
    
    @Override
    public void switchOn() {
        isOn = true;        
        if (battery != null && battery.getEnergyLevel() > 0) {
            isShining = true;
            battery.decreaseEnergyLevel();
        }
    }
    
    // version 1.0: public void switchOff() {
    // isOn = false;
    // isShining = false;
    // }
    
    public void changeBattery(Battery battery) {
        this.battery = battery;
    }
    
    @Override
    public String toString() {
        return "FlashLight [isOn=" + isOn + ", isShining=" + isShining + ", battery=" + ((battery == null) ? "null" : battery) + "]";
    }

}
