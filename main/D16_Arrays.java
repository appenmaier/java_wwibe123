package main;

/**
 * Felder (Arrays)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D16_Arrays {

    public static void main(String[] args) {
        
        /* Deklaration und Initialisierung von Feldern */
        String[] names = new String[3];
        int[] numbers = { 4, 7, 9, 1, 3, -5 }; // new int[6]
        
        /* Zugriff auf die Elemente eines Feldes */
        names[0] = "Max";
        names[2] = "Lisa";
        names[1] = "Peter";
        
        /* Sequentieller Zugriff */
        for(int i = 0; i < names.length; i++) {
            String name = names[i];
            int length = name.length();
            System.out.println(name + " (" + length + ")");
        }
        
        numbers[3] = 7;
        
        for(int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        
        System.out.println();
        
        for(int i = numbers.length - 1; i >= 0; i--) {
            int number = numbers[i];
            System.out.println(number);    
        }

    }
    
}
