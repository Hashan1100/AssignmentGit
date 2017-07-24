/*
 * Game
 *
 * This is the lucky number game
 * This game compares the player input number with random value
 * Generated by the system
 *
 * version 1.0.0.0
 *
 * Last edit 21/07/17
 */

package com.assignment.app;

import com.assignment.calculate.Calculate;
import com.assignment.generate.Player;
import com.assignment.generate.PlayerHandler;

/**
 * This class initiates the game
 *
 */
public class Game 
{
    public static void main( String[] args )
    {
        System.out.println( "Lucky Number Enter Numbers Between 100 to 10\n" );

        Player newPlayer = PlayerHandler.getInput();
        newPlayer = Calculate.calculateWin(newPlayer);
        PlayerHandler.printResults(newPlayer);

    }
}
