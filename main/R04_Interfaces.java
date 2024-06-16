package main;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Burger;
import model.Color;
import model.Eatable;
import model.Fish;

/**
 * Wiederholung: Schnittstellen (Interfaces)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R04_Interfaces {

  public static void main(String[] args) throws FileNotFoundException {

    List<Eatable> eatables = new ArrayList<>();
    eatables.add(new Fish("Nemo", 'm', 0.1, LocalDate.of(2000, 7, 5), Color.RED)); // Upcast
    eatables.add(new Burger(750)); // Upcast

    for (Eatable e : eatables) {
      System.out.println(e.getCalories()); // Polymorphie
      if (e instanceof Fish f) { // Downcast
        f.blub();
      }
    }

  }

}
