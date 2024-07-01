package main;

import java.util.List;
import model.Genre;
import model.Movie;

/**
 * Datenklassen (Records)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D31_Records {

  public static void main(String[] args) {

    Movie movie1 = new Movie("John Wick 4", List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER),
        "2023", 169, 7.8, 241552);
    Movie movie2 = new Movie("John Wick 4", List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER),
        "2023", 169, 7.8, 241552);

    System.out.println(movie1);
    System.out.println(movie2);

    if (movie1 == movie2) {
      System.out.println("Die Filme sind identisch");
    }

    if (movie1.equals(movie2)) {
      System.out.println("Die Filme sind gleich");
    }

  }

}
