/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package byui.cit.vikingQuest.view;

// import byui.cit260.vikingQuest.control.ProgramControl;
import byui.cit260.vikingQuest.model.Player;
import java.util.Scanner;


/**
 *
 * @author Jenny, Ivy, Amy
 */

public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram(){
            //Display Banner
            this.displayBanner();
            //Prompt player for name and save it
            String playersName = this.getPlayersName();
            
            // Create and save player object
            Player player = ProgramControl.createPlayer(playersName);
    }
    private void displayBanner(){
        
        System.out.println("*                             *"
                        + "\n* Welcome To Viking Quest!!! *"
                        + "\n* In this game you will hunt *"
                        + "\n* for a Viking mound with treasure!*");
    }
    public String getPlayersName(){
            boolean valid = false;// indicates whether name has been retrived.
            String playersName = null;
            Scanner keyboard = new Scanner(System.in);// keyboard input stream
            
            while(!valid){// while invalid name has not been retrived.
                
                //prompt for player's name
                System.out.println("Enter the player's name below:");
                
                //get the name from the keyboard trim off blank spaces
                playersName = keyboard.nextLine();
                playersName = playersName.trim();
                
                System.out.println("Welcome " + playersName + "!\n");
                
                //if the name is invalid (less than 2 char in length)
                if(playersName.length()<2){
                    System.out.println("Invalid name - The name must not be blank.");
                    continue; // and repeat again
                   
                }
                break; // out of the (exit) the repitition.     
            }
            return playersName; //return the name                
            }
    }   

 I commented these out because I didn't know how to use them,
 but I didn't want you to loose your work.
 
 
      Player player = ProgramControl.createPlayer(playersName);
      this.displayWelcomeMessage(player);

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=================================================");
        System.out.println("\tWelcome To Viking Quest" + player.getName());
        System.out.println("\tEnjoy! And good luck!");
        System.out.println("======================================================");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
