package model;

/**
 * Gluehbirne
 *
 * @author Daniel Appenmaier
 * @version 4.0
 */
public class LightBulb {

  /* Attribute */
  private final String color;
  // version 1.0: public String color;
  // version 3.0: private String color;

  /* Methoden */
  public LightBulb(String color) {
    this.color = color;
  }
  // version 3.0: public void setColor(String c) { color = c; }
  // version 1.0: - */

  public LightBulb() {
    color = "weiss";
  }
  // version 3.0: -

  public String getColor() {
    return color;
  }
  // version 1.0: -

  @Override
  public String toString() {
    return "LightBulb [color=" + color + "]";
  }
  // version 2.0: -

  public boolean equals(LightBulb other) {
    boolean isEqual = (other.color == color) ? true : false;
    return isEqual;
  }
  // version 2.0: -

}
