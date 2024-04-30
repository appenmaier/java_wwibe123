package main;

import model.TableLamp;

/**
 * Statische Elemente
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D23_StaticAttributesAndMethods {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    System.out.println(TableLamp.getNumberOfTableLamps());
    TableLamp l1 = new TableLamp();
    System.out.println(TableLamp.getNumberOfTableLamps());
    TableLamp l2 = new TableLamp();
    System.out.println(TableLamp.getNumberOfTableLamps());

  }

}
