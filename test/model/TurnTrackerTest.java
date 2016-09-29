package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTrackerTest {

    private TurnTracker turnTracker;

    @Before
    public void setUp() {
        turnTracker = new TurnTracker();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testPassTurn() {
        try {
            //assertEquals(0, turnTracker.getCurrentTurn());
            //turnTracker.passTurn();
            //assertEquals(1, turnTracker.getCurrentTurn());
            //turnTracker.passTurn();
            //assertEquals(2, turnTracker.getCurrentTurn());
            //turnTracker.passTurn();
            //assertEquals(3, turnTracker.getCurrentTurn());
            //turnTracker.passTurn();
            //assertEquals(0, turnTracker.getCurrentTurn());
        } catch (Exception e) {
            assertEquals(false, true);
        }
    }

}