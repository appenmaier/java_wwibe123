package main;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
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
    List<Movie> allActionMovies = movies.stream()
        .filter(movie -> movie.genres()
            .contains(Genre.ACTION))
        .toList();
    allActionMovies.forEach(System.out::println);
    System.out.println();

    // mapToDouble/mapToInt/mapToLong, average/sum
    System.out.println("Die Durchschnittsbewertung aller Filme");
    OptionalDouble averageRating = movies.stream()
        .mapToDouble(Movie::rating)
        .average();
    // OptionalDouble averageRating = movies.stream().mapToDouble(movie ->
    // movie.rating()).average();
    averageRating.ifPresent(System.out::println);
    System.out.println();

    // filter, sorted, limit/skip, forEach
    System.out.println("Die Top 5 Horrorfilme ausgeben");
    movies.stream()
        .filter(movie -> movie.genres()
            .contains(Genre.HORROR))
        .sorted((movie1, movie2) -> Double.compare(movie2.rating(), movie1.rating()))
        .limit(5)
        .forEach(System.out::println);
    System.out.println();

    // map, distinct, sorted, toList
    System.out.println("Alle Erscheinungsjahre als sortierte Liste");
    List<String> allPublishingYears = movies.stream()
        .map(movie -> movie.publishingYear())
        .distinct()
        .sorted()
        .toList();
    allPublishingYears.forEach(System.out::println);
    System.out.println();

    // filter, min/max/count
    System.out.println("Die laengste Komoedie als Optional");
    Optional<Movie> longestComedy = movies.stream()
        .filter(movie -> movie.genres()
            .contains(Genre.COMEDY))
        .max((movie1, movie2) -> Integer.compare(movie1.runtimeInMinutes(),
            movie2.runtimeInMinutes()));
    longestComedy.ifPresent(System.out::println);
    System.out.println();

    // filter, findFirst/findAny
    System.out.println("Ein Drama als Optional");
    Optional<Movie> drama = movies.stream()
        .filter(movie -> movie.genres()
            .contains(Genre.DRAMA))
        .findAny();
    drama.ifPresent(System.out::println);
    System.out.println();

    // anyMatch/allMatch/noneMatch
    System.out.println("Sind alle Horrorfilme nach dem Jahr 1982?");
    boolean exists = movies.stream()
        .allMatch(movie -> movie.genres()
            .contains(Genre.HORROR)
            && movie.publishingYear()
                .compareTo("1982") > 0);
    System.out.println(exists);
    System.out.println();

    // collect
    System.out.println("Alle Filme nach Jahr gruppiert als Map");
    Map<String, List<Movie>> allMoviesByYear = movies.stream()
        .collect(Collectors.groupingBy(movie -> movie.publishingYear()));
    allMoviesByYear.forEach((year, movies2) -> System.out.println(year + ": " + movies2.stream()
        .map(movie -> movie.title())
        .toList()));

    // filter, peek, toList
    System.out.println("Alle Komoedien mit einer Laufzeit von maximal 120 Minuten als Liste");
    List<Movie> allComedies = movies.stream()
        .filter(movie -> movie.genres()
            .contains(Genre.COMEDY))
        .peek(movie -> System.out.println(movie))
        .filter(movie -> movie.runtimeInMinutes() <= 120)
        .toList();
    allComedies.forEach(System.out::println);
    System.out.println();

  }

}
