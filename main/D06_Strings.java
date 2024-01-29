package main;

/**
 * Zeichenketten (Strings)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D06_Strings {

    public static void main(String[] args) {
        
        String text = new String("Hello World"); // "Hello World";
        
        char charAtStart = text.charAt(0);
        char charAt5 = text.charAt(5);
        char charAtEnd = text.charAt(text.length() - 1);
        int lengthOfText = text.length();
        
        System.out.println("charAtStart: " + charAtStart);
        System.out.println("charAt5: " + charAt5);
        System.out.println("charAtEnd: " + charAtEnd);
        System.out.println("lengthOfText: " + lengthOfText);
        System.out.println("lengthOfMax: " + "Max".length());
        
        /* Escape-Sequenzen in Zeichenkette */
        System.out.println("\"Hello World\" heisst auf Deutsch \"Hallo Welt\""); // \" Anfuehrungszeichen
        System.out.println("Hello\tWorld"); // \t Tabulatorsprung
        System.out.println("Hello\nWorld"); // \n Zeilenumbruch
        System.out.println("Hello\\World"); // \\ Umgedrehter Schraegstrich
    }
    
}
