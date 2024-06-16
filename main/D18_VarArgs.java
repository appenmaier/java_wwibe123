package main;

/**
 * Variable Argumentlisten (VarArgs)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D18_VarArgs {

  public static void main(String[] args) {

    D18_VarArgs.printText("Hans");
    D18_VarArgs.printText("Peter");
    D18_VarArgs.printText("Lisa");

    System.out.println();

    String[] names = {"Hans", "Peter", "Lisa"};
    D18_VarArgs.printTexts(names);

    System.out.println();

    D18_VarArgs.printAll("Hans");
    D18_VarArgs.printAll("Hans", "Peter");
    D18_VarArgs.printAll("Hans", "Peter", "Lisa");

  }

  public static void printText(String text) {
    System.out.println(text);
  }

  public static void printTexts(String[] texts) {
    for (int i = 0; i < texts.length; i++) {
      String text = texts[i];
      System.out.println(text);
    }
  }

  public static void printAll(String... texts) {
    for (int i = 0; i < texts.length; i++) {
      String text = texts[i];
      System.out.println(text);
    }
  }

}
