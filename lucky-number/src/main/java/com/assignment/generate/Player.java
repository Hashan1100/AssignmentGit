/*
 * Player
 *
 * version 1.0.0.0
 *
 * Last Edit 21/07/17
 */
package com.assignment.generate;

/**
 * This class represent the player.
 * This is used to pass player information to other classes.
 */

public class Player {
    private int playerValue;
    private boolean winStatus;
    private int luckyValue;

    /**
     * Set initial input value for the player
     * @param value
     */
    public Player(int value)
    {
        this.playerValue = value;
    }

    /**
     * Get win or lose status
     * @return boolean
     */
    public boolean isWinStatus()
    {
        return winStatus;
    }

    /**
     * Set win or lose status for the player
     * @param winStatus
     */
    public void setWinStatus(boolean winStatus)
    {
        this.winStatus = winStatus;
    }

    /**
     * Get current playing value for the player
     * @return int
     */
    public int getPlayerValue() {
        return playerValue;
    }

    /**
     * Get given random value for the user by the system
     * @return int
     */
    public int getLuckyValue() {
        return luckyValue;
    }

    /**
     * Set given random value for the user by system
     * @param luckValue
     */
    public void setLuckyValue(int luckValue) {
        this.luckyValue = luckValue;
    }
}
