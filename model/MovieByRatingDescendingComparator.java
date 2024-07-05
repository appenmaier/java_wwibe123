package model;

import java.util.Comparator;

/**
 * MovieByRatingDescendingComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MovieByRatingDescendingComparator implements Comparator<Movie> {

  @Override
  public int compare(Movie movie1, Movie movie2) {
    // Double rating1 = movie1.rating();
    // Double rating2 = movie2.rating();
    // return rating2.compareTo(rating1);
    return Double.valueOf(movie2.rating()).compareTo(movie1.rating());
  }

}
