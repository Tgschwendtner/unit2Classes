

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class Vending_MachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_MachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Vending_MachineTest
     */
    public Vending_MachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testfillUp()
    { 
        Vending_Machine machine = new Vending_Machine( 50);
        machine.fillUp(50);
        assertEquals( 100 , machine.getCanCount() );
    }
    @Test
    public void testinsetToken()
    {
         Vending_Machine machine = new Vending_Machine( 50 );
         machine.insertToken(2);
         assertEquals( 2 , machine.getTokenCount() );
         assertEquals( 48 , machine.getCanCount() );
    }
}
