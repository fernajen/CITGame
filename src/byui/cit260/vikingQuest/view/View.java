/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.view;

import java.util.Scanner;

/**
 *
 * @author Amy
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    public View(String promptMessage){
        
    }
    
    @Override
    public void display() {
        String value;
        
        char selection = ' ';
        do {
            System.out.println(this.promptMessage); //Display the main menu
            
            value = this.getInput(); // Get user selection
        
            this.doAction(value);  //Do action selected
        
        } while (selection != 'E'); // A selection is not Exit
        
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);// keyboard input stream
        boolean valid = false;
        String selection = null;
        
        
        
        while(!valid){
                
            //prompt user for input
            System.out.println("\t\nEnter the letter of your selection: \n");
            
            //get the name from the keyboard trim off blank spaces
            selection = keyboard.nextLine();
            selection = selection.trim();
                
            //if the input is invalid send out error message
            if(selection.length()>=2){
                System.out.println("Invalid entry - Please Select a letter.");
                continue; // and repeat again
                   
            }
            break; // out of the (exit) the repitition.
            
        }
      
        return selection;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    public String getPromptMessage(){
        return promptMessage;
    }
    
}

