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
public class GameHelpMenu extends View{
        
    //Game Menu
    public GameHelpMenu(){
        super("\n"
            + "\n---------------------"
            + "\n|     Help Menu     |"
            + "\n---------------------"
            + "\nR - Read Letter"
            + "\nH - Hint"
            + "\nQ - Quit Game Help"
            + "\n---------------------");
    }
    
    @Override
    public void doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase(); // convert all input to uppercase
        char choice = value.charAt(0); // get first character
        
        switch (choice) {
            case 'R': // Read letter
                this.readLetter();
                break;
            case 'H': // Hint
                this.hint();
                break;
            case 'Q': // Exit to Main Menu
                this.returnToGameMenu();
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
    
    private void readLetter() {
        
        //Placeholder mark begining of function call
        System.out.println("*** readLetter() function called ***");
        
    }
    
    private void hint() {
        
        System.out.println("*** hint() function called ***");
    }
   
    private void returnToGameMenu() {
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    } 
}

