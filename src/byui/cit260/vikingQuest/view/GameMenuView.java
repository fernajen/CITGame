/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.view;

/**
 *
 * @author Amy
 */

public class GameMenuView extends View{
        
    //Game Menu
    public GameMenuView(){
        
        super ("\n"
        + "\n---------------------"
        + "\n|     Game Menu     |"
        + "\n---------------------"
        + "\nV - View Map"
        + "\nB - Backpack"
        + "\nT - Talk to someone"
        + "\nG - Give Item"
        + "\nI - Item Recieved"
        + "\nH - Help"
        + "\nQ - Quit Game Menu"
        + "\n---------------------");
    }
    
    @Override
    public void doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase(); // convert all input to uppercase
        char choice = value.charAt(0); // get first character
        
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
            case 'Q': // Exit to Main Menu
                this.returnToMain();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
     
    public void viewMap() {        
        //Display the game menu
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
        
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
        GameHelpMenu gameHelpMenu = new GameHelpMenu();
        gameHelpMenu.display();
        
    } 
    
    private void returnToMain() { 
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    } 

}