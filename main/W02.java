package main;

import model.Animal;

/**
 * Wiederholung 2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class W02 {

    public static void main(String[] args) {
        
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        
        animal1.name = "Max";
        animal1.gender = 'm';
        animal1.age = 7;
        animal1.weightInKg = 20;
        
        animal2.name = "Amadeus";
        animal2.gender = 'm';
        animal2.age = 2;
        animal2.weightInKg = 240;        
        
        animal1.eat();
        animal1.move();
        
        animal2.eat();

    }
    
}
