package byui.cit260.vikingQuest.control;

//import com.sun.org.apache.bcel.internal.Constants;

import byui.cit260.vikingQuest.exceptions.CreateInventoryListExceptions;
import byui.cit260.vikingQuest.model.InventoryItem;
import java.util.logging.Level;
import java.util.logging.Logger;
import vikingquest.VikingQuest;


/**
 *
 * @author Amy
 */

public class createInventoryList {
    // private static Object Constants;
    public static int NUMBER_OF_INVENTORY_ITEMS;
    public static InventoryItem[] inventory;
    
    public static class Constants {
        public static int NUMBER_OF_INVENTORY_ITEMS;

        public Constants() {
        }
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