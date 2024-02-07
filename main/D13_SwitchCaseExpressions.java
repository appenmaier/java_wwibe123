package main;

import java.util.Scanner;

/**
 * Fallunterscheidungen mit SWITCH...CASE
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D13_SwitchCaseExpressions {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Gib bitte \"R/r\", \"G/g\" oder \"B/b\" ein: ");
        
        char color = scanner.next().charAt(0);
        
        String colorText;
        
        if (color == 'R' || color == 'r') {
            colorText = "rot";
        } else if (color == 'G' || color == 'g') {
            colorText = "gruen";
        } else {
            colorText = "blau";
        }
        
        colorText = (color == 'R' || color == 'r') ? "rot" : 
          (color == 'G' || color == 'g') ? "gruen" : "blau";
        
        switch (color) {
            case 'R':
            case 'r':
                colorText = "rot";
                break;
            case 'G':
            case 'g':
                colorText = "gruen";
                break;
            default:
                colorText = "blau";
                break;
        }
        
        colorText = switch (color) {
            case 'R', 'r' -> "rot";
            case 'G', 'g' -> "gruen";
            default -> "blau";
        };
        
        System.out.println(colorText);

    }
    
}
