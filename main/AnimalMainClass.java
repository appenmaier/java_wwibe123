package main;

import model.Animal;
import java.util.ArrayList;
import java.time.LocalDate;
import model.Color;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import model.Dog;
import model.Fish;

/**
 * Wiederholung: Tiere
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class AnimalMainClass {

    public static void main(String[] args) throws FileNotFoundException {
        
        Animal animal1 = new Dog("Max", 'm', 3, LocalDate.of(2021, 5, 7), Color.BROWN, "Poodle"); // Upcast
        Animal animal2 = new Dog("Amadeus", 'm', 40, LocalDate.of(1984, 12, 4), Color.WHITE, "German Sheperd"); // Upcast 
        Animal animal3 = new Fish("Max", 'm', 3, LocalDate.of(2021, 8, 26), Color.RED); // Upcast
        Fish fish1 = new Fish("Nemo", 'm', 0.1, LocalDate.of(2000, 7, 5), Color.RED);
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(new Animal("Ingrid", 'w', 1, LocalDate.of(2023, 4, 4), Color.BROWN));
        animals.add(fish1); // Upcast
        
        File myFile = new File("resources/animals.txt");
        Scanner myScanner = new Scanner(myFile);
        
        while(myScanner.hasNextLine()) {
            String line = myScanner.nextLine();
            String[] tokens = line.split(";");
            
            String name = tokens[0];
            char gender = tokens[1].charAt(0);
            double weightInKg = Double.parseDouble(tokens[2]); // Double.valueOf(tokens[2]);
            int year = Integer.parseInt(tokens[3]);
            int month = Integer.parseInt(tokens[4]);
            int day = Integer.parseInt(tokens[5]);
            LocalDate birthday = LocalDate.of(year, month, day);
            Color color = Color.valueOf(tokens[6]);
            
            Animal animal = new Animal(name, gender, weightInKg, birthday, color);
            animals.add(animal);
        }
        
        if (animal1.equals(animal3)) {
            System.out.println("animal1 und animal3 sind gleich");
        }
        
        animal1.eat(3);
        animal1.eat(2);
        animal1.move();
        animal1.move();
        System.out.println(animal1);
        
        animal2.eat(5);
        animal2.move();
        animal2.eat(5);
        System.out.println(animal2);
        
        /* klassische for-Schleife */
        for(int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            animal.eat(2);
            animal.move();
            System.out.println(animal); // Dynamische Polymorphie
        }
        
        /* for-each-Schleife */
        for(Animal animal : animals) {
            animal.eat(2);
            animal.move();
            System.out.println(animal); // Dynamische Polymorphie 
            
            if (animal instanceof Fish fish) { // Downcast (seit Java 16)
                //Fish fish = (Fish) animal; // Downcast
                fish.blub();
            }
            
            if (animal instanceof Dog dog) { // Downcast (seit Java 16)
                //Dog dog = (Dog) animal; // Downcast
                dog.bark();
            }
        }

    }
    
}
