package main;

import model.Box;
import model.IntegerBox;
import model.StringBox;

/**
 * Java Generics
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D36_Generics {

  public static void main(String[] args) {

    /* String Box */
    StringBox stringBox = new StringBox();
    stringBox.setContentA("Hans");
    stringBox.setContentB("Peter");

    String name1 = stringBox.getContentA();
    String name2 = stringBox.getContentB();

    System.out.println(name1);
    System.out.println(name2);

    /* Integer Box */
    IntegerBox integerBox = new IntegerBox();
    integerBox.setContentA(4);
    integerBox.setContentB(2);

    Integer number1 = integerBox.getContentA();
    Integer number2 = integerBox.getContentB();

    System.out.println(number1);
    System.out.println(number2);

    /* Box */
    Box<String, Integer> box = new Box<>();
    box.setContentA("Hans");
    box.setContentB(2);

    String name3 = box.getContentA();
    Integer number3 = box.getContentB();

    System.out.println(name3);
    System.out.println(number3);

  }

}
