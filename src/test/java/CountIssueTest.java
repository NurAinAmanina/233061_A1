/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CountIssueTest {
    
    public CountIssueTest() {
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
     * Test of issue method, of class CountIssue.
     */
    @Test
     public void testCountIssue() throws IOException {
        System.out.println("NumberOfIssue");
        CountIssue instance = new CountIssue();
        int expResult = 3;
        int result = instance.issue();
        assertEquals(expResult, result);
 
    }
}