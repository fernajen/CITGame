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
public enum Characters implements Serializable{
    
   Elf("Elf description here"),
   Dwarf("Dwarf description here"),
   Vampire("Vampire descrition here"),
   Werewolf("Werewolf description here"),
   Wizard("Wizard description here"),
   Hawk("Hawk description here"),
   Giant("Giant description here"),
   BabyDragon("Baby Dragon description here");
   
    //Class instance variables
    private final String ability;
    private final String description;
    
    //Default Constructor Function

    Characters(String description) {
    this.description = description;
    ability = new String ("The character can do this!");
    }
    
    
    //Getter and Setter Functions
    public String getAbility() {
        return ability;
    }
 
    public String getDescription() {
        return description;
    }

 
    
    //toString, equals, hashCode functions
    /*

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
    */
    
}
