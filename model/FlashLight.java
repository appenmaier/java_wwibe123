package model;

/**
 * Taschenlampe
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public final class FlashLight extends Light {
  // version 2.0: public class FlashLight extends Light {

  // version 1.0: private boolean isShining;
  // version 1.0: private boolean isOn;
  private Battery battery;

  public void changeBattery(Battery battery) {
    this.battery = battery;
  }

  // version 1.0: public void switchOff() {
  // isOn = false;
  // isShining = false;
  // }

  @Override
  public void switchOn() {
    isOn = true;
    if (battery != null && battery.getEnergyLevel() > 0) {
      isShining = true;
      battery.decreaseEnergyLevel();
    }
  }

  @Override
  public String toString() {
    return "FlashLight [isOn=" + isOn + ", isShining=" + isShining + ", battery="
        + ((battery == null) ? "null" : battery) + "]";
  }

}
