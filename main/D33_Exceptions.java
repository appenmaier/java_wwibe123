package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.AlreadyPluggedInException;
import model.FlashLight;
import model.Light;
import model.TableLamp;

/**
 * Ausnahmen (Exceptions)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D33_Exceptions {

  @SuppressWarnings({"unused", "resource"})
  public static void main(String[] args) {

    /* ArrayIndexOutOfBoundsException und NullPointerException */
    String[] names = {"Hans", "Peter", null};

    try {
      String name = names[3];
      String name2 = names[2];
      System.out.println(name2.toUpperCase());
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }

    /* InputMismatchException */
    Scanner myScanner = new Scanner(System.in);
    try {
      System.out.print("Bitte eine ganze Zahl eingeben: ");
      int number = myScanner.nextInt();
      System.out.println(number);
    } catch (InputMismatchException e) {
      System.out.println("Das war keine ganze Zahl");
    }

    /* ClassCastException */
    try {
      Light light = new TableLamp(); // Upcast
      FlashLight flashLight = (FlashLight) light; // Downcast
    } catch (ClassCastException e) {
    }

    /* AlreadyPluggedInException */
    TableLamp t = new TableLamp();
    try {
      t.plugIn();
      t.plugIn();
    } catch (AlreadyPluggedInException e) {
      System.err.println(e.getMessage());
    }

  }

}
