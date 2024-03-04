package model;

import java.util.ArrayList;

/**
 * Farbe
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public enum Color {
    
    BROWN("braun"), WHITE("weiss"), BLACK("schwarz"), RED("rot");
    
    private final String description;
    
    Color(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

}
