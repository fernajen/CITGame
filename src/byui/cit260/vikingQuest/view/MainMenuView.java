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


public class MainMenuView {
     
    private final String MENU = "\n"
    + "\n---------------------"
    + "\n| Main Menu         |"
    + "\n---------------------"
    + "\nG - Start Game"
    + "\nH - Get help on how to play the game"
    + "\nS - Save Game"
    + "\nE - Exit"
    + "\n---------------------";
    
    void displayMenu(){
        
        //Placeholder call function alert
        System.out.println("*** MainMenuView.displayMenu() function called ***");
        
    }

    private String getInput(char choice) {
        Scanner choice = new Scanner(System.in);
        
        //Ask for user input and store it
        String user_input;
        System.out.print("Please select an option: ");
        user_input = choice.next();
        
        //Return user input
        return user_input; 
        
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
        GameControl.createNewGame(VikingQuest.getPlayer());
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("*** StartExistingGame function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }    
}
    
