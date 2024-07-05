package model;

import java.util.Comparator;
import java.util.List;

/**
 * Film
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Movie(String title, List<Genre> genres, String publishingYear, int runtimeInMinutes,
    double rating, int numberOfVotes) implements Comparable<Movie> {

  @Override
  public int compareTo(Movie otherMovie) {
    return title.compareTo(otherMovie.title);
  }

  public static class MovieByPublishingYearDescendingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
      return movie2.publishingYear.compareTo(movie1.publishingYear);
    }

  }

}
