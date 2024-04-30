package main;

import java.util.Scanner;

/**
 * Konsoleneingaben mit Hilfe der Klasse Scanner
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D09_ConsoleInputs {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    /* Scanner initialisieren */
    Scanner scanner = new Scanner(System.in);

    /* Werte von der Konsole auslesen */
    System.out.print("Bitte eine ganze Zahl eingeben: ");
    int int1 = scanner.nextInt();
    System.out.println("int1: " + int1);

    System.out.print("Bitte eine reelle Zahl eingeben: ");
    double double1 = scanner.nextDouble();
    System.out.println("double1: " + double1);

    System.out.print("Bitte einen boolschen Wahrheitswert eingeben: ");
    boolean boolean1 = scanner.nextBoolean();
    System.out.println("boolean1: " + boolean1);

    System.out.print("Bitte ein einzelnes Zeichen eingeben: ");
    String string1 = scanner.next();
    char char1 = string1.charAt(0);
    System.out.println("char1: " + char1);

    System.out.print("Bitte ein Wort eingeben: ");
    String string2 = scanner.next();
    System.out.println("string2: " + string2);

    System.out.print("Bitte mehrere Wörter eingeben: ");
    scanner.nextLine();
    String string3 = scanner.nextLine();
    System.out.println("string3: " + string3);
  }

}
