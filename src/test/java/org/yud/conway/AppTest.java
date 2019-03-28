package org.yud.conway;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	ConwayGame game = new ConwayGame();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testCellShouldBeAliveForNextState() {
    	assertTrue(game.checkForDeathOrAliveConditionOfCell(3, 0));
    }
    
    public void testDeadCellShouldBeDeadForNextState() {
    	assertFalse(game.checkForDeathOrAliveConditionOfCell(4, 0));
    }
    
    public void testCellShouldLiveOnNextState() {
    	assertTrue(game.checkForDeathOrAliveConditionOfCell(3, 1));
    	assertTrue(game.checkForDeathOrAliveConditionOfCell(2, 1));
    }
    
    public void testLiveCellShouldDieOnNextStateIfCountGrt4() {
    	assertFalse(game.checkForDeathOrAliveConditionOfCell(4, 1));
    }
    public void testLiveCellShouldDieOnNextStateIfCountLess2() {
    	
    	assertFalse(game.checkForDeathOrAliveConditionOfCell(1, 1));
    }
    
    public void testForCorrectGetLiveNeighboursCount() {
    	assertEquals(2, game.getLiveNeighboursCount(0, 0));
    }
    public void testForIncorrectGetLiveNeighboursCount() {
    	assertEquals(2, game.getLiveNeighboursCount(0, 0));
    }
}
