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
public enum Items{
    flashlight,
    waterBottle,
    matches,
    rope,
    bowAndArrow,
    sword,
    walkingStick;
   Public Static ItemsInventory[] create InventoryList {
    ItemsInventory[] inventory =
            new ItemsInventory[Constants.NUMBER_OF_INVENTORY_ITEMS];
    
    InventoryItem flashlight = new ItemsInventory();
    flashlight.setDescription("flashlight");
    flashlight.setQuantityInStock(0);
    flashlight.setRequiredAmount(0);
    inventory[Item.flashlight.ordinal()] = flashlight;
    
        InventoryItem waterBottle = new ItemsInventory();
    waterBottle.setDescription("waterBottle");
    waterBottle.setQuantityInStock(0);
    waterBottle.setRequiredAmount(0);
    inventory[Item.waterBottle.ordinal()] = waterBottle;
    
       InventoryItem matches = new ItemsInventory();
    matches.setDescription("matches");
    matches.setQuantityInStock(0);
    matches.setRequiredAmount(0);
    inventory[Item.matches.ordinal()] = matches;
    
      InventoryItem rope = new ItemsInventory();
   rope.setDescription("rope");
   rope.setQuantityInStock(0);
    rope.setRequiredAmount(0);
    inventory[Item.rope.ordinal()] = rope;
    
      InventoryItem bowAndArrow = new ItemsInventory();
  bowAndArrow.setDescription("bowAndArrow");
  bowAndArrow.setQuantityInStock(0);
   bowAndArrow.setRequiredAmount(0);
    inventory[Item.bowAndArrow.ordinal()] = bowAndArrow;
    
     InventoryItem sword = new ItemsInventory();
  sword.setDescription("sword");
 sword.setQuantityInStock(0);
   sword.setRequiredAmount(0);
    inventory[Item.sword.ordinal()] = sword;
     
    InventoryItem walkingStick = new ItemsInventory();
 walkingStick.setDescription("walkingStick");
 walkingStick.setQuantityInStock(0);
   walkingStick.setRequiredAmount(0);
    inventory[Item.walkingStick.ordinal()] = walkingStick;
} 
    
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
