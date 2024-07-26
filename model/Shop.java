package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Shop
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Shop<T extends Comparable<T>>(String name, Map<T, List<Integer>> assortment) { // 1,5
                                                                                             // - 2
  public void addProduct(T product) { // 0,5
    if (!assortment.containsKey(product)) { // 1
      assortment.put(product, new ArrayList<>()); // 1
    }
    // assortment.putIfAbsent(product, new ArrayList<>()); // 2
  } // 2,5

  public void rateProduct(T product, int rating)
      throws NoProductFoundException, InvalidRatingException { // 1 - 1,5
    if (!assortment.containsKey(product)) { // 1
      throw new NoProductFoundException(); // 1
    }

    if (rating < 1 || rating > 5) { // 1
      throw new InvalidRatingException(rating); // 1
    }

    List<Integer> ratings = assortment.get(product); // 1
    ratings.add(rating); // 0,5 - 1
  } // 6,5 - 7,5

  public Optional<T> getBestRatedProduct() { // 0,5
    T bestRatedProduct = null; // 0,5
    double bestAverageRating = 0; // 0,5

    for (Entry<T, List<Integer>> entry : assortment.entrySet()) { // 1
      List<Integer> ratings = entry.getValue(); // 1

      double total = 0; // 0,5
      for (int rating : ratings) { // 1
        total += rating; // 0,5 - 1
      }
      double averageRating = total / ratings.size(); // 1 - 1,5

      if (averageRating > bestAverageRating) { // 1
        bestRatedProduct = entry.getKey(); // 1
        bestAverageRating = averageRating; // 1
      }
    }

    return Optional.ofNullable(bestRatedProduct); // 1 - 1,5
  } // 10,5 - 12

  public List<T> getAllProductsSortedByNaturalOrdering() { // 0,5
    // List<T> products = new ArrayList<>(); // 0,5
    // for (T p : assortment.keySet()) { // 1
    // products.add(p); // 0,5
    // }
    List<T> products = new ArrayList<>(assortment.keySet()); // 2

    Collections.sort(products); // 1

    return products; // 0,5
  } // 4

}
