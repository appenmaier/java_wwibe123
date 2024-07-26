package main;

import java.util.HashMap;
import model.FastFood;
import model.FastFoodCategory;
import model.InvalidRatingException;
import model.NoProductFoundException;
import model.Shop;

/**
 * Klausurvorbereitung: Fast-Food
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class T03_FastFood {

  public static void main(String[] args) {

    Shop<FastFood> fastFoodShop = new Shop<FastFood>("Burger King", new HashMap<>());

    fastFoodShop.addProduct(new FastFood("Hamburger", FastFoodCategory.BURGER, 259, false));
    fastFoodShop.addProduct(new FastFood("Pommes klein", FastFoodCategory.FRIES, 231, true));
    fastFoodShop.addProduct(new FastFood("Pizza Margherita", FastFoodCategory.PIZZA, 840, true));

    try {
      fastFoodShop.rateProduct(new FastFood("Hamburger", FastFoodCategory.BURGER, 259, false), 3);
      fastFoodShop.rateProduct(new FastFood("Hamburger", FastFoodCategory.BURGER, 259, false), 3);
      fastFoodShop.rateProduct(new FastFood("Hamburger", FastFoodCategory.BURGER, 259, false), 1);
      fastFoodShop.rateProduct(new FastFood("Hamburger", FastFoodCategory.BURGER, 259, false), 5);
      fastFoodShop.rateProduct(new FastFood("Pommes klein", FastFoodCategory.FRIES, 231, true), 5);
    } catch (NoProductFoundException e) {
      e.printStackTrace();
    } catch (InvalidRatingException e) {
      System.out.println(e.getMessage());
    }

    fastFoodShop.getBestRatedProduct().ifPresent(System.out::println);
    fastFoodShop.getAllProductsSortedByNaturalOrdering().forEach(System.out::println);

  }

}
