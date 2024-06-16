package main;

import java.util.ArrayList;
import model.LightBulb;
import model.TableLamp;

/**
 * Imperatives und objektorientiertes Programmieren
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class D19_ImperativeAndObjectOrientedProgramming {

  public static void main(String[] args) {

    /* Zeichenkette (imperativ) */
    int length;

    String name = "Hans-Peter";
    length = D19_ImperativeAndObjectOrientedProgramming.length(name);
    System.out.println("length: " + length);

    /* Zeichenkette (objektorientiert) */
    length = name.length();
    length = "Hans-Peter".length();
    System.out.println("length: " + length);

    /* Tischleuchte (imperativ) */
    boolean isShining;
    boolean isOn = true;
    boolean isConnected = true;
    boolean hasLightBulb = true;
    String colorOfLightBulb = "blau";

    if (isOn && isConnected && hasLightBulb) {
      isShining = true;
    } else {
      isShining = false;
    }

    if (isShining) {
      System.out.println("Die Lampe leuchtet in der Farbe " + colorOfLightBulb);
    } else {
      System.out.println("Die Lampe leuchtet nicht");
    }

    /* Tischleuchte (objektorientiert) */
    LightBulb blueLightBulb = new LightBulb("blau");
    // version 2.0: LightBulb blueLightBulb = new LightBulb(); blueLightBulb.setColor("blau");
    // version 1.0: blueLightBulb.color = "blau";

    TableLamp tableLamp1 = new TableLamp();
    tableLamp1.changeLightBulb(blueLightBulb);
    tableLamp1.plugIn();
    tableLamp1.switchOn();
    System.out.println(tableLamp1.toString());
    tableLamp1.pullThePlug();
    System.out.println(tableLamp1.toString());

    /* Felder (imperativ) */
    String[] names = new String[3];

    names[1] = "Hans";
    names[2] = "Lisa";

    D19_ImperativeAndObjectOrientedProgramming.printStringArray(names);

    names[0] = "Peter";

    names = D19_ImperativeAndObjectOrientedProgramming.copyArray(names);
    names[3] = "Max";

    /* Felder (objektorientiert) */
    ArrayList<String> names2 = new ArrayList<>();
    names2.add("Hans");
    names2.add("Lisa");

    int size = names2.size();

    System.out.println("size: " + size);

    for (int i = 0; i < names2.size(); i++) {
      name = names2.get(i);
      System.out.println(name);
    }

  }

  public static int length(String text) {
    int length = 0;
    for (int i = 0; i < text.length(); i++) {
      length++;
    }
    return length;
  }

  public static void printStringArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      String string = array[i];
      if (string == null) {
        continue;
      }
      System.out.println(string.length());
    }
  }

  public static String[] copyArray(String[] oldArray) {
    String[] newArray = new String[oldArray.length * 2];
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i] = oldArray[i];
    }
    return newArray;
  }

}
