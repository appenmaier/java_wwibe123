package main;

import java.util.Random;

/**
 * Arithmetische Berechnungen und Pseudozufallszahlen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D08_CalculationsAndPseudoRandomNumbers {

  public static void main(String[] args) {

    /* Die Klasse Math */
    double result = Math.sqrt(8);
    System.out.println("result: " + result);

    /* Die Klasse Random */
    Random random = new Random();
    int randomNumber = random.nextInt(50, 101);
    System.out.println("randomNumber: " + randomNumber);
  }

}
