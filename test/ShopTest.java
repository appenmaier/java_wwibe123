package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.FastFood;
import model.FastFoodCategory;
import model.InvalidRatingException;
import model.NoProductFoundException;
import model.Shop;

/**
 * ShopTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ShopTest {

  Shop<FastFood> shop;
  FastFood ff1;
  FastFood ff2;
  FastFood ff3;

  @BeforeEach
  void setUp() {
    shop = new Shop<FastFood>("MyShop", new HashMap<>());
    ff1 = new FastFood("FF1", FastFoodCategory.BURGER, 5, false);
    ff2 = new FastFood("FF2", FastFoodCategory.BURGER, 3, false);
    ff3 = new FastFood("FF3", FastFoodCategory.BURGER, 1, false);
  }

  @Test
  void testAddProduct() {
    shop.addProduct(ff1);
    assertNotNull(shop.assortment()
        .get(ff1));
  }

  @Test
  void testGetAllProductsSortedByNaturalOrdering() {
    shop.addProduct(ff2);
    shop.addProduct(ff1);
    shop.addProduct(ff3);
    assertEquals(ff1, shop.getAllProductsSortedByNaturalOrdering()
        .get(0));
    assertEquals(ff2, shop.getAllProductsSortedByNaturalOrdering()
        .get(1));
    assertEquals(ff3, shop.getAllProductsSortedByNaturalOrdering()
        .get(2));
  }

  @Test
  void testGetBestRatedProduct() throws NoProductFoundException, InvalidRatingException {
    assertEquals(Optional.empty(), shop.getBestRatedProduct());

    shop.addProduct(ff1);
    shop.addProduct(ff2);
    shop.rateProduct(ff1, 5);
    shop.rateProduct(ff2, 3);
    assertEquals(Optional.of(ff1), shop.getBestRatedProduct());
    assertEquals(ff1, shop.getBestRatedProduct()
        .get());
  }

  @Test
  void testRateProduct() throws NoProductFoundException, InvalidRatingException {
    assertThrows(NoProductFoundException.class, () -> shop.rateProduct(ff1, 1));

    shop.addProduct(ff1);
    assertThrows(InvalidRatingException.class, () -> shop.rateProduct(ff1, 0));
    assertThrows(InvalidRatingException.class, () -> shop.rateProduct(ff1, 6));

    shop.rateProduct(ff1, 3);
    shop.rateProduct(ff1, 1);
    shop.rateProduct(ff1, 5);
    assertEquals(3, shop.assortment()
        .get(ff1)
        .size());
    assertEquals(1, shop.assortment()
        .get(ff1)
        .get(1));
  }

}
