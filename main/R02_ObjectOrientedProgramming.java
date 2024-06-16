package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Animal;
import model.Color;

/**
 * Wiederholung: objektorientiertes Programmieren
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class R02_ObjectOrientedProgramming {

  @SuppressWarnings("unused")
  public static void main(String[] args) throws FileNotFoundException {

    /*
     * version 1.0: Animal animal1 = new Animal("Max", 'm', 3, LocalDate.of(2021, 5, 7),
     * Color.BROWN); Animal animal2 = new Animal("Amadeus", 'm', 40, LocalDate.of(1984, 12, 4),
     * Color.WHITE); Animal animal3 = new Animal("Nemo", 'm', 0.1, LocalDate.of(2000, 7, 5),
     * Color.RED);
     */

    ArrayList<Animal> animals = new ArrayList<>();
    /* version 1.0: animals.add(animal1); animals.add(animal2); animals.add(animal3); */

    File myFile = new File("resources/animals_v1.txt");
    Scanner myScanner = new Scanner(myFile);

    while (myScanner.hasNextLine()) {
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

      /*
       * version 1.0: Animal animal = new Animal(name, gender, weightInKg, birthday, color);
       * animals.add(animal);
       */
    }

    myScanner.close();

    for (Animal a : animals) {
      a.eat(3);
      a.move();
      System.out.println(a);
    }

  }

}
