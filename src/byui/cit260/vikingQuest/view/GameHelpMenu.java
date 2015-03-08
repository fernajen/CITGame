/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.view;

import byui.cit260.vikingQuest.control.GameControl;
import java.util.Scanner;
import vikingquest.VikingQuest;

/**
 *
 * @author Amy
 */
public class GameHelpMenu {
        
    //Game Menu
    private final String MENU = "\n"
        + "\n---------------------"
        + "\n|     Help Menu     |"
        + "\n---------------------"
        + "\nR - Read Letter"
        + "\nH - Hint"
        + "\nG - Game Menu"
        + "\n---------------------";
    
    public void display() {

        
        char selection = ' ';
        do {
            System.out.println(MENU); //Display the main menu
            
            String input = this.getInput(); // Get user selection
            
            selection = input.charAt(0);
        
            this.doAction(selection);  //Do action selected
        
        } while (selection != 'E'); // A selection is not Exit
        
    }

    private String getInput() {
        boolean valid = false;// indicates whether name has been retrived.
        String selection = null;
        Scanner keyboard = new Scanner(System.in);// keyboard input stream
        
        //Ask for and recieve user name input Placeholder
        System.out.println("\n*** The user input is requested and stored. ***");
        
        while(!valid){
                
            //prompt user for input
            System.out.println("Enter the letter of your selection: \n");
            
            //get the name from the keyboard trim off blank spaces
            selection = keyboard.nextLine();
            selection = selection.trim();
                
            //if the input is invalid send out error message
            if(selection.length()>=2){
                System.out.println("Invalid entry - Please Select a letter.");
                continue; // and repeat again
                   
            }
            break; // out of the (exit) the repitition.
            
        }
      
        return selection;
    }
    
    public void doAction(char choice) {
        switch (choice) {
            case 'R': // Read letter
                this.readLetter();
                break;
            case 'H': // Hint
                this.hint();
                break;
            case 'G': // Exit to Main Menu
                this.returnToGameMenu();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
    
    
    public void viewMap() {
        
        //Placeholder Comment
        System.out.println("*** viewMap() function is called ***");
            
        // This link isnt working
        
        //Display the game menu
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.map();
        
    }
    
    private void readLetter() {
        
        //Placeholder mark begining of function call
        System.out.println("*** readLetter() function called ***");
        
    }
    
    private void hint() {
        
        System.out.println("*** hint() function called ***");
    }
   
    private void returnToGameMenu() {
        
        System.out.println("*** returnToGameMenu() function called ***");
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    } 
}

