package main;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.OptionalDouble;
import model.Genre;
import model.Movie;
import model.Movies;

/**
 * Intermediaere und Terminale Operationen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D41_IntermediateAndTerminaleOperations {

  public static void main(String[] args) throws FileNotFoundException {

    List<Movie> movies = Movies.getMovies(50, 100000);

    movies.forEach(System.out::println);
    System.out.println();

    // filter, toList
    System.out.println("Alle Actionfilme als Liste");
    List<Movie> allActionMovies =
        movies.stream().filter(movie -> movie.genres().contains(Genre.ACTION)).toList();
    allActionMovies.forEach(System.out::println);
    System.out.println();

    // filter, toList
    System.out.println("Alle Komoedien mit einer Laufzeit von maximal 120 Minuten");
    List<Movie> allComedies = movies.stream()
        .filter(movie -> movie.genres().contains(Genre.COMEDY))
        .filter(movie -> movie.runtimeInMinutes() <= 120)
        .toList();
    allComedies.forEach(System.out::println);
    System.out.println();

    // mapToDouble/mapToInt/mapToLong, average/sum
    System.out.println("Die Durchschnittsbewertung aller Filme");
    OptionalDouble averageRating = movies.stream().mapToDouble(Movie::rating).average();
    // OptionalDouble averageRating = movies.stream().mapToDouble(movie ->
    // movie.rating()).average();
    averageRating.ifPresent(System.out::println);
    System.out.println();

    // filter, sorted, limit/skip, forEach
    System.out.println("Die Top 5 Horrorfilme");
    movies.stream()
        .filter(movie -> movie.genres().contains(Genre.HORROR))
        .sorted((movie1, movie2) -> Double.compare(movie2.rating(), movie1.rating()))
        .limit(5)
        .forEach(System.out::println);
    System.out.println();

    // map, distinct, sorted, toList
    System.out.println("Alle Erscheinungsjahre als sortierte Liste");
    List<String> allPublishingYears =
        movies.stream().distinct().map(Movie::publishingYear).sorted().toList();
    allPublishingYears.forEach(System.out::println);

    System.out.println();

  }

}
