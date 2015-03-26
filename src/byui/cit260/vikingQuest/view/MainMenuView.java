package byui.cit260.vikingQuest.view;

import byui.cit260.vikingQuest.control.GameControl;
import byui.cit260.vikingQuest.control.MapControl;
import byui.cit260.vikingQuest.model.Game;
import java.util.logging.Level;
import java.util.logging.Logger;
import vikingquest.VikingQuest;

/**
 *
 * @author Amy
 */

public class MainMenuView extends View{
    
    // Main Menu
    public MainMenuView(){
        
        super ("\n"
        + "\n---------------------"
        + "\n|     Main Menu     |"
        + "\n---------------------"
        + "\nN - Start New Game"
        + "\nG - Continue Existing Game"
        + "\nH - Get help on how to play the game"
        + "\nS - Save Game"
        + "\nE - Exit"
        + "\n---------------------");
    }

    @Override
    public void doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase(); // convert all input to uppercase
        char choice = value.charAt(0); // get first character entered
        
        switch(choice) {
            case 'N': // will create a new game
                this.startNewGame();
                break;
            case 'G': // will start an existing game
                this.startExistingGame();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'E': // Exit Program
                this.console.println("Exit called");
                break;
            case 'S': // Save Game
                this.console.println("Save Game called");
                this.saveGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
    }

     private void startNewGame() {
        try {
            // Create New Game
            GameControl.createNewGame(VikingQuest.getPlayer());
        } catch (MapControl.MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        
        //Display the Help menu
        GetHelp getHelp = new GetHelp();
        getHelp.display();
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
