 
package assignment2;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class GameTest {
     Game validGame;
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          validGame = new Game("GTA V", "PC", "Adventure", "2GB", LocalDate.of(2013, Month.MARCH, 1),"Canada");

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
         String expResult = "GTA V";
        String result = validGame.getName();
        assertEquals(expResult, result);
    }
  


    /**
     * Test of setName method, of class Game.
     */
    @Test
    public void testSetName() {
         validGame.setName("GTA V");
        String result = validGame.getName();
        assertEquals("GTA V",result);       
    }
    
      /**
     * Test of setName method, of class game.
     */
     public void testSetNameInvalid()
    {
        String name  = "";
        try
        {
            validGame.setName(name);
            fail("The setName method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getPlatform method, of class Game.
     */
    @Test
    public void testGetPlatform() {
        String expResult = "PC";
        String result = validGame.getPlatform();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlatform method, of class Game.
     */
    @Test
    public void testSetPlatform() {
        validGame.setPlatform("PC");
        String result = validGame.getPlatform();
        assertEquals("PC",result);  
    }
    
    /**
     * Test of setPlatform method, of class game.
     */
    @Test
    public void testSetPlatformInvalid()
    {
        String platform = "";
        try
        {
            validGame.setPlatform(platform);
            fail("The setPlatform method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getGenre method, of class Game.
     */
    @Test
    public void testGetGenre() {
       String expResult = "Adventure";
        String result = validGame.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class Game.
     */
    @Test
    public void testSetGenre() {
        validGame.setPlatform("Adventure");
        String result = validGame.getGenre();
        assertEquals("Adventure",result); 
    }
    
    /**
     * Test of setGenre method, of class Game.
     */
    @Test
    public void testSetGenreInvalid()
    {
        String genre = "";
        try
        {
            validGame.setGenre(genre);
            fail("The setGenre method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getSize method, of class Game.
     */
    @Test
    public void testGetSize() {
      String expResult = "2GB";
        String result = validGame.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class Game.
     */
    @Test
    public void testSetSize() {
        validGame.setPlatform("2GB");
        String result = validGame.getSize();
        assertEquals("2GB",result); 
    }
    
    /**
     * Test of setSize method, of class Game.
     */
    @Test
    public void testSetSizeInvalid()
    {
        String size = "";
        try
        {
            validGame.setSize(size);
            fail("The setSize method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getLaunchDate method, of class Game.
     */
    @Test
    public void testGetLaunchDate() {
         LocalDate expResult = LocalDate.of(2013, Month.MARCH, 1);
        LocalDate result = validGame.getLaunchDate();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLaunchDate method, of class Game.
     */
    @Test
    public void testSetLaunchDate() {
         LocalDate launchDate = LocalDate.of(2013, Month.MARCH, 1);
        validGame.setLaunchDate(launchDate);
        assertEquals(launchDate, validGame.getLaunchDate());
    }
    
     /**
     * Test of setLaunchDate method, of class Game.
     */
    
     @Test
    public void testSetLaunchDateInvalid()
    {
        LocalDate launchDate = LocalDate.of(1989, Month.DECEMBER, 31);
        try{
            validGame.setLaunchDate(launchDate);
            fail("A LaunchDate is greater than 1990 ");
        } catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getAvailability method, of class Game.
     */
    @Test
    public void testGetAvailability() {
        
         String expResult = "Canada";
        String result = validGame.getAvailability();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvailability method, of class Game.
     */
    @Test
    public void testSetAvailability() {
       validGame.setAvailability("Canada");
        String result = validGame.getAvailability();
        assertEquals("Canada",result);
    }
    
        /**
     * Test of setAvailability method, of class Game.
     */
    @Test
    public void testSetAvailabilityInvalid()
    {
        String availability = "";
        try
        {
            validGame.setAvailability(availability);
            fail("The setAvailability method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    
}
