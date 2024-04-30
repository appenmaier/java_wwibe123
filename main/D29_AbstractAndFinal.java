package main;

import model.FlashLight;
import model.Light;

/**
 * Abstrakte und finale Klassen und Methoden
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D29_AbstractAndFinal {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    Light light;
    // light = new Light(); // Kompilierfehler
    light = new FlashLight();

  }

}
