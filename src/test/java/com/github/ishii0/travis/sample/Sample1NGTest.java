/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ishii0.travis.sample;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ishii
 */
public class Sample1NGTest {
    
    public Sample1NGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void failedTest() {
        boolean expResult = false;
        boolean result = Sample1.method1();
        assertEquals(result, expResult);
    }

    @Test
    public void successedTest() {
        boolean expResult = true;
        boolean result = Sample1.method1();
        assertEquals(result, expResult);
    }
}
