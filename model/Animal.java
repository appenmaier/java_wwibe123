package model;

import java.util.ArrayList;

/**
 * Tier
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Animal {
    
    public String name;
    public char gender;
    public int age;
    public double weightInKg;
    
    public void eat() {
        System.out.println(name + " frisst");
    }
    
    public void move() {
        System.out.println(name + " bewegt sich");
    }

}
