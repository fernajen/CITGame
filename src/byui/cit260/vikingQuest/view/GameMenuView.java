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
public class GameMenuView {
        
    //Game Menu
    private final String GAMEMENU = "\n"
        + "\n---------------------"
        + "\n|     Game Menu     |"
        + "\n---------------------"
        + "\nV - View Map"
        + "\nB - Backpack"
        + "\nT - Talk to someone"
        + "\nG - Give Item"
        + "\nI - Item Recieved"
        + "\nH - Help"
        + "\nM - Main Menu"
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
            case 'V': // View Map
                this.viewMap();
                break;
            case 'B': // Backpack
                this.viewBackpack();
                break;
            case 'T': // Talk to someone
                this.talk();
                break;
            case 'G': // Give Item
                this.giveItem();
                return;
            case 'I': // Item (Received)
                this.itemRecieved();
                return;
            case 'H': // Item (Received)
                this.displayHelpMenu();
                return;
            case 'M': // Exit to Main Menu
                this.returnToMain();
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
        /***Display the game menu -- Template
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();***/
        
    }
    
    private void viewBackpack() {
        
        //Placeholder mark begining of function call
        System.out.println("*** viewBackpack() function called ***");
        
    }
    
    private void talk() {
        
        System.out.println("*** talk() function called ***");
    }
    
    private void giveItem() {
        
        System.out.println("*** giveItem()displayHelpMenu function called ***");
    } 
    
    private void itemRecieved() {
        
        System.out.println("*** itemRecieved()displayHelpMenu function called ***");
    } 
    
    private void displayHelpMenu(){
        
        System.out.println("*** displayHelpMenu() function called ***");
    } 
    
    private void returnToMain() {
        
        System.out.println("*** returnToMainMenu() function called ***");
    } 
}
