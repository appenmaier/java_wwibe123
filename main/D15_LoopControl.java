package main;

import java.util.Scanner;

/**
 * Schleifensteuerung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D15_LoopControl {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i = 1;
        
        while(true) {
            System.out.println("Schleifendurchlauf: " + i);
            i++;
            
            System.out.print("1 - Durchlauf beenden, 2 - Schleife beenden: ");
            
            int answer = scanner.nextInt();
            
            if (answer == 1) {
                continue;
            } else if (answer == 2) {
                break;
            }
            
            System.out.println("Schleifendurchlaufende");            
        }
        
        System.out.println("Programmende");

    }
    
}
