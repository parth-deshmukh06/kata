package org.bowling;

public class BowlingGame {
    private int totalScores=0;
    private int[] rolls = new int[21];
    int currentRoll=0;
    public void roll(int numberOfKnockedPins){
        rolls[currentRoll] = numberOfKnockedPins;
        currentRoll++;
    }
    public int score() {
        for(int i=0;i<currentRoll;)
        {
            if ((rolls[i] + rolls[i+1])==10) {
                totalScores+=rolls[i+2];
            }
            totalScores+= rolls[i]+rolls[i+1];
            i=i+2;
        }
        return totalScores;
    }
}
