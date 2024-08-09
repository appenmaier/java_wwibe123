package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import model.BMICalculator;
import model.InvalidSizeException;

/**
 * BMICalculatorTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BMICalculatorTest {

  static BMICalculator calculator;

  @BeforeAll
  static void setUp() throws InvalidSizeException {
    calculator = new BMICalculator(85, 1.8);
  }

  @Test
  void testConstructor() {
    assertThrows(InvalidSizeException.class, () -> new BMICalculator(0, 1));
    assertThrows(InvalidSizeException.class, () -> new BMICalculator(1, 0));
  }

  @Test
  void testGetBMI() {
    assertTrue(Math.abs(calculator.getBMI() - 26.234) <= 0.001);
  }

  @Test
  void testGetBMICategory() {
    assertTrue(calculator.getBMICategory()
        .equals("Uebergewicht"));

    assertEquals("Uebergewicht", calculator.getBMICategory());
  }

}
