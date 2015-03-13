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
public class GetHelp extends View{
    
    public GetHelp(){
        super ("\n"
            + "\n-------------------------"
            + "\n|        Help Menu      |"
            + "\n-------------------------"
            + "\nG - Learn the goal of the game"
            + "\nM - How to move"
            + "\nH - How to use your items"
            + "\nQ - Quit Help"
            + "\n---------------------------";
    public GetHelp(){
        char selection = ' ';
        do {
            System.out.println(MENU); //display help menu
            
            String input = this.getInput(); // get input
            
            selection = input.charAt(0); //first line of character
            this.doAction(selection); // action decided based on selection

        }
        while(selection != 'Q'); 
    }
  
    @Override
    public void doAction(Object obj){
        
        String value = (String)obj;
        
        value = value.toUpperCase(); // convert all input to uppercase
        char choice = value.charAt(0); // get first character
        
        switch(choice){ 
            case 'G': // This will teach you the goal of the game
               System.out.println("\n*********************************");
               System.out.println("\t Solve puzzles and collect items to");
               System.out.println("\t travel to a lost Island and discover");
               System.out.println("\t a Viking treasure.");
               break;
            case 'M': // Explains how to move
                System.out.println("\n*** Explaination about how to move in the game ***");
                break;
            case 'H': // Eplains how to use the items
                System.out.println("\n*** Explaination about how to use the items in the game ***");
                break;
            case 'Q': // leaves the help menu and returns to Main
                
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;        
        }
    }
}
