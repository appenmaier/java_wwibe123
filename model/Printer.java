package model;

/**
 * Konsolendrucker
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Printer {

  /**
   * Gibt die Zeichenkette "Hello World" auf der Konsole aus
   */
  public static void printHelloWorld() {
    System.out.println("Hello World");
  }

  /**
   * Gibt den eingehenden Text auf der Konsole aus
   *
   * @param text Eingehender Text
   */
  public static void printText(String text) {
    System.out.println(text);
  }
}
