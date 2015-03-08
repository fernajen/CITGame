/*
 * Scene
 */
package byui.cit260.vikingQuest.model;

//Directories
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Amy, Jennifer, Ivey
 */
public class Scene implements Serializable{
    
    // Class instance variables
    private String jungle;
    private String temple;
    private String ruins;
    private String vikingMound;
    private String mountains;
    private String start;
    private String town;
    private String shop;
    
    //Default Constructor function
    public Scene() {
    }
    
    
    //Getter and Setter
    public String getJungle() {
        return jungle;
    }

    public void setJungle(String jungle) {
        this.jungle = jungle;
    }

    public String getTemple() {
        return temple;
    }

    public void setTemple(String temple) {
        this.temple = temple;
    }

    public String getRuins() {
        return ruins;
    }

    public void setRuins(String ruins) {
        this.ruins = ruins;
    }

    public String getVikingMound() {
        return vikingMound;
    }

    public void setVikingMound(String vikingMound) {
        this.vikingMound = vikingMound;
    }

    public String getMountains() {
        return mountains;
    }

    public void setMountains(String mountains) {
        this.mountains = mountains;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
    
    //toString, equals, hashCode
    @Override
    public String toString() {
        return "Scene{" + "jungle=" + jungle + ", temple=" + temple + ", ruins=" + ruins + ", vikingMound=" + vikingMound + ", mountains=" + mountains + ", start=" + start + ", town=" + town + ", shop=" + shop + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.jungle);
        hash = 11 * hash + Objects.hashCode(this.temple);
        hash = 11 * hash + Objects.hashCode(this.ruins);
        hash = 11 * hash + Objects.hashCode(this.vikingMound);
        hash = 11 * hash + Objects.hashCode(this.mountains);
        hash = 11 * hash + Objects.hashCode(this.start);
        hash = 11 * hash + Objects.hashCode(this.town);
        hash = 11 * hash + Objects.hashCode(this.shop);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.jungle, other.jungle)) {
            return false;
        }
        if (!Objects.equals(this.temple, other.temple)) {
            return false;
        }
        if (!Objects.equals(this.ruins, other.ruins)) {
            return false;
        }
        if (!Objects.equals(this.vikingMound, other.vikingMound)) {
            return false;
        }
        if (!Objects.equals(this.mountains, other.mountains)) {
            return false;
        }
        if (!Objects.equals(this.start, other.start)) {
            return false;
        }
        if (!Objects.equals(this.town, other.town)) {
            return false;
        }
        if (!Objects.equals(this.shop, other.shop)) {
            return false;
        }
        return true;
    }
    
    
}
