/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest;

import byui.cit260.vikingQuest.model.Game;

/**
 *
 * @author Amy
 */
public class VikingQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game gameOne = new Game();
        
        gameOne.setName("Fred Flinstone");
        gameOne.setBestTime(7.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
    }
    
}
