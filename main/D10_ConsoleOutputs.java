package main;

import java.util.Locale;

/**
 * Konsoelausgaben mit Hilfe der print-Methoden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D10_ConsoleOutputs {

    public static void main(String[] args) {
        
        String text = "Hallo";
        String name = "Hans";
        
        /* print- und println-Methoden */
        System.out.println("Text 1");
        System.out.print("Text 2");
        System.out.println("Text 3");
        System.out.println(text + " " + name);

        /* printf-Methoden */
        /* Aufbau einer Formatierungsregel: %[flags][width][.precision] conversion-character */
        
        /* String-Formatierungen (s) */ 
        System.out.printf("%s %s%n", text, name);
        System.out.printf("%S %S%n", text, name); // Grossbuchstabenkonvertierung
        System.out.printf("%20s %s%n", text, name); // Festlegen der Ausgabelaenge
        System.out.printf("%-20s %s%n", text, name); // Linksbuendige Ausgabe
        
        /* Dezimalzahlen-Formatierungen (d) */
        System.out.println(1_000_000_000);
        System.out.printf("%,d%n", 1_000_000_000); // Festlegen des Tausendertrennzeichens
        System.out.printf(Locale.US, "%,d%n", 1_000_000_000); // Laenderspezifische Ausgabe
        
        /* Gleitkommazahlen-Formatierungen (f) */
        System.out.println(45.12897);
        System.out.println((double) 45);
        System.out.printf("%.2f%n", 45.12897); // Festlegen der Genauigkeit
        System.out.printf("%.2f%n", (double) 45);
        
        System.out.println("Name Note");
        System.out.println("Max" + " " + 1.5);
        System.out.println("Peter" + " " + 3);
        System.out.println("Lisa-Marie" + " " + 2.25);
        
        System.out.printf("%-20s %s%n", "Name", "Note");
        System.out.printf("%-20s %.1f%n", "Max", 1.5);
        System.out.printf("%-20s %.1f%n", "Peter", 3.0);
        System.out.printf("%-20s %.1f%n", "Lisa-Marie", 2.25);
    }
    
}
