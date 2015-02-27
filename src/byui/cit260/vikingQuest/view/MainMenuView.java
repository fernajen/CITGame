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
     
    //MENU - called in public void displayMenu()
    private final String MENU = "\n"
        + "\n---------------------"
        + "\n|     Main Menu     |"
        + "\n---------------------"
        + "\nN - Start New Game"
        + "\nG - Continue Existing Game"
        + "\nH - Get help on how to play the game"
        + "\nS - Save Game"
        + "\nE - Exit"
        + "\n---------------------";
    
    public void displayMenu() {

        
        char selection = ' ';
        do {
            System.out.println(MENU); //Display the main menu
            
            String input = this.getInput(); // Get user selection
            selection = input.charAt(0);
        
            this.doAction(selection);  //Do action selected
        
        } while (selection != 'E'); // A selection is not Exit
        
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);// keyboard input stream
        boolean valid = false;// indicates whether name has been retrived.
        String selection = null;
        
        //prompt user for input
        System.out.println("Enter the letter of your selection: \n");
        
        while(!valid){
            
            //get the name from the keyboard trim off blank spaces
            selection = keyboard.nextLine();
            selection = selection.trim();
                
            //if the input is invalid send out error message
            if(selection.length()< 1){ // blank value entered
                System.out.println("Invalid entry - Please Select a letter.");
                continue; // and repeat again   
            }
            break; // out of the (exit) the repitition.
            
        }
      
        return selection;
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
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        
        //Placeholder mark begining of function call
        System.out.println("*** StartExistingGame function called ***");
        
        //Create New Game
        GameControl.createNewGame(VikingQuest.getPlayer());
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }
    
    private void saveGame() {
        // Save Game

        System.out.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    } 
}

    
