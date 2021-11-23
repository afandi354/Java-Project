/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fun_dy
 */
public class SimpleMathTest {
    
    public SimpleMathTest() {
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

    @Test
    public void testDoAddition() {
        System.out.println("doAddition");
        int a = 2;
        int b = 2;
        SimpleMath instance = new SimpleMath();
        int expResult =4;
        int result = instance.doAddition(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoSubtraction() {
        System.out.println("doSubstraction");
        int a = 3;
        int b = 1;
        SimpleMath instance = new SimpleMath();
        int expResult = 3;
        int result = instance.doSubtraction(a, b);
        assertEquals(expResult, result);
    }
}
