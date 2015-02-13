/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Amy
 */
public class Location implements Serializable{
    
    // Calss Instance Variables
    private String locationName;
    private String scenesInLocation;
    private String itemsInLocation;
    
    // Default Constructor
    public Location() {
    }

    // Getter and Setter
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getScenesInLocation() {
        return scenesInLocation;
    }

    public void setScenesInLocation(String scenesInLocation) {
        this.scenesInLocation = scenesInLocation;
    }

    public String getItemsInLocation() {
        return itemsInLocation;
    }

    public void setItemsInLocation(String itemsInLocation) {
        this.itemsInLocation = itemsInLocation;
    }
    
    //ToString, equals, hashCode
    @Override
    public String toString() {
        return "Location{" + "locationName=" + locationName + ", scenesInLocation=" + scenesInLocation + ", itemsInLocation=" + itemsInLocation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.locationName);
        hash = 79 * hash + Objects.hashCode(this.scenesInLocation);
        hash = 79 * hash + Objects.hashCode(this.itemsInLocation);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        if (!Objects.equals(this.scenesInLocation, other.scenesInLocation)) {
            return false;
        }
        if (!Objects.equals(this.itemsInLocation, other.itemsInLocation)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
