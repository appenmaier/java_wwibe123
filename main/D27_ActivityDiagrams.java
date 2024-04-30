package main;

import java.util.Scanner;

/**
 * Aktivitaetsdiagramme
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D27_ActivityDiagrams {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    int number1, number2;

    System.out.print("1. Zahl eingeben: ");
    number1 = myScanner.nextInt();

    do {
      System.out.print("2. Zahl eingeben: ");
      number2 = myScanner.nextInt();
    } while (number2 == 0);

    System.out.println(number1 / number2);

  }

}
