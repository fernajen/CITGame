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
public class MapMenuView extends View{
    
    // Map Menu
    public MapMenuView(){
        super("\n"
        + "\n---------------------"
        + "\n|     MAP Menu     |"
        + "\n---------------------"
        + "\nJ - Jungle"
        + "\nM - Mountain"
        + "\nP - Mountain Pass"
        + "\nT - Temple Ruins"
        + "\nS - Shipwreak"
        + "\nG - Game Menu"
        + "\n---------------------");
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
        gameMenu.display();
        
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
