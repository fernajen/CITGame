/*
 *This is the main function of VikingQuest
 */
package vikingquest;

//Import class statements
import byui.cit260.vikingQuest.model.Backpack;
import byui.cit260.vikingQuest.model.Characters;
import byui.cit260.vikingQuest.model.Game;
import byui.cit260.vikingQuest.model.Items;
import byui.cit260.vikingQuest.model.Location;
import byui.cit260.vikingQuest.model.Map;
import byui.cit260.vikingQuest.model.Player;
import byui.cit260.vikingQuest.model.Scene;
import byui.cit260.vikingQuest.model.Skills;

/**
 * @author Amy, Jennifer and Ivy
 */
public class VikingQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Game class functions
        Game gameOne = new Game();
        
        gameOne.setName("Fred Flinstone");
        gameOne.setBestTime(7.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Player functions
        Player playerOne = new Player();
        
        //Map calss functions
        Map mapOne = new Map();
        
        //Backpack Class Functions
        Backpack backpackOne = new Backpack();
        
        //Skills Class Functions
        Skills skillsOne = new Skills();
        
        //Characters Functions
        Characters charactersOne = new Characters();
        
        //Items Functions
        Items itemsOne = new Items();
        
        //Location Functions
        Location locationOne = new Location();
        
        //Scene Functions
        Scene sceneOne = new Scene();
        
    }
    
}
