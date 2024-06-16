package main;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import model.Color;
import model.Dog;
import model.Fish;
import model.Zoo;

/**
 * Wiederholung: Schnittstellen (Interfaces)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class T02_Zoo {

  public static void main(String[] args) throws FileNotFoundException {

    Zoo zoo = new Zoo();
    zoo.addAnimal(new Dog("Max", 'm', 3, LocalDate.of(2021, 5, 7), Color.BROWN, "Poodle"));
    zoo.addAnimal(
        new Dog("Amadeus", 'm', 40, LocalDate.of(1984, 12, 4), Color.WHITE, "German Sheperd"));
    zoo.addAnimal(new Fish("Nemo", 'm', 0.1, LocalDate.of(2000, 7, 5), Color.RED));
    zoo.addAnimal(new Fish("Dorie", 'w', 0.2, LocalDate.of(2023, 4, 4), Color.BLUE));

    System.out.println(zoo.getHeaviestAnimal());
    System.out.println(zoo.getFishesByColor(Color.RED));

  }

}
