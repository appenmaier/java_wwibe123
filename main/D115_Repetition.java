package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Wiederholung: Scanner, Verzweigungen, Arithmetische Operationen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D115_Repetition {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Was moechtest Du tun?");
    System.out.println("1 - Sinus berechnen");
    System.out.println("2 - Zufallszahl erzeugen");
    System.out.println("3 - Ausdruck auswerten");

    int answer = scanner.nextInt();

    if (answer == 1) {
      System.out.print("Bitte gib eine reelle Zahl ein: ");
      double value = scanner.nextDouble();
      double result = Math.sin(value);
      System.out.printf("Der Sinus von %.2f ist %.2f", value, result);
    } else if (answer == 2) {
      Random random = new Random();
      int randomNumber = random.nextInt(1, 11);
      System.out.println(randomNumber);
    } else {
      System.out.print("Bitte gib eine Zahl groesser Null ein: ");
      int value = scanner.nextInt();
      if (value > 0) {
        System.out.println("Super gemacht");
      } else {
        System.out.println("Schade, knapp daneben");
      }
    }

  }

}
