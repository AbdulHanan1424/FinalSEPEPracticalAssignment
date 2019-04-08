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
    Clip instanceClip1 = new Clip(); // creating new clip for the class
        Clip instanceClip2 = new Clip(); // creating another new clip for the class
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
         System.out.println("Set  end time before start (Keeps previous value)");
        boolean endBeforeStart = false, endEqualStart = false, endAtZero = false, endAtNull = false;
        
        int initialEndTime = instanceClip1.getEnd(); 
        instanceClip1.setEnd(instanceClip1.getStart()-5);
        int initialendTimeAfterModified = instanceClip1.getEnd(); 
        if (initialEndTime==initialendTimeAfterModified)
            endBeforeStart = true;
        
        
        initialEndTime = instanceClip1.getEnd();
        instanceClip1.setEnd(instanceClip1.getStart()); 
        initialendTimeAfterModified = instanceClip1.getEnd(); 
        if (initialEndTime==initialendTimeAfterModified) return; 
        endEqualStart = true; 
        
        
        initialEndTime = instanceClip1.getEnd(); 
        instanceClip1.setEnd(0); 
        initialendTimeAfterModified = instanceClip1.getEnd(); 
        if (initialEndTime==initialendTimeAfterModified) 
            endAtZero = true;
        initialEndTime = instanceClip1.getEnd();
        instanceClip1.setEnd(null); 
        initialendTimeAfterModified = instanceClip1.getEnd(); 
        if (initialEndTime==initialendTimeAfterModified)
            endAtNull = true;
        assertEquals(true,endBeforeStart&&endEqualStart&&endAtZero&&endAtNull);
    }

    @Test
    public void testEqualsOnEqualClips() 
    {
        
        boolean nullClip = false, sameClip = false;
        System.out.println("Check the Equal function for equals clips)");
        
       
        if (instanceClip1.equals(instanceClip2))
            sameClip = true;
        
       
        Clip instanceClipEmpty = new Clip(); 
        instanceClipEmpty = null; 
        if (!instanceClip1.equals(instanceClipEmpty))
            nullClip = true;
        
        assertEquals(true,nullClip&&sameClip);
    }
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
       boolean nullClip = false, differentClip = true;
        System.out.println("Check the Equal function for non-equals clips)");
        
       
        if (instanceClip1.equals(instanceClip2))
            differentClip = false;
        
       
        Clip instanceClipEmpty = new Clip(); 
        instanceClipEmpty = null; 
        if (!instanceClip1.equals(instanceClipEmpty))
            nullClip = true;
        
        assertEquals(false,nullClip&&differentClip);
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
