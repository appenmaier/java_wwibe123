package main;

/**
 * Der Parameter String[] args
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D17_StringArgs {

  public static void main(String[] args) {

    for (int i = 0; i < args.length; i++) {
      String argument = args[i];
      System.out.println(argument);
    }

  }

}
