package model;

/**
 * Leuchte
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public abstract class Light {
  // version 1.0: public class Light {

  protected boolean isShining;
  protected boolean isOn;

  public abstract void switchOn();
  // version 1.0: public void switchOn() {
  // isOn = true;
  // isShining = true;
  // }

  public final void switchOff() {
    isOn = false;
    isShining = false;
  }
  // version 1.0: public void switchOff() {
  // isOn = false;
  // isShining = false;
  // }

  @Override
  public String toString() {
    return "Light [isOn=" + isOn + ", isShining=" + isShining + "]";
  }

}
