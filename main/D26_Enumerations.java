package main;

import java.util.ArrayList;
import model.LightBulb;
import model.TableLamp;
import model.PlugType;

/**
 * Aufzählungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D26_Enumerations {

    public static void main(String[] args) {
        
        TableLamp t1 = new TableLamp(PlugType.TYPE_F);
        TableLamp t2 = new TableLamp(PlugType.TYPE_F);
        TableLamp t3 = new TableLamp(PlugType.TYPE_F);
        
        PlugType myPlugType;
        String text = "TYPE_F";
        
        if (text.equals("TYPE_F")) {
            myPlugType = PlugType.TYPE_F;
        }
        myPlugType = PlugType.valueOf("TYPE_F");
        System.out.println("myPlugType: " + myPlugType);
        
        for(PlugType p : PlugType.values()) {
            System.out.println(p);
        }

    }
    
}
