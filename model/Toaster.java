package model;

/**
 * Toaster
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Toaster implements WiredDevice {

  @Override
  public void plugIn() {
    System.out.println("Der Toaster ist jetzt eingesteckt");
  }

  @Override
  public void pullThePlug() {
    System.out.println("Der Toaster ist jetzt ausgesteckt");
  }

}
