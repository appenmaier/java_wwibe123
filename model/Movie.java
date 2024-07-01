package model;

import java.util.List;

/**
 * Film
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Movie(String title, List<Genre> genres, String publishingYear, int runtimeInMinutes,
    double rating, int numberOfVotes) {

}
