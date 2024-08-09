package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import model.FastFood;
import model.FastFoodCategory;

/**
 * FastFoodTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FastFoodTest {

  static FastFood fastFood1;
  static FastFood fastFood2;
  static FastFood fastFood3;

  @BeforeAll
  static void setUp() {
    fastFood1 = new FastFood("FF1: 1kcal", FastFoodCategory.BURGER, 1, false);
    fastFood2 = new FastFood("FF1: 5kcal", FastFoodCategory.BURGER, 5, false);
    fastFood3 = new FastFood("FF1: 1kcal", FastFoodCategory.BURGER, 1, false);
  }

  @Test
  void testCompareTo1() {
    assertTrue(fastFood1.compareTo(fastFood2) > 0);
  }

  @Test
  void testCompareTo2() {
    assertTrue(fastFood2.compareTo(fastFood1) < 0);
  }

  @Test
  void testCompareTo3() {
    assertTrue(fastFood1.compareTo(fastFood3) == 0);
    assertTrue(fastFood3.compareTo(fastFood1) == 0);
  }

}
