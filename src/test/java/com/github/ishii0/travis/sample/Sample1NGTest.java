/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ishii0.travis.sample;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author ishii
 */
public class Sample1NGTest {
    
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
