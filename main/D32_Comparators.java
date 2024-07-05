package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Genre;
import model.Movie;
import model.MovieByRatingDescendingComparator;

/**
 * Komparatoren
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D32_Comparators {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(7);
    numbers.add(2);
    numbers.add(9);

    List<String> names = new ArrayList<>();
    names.add("Xaver");
    names.add("Anna");
    names.add("Lisa");
    names.add("Moritz");

    List<Movie> movies = new ArrayList<>();
    movies.add(new Movie("John Wick 4", List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER), "2023",
        169, 7.8, 241552));
    movies.add(new Movie("Disaster Movie", List.of(Genre.COMEDY, Genre.SCIENCE_FICTION), "2008", 87,
        2.1, 93334));
    movies.add(new Movie("Der Pate", List.of(Genre.DRAMA, Genre.CRIME), "1972", 175, 9.2, 1900000));
    movies.add(new Movie("The Super Mario Bros. Movie",
        List.of(Genre.ANIMATION, Genre.ADVENTURE, Genre.COMEDY), "2023", 92, 7.1, 161146));

    Collections.sort(numbers);
    Collections.sort(names);
    Collections.sort(movies);

    for (Integer i : numbers) {
      System.out.println(i);
    }

    for (String name : names) {
      System.out.println(name);
    }

    for (Movie movie : movies) {
      System.out.println(movie);
    }

    Collections.sort(movies, new MovieByRatingDescendingComparator());

    for (Movie movie : movies) {
      System.out.println(movie);
    }

  }

}
