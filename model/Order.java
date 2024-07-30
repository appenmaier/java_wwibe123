package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Auftrag
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Order {

  /**
   * Auftragsposition
   *
   * @author Daniel Appenmaier
   * @version 1.0
   *
   */
  public class OrderItem {

  }

  private List<OrderItem> items;

  public Order() {
    items = new ArrayList<>();
  }

  public List<OrderItem> items() {
    return items;
  }

}
