package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Filme
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movies {

  public static List<Movie> getMovies(int maxMovies, int minVotes) throws FileNotFoundException {
    List<Movie> movies = new ArrayList<>();
    File file = new File("resources/movies.csv");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");
      String title = tokens[0];
      double rating = Double.valueOf(tokens[1]);
      int runtimeInMinutes = Integer.valueOf(tokens[2]);
      String year = tokens[3];
      ArrayList<Genre> genres = new ArrayList<>();
      String[] genreTexts = tokens[4].split(",");
      for (String text : genreTexts) {
        Genre genre = Genre.valueOf(text);
        genres.add(genre);
      }
      int votes = Integer.valueOf(tokens[5]);
      Movie movie = new Movie(title, genres, year, runtimeInMinutes, rating, votes);
      movies.add(movie);
    }
    scanner.close();

    movies.removeIf(m -> m.numberOfVotes() < minVotes);

    List<Movie> tmp = new ArrayList<>();
    for (int i = 0; i < maxMovies; i++) {
      if (movies.size() == 0) {
        break;
      }
      Random random = new Random();
      int index = random.nextInt(movies.size());
      tmp.add(movies.get(index));
      movies.remove(index);
    }
    movies = tmp;

    return movies;
  }

}
