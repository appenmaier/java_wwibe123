package model;

/**
 * Genre
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Genre {

  ACTION("Action"), ADVENTURE("Adventure"), ANIMATION("Animation"), BIOGRAPHY("Biography"),
  COMEDY("Comedy"), CRIME("Crime"), DOCUMENTARY("Documentary"), DRAMA("Drama"), FAMILY("Family"),
  FANTASY("Fantasy"), FILM_NOIR("Film Noir"), HISTORY("History"), HORROR("Horror"), MUSIC("Music"),
  MUSICAL("Musical"), MYSTERY("Mystery"), NEWS("News"), ROMANCE("Romance"),
  SCIENCE_FICTION("Science Fiction"), SPORT("Sport"), THRILLER("Thriller"), WAR("War"),
  WESTERN("Western");

  private String name;

  Genre(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
