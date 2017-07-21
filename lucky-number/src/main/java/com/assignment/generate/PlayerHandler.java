/*
 * Player Handler
 *
 * version 1.0.0.0
 *
 * Last Edit 21/07/17
 */

package com.assignment.generate;

import java.util.Scanner;

/**
 * This handles the user input and output
 * of the game
 */
public class PlayerHandler {
    private static Scanner scan = new Scanner(System.in);
    private static int MAX_AMOUNT = 100;
    private static int MIN_AMOUNT = 10;

    /**
     * Gets inputs and assign them to player
     * @return Player
     */
    public static Player getInput(){

        Player newPlayer;
        int playingValue;

        System.out.println("Enter Playing number : ");
        playingValue = scan.nextInt();
        newPlayer = new Player(playingValue);
        int randomNumber = RandowNumberGenerator.getRandomNumber(MAX_AMOUNT, MIN_AMOUNT);
        newPlayer.setLuckyValue(randomNumber);
        return newPlayer;
    }

    /**
     * Prints the results of the game to the console
     * @param player
     */
    public static void printResults(Player player){
        if (player.isWinStatus()){
            System.out.println("Player Wins... Player Number is : " + player.getPlayerValue() +
                    "\nLucky value is : " + player.getLuckyValue());
        } else {
            System.out.println("Player Losses... Player Number is : " + player.getPlayerValue() +
                    "\nRandom value is : " + player.getLuckyValue());
        }
    }

}
