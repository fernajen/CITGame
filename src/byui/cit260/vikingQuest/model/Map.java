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
public class Map implements Serializable{
    
    // Instance Class Variables
    private String entireMap;
    private String locationsInMap;
    
    
    // ToString, equals, hashCode
    @Override
    public String toString() {
        return "Map{" + "entireMap=" + entireMap + ", locationsInMap=" + locationsInMap + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.entireMap);
        hash = 89 * hash + Objects.hashCode(this.locationsInMap);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.entireMap, other.entireMap)) {
            return false;
        }
        if (!Objects.equals(this.locationsInMap, other.locationsInMap)) {
            return false;
        }
        return true;
    }
    
    
    
}
