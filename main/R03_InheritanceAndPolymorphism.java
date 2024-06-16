package main;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Animal;
import model.Color;
import model.Dog;
import model.Fish;

/**
 * Wiederholung: Vererbung und Polymorphie
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R03_InheritanceAndPolymorphism {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Animal> animals = new ArrayList<>();
    Animal animal;

    Dog dog1 = new Dog("Max", 'm', 3, LocalDate.of(2021, 5, 7), Color.BROWN, "Poodle");
    Dog dog2 =
        new Dog("Amadeus", 'm', 40, LocalDate.of(1984, 12, 4), Color.WHITE, "German Sheperd");
    Fish fish1 = new Fish("Nemo", 'm', 0.1, LocalDate.of(2000, 7, 5), Color.RED);

    animal = dog1; // Upcast
    animals.add(animal);
    animals.add(dog2); // Upcast
    animals.add(fish1); // Upcast
    animals.add(new Fish("Dorie", 'w', 0.2, LocalDate.of(2023, 4, 4), Color.BLUE)); // Upcast

    for (Animal a : animals) {
      a.eat(3);
      a.move();
      System.out.println(a); // Dynamische Polymorphie

      if (a instanceof Fish fish) { // Downcast (seit Java 16)
        // Fish fish = (Fish) animal; // Downcast
        fish.blub();
      }

      if (a instanceof Dog dog) { // Downcast (seit Java 16)
        // Dog dog = (Dog) animal; // Downcast
        dog.bark();
      }
    }

  }

}
