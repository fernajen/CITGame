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
public class MapMenuView {
    
    // Map Menu
    private final String MAPMENU = "\n"
        + "\n---------------------"
        + "\n|     MAP Menu     |"
        + "\n---------------------"
        + "\nJ - Jungle"
        + "\nM - Mountain"
        + "\nP - Mountain Pass"
        + "\nT - Temple Ruins"
        + "\nS - Shipwreak"
        + "\nG - Game Menu"
        + "\n---------------------";
    
    //Default Constructor
    public void map() {
        
        char selection = ' ';
        do {
            
        System.out.println(MAPMENU); //Display the main menu
        
        String input = this.getInput(); // Get user selection
            
        selection = input.charAt(0);
        
        this.doAction(selection);  //Do action selected
        
        }while (selection != 'E'); // A selection is not Exit
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
            case 'J': // Jungle
                this.goToJungle();
                break;
            case 'M': // Mountain
                this.goToMountain();
                break;
            case 'P': // Mountain Pass
                this.goToMountainPass();
                break;
            case 'T': // Temple Ruins
                this.goToTempleRuins();
                return;
            case 'S': // Shipwreak
                this.goToShipwreak();
                return;
            case 'G': // Game Menu
                this.displayGameMenu();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
    
    private void goToJungle() {
        
        //Placeholder Comment
        System.out.println("*** goToJungle() function is called ***");
        
    }
    
    private void goToMountain() {
        
        //Placeholder Comment
        System.out.println("*** goToMountain() function is called ***");
        
    }
    
    private void goToMountainPass() {
        
        //Placeholder Comment
        System.out.println("*** goToMountainPass function is called ***");
        
    }
    private void goToTempleRuins() {
        
        //Placeholder Comment
        System.out.println("*** goToTempleRuins() function is called ***");
        
    }
    private void goToShipwreak() {
        
        //Placeholder Comment
        System.out.println("*** goToShipwreak() function is called ***");
        
    }
    private void displayGameMenu() {
        
        //Placeholder Comment
        System.out.println("*** displayGameMenu() function is called ***");
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

}
    