package com.assignment.generate;

import java.util.Scanner;

/**
 * Created by hashan on 7/21/17.
 */
public class PlayerHandler {
    private static Scanner scan = new Scanner(System.in);

    public static Player getInput(){
        Player newPlayer;
        int playingValue;
        System.out.println("Enter Playing number : ");
        playingValue = scan.nextInt();
        newPlayer = new Player(playingValue);
        return newPlayer;
    }

    public static void printResults(Player player){
        if (player.isWinStatus()){
            System.out.println("Player Wins...");
        } else {
            System.out.println("Player Losses Please try again...");
        }
    }

}
