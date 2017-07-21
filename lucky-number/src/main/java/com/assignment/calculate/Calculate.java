package com.assignment.calculate;

import com.assignment.generate.Player;
import com.assignment.generate.RandowNumberGenerator;

/**
 * Created by hashan on 7/21/17.
 */
public class Calculate {
    private static int MAX_AMOUNT = 100;
    private static int MIN_AMOUNT = 10;
    public static Player calculateWin(Player newPlayer){
        int randomNumber = RandowNumberGenerator.getRandomNumber(MAX_AMOUNT, MIN_AMOUNT);
        if(isPlayerWon(newPlayer, randomNumber)){
            newPlayer.setWinStatus(true);
        } else {
            newPlayer.setWinStatus(false);
        }

        return newPlayer;
    }

    private static boolean isPlayerWon(Player newPlayer, int randomNumber) {
        return newPlayer.getPlayerValue() == randomNumber;
    }

}
