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
        + "\n---------------------";
    public void displayMenu(){
        char selection =' ';
        do{
            System.out.println(MENU); //Display main menu
            
            String input = this.getInput(); //get the user's input
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        }
        while (selection != 'E'); // Not exit
    }
    

  
    public abstract class View implements ViewInterface{
       
        
        private String promptMessage;

        public String getPromptMessage() {
            return promptMessage;
        }

        public void setPromptMessage(String promptMessage) {
            this.promptMessage = promptMessage;
        }
        @Override
        public void display(){
            String value;
            do{
                System.out.println(this.promptMessage); // display prompt
                value = this.getInput(); //get the user's input
                this.doAction(value); //do action based on selection
            }
            while(!value.equals("E"));
            }
        @Override
        public String getInput(){
            Scanner keyboard = new Scanner(System.in);
            boolean valid = false;
            String selection = null;
            //while a valid name hasn't been inputed
            while(!valid){
                //prompt for player's name
                System.out.println("\t\Enter your selection below");
                //get the value entered via keyboard
                selection = keyboard.nextLine();
                selection = selection.trim();
                
                if (selection.length()<1){//blank value entered
                    System.out.println("\n*** Invalid selection ***try again")
                            continue;
                }
                break;
            }
            return selection;
        }
        }
    public void displayMenu() {

        
        char selection = ' ';
        do {
            System.out.println(MENU); //Display the main menu
            
            String input = this.getInput(); // Get user selection
            selection = input.charAt(0);
        
            this.doAction(selection);  //Do action selected
        
        } while (selection != 'E'); // A selection is not Exit
        
    }
    
   /* private String getInput() {
        Scanner keyboard = new Scanner(System.in);// keyboard input stream
        boolean valid = false;// indicates whether name has been retrived.
        String selection = null;
        
        String value = (String)obj;
        
        while(!valid){
            
            //get the name from the keyboard trim off blank spaces
            selection = keyboard.nextLine();
            selection = selection.trim();
                
            //if the input is invalid send out error message
            if(selection.length()< 1){ // blank value entered
                System.out.println("Invalid entry - Please Select a letter.");
                continue; // and repeat again   
            }
            break; // out of the (exit) the repitition.
            
        }
      
        return selection;
    }*/
    
    public void doAction(char choice) {
        switch (choice) {
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
