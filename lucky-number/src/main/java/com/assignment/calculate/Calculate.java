/*
 * Calculate
 *
 * version 1.0.0.0
 *
 * Last Edit 21/07/17
 */

package com.assignment.calculate;

import com.assignment.generate.Player;
import com.assignment.generate.RandowNumberGenerator;

/**
 * This compares the random number and the given user value.
 */

public class Calculate {



    /**
     * Compares the random number with user value and returns the player with results
     * @param newPlayer
     * @return Player
     */
    public static Player calculateWin(Player newPlayer){

        if(isPlayerWon(newPlayer, newPlayer.getLuckyValue())){
            newPlayer.setWinStatus(true);
        } else {
            newPlayer.setWinStatus(false);
        }

        return newPlayer;
    }

    /**
     * Compare two numbers
     * @param newPlayer
     * @param randomNumber
     * @return boolean
     */
    private static boolean isPlayerWon(Player newPlayer, int randomNumber) {
        return newPlayer.getPlayerValue() == randomNumber;
    }

}
