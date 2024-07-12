package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import model.Genre;
import model.Movie;
import model.MovieByRatingDescendingComparator;

/**
 * Lokale Klassen, Anonyme Klassen, Lambda-Ausdruecke und Methodenreferenzen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D35_InnerClasses {

  private static List<Movie> movies;

  public static void main(String[] args) {

    /* Filme erstellen */
    movies = new ArrayList<>();
    movies.add(new Movie("John Wick 4", List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER), "2023",
        169, 7.8, 241552));
    movies.add(new Movie("Disaster Movie", List.of(Genre.COMEDY, Genre.SCIENCE_FICTION), "2008", 87,
        2.1, 93334));
    movies.add(new Movie("Der Pate", List.of(Genre.DRAMA, Genre.CRIME), "1972", 175, 9.2, 1900000));
    movies.add(new Movie("The Super Mario Bros. Movie",
        List.of(Genre.ANIMATION, Genre.ADVENTURE, Genre.COMEDY), "2023", 92, 7.1, 161146));

    /* Auessere Klassen */
    sortMoviesByOuterClass();
    printMoviesByOuterClass();
    System.out.println();

    /* Lokale Klassen */
    sortMoviesByLocalClass();
    printMoviesByLocalClass();
    System.out.println();

    /* Anonyme Klassen */
    sortMoviesByAnonymousClass();
    printMoviesByAnonymousClass();
    System.out.println();

    /* Lambda Ausdruecke */
    sortMoviesByLambdaExpression();
    printMoviesByLambdaExpression();
    System.out.println();

    /* Methodenreferenzen */
    sortMoviesByMethodReference();
    printMoviesByMethodReference();

  }

  private static void sortMoviesByOuterClass() {
    Collections.sort(movies, new MovieByRatingDescendingComparator());
  }

  private static void sortMoviesByLocalClass() {
    class MovieByPublishingYearAscendingComparator implements Comparator<Movie> {

      @Override
      public int compare(Movie movie1, Movie movie2) {
        return movie1.publishingYear().compareTo(movie2.publishingYear());
      }

    }

    Collections.sort(movies, new MovieByPublishingYearAscendingComparator());
  }

  private static void sortMoviesByAnonymousClass() {
    Collections.sort(movies, new Comparator<Movie>() {

      @Override
      public int compare(Movie movie1, Movie movie2) {
        return movie2.title().compareTo(movie1.title());
      }

    });
  }

  private static void sortMoviesByLambdaExpression() {
    Collections.sort(movies, (movie1, movie2) -> movie1.title().compareTo(movie2.title()));
  }

  private static void sortMoviesByMethodReference() {
    Collections.sort(movies, Comparator.comparing(Movie::runtimeInMinutes).reversed());
  }

  private static void printMoviesByOuterClass() {
    movies.forEach(new model.MoviePrinter());
  }

  private static void printMoviesByLocalClass() {
    class MoviePrinter implements Consumer<Movie> {

      @Override
      public void accept(Movie movie) {
        System.out.println(movie);
      }

    }

    movies.forEach(new MoviePrinter());
  }

  private static void printMoviesByAnonymousClass() {
    movies.forEach(new Consumer<Movie>() {

      @Override
      public void accept(Movie movie) {
        System.out.println(movie);
      }

    });
  }

  private static void printMoviesByLambdaExpression() {
    movies.forEach(movie -> System.out.println(movie));
  }

  private static void printMoviesByMethodReference() {
    movies.forEach(System.out::println);
    // movies.forEach(Movie::title);
  }

}
