package model;

/**
 * BMI Rechner
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BMICalculator {

  private double weightInKg;
  private double sizeInM;

  public BMICalculator(double weightInKg, double sizeInM) throws InvalidSizeException {
    if (weightInKg <= 0 || sizeInM <= 0) {
      throw new InvalidSizeException();
    }

    this.weightInKg = weightInKg;
    this.sizeInM = sizeInM;
  }

  public double getBMI() {
    return weightInKg / (sizeInM * sizeInM);
  }

  public String getBMICategory() {
    return (getBMI() < 18.5 ? "Untergewicht" : getBMI() < 25 ? "Normalgewicht" : "Uebergewicht");
  }

}
