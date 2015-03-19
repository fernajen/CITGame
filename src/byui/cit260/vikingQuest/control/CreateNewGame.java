/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.control;

import byui.cit260.vikingQuest.model.InventoryItem;
import byui.cit260.vikingQuest.model.Map;
import byui.cit260.vikingQuest.model.Player;
import java.io.Serializable;

/**
 *
 * @author Amy
 */
public class CreateNewGame implements Serializable {
    private double totalTime;
    
    private Player player;
    InventoryItem[] inventory;
    private Shovel shovel;
    private Gold gold;
    private Map map;

    private static class Gold {

        public Gold() {
        }
    }
}
