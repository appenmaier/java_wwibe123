package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.FastFood;
import model.FastFoodCategory;

/**
 * Klausurvorbereitung: Fast-Food
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class T03_FastFood {

  public static void main(String[] args) {

    List<FastFood> fastFood = new ArrayList<>();

    fastFood.add(new FastFood("Hamburger", FastFoodCategory.BURGER, 259, false));
    fastFood.add(new FastFood("Pommes klein", FastFoodCategory.FRIES, 231, true));
    fastFood.add(new FastFood("Pizza Margherita", FastFoodCategory.PIZZA, 840, true));

    Collections.sort(fastFood);

    fastFood.forEach(System.out::println);

  }

}
