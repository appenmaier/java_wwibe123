package main;

import model.Calculator;
import model.Printer;

/**
 * Demo 2: Statische Methoden
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_StaticMethods {

  public static void main(String[] args) {
    Printer.printText("Winter");
    Printer.printText("is");
    Printer.printText("Coming");
    Printer.printHelloWorld();
    Printer.printHelloWorld();

    int result = Calculator.add(4, 3);
    System.out.println(result);
    System.out.println(Calculator.subtract(5, 8));
  }

}
