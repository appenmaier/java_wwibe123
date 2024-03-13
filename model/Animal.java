package model;

import java.util.ArrayList;
import java.time.LocalDate;
import model.Color;

/**
 * Tier
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public abstract class Animal {
    
    private final String name;
    private final char gender;
    private final LocalDate birthday;
    protected double weightInKg;
    private final Color color;
    
    public Animal(String name, char gender, double weightInKg, LocalDate birthday, Color color) {
        this.name = name;
        this.gender = gender;
        this.weightInKg = weightInKg;
        this.birthday = birthday;
        this.color = color;
    }
    
    public final void eat(int valueInKg) {
        weightInKg += valueInKg;
        System.out.println(name + " frisst und wiegt nun " + weightInKg + "kg");
    }
    
    public abstract void move();
    
    public final String name() {
        return name;
    }
    
    public final char gender() {
        return gender;
    }
    
    public final double getWeightInKg() {
        return weightInKg;
    }
    
    public final LocalDate birthday() {
        return birthday;
    }
    
    public final Color color() {
        return color;
    }
    
    public boolean equals(Animal other) {
        if(this.name.equals(other.name) && this.gender == other.gender
          && this.weightInKg == other.weightInKg
          && this.birthday.equals(other.birthday) && this.color.equals(other.color) ) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "Animal [name=" + name + ", gender=" + gender
          + ", weightInKg=" + weightInKg 
          + ", birthday=" + birthday + ", color=" + color + "]";
        // ab Java 24: return STR."Animal [name=\{name}, gender=\{gender}, weightInKg=\{weightInKg}, birthday=\{birthday}";
    }

}
