package main;

import java.util.ArrayList;
import model.TableLamp;
import model.Toaster;
import model.WiredDevice;

/**
 * Schnittstellen (Interfaces)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D30_Interfaces {

  public static void main(String[] args) {

    ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

    WiredDevice wiredDevice = new TableLamp(); // Upcast
    wiredDevices.add(wiredDevice);
    wiredDevices.add(new Toaster()); // Upcast

    for (WiredDevice d : wiredDevices) {
      d.plugIn(); // Polymorphie

      if (d instanceof TableLamp t) { // Downcast
        t.switchOn();
      }
      System.out.println(d);
    }

  }

}
