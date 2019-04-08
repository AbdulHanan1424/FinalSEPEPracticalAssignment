/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embeddedmediaplayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class ClipTest {
    
    public ClipTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Clip.
     */
    @Test
    public void testSetTitleToEmptyStringKeepsPreviousValue()
    {
        Clip instanceClip1 = new Clip(); // creating new clip for the class
        Clip instanceClip2 = new Clip(); // creating another new clip for the class
        System.out.println("Set title to empty string (Keeps previous value)");
        boolean emptyStringFlag = false, nullStringFlag = false;
        
        // Take the title before modified and try to change the name with empty String.
        String initialTitle = instanceClip1.getTitle(); //Get the real name of the sub-clip before made any changes.
        instanceClip1.setTitle("");  // set the title as empty string
        String initialTitleAftermodified = instanceClip1.getTitle(); //Get the real name of the sub-clip after made changes.
        if (initialTitle.equals(initialTitleAftermodified))
            emptyStringFlag = true;
        
        // Take the title before modified and try to change the name with null String.
        initialTitle = instanceClip1.getTitle(); //Get the real name of the sub-clip before made any changes.
        instanceClip1.setTitle(null); //// set the title as null
        initialTitleAftermodified = instanceClip1.getTitle(); //Get the real name of the sub-clip after made changes.
        if (initialTitle.equals(initialTitleAftermodified))
            nullStringFlag = true;
        
        assertEquals(true,emptyStringFlag&&nullStringFlag);
    }

    @Test
    public void testSetEndBeforeStartKeepsPreviousValue()
    {
    }

    @Test
    public void testEqualsOnEqualClips() 
    {
    }
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
    }
    
    @Test
    public void testSetEndToNegativeNumberKeepsPreviousValue() 
    {
    }
    
    @Test
    public void testSetStartToValidPositiveNumber() 
    {    
    }
    
    
    
}
