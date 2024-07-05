package model;

/**
 * Kabelgebundenes Geraet
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public interface WiredDevice {

  void plugIn() throws AlreadyPluggedInException;
  /* version 1.0: void plugIn(); */

  void pullThePlug();

}
