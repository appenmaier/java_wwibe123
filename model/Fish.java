package model;

import java.time.LocalDate;

/**
 * Fisch
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Fish extends Animal {
    
    public Fish(String name, char gender, double weightInKg, LocalDate birthday, Color color) {
        super(name, gender, weightInKg, birthday, color);
    }
    
    public void blub() {
        System.out.println("Blub");
    }
    
    @Override
    public String toString() {
        return "Ich bin ein Fisch";
    }

}
