/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.view;
import vikingquest.VikingQuest;

/**
 *
 * @author Amy
 */
public class MapMenuView extends View{
    
    // Map Menu
    public MapMenuView(){
        
        super("\n"
        + "\n---------------------"
        + "\n|     MAP Menu     |"
        + "\n---------------------"
        + "\nT - Temple"
        + "\nR - Ruins"
        + "\nJ - Jungle"
        + "\nM - Mountain"
        + "\nP - Mountain Pass"
        + "\nS - Shipwreak"
        + "\nQ - Quit Map"
        + "\n---------------------");
    }

    @Override
    public void doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase(); // convert all input to uppercase
        char choice = value.charAt(0); // get first character entered
        
        switch (choice) {
            case 'T': // Temple Ruins
                this.goToTemple();
                return;
            case 'R': // Ruins
                this.goToRuins();
                return;
            case 'V': // Mountain Pass
                this.goToVikingMound();
                break;
            case 'M': // Mountains
                this.goToMountains();
                break;
            case 'S': // Start
                this.goToStart();
                return;
            case 'B': // Beach Town
                this.goToBeachTown();
                return;
            case 'H': // Beach Town
                this.goToHut();
                return;
            case 'J': // Jungle
                this.goToJungle();
                break;
            case 'Q': // Game Menu
                this.displayGameMenu();
                return;
            default:
               ErrorView.display(this.getClass().getName(),
                       "\n*** Invalid Selection *** Try Again");
                break;
        }
    }
    
    private void goToTemple() {
        
        //Placeholder Comment
        this.console.println("*** goToTemple() function is called ***");
        
    }
    
    private void goToRuins() {
        
        //Placeholder Comment
        this.console.println("*** goToRuins() function is called ***");
        
    }
    
    private void goToVikingMound() {
        
        //Placeholder Comment
        this.console.println("*** goToVikingMound function is called ***");
        
    }
    
    private void goToMountains() {
        
        //Placeholder Comment
        this.console.println("*** goToMountain() function is called ***");
        
    }
    
    private void goToStart() {
        
        //Placeholder Comment
        this.console.println("*** goToStart() function is called ***");
        
    }
    
    private void goToBeachTown(){
        
        this.console.println("***goTOBeachTown() function called***");
    }
    
    private void goToHut(){
        
        this.console.println("***goToHut() function called***");
    }
    
    private void goToJungle() {
        
        //Placeholder Comment
        this.console.println("*** goToJungle() function is called ***");
        
    }

    private void displayGameMenu() { // Quit
       // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
   }

}
    
