package model;

import java.util.ArrayList;

/**
 * Tier
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Animal {
    
    private final String name;
    private final char gender;
    private int age;
    private double weightInKg;
    
    public Animal(String name, char gender, double weightInKg) {
        this.name = name;
        this.gender = gender;
        this.weightInKg = weightInKg;
    }
    
    public void getOlder(){
        System.out.println(name + " hat Geburtstag und wird ein Jahr aelter");
        age++;
    }
    
    public void eat(int valueInKg) {
        weightInKg += valueInKg;
        System.out.println(name + " frisst und wiegt nun " + weightInKg + "kg");
    }
    
    public void move() {
        weightInKg *= 0.9;
        System.out.println(name + " bewegt sich");
    }
    
    public String getName() {
        return name;
    }
    
    public char getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeightInKg() {
        return weightInKg;
    }
    
    public boolean equals(Animal other) {
        if(this.name.equals(other.name) && this.gender == other.gender
          && this.age == other.age && this.weightInKg == other.weightInKg) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "Animal [name=" + name + ", gender=" + gender
          + ", age=" + age + ", weightInKg=" + weightInKg  + "]";
        // ab Java 24: return STR."Animal [name=\{name}, gender=\{gender}, age=\{age}, weightInKg=\{weightInKg}";
    }

}
