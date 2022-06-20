package org.bowling;

public class BowlingGame {
    private int totalScores=0;
    private int rolls[] = new int[21];
    int currentRoll=0;
    public void roll(int numberOfKnockedPins){
        rolls[currentRoll] = numberOfKnockedPins;
        currentRoll++;
    }
    public int score() {
        for(int i=0;i<currentRoll;i++)
        {
            totalScores+= rolls[i];
        }
        return totalScores;
    }
}
