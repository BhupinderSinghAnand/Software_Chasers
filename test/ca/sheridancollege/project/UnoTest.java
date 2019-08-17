/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author komal
 */
public class UnoTest {
    
    public UnoTest() {
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
     * Test of play method, of class Uno.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Uno instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of createPlayers method, of class Uno.
     */
    @Test
    public void testCreatePlayersGood() {
        System.out.println("createPlayersGood");
        int userInput= 4;
        Uno instance = null;
        instance.createPlayers();
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
     @Test
    public void testCreatePlayersBad() {
        System.out.println("createPlayersBad");
        int userInput= 1;
        Uno instance = null;
        instance.createPlayers();
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
     @Test
    public void testCreatePlayersBoundary() {
        System.out.println("createPlayersBoundary");
        int userInput= 2;
        Uno instance = null;
        instance.createPlayers();
        // TODO review the generated test code and remove the default call to fail.
       
    }
  
    /**
     * Test of start method, of class Uno.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Uno instance = null;
        int expResult = 0;
        int result = instance.start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of declareWinner method, of class Uno.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Uno instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of again method, of class Uno.
     */
    @Test
    public void testAgain() {
        System.out.println("again");
        Uno instance = null;
        instance.again();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
