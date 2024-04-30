package model;

/**
 * Burger
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Burger implements Eatable {

  private final double calories;

  public Burger(double calories) {
    this.calories = calories;
  }

  @Override
  public double getCalories() {
    return calories;
  }

}
