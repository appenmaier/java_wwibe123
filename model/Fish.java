package model;

import java.time.LocalDate;

/**
 * Fisch
 *
 * @author Daniel Appenmaier
 * @version 2.0
 */
public final class Fish extends Animal implements Eatable {

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

  @Override
  public void move() {
    weightInKg *= 0.95;
    System.out.println(name() + " schwimmt so vor sich hin");
  }

  @Override
  public double getCalories() {
    return weightInKg * 10;
  }

}
