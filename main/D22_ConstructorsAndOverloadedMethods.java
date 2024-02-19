package main;

import java.util.ArrayList;
import model.LightBulb;
import model.TableLamp;

/**
 * Konstruktoren und Ueberladene Methoden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D22_ConstructorsAndOverloadedMethods {

    public static void main(String[] args) {
        
        LightBulb redLightBulb = new LightBulb("rot");
        LightBulb lightBulb = new LightBulb();
        
        TableLamp l1 = new TableLamp();
        TableLamp l2 = new TableLamp("blau");
        TableLamp l3 = new TableLamp(redLightBulb);
        
        ArrayList<TableLamp> tableLamps = new ArrayList<>();
        tableLamps.add(l1);
        tableLamps.add(l2);
        tableLamps.add(l3);
        
        for (int i = 0; i < tableLamps.size(); i++) {
            TableLamp lamp = tableLamps.get(i);
            lamp.plugIn();
            lamp.switchOn();
            System.out.println(lamp);
        }        
        
    }
    
}
