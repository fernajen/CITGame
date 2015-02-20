/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit.vikingQuest.view;

/**
 *
 * @author Amy
 */
public class MainMenu {
    public MainMenu(){
        
    }
    
    public void mainMenu(){
        
        //Placeholder text to ensure the function works
        this.displayMenu();
    }

    private void displayMenu() {
         System.out.println("*                        *"
                    + "\n* Main menu will display here.");
        
    }
      private static class MainMenuView {
          private final String MENU = "\n"
                  + "\n---------------------------"
                  + "\n| Main Menu                |"
                  + "\n---------------------------"
                  + "\nG - Start Game"
                  + "\nH - Get Help on how to play"
                  + "\nS - Save Game"
                  + "\nE - Exit"
                  + "\n----------------------------";
          public void displayMenu(){
              char selection=' ';
              do{
                  System.out.println(MENU); //display the main menu
                  
                  String input = this.getInput(); // get user selection
                  selection =input.charAt(0); //
                  
                  this.doAction(selection);
              }
              While (selection !=E);
          }
                  

        void MainMenuView() {
            System.out.println("*** MainMenuView.displayMenu() function called ***");
        }
    }
}
