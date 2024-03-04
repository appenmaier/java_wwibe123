package model;


/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier 
 * @version 7.0
 */
public class TableLamp extends Light {

    /* Attribute */
    private boolean isConnected;
    private LightBulb lightBulb;
    // version 1.0: public boolean isShining;
    // version 1.0: public boolean isConnected;
    // version 1.0: public boolean isOn;
    // version 1.0: public LightBulb lightBulb;
    // version 6.0: private boolean isShining;
    // version 6.0: private boolean isOn;
    private PlugType plugType;
    // version 5.0: -
    
    public final static String TYPE = "Tischleuchte";
    private static int numberOfTableLamps;
    // version 4.0: -

    /* Methoden */
    public TableLamp() {
        lightBulb = new LightBulb();
        plugType = PlugType.TYPE_F;
        numberOfTableLamps++;
    }
    // version 3.0: -
    
    public TableLamp(String lightBulbColor) {
        lightBulb = new LightBulb(lightBulbColor);
        plugType = PlugType.TYPE_F;
        numberOfTableLamps++;
    }
    // version 3.0: -
    
    public TableLamp(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        plugType = PlugType.TYPE_F;
        numberOfTableLamps++;
    }
    // version 3.0: -
    
    public TableLamp(PlugType plugType) {
        lightBulb = new LightBulb();
        this.plugType = plugType;
    }
    // version 5.0: -
    
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
    @Override
    public void switchOn() {
        isOn = true;
        if(isConnected && lightBulb != null) {
            isShining = true;
        }
    }
    
    // version 6.0:
    // public void switchOff() {
    // isOn = false;
    // isShining = false;
    // }
    
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
    @Override
    public String toString() {
        return "TableLamp [isShining=" + isShining
            + ", isOn=" + isOn
            + ", isConnected=" + isConnected
            + ", lightBulb=" + lightBulb + "]";
    }
    // version 2.0: public String toString() {
    // return "TableLamp [isShining=" + isShining + ", isOn="
    // + isOn + ", isConnected=" + isConnected + ", lightBulb.color=" + lightBulb.getColor() + "]"; }
    
    /**
     * Prueft, ob die Tischleuchte zur eingehenden Tischleuchte gleich ist
     * 
     * @param other eingehende Tischleuchte
     * @return true = gleich, false = ungleich
     */
    public boolean equals(TableLamp other) {
        boolean isEqual = (other.isShining == isShining &&
                           other.isConnected == isConnected &&
                           other.isOn == isOn &&
                           other.lightBulb.equals(lightBulb)) ? true : false;
        return isEqual;
    }
    // version 2.0: -
    
    public static int getNumberOfTableLamps() {
        return numberOfTableLamps;
    }
    // version 4.0: -
    
    public PlugType getPlugType() {
        return plugType;
    }
    // version 5.0: -
    
}
