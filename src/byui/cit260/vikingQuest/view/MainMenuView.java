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

public class MainMenuView extends View{
    
    // Main Menu
    public MainMenuView(){
        
        super ("\n"
        + "\n---------------------"
        + "\n|     Main Menu     |"
        + "\n---------------------"
        + "\nN - Start New Game"
        + "\nG - Continue Existing Game"
        + "\nH - Get help on how to play the game"
        + "\nS - Save Game"
        + "\nE - Exit"
        + "\n---------------------");
    }

    @Override
    public void doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase(); // convert all input to uppercase
        char choice = value.charAt(0); // get first character entered
        
        switch(choice) {
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
                System.out.println("Exit called");
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }

    private void startNewGame() {
        
        //Display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        
        //Display the Help menu
        GetHelp getHelp = new GetHelp();
        getHelp.display();
    }
}
