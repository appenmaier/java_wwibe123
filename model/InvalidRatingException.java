package model;

/**
 * InvalidRatingException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@SuppressWarnings("serial")
public class InvalidRatingException extends Exception { // 1

  public InvalidRatingException(int rating) { // 0,5
    super(rating + " is not a valid rating. Ratings must be in range 1 to 5"); // 1
  } // 1,5

}
// 2,5
