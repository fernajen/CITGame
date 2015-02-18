/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit.vikingQuest.view;

import byui.cit260.vikingQuest.control.ProgramControl;
import byui.cit260.vikingQuest.model.Player;
import java.util.Scanner;


/**
 *
 * @author Jenny
 */
public class StartProgramView {
    public StartProgramView() {
        
    }
    public void startProgram(){
        // Display banner screen
        this.displayBanner();
 
        // Prompt player to enter name and retrive the player name
         String playersName = this.getPlayersName();
         
         Player player = ProgramControl.createPlayer(playersName);
         this.displayWelcomeMessage(player);
         
        public String getPlayersName(){
            boolean valid = false;// indicates whether name has been retrived.

            Scanner keyboard = new Scanner(System.in);// keyboard input stream
            
            while(!valid){// while invalid name has not been retrived.
                
                //prompt for player's name
                System.out.println("Enter the player's name below:");
                
                //get the name from the keyboard trim off blank spaces
                playersName = keyboard.nextLine();
                playersName = playersName.trim();
                
                //if the name is invalid (less than 2 char in length)
                if(playersName.length()<2){
                    System.out.println("invalid name - The name must not be blank.");
                    continue; // and repeat again
                   
                }
                   break; // out of the (exit) the repitition. 
                   
                }
                return playersName; //return the name
                
            }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=================================================");
        System.out.println("\tWelcome To Viking Quest" + player.getName());
        System.out.println("\tEnjoy! And good luck!");
        System.out.println("======================================================");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          
  
    
}
        // create and save player object
        // display a personalized welcome message
        // display main menu

   
    }

    public void displayBanner() {
        System.out.println("\n\n***************************************************");
        
        System.out.println("*Welcome, in this game you will hunt for a Viking mound with treasure!*");
        
        System.out.println("\n\n****************************************************");

        
    }
        
        
