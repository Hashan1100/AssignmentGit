/*
 * CalculateTest
 *
 * version 1.0.0.0
 *
 * Last Edit 21/07/17
 */

package com.assignment.app;

import com.assignment.calculate.Calculate;
import com.assignment.generate.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This unit test checks whether caparison between
 * random number and player value is correct or not
 */
public class CalculateTest {
    private Player player;

    @Before
    public void executeBeforeMethod()
    {
        player = new Player(30);
    }

    /**
     * Check whether calculation successful if the numbers match
     */
    @Test
    public void calculationSuccessfulTest(){
        player.setLuckyValue(30);
        assertEquals(true, Calculate.calculateWin(player).isWinStatus());
    }

    /**
     * Check whether calculation fail if the numbers won't match
     */
    @Test
    public void calculationFailTest(){
        player.setLuckyValue(40);
        assertEquals(false, Calculate.calculateWin(player).isWinStatus());
    }

    @After
    public void executeAfterMethod(){
        System.out.println("This is executed after the test");
    }

}
