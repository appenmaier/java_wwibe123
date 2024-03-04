package model;

import java.util.ArrayList;

/**
 * Leuchte
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Light {
    
    protected boolean isShining;
    protected boolean isOn;
    
    public void switchOn() {
        isOn = true;
        isShining = true;
    }
    
    public void switchOff() {
        isOn = false;
        isShining = false;
    }
    
    @Override
    public String toString() {
        return "Light [isOn=" + isOn + ", isShining=" + isShining + "]";
    }

}
