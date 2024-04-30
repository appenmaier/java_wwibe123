package main;

import java.util.Scanner;

/**
 * Schleifen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D14_Loops {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // LoC ohne Schleifen für 10, 1.000, 1.000.000.000: 21, 2.0001, 2.000.000.001
    // LoC mit Schleifen für 10, 1.000, 1.000.000.000: 5

    /* while-Schleife (kopfgesteuerte Schleife) */
    int i = 1;

    while (i < 11) {
      System.out.println(i);
      i++;
    }

    System.out.println();

    boolean repeat = true;

    while (repeat) {
      System.out.print("Gib bitte eine Zahl groesser Null ein: ");
      int value = scanner.nextInt();
      if (value <= 0) {
        System.out.println("SO NICHT, versuchs nochmal");
      } else {
        repeat = false;
      }
    }

    /* do/while-Schleife (fussgesteuerte Schleife) */
    int k = 1;

    do {
      System.out.println(k);
      k++;
    } while (k < 11);

    System.out.println();

    boolean repeat2;

    do {
      System.out.print("Gib bitte eine Zahl groesser Null ein: ");
      int value = scanner.nextInt();
      if (value <= 0) {
        System.out.println("SO NICHT, versuchs nochmal");
        repeat2 = true;
      } else {
        repeat2 = false;
      }
    } while (repeat2);

    /* for-Schleife (Zaehlschleife) */
    for (int m = 1; m < 11; m++) {
      System.out.println(m);
    }

    String name = "Hans-Peter";
    for (int m = 0; m < name.length(); m++) {
      System.out.println(name.charAt(m));
    }

    System.out.println("i: " + i);
    System.out.println("k: " + k);
    // System.out.println("m: " + m);

  }

}
