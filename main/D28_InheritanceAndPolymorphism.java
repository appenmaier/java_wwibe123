package main;

import model.TableLamp;
import model.FlashLight;
import model.Battery;
import java.util.ArrayList;
import model.Light;

/**
 * Vererbung und Polymorphie
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D28_InheritanceAndPolymorphism {
    
    public static void main(String[] args) {
        
        TableLamp tableLamp1 = new TableLamp();
        TableLamp tableLamp2 = new TableLamp();
        
        FlashLight flashLight1 = new FlashLight();
        FlashLight flashLight2 = new FlashLight();
        
        /* Ohne Vererbung */
        ArrayList<TableLamp> tableLamps = new ArrayList<>();
        tableLamps.add(tableLamp1);
        tableLamps.add(tableLamp2);
        
        for(TableLamp t : tableLamps) {
            t.switchOn();
        }    
        
        ArrayList<FlashLight> flashLights = new ArrayList<>();
        flashLights.add(flashLight1);
        flashLights.add(flashLight2);
        
        for(FlashLight f: flashLights) {
            f.switchOn();
        }
        
        /* Mit Vererbung */
        ArrayList<Light> lights = new ArrayList<>();
        Light light = flashLight1; // Upast
        lights.add(light);
        lights.add(flashLight2); // Upcast
        lights.add(tableLamp1); // Upcast
        lights.add(tableLamp2); // Upcast
        
        // Dynamische Polymorphie
        for(Light l : lights) {
            l.switchOn();
            if(l instanceof TableLamp) {
                TableLamp t = (TableLamp) l; // Downcast (bis Java 16)
                t.plugIn();
            } else if(l instanceof FlashLight f) { // Downcast (seit Java 16)
                f.changeBattery(new Battery());
            }
            System.out.println(l);
            System.out.println(l.hashCode());
        }   
        
    }
    
}
