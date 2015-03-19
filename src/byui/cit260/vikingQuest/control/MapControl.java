/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.control;

import byui.cit260.vikingQuest.model.Map;
import byui.cit260.vikingQuest.model.Scene;

/**
 *
 * @author Amy
 */
public class MapControl {

    public static Map createMap() throws MapControlException {
       System.out.println("*** called createMap() function ***");
       return null;
    }
    
    public static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** moveActorsToStartingLocation() called***");
    }
    

    static CreateScenes.ImageIcon getImage(Scene finishScene, String citbyuicit260vikingquestimagesfinishjpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class MapControlException extends Exception {

        public MapControlException() {
        }
    }
}
