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
            + "\nG - Game Menu"
            + "\n---------------------");
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

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

