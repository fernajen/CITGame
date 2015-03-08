/*
 * Characters Class Functions
 */
package byui.cit260.vikingQuest.model;

//Directories
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Amy, Jennifer, Ivey
 */
public class Characters implements Serializable{
    
    //Class instance variables
    private String ability;
    private String name;
    private String description;
    
    //Default Constructor Function

    public Characters() {
    }
    
    
    //Getter and Setter Functions
    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    //toString, equals, hashCode functions

    @Override
    public String toString() {
        return "Characters{" + "ability=" + ability + ", name=" + name + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.ability);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
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
        final Characters other = (Characters) obj;
        if (!Objects.equals(this.ability, other.ability)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
}
