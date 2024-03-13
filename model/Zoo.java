package model;

import java.util.List;
import java.util.ArrayList;

/**
 * Zoo
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Zoo {
    
    private List<Animal> animals;
    
    public Zoo() {
        animals = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    
    public List<Fish> getFishesByColor(Color color) {
        List<Fish> fishes = new ArrayList<>();
        
        for(Animal a : animals) {
            if(a instanceof Fish f && f.color().equals(color)) {
                fishes.add(f);
            }
        }       
        
        return fishes;
    }
    
    public Animal getHeaviestAnimal() {
        Animal animal = null;
        double max = 0;
        
        for(Animal a : animals) {
            if(a.getWeightInKg() > max) {
                max = a.getWeightInKg();
                animal = a;
            }
        }        
        
        return animal;
    }

}
