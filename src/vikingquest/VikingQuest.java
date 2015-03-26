/*
 *This is the main function of VikingQuest
 */
package vikingquest;

//!!!!! Working on Main Menu View. I need it to
//!!!!! call the other classes using team assignment 
//!!!!! eight instructions. 

//Import class statements

import byui.cit260.vikingQuest.view.StartProgramView;
import byui.cit260.vikingQuest.model.Backpack;
import byui.cit260.vikingQuest.model.Characters;
import byui.cit260.vikingQuest.model.Game;
import byui.cit260.vikingQuest.model.InventoryItem;
import byui.cit260.vikingQuest.model.Location;
import byui.cit260.vikingQuest.model.Map;
import byui.cit260.vikingQuest.model.Player;
import byui.cit260.vikingQuest.model.Scene;
import byui.cit260.vikingQuest.model.Skills;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import sun.util.logging.PlatformLogger;


/**
 * @author Amy, Jennifer and Ivy
 */
public class VikingQuest {

    /**
     * @param args the command line arguments
     */
    
    //Class instance Variables
    private static Game currentGame = null;
    private static Player player = null;
     
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        VikingQuest.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        VikingQuest.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        VikingQuest.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        VikingQuest.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        VikingQuest.logFile = logFile;
    }
     
    private static PrintWriter logFile = null;
    
    public static void main(String[] args){
        StartProgramView startProgramView = new StartProgramView();
    startProgramView.startProgram();
        try {
            //open character stream files for end user input and output
            VikingQuest.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            VikingQuest.outFile = new PrintWriter(System.out, true);
                  
            //open logfile
            String filePath = "logFile.txt";
            VikingQuest.logFile = new PrintWriter(filePath);
           // VikingQuest.logFile = new PrintWriter(filePath);
    } catch (Exception e){
        System.out.println("Exception: " + e.toString() +
               "\nCause: " + e.getCause() +
                "\nMessage: " + e.getMessage());
        
    } finally {
            try{
            if (VikingQuest.inFile != null)
            VikingQuest.inFile.close();
            
            if (VikingQuest.outFile != null)
            VikingQuest.outFile.close();
            
            if (VikingQuest.logFile != null)
            VikingQuest.logFile.close();
            } catch (IOException ex) {
               System.out.println("Error in closing files");
                return;
                
            }
        }
    }
           
}

       
/************************
 * I edited these out for now
 * Page 6 of the Lesson 6 Team Assignment doc 
 * says to "Delete any existing code currently in this function
 * before adding this weeks code here.
 * 
 *        //Game class functions
 8        
 *      //Player functions
 *      Player playerOne = new Player();
 *       
 *       //Map class functions
 *       Map mapOne = new Map();
 *       
 *       //Backpack Class Functions
 *       Backpack backpackOne = new Backpack();
 *       
 *       //Skills Class Functions
 *       Skills skillsOne = new Skills();
 *       
 *       //Characters Functions
 *       Characters charactersOne = new Characters();
 *       
 *       //Items Functions
 *       Items itemsOne = new Items();
 *       
 *       //Location Functions
 *       Location locationOne = new Location();
 *       
 *       //Scene Functions
 *       Scene sceneOne = new Scene();
 *       
 *   }
 *   
 ******************/
