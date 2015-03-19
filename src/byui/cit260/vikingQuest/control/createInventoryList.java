
package byui.cit260.vikingQuest.control;

//import com.sun.org.apache.bcel.internal.Constants;

import byui.cit260.vikingQuest.model.InventoryItem;
import vikingquest.VikingQuest;


/**
 *
 * @author Amy
 */

public class createInventoryList {
    // private static Object Constants;
    private static int NUMBER_OF_INVENTORY_ITEMS;
    private static InventoryItem[] inventory;
    
    
    public static InventoryItem[] createInventoryList(){
    // create array(list) of inventory items
        InventoryItem[] inventory = 
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        

        InventoryItem shovel = new InventoryItem();
        shovel.setType("Shovel");
        shovel.setQuantity(0);
        shovel.setRequiredAmount(0);
        inventory[Item.shovel.ordinal()] = shovel;

        InventoryItem gold = new InventoryItem();
        gold.setType("gold");
        gold.setQuantity(0);
        gold.setRequiredAmount(0);
        inventory[Item.gold.ordinal()] = gold;
        
        return inventory;
    }
    
    public enum Item {     // enums are like arrays... but doesn't save any info with it.
        shovel,
        gold;

        public static InventoryItem getShovel() {
            InventoryItem[] itemList = VikingQuest.getCurrentGame().getItems();
            InventoryItem shovel = itemList[Item.shovel.ordinal()];
            return shovel;
        }

        public static InventoryItem getGold() {
            InventoryItem[] itemList = VikingQuest.getCurrentGame().getItems();
            InventoryItem gold = itemList[Item.gold.ordinal()];
            return gold;
        }

        private void setQuantityInStock(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setDescription(String shovel) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setRequiredAmount(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }  
}
