/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.model;
import java.io.Serializable;

/**
 *
 * @author Amy Jennifer Ivy
 */


public class Backpack implements Serializable{
    
    // Class instance Variables
    private double totalNumItems;
    
    // Default Constructor

    public Backpack() {
    }
    
    
    // Getter and Setter
    public double getTotalNumItems() {
        return totalNumItems;
    }

    public void setTotalNumItems(double totalNumItems) {
        this.totalNumItems = totalNumItems;
    }
    
    //toString equals and hashCode
    @Override
    public String toString() {
        return "Backpack{" + "totalNumItems=" + totalNumItems + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.totalNumItems) ^ (Double.doubleToLongBits(this.totalNumItems) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Backpack other = (Backpack) obj;
        if (Double.doubleToLongBits(this.totalNumItems) != Double.doubleToLongBits(other.totalNumItems)) {
            return false;
        }
        return true;
    }
    
    
    
}


