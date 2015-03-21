/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.control;

import byui.cit260.vikingQuest.model.Map;
import byui.cit260.vikingQuest.model.Scene;
import java.awt.Point;
import vikingquest.VikingQuest;

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

    
    public static int moveActorToLocation(Character character, Point coordinates) throws MapControlException{
        
        Map map = VikingQuest.getCurrentGame().getMap();
         int newRow = coordinates.x-1;
         int newColumn = coordinates.y-1;
        
        if(newRow < 0 || newRow >= map.getNoOfRows() ||
                newColumn < 0 || newColumn >= map.getNoOfColumns) {
            throw new MapControlException("Cannot move actor to location."
                    + coordinates.x + "," + coordinates.y
                    + "Because that location is outside"
                    + "the bounds of the map.");
     
        }

        public static CreateScenes.ImageIcon getImage(Scene finishScene, String citbyuicit260vikingquestimagesfinishjpg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    public static class MapControlException extends Exception {

        public MapControlException() {
        }

        private MapControlException(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
     


}
