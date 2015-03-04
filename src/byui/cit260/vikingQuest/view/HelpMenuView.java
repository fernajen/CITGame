/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.view;

import java.util.Scanner;

/**
 *
 * @author Amy
 */
public class HelpMenuView {
    //Help Menu
    private final String GAMEMENU = "\n"
        + "\n---------------------"
        + "\n|     Help Menu     |"
        + "\n---------------------"
        + "\nL - Read Letter"
        + "\nC - Clue"
        + "\nG - Game Menu"
        + "\n---------------------";
    public void displayMenu() {

        
        char selection = ' ';
        do {
            System.out.println(GAMEMENU); //Display the main menu
            
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
            case 'L': // Read Letter
                this.readLetter();
                break;
            case 'C': // Clue
                this.seeClue();
                break;
            case 'G': // Exit to Main Menu
                this.returnToGameMenu();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
    
        private void readLetter() {
        
        System.out.println("*** seeLetter() function called ***");
    }
        
        private void seeClue() {
        
        System.out.println("*** seeClue() function called ***");
    }
    
    private void returnToGameMenu() {
        
        System.out.println("*** returnToGameMenu() function called ***");
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();

    } 
}
