/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.view;
import byui.cit260.vikingQuest.control.GameControl;
import vikingquest.VikingQuest;

/**
 *
 * @author Amy
 */
public class GetHelp {
    private final String MENU = "\n"
            + "\n-------------------------"
            + "\n|        Help Menu      |"
            + "\n-------------------------"
            + "\nG - Learn the goal of the game"
            + "\nM - How to move"
            + "\nH - How to use your items"
            + "\nQ - Quit Help"
            + "\n---------------------------";
    public GetHelp(){
        
    }
    
    public void getHelp(char choice){
        switch(choice){ 
               case 'G': // This will teach you the goal of the game
               System.out.println("\n*** Explaination about the game's goals  ***");
                break;
               case 'M': // Explains how to move
                 System.out.println("\n*** Explaination about how to move in the game ***");
                   break;
               case 'H': // Eplains how to use the items
                   System.out.println("\n*** Explaination about how to use the items in the game ***");
                   break;
               case 'Q': // leaves the help menu
                   return;
                   default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        //Display Placeholder
        this.displayHelp();
    }

    private void displayHelp() {
        
        //Display Help placeholder
        System.out.println("*                       *"
                            + "\n* Help menu will display here.*");
        char selection = ' ';
        do {
            System.out.println(MENU); //Display the main menu
            
        String input = this.getInput(); // Get user selection
        selection = input.charAt(0);
        
        this.getHelp(selection);  //Do action selected
        
        }
        while (selection != 'Q'); // A selection is not Exit
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
