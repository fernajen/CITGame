/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.control;

/**
 *
 * @author Amy
 */
public class addItem {
    public static void main(String args[]){
        
        //Declare Variables
        int totalItems, itemLimit, itemsToAdd;
        
        //Placeholder Ammounts
        totalItems = 15;
        itemLimit = 25;
        itemsToAdd = 3;
        
        //Calculate if sufficiant room for new items
        if((totalItems + itemsToAdd) <= itemLimit){
            totalItems = (totalItems + itemsToAdd);
            System.out.println(totalItems);
            System.out.println("Added successfully!");
        }
        else {
            System.out.println("You do not have enough room in your backpack.");
        }
    }
}
