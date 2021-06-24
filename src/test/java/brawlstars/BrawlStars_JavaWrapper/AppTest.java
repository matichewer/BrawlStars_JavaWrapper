package brawlstars.BrawlStars_JavaWrapper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import GeneratedObjects.Player;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
//        assertTrue( true );
    	
    	System.out.println("Inicio de JUnit Test\n");
        Player p1 = new Player("U2VYCYV");
        assertTrue(p1.getStatus());
    	System.out.println("Fin de JUnit Test");
    }
}
