package main;

import java.util.Scanner;

/**
 * Bedingte Zuweisungen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D12_ConditionalIfCases {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String ageText;

    System.out.print("Gib bitte Dein Alter ein: ");
    int age = scanner.nextInt();

    if (age >= 18) {
      ageText = "volljaehrig";
    } else {
      ageText = "minderjaehrig";
    }

    ageText = (age >= 18) ? "volljaehrig" : "minderjaehrig";

    System.out.println("Du bist " + ageText);

  }

}
