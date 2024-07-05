package model;

/**
 * AlreadyPluggedInException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class AlreadyPluggedInException extends Exception {

  private static final long serialVersionUID = 1L;

  public AlreadyPluggedInException() {
    super("Die Tischleuchte ist bereits eingesteckt");
  }

}
