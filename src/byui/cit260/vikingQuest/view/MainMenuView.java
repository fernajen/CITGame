/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.view;

// Import Directories
import byui.cit260.vikingQuest.control.GameControl;
import java.util.Scanner;
import vikingquest.VikingQuest;

/**
 *
 * @author Amy
 */


public class MainMenuView extends View{
    
    public MainMenuView(){
        super("\n"
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
    
    public void doAction(char choice) {
        switch (choice) {
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
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
    
    
    private void startNewGame() {
        
        //Placeholder Comment
        System.out.println("*** startNewGame function called ***");
        
        //Create New Game
        int value = GameControl.createNewGame(VikingQuest.getPlayer());
        if (value < 0) {
            System.out.println("Error - Failed to create new game");
        }
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void startExistingGame() {
        
        //Placeholder mark begining of function call
        System.out.println("*** StartExistingGame function called ***");
        
        //Create New Game
        GameControl.createNewGame(VikingQuest.getPlayer());
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }
    
    private void saveGame() {
        // Save Game

        System.out.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenu() {
        
        System.out.println("\n ======================================================");
        System.out.println("\t             Main Help Menu                  ");
        System.out.println("\n                                    ");
        System.out.println("\n To begin your adventure, follow these simple steps:");
        System.out.println("\n ======================================================");
        System.out.println("\n First, select 'N' from the main menu above");
        System.out.println("\n tis will start a new game.");
        System.out.println("\n                                    ");
        System.out.println("\n If you want to continue with an existing game, ");
        System.out.println("\n select 'G' from the Main Menu.");
        System.out.println("\n                                            ");
        System.out.println("\n If you need help throught your game, you can always ");
        System.out.println("\n select the Game menu 'Help', which can provide you ");
        System.out.println("\n with more specific instructions.");
        System.out.println("\n ======================================================");
    } 

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
