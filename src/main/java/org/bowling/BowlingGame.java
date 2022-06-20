package org.bowling;

public class BowlingGame {
    private int[] rolls = new int[21];
    int currentRoll=0;
    public void roll(int numberOfKnockedPins){
        rolls[currentRoll++] = numberOfKnockedPins;
    }
    public int score() {
        int totalScores=0;
        int i=0;
        for(int frame=0;frame<10; frame++)
        {
            int bonus=0;
            if(rolls[i]==10) {
                totalScores+=rolls[i]+rolls[i+1]+rolls[i+2];
                i++;
            }
            else if ((rolls[i] + rolls[i+1])==10) {
                totalScores+=rolls[i]+rolls[i+1]+rolls[i+2];
                i += 2;
            }
            else{
                totalScores += rolls[i] + rolls[i + 1];
                i += 2;
            }
        }
        return totalScores;
    }
}
