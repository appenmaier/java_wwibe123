package main;

import model.Printer;

/**
 * Demo 1: Syntax und Kommentare
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D01_SyntaxAndComments {

    public static void main(String[] args) {
        String text = "Hello World"; // Deklaration und Initialisierung
        
        /* Ausgabe */
        System.out.println(text);

        Printer.printText("Winter");
        Printer.printText("is");
        Printer.printText("Coming");
        Printer.printHelloWorld();
        Printer.printHelloWorld();
    }

}