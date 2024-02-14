package model;


/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier 
 * @version 1.0
 */
public class TableLamp {

    /* Attribute */
    public boolean isShining;
    public boolean isConnected;
    public boolean isOn;
    public LightBulb lightBulb;

    /* Methoden */
    /**
     * Tischleuchte eingestecken
     */
    public void plugIn() {
        isConnected = true;
        if(isOn && lightBulb != null) {
            isShining = true;
        }
    }
    
    /**
     * Tischleuchte ausgestecken
     */
    public void pullThePlug() {
        isConnected = false;
        isShining = false;
    }
    
    /**
     * Tischleuchte einschalten
     */
    public void switchOn() {
        isOn = true;
        if(isConnected && lightBulb != null) {
            isShining = true;
        }
    }
    
    /**
     * Tischleuchte ausschalten
     */
    public void switchOff() {
        isOn = false;
        isShining = false;
    }
    
    /**
     * Gluehbirne wechseln
     * 
     * @param newLightBulb neue Gluehbirne
     * @return alte Gluehbirne
     */
    public LightBulb changeLightBulb(LightBulb newLightBulb) {
        LightBulb oldLightBulb = lightBulb;
        lightBulb = newLightBulb;
        return oldLightBulb;
    }
    
    /**
     * Gibt alle Attribute der Tischleuchte als Zeichenkette zurueck
     * 
     * @return alle Attribute der Tischleuchte als Zeichenkette
     */
    public String toString() {
        return "TableLamp [isShining=" + isShining + ", isOn=" + isOn + ", isConnected="
               + isConnected + ", lightBulb.color=" + lightBulb.color + "]";
    }
    
}
