/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.vikingQuest.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amy
 */
public class interactWithCharacterTest {
    
    public interactWithCharacterTest() {
        
        //Placeholder Function
        System.out.println("\n*** interactWithCharacterTest called ***");
        
        //Input values for test 1
        int x=2;
        int y=3;
        
        // Expected output
        double expectedResult;
        expectedResult = x+y;
        
        //Call function to run test
        int result = x+y;
        
        //Compare expected return to actual return
        assertEquals(expectedResult, result, 5);
        
    }

    /**
     * Test of main method, of class interactWithCharacter.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        interactWithCharacter.main();
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test case is a prototype.");
    }
    
}
