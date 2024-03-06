package main;

import model.LightBulb;
import model.TableLamp;
import model.Light;
import model.FlashLight;

/**
 * Abstrakte und finale Klassen und Methoden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D29_AbstractAndFinal {

    public static void main(String[] args) {
        
        Light light;
        // light = new Light(); // Kompilierfehler
        light = new FlashLight();        

    }
    
}
