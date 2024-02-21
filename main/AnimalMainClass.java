package main;

import model.Animal;
import java.util.ArrayList;

/**
 * Wiederholung: Tiere
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class AnimalMainClass {

    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Max", 'm', 3);
        Animal animal2 = new Animal("Amadeus", 'm', 40); 
        Animal animal3 = new Animal("Max", 'm', 3);
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(new Animal("Ingrid", 'w', 1));
        
        if (animal1.equals(animal3)) {
            System.out.println("animal1 und animal3 sind gleich");
        }
        
        animal1.eat(3);
        animal1.eat(2);
        animal1.move();
        animal1.move();
        animal1.getOlder();
        System.out.println(animal1);
        
        animal2.eat(5);
        animal2.move();
        animal2.getOlder();
        animal2.eat(5);
        animal2.getOlder();
        System.out.println(animal2);
        
        /* klassische for-Schleife */
        for(int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            animal.getOlder();
            animal.eat(2);
            animal.move();
            System.out.println(animal);
        }
        
        /* for-each-Schleife */
        for(Animal animal : animals) {
            animal.getOlder();
            animal.eat(2);
            animal.move();
            System.out.println(animal);        
        }

    }
    
}
