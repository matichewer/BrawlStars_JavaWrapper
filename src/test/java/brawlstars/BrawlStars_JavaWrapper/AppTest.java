package brawlstars.BrawlStars_JavaWrapper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import GeneratedObjects.Player;


public class AppTest 
{
	
    @Test
    public void shouldAnswerWithTrue() {

    	System.out.println("Inicio de JUnit Test\n");
    	
        assertTrue( true );
    	
        Player p1 = new Player("U2VYCYV");
        assertTrue(p1.getStatus());
        
    	System.out.println("Fin de JUnit Test");
    	
    }
}
