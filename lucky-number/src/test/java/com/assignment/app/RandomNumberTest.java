package com.assignment.app;
import com.assignment.generate.RandowNumberGenerator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hashan on 7/21/17.
 */
public class RandomNumberTest {
    int maxAmount = 100;
    int minAmount = 10;

    @BeforeClass
    public static void executeBeforeClass(){
        System.out.println("This is executed before the Class\n");
    }

    @Before
    public void executeBeforeMethod(){
        System.out.println("This is executed before the method\n");
    }

    @Test
    public void randomNumberWithinRangeTest(){
        assertEquals( true, 100 >= RandowNumberGenerator.getRandomNumber(maxAmount, minAmount) && 10 < RandowNumberGenerator.getRandomNumber(maxAmount, minAmount));
    }

    @Test
    public void randomNumberOutOfRangeTest(){
        assertEquals( false, 100 < RandowNumberGenerator.getRandomNumber(maxAmount, minAmount) && 10 >= RandowNumberGenerator.getRandomNumber(maxAmount, minAmount));
    }

}
