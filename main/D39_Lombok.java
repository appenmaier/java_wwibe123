package main;

import model.DragonLombok;
import model.DragonNormalClass;
import model.DragonRecord;

/**
 * Lombok
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D39_Lombok {

  public static void main(String[] args) {

    /* Normal Class */
    DragonNormalClass dragon1 = new DragonNormalClass("Fafnir", 500);
    DragonNormalClass dragon2 = new DragonNormalClass("Fafnir", 500);

    System.out.println(dragon1.equals(dragon2));
    System.out.println(dragon1.hashCode());
    System.out.println(dragon2.hashCode());
    System.out.println(dragon1.getName());
    dragon2.setAge(600);
    System.out.println(dragon2);
    System.out.println();

    /* Record */
    DragonRecord dragon3 = new DragonRecord("Fafnir", 500);
    DragonRecord dragon4 = new DragonRecord("Fafnir", 500);

    System.out.println(dragon3.equals(dragon4));
    System.out.println(dragon3.hashCode());
    System.out.println(dragon4.hashCode());
    System.out.println(dragon3.name());
    // dragon4.setAge(600);
    System.out.println(dragon4);
    System.out.println();

    /* Record */
    DragonLombok dragon5 = new DragonLombok("Fafnir", 500);
    DragonLombok dragon6 = new DragonLombok("Fafnir", 500);

    System.out.println(dragon5.equals(dragon6));
    System.out.println(dragon5.hashCode());
    System.out.println(dragon6.hashCode());
    System.out.println(dragon5.getName());
    dragon6.setAge(600);
    System.out.println(dragon6);
    System.out.println();

  }

}
