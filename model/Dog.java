package model;

import java.time.LocalDate;

/**
 * Hund
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Dog extends Animal {
    
    private final String breedOfDog;
    
    public Dog(String name, char gender, double weightInKg, LocalDate birthday, Color color, String breedOfDog) {
        super(name, gender, weightInKg, birthday, color);
        this.breedOfDog = breedOfDog; 
    }
    
    public String breedOfDog() {
        return breedOfDog;
    }
    
    public boolean equals(Dog other) {
        boolean isEqual = super.equals(other);
        return isEqual && this.breedOfDog.equals(other.breedOfDog);
    }

    @Override
    public String toString() {
        return "Dog [name=" + name() + ", gender=" + gender()
          + ", weightInKg=" + getWeightInKg() 
          + ", birthday=" + birthday() + ", color=" + color()
          + ", breedOfDog=" + breedOfDog + "]";
    }
    
    public void bark() {
        System.out.println("Wuff Wuff");
    }

}
