/*
 * Items Class Functions
 */
package byui.cit260.vikingQuest.model;

//Directories
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Amy, Jennifer, Ivey
 */
public class Items implements Serializable{
    
    // Class instance Variables
    private String type;
    private String name;
    private String quantity;
    private String ability;
    
    //Default Constructor Function
    public Items() {
    }
    
    
    //Getter and Setter functions
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    
    //toString, equals, hashCode

    @Override
    public String toString() {
        return "Items{" + "type=" + type + ", name=" + name + ", quantity=" + quantity + ", ability=" + ability + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.quantity);
        hash = 89 * hash + Objects.hashCode(this.ability);
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
        final Items other = (Items) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.ability, other.ability)) {
            return false;
        }
        return true;
    }
    
    
}
