/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.control;

import byui.cit260.vikingQuest.exceptions.CreateInventoryListExceptions;
import byui.cit260.vikingQuest.exceptions.GameControlException;
import byui.cit260.vikingQuest.model.Backpack;
import byui.cit260.vikingQuest.model.Game;
import byui.cit260.vikingQuest.model.Map;
import byui.cit260.vikingQuest.model.Player;
import byui.cit260.vikingQuest.model.Scene;
import byui.cit260.vikingQuest.model.InventoryItem;
import java.util.logging.Level;
import java.util.logging.Logger;
import vikingquest.VikingQuest;


/**
 *
 * @author Amy
 */

    
/**
*
* @param player
*/

public class GameControl {
    
    public static void createNewGame(Player player) throws MapControl.MapControlException {
        
        Game game = new Game(); // Create new game
        VikingQuest.setCurrentGame(game); // Save in Viking Quest
        
        game.setPlayer(player); // save player in game
        
        // Create the inventory list and save in game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setItems(inventoryList);
        
        Backpack backpack = new Backpack(); // Create new backpack
        game.setBackpack(backpack); // Save Backpack in game
        
        Map map = MapControl.createMap(); // create new map
        game.setMap(map);  // Save map in game
        
        // Move characters to starting position on Map
        MapControl.moveActorsToStartingLocation(map);
    }

    
   public static InventoryItem[] createInventoryList(){
    // create array(list) of inventory items
        InventoryItem[] inventory =
                new InventoryItem[createInventoryList.Constants.NUMBER_OF_INVENTORY_ITEMS];
        

        InventoryItem shovel = new InventoryItem();
        shovel.setType("Shovel");
        shovel.setQuantity(0);
        shovel.setRequiredAmount(0);
        inventory[createInventoryList.Item.shovel.ordinal()] = shovel;

        InventoryItem gold = new InventoryItem();
        gold.setType("gold");
        gold.setQuantity(0);
        gold.setRequiredAmount(0);
        inventory[createInventoryList.Item.gold.ordinal()] = gold;
        
        return inventory;
    }
    /*if(InventoryItem[0]<0 || InventoryItem[1]<0){
        try {
            throw new CreateInventoryListExceptions("You cannot have less than 0 of any item!");
        } catch (CreateInventoryListExceptions ex) {
            Logger.getLogger(createInventoryList.class.getName()).log(Level.SEVERE, null, ex);
        }
}*/
    
    public static void moveActorsToStartingLocation(Map map){
        System.out.println("*** called moveActorsToStartingLocation***");
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static InventoryItem[] getSortedInventoryList(){
        
        // Get inventory list for the current game
        InventoryItem[] originalInventoryList = 
                        VikingQuest.getCurrentGame().getItems();
        
        // Clone (make a copy) origionalList
       InventoryItem[] inventoryList = originalInventoryList.clone();
       return inventoryList; 
    }
    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        Game game = null;
        try( FileOutputStream fips = new FileOutputStream(filepath)){
         ObjectInputStream output = new ObjectInnputStream(fips);
         
         game = (Game) output.readObject();
        }
        catch(fileNotFoundException fnfe) {
        throw new GameControlException(fnfe.getMessage())
        }
        }
        catch(IOException e) {
         throw new GameControlException(e.getMessage());   
        
        }
        VikingQuest.setCurrentGame(game); //save in viking quest
    }


    
        // Using a BubbleSort to sort the list of inventoryList by name
       /* Item tempInventoryItem;
        for (int i=0; i<inventoryList.length-1; i++){
            for (int j=0; j<inventoryList.length-1-i; j++){
                if (inventoryList[j].getType().
                          compareToIgnoreCase(inventoryList[j + 1].getType()) > 0){
                    tempItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempItem;
                }
            }
        }*/
          
    