package main;
import model.LightBulb;
import model.TableLamp;

/**
 * Statische Elemente
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D23_StaticAttributesAndMethods {

    public static void main(String[] args) {

        System.out.println(TableLamp.getNumberOfTableLamps());        
        TableLamp l1 = new TableLamp();        
        System.out.println(TableLamp.getNumberOfTableLamps());
        TableLamp l2 = new TableLamp();        
        System.out.println(TableLamp.getNumberOfTableLamps());

    }
    
}
