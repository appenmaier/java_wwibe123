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
        lights.add(flashLight1);
        lights.add(flashLight1);
        lights.add(tableLamp1);
        lights.add(tableLamp2);
        
        for(Light l : lights) {
            l.switchOn();
            System.out.println(l);
        }
        
    }
    
}
