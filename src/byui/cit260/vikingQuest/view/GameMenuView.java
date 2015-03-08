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
public class GameMenuView extends View{
        
    //Game Menu
    public GameMenuView(){
        super("\n"
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
            + "\n---------------------");
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
        
        GameHelpMenu gameHelpMenu = new GameHelpMenu();
        gameHelpMenu.display();
    } 
    
    private void returnToMain() {
        
        System.out.println("*** returnToMainMenu() function called ***");
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    } 

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
