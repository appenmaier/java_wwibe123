package main;

import model.LightBulb;
import model.TableLamp;

/**
 * Objekte und Referenzen
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class D21_ObjectsAndReferences {

  public static void main(String[] args) {

    /* "Normale" Variablen und Referenzvariablen */
    int i = 5;
    TableLamp l1 = new TableLamp();
    LightBulb redLightBulb = new LightBulb("rot");
    // version 1.0: LightBulb redLightBulb = new LightBulb(); redLightBulb.setColor("rot");

    int x = i;
    TableLamp l2 = l1;
    l1.changeLightBulb(redLightBulb);

    i = 7;
    /* version 2.0: l1.plugIn(); */
    l1.switchOn();

    System.out.println("i: " + i);
    System.out.println("x: " + x);
    System.out.println("l1: " + l1);
    System.out.println("l1 (IdentityHashCode): " + System.identityHashCode(l1));
    System.out.println("l2: " + l2);
    System.out.println("l2 (IdentityHashCode): " + System.identityHashCode(l2));

    /* Vergleichen von Objekten */
    TableLamp l3 = new TableLamp();
    LightBulb redLightBulb2 = new LightBulb("rot");
    // version 1.0: LightBulb redLightBulb2 = new LightBulb(); redLightBulb2.setColor("rot");
    l3.changeLightBulb(redLightBulb2);
    /* version 2.0: l3.plugIn(); */
    l3.switchOn();

    /*
     * Der Operator "==" prüft, ob zwei Referenzen gleich sind, also ob beide dasselbe Objekt
     * referenzieren
     */
    if (l1 == l2) {
      System.out.println("l1 ist identisch mit l2");
    }

    if (l1 == l3) {
      System.out.println("l1 ist identisch mit l3");
    }

    /*
     * Die Methode "boolean equals(obj: Object)" prüft, ob zwei Objekte gleich sind, also ob alle
     * Attribute der beiden Objekte gleich sind
     */
    if (l1.equals(l3)) {
      System.out.println("l1 und l3 sind gleich");
    }

    /* Die Methode "String toString()" */
    System.out.println("redLightBulb: " + redLightBulb);
    System.out.println("redLightBulb.toString(): " + redLightBulb.toString());
    System.out.println("l1: " + l1);
    System.out.println("l1.toString(): " + l1.toString());

  }

}
