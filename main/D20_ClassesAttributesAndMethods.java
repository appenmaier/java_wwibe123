package main;

import model.LightBulb;
import model.TableLamp;

/**
 * Klassen, Attribute und Methoden
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D20_ClassesAttributesAndMethods {

  public static void main(String[] args) {

    LightBulb blueLightBulb = new LightBulb("blau");
    // version 2.0: LightBulb blueLightBulb = new LightBulb(); blueLightBulb.setColor("blau");
    // version 1.0: blueLightBulb.color = "blau";

    TableLamp tableLamp1 = new TableLamp();
    // tableLamp1.isOn = false;
    // tableLamp1.isShining = true;
    // tableLamp1.lightBulb = blueLightBulb;
    tableLamp1.changeLightBulb(blueLightBulb);
    tableLamp1.switchOn();

    System.out.println(tableLamp1.toString());

  }

}
