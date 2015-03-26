
 package byui.cit260.vikingQuest.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import vikingquest.VikingQuest;

/**
 *
 * @author Amy
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
     
    protected final BufferedReader keyboard = VikingQuest.getInFile();
    protected final PrintWriter console = VikingQuest.getOutFile();
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;

        do {
            System.out.println(this.promptMessage); //Display the main menu  
            value = this.getInput(); // Get user selection
            this.doAction(value);  //Do action selected
        
        } while (!value.equals("E")); // A selection is not Exit
        
    }
    
    @Override
    public String getInput() {
        
        
        boolean valid = false;
        String selection = null;
        
        // While a valid name has not been retrieved
       
                
            //prompt user for input
            System.out.println("\t\nEnter your selection: \n");
            while(!valid){
             try {
                 
                     
                //get the name from the keyboard trim off blank spaces
                selection = this.keyboard.readLine();
                selection = selection.trim();
                
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }  if(selection.length() < 1){  // blank value entered
                ErrorView.display(this.getClass().getName(),
                        "Invalid entry - Try again.");
                continue; // and repeat again       
            }
              
            
                
            //if the input is invalid send out error message
            break; // out of the (exit) the repitition.  
        }
      
        return selection; // Return the input
    }
    
    public String getPromptMessage(){
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
}

