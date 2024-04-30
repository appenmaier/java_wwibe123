package main;

import java.util.Scanner;

/**
 * Einfachverzweiungen mit IF...ELSE
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D11_IfCases {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Bitte Dein Alter eingeben: ");
    int age = scanner.nextInt();

    /* Einfachverzweigungen */
    /* Vergleichsoperatoren: >, <, >=, <=, !=, == */
    /* Logischer Operatoren: && (logisches UND), || (logisches ODER), ! (Verneinung) */
    if (age >= 18) {
      System.out.println("Du bist volljaehrig");
    } else {
      System.out.println("Du bist minderjaehrig");
    }

    /* Verschachtelte Verzweigungen */
    if (age < 12) {
      System.out.println("Du bist ein Kind");
    } else if (age < 18) {
      System.out.println("Du bist ein Jugendlicher");
    } else {
      System.out.println("Du bist ein Erwachsener");
    }

    /* Vergleich von Zeichenketten */
    System.out.print("Bitte Deinen Namen eingeben: ");
    String name = scanner.next();

    if (name.equals("Daniel")) {
      System.out.println("Cooler Name");
    }

    /* Kurzschlussauswertung (Lazy Evaluation) */
    boolean boolean1 = true;
    int int1 = 5;

    if (boolean1 == true && (int1 += 1) > 5) {
    }

    System.out.println("int1: " + int1);
  }

}
