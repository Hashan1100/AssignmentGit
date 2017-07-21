package com.assignment.app;

import com.assignment.calculate.Calculate;
import com.assignment.generate.Player;
import com.assignment.generate.PlayerHandler;

/**
 * Hello world!
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
