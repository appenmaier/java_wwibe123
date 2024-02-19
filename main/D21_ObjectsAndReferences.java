package main;

import model.LightBulb;
import model.TableLamp;

/**
 * Objekte und Referenzen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D21_ObjectsAndReferences {

    public static void main(String[] args) {
        
        /* "Normale" Variablen und Referenzvariablen */
        int i = 5;
        TableLamp l1 = new TableLamp();
        LightBulb redLightBulb = new LightBulb();
        redLightBulb.setColor("rot");
        
        int x = i;
        TableLamp l2 = l1;
        
        i = 7;
        l1.changeLightBulb(redLightBulb);
        l1.plugIn();
        l1.switchOn();
        
        System.out.println("i: " + i);
        System.out.println("x: " + x);
        System.out.println("l1: " + l1);
        System.out.println("l1 (IdentityHashCode): " + System.identityHashCode(l1));
        System.out.println("l2: " + l2);
        System.out.println("l2 (IdentityHashCode): " + System.identityHashCode(l2));
        
        /* Vergleich von Objekten */
        TableLamp l3 = new TableLamp();
        l3.changeLightBulb(redLightBulb);
        l3.plugIn();
        l3.switchOn();
        
        /* Der Operator == prüft, ob zwei Referenzen gleich sind, also ob beide dasselbe Objekt referenzieren */
        if (l1 == l2) {
            System.out.println("l1 ist identisch mit l2");
        }
        
        if (l1 == l3) {
            System.out.println("l1 ist identisch mit l3");
        }
        
        /* Die Methode equals(Object) prüft, ob zwei Objekte gleich sind, also ob alle Attribute der beiden Objekte gleich sind */
        if (l1.equals(l3)) {
            System.out.println("l1 und l3 sind gleich");
        }

    }
    
}
