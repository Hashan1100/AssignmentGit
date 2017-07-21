package com.assignment.generate;

/**
 * Created by hashan on 7/21/17.
 */
public class Player {
    private int playerValue;
    private boolean winStatus;
    public Player(int value){
        this.playerValue = value;
    }

    public boolean isWinStatus() {
        return winStatus;
    }

    public void setWinStatus(boolean winStatus) {
        this.winStatus = winStatus;
    }

    public int getPlayerValue() {
        return playerValue;
    }
}
