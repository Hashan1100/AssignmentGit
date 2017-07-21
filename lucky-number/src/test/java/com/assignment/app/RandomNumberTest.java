/*
 * RandomNumberTest
 *
 * version 1.0.0.0
 *
 * Last Edit 21/07/17
 */

package com.assignment.app;
import com.assignment.generate.RandowNumberGenerator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit testing for the Random number generator
 */
public class RandomNumberTest {
    private int maxAmount = 100;
    private int minAmount = 10;

    @BeforeClass
    public static void executeBeforeClass(){
        System.out.println("This is executed before the Class\n");
    }

    @Before
    public void executeBeforeMethod(){
        System.out.println("This is executed before the method\n");
    }

    /**
     * Check whether random number within range of the max and min values
     */
    @Test
    public void randomNumberWithinRangeTest(){
        assertEquals( true, 100 >= RandowNumberGenerator.getRandomNumber(maxAmount, minAmount) && 10 < RandowNumberGenerator.getRandomNumber(maxAmount, minAmount));
    }

    /**
     * Check whether random numbers are out of the range of max and min values
     */
    @Test
    public void randomNumberOutOfRangeTest(){
        assertEquals( false, 100 < RandowNumberGenerator.getRandomNumber(maxAmount, minAmount) && 10 >= RandowNumberGenerator.getRandomNumber(maxAmount, minAmount));
    }

}
