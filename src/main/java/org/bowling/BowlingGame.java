package org.bowling;

public class BowlingGame {
    private int[] rolls = new int[21];
    int currentRoll=0;
    public void roll(int numberOfKnockedPins){
        rolls[currentRoll++] = numberOfKnockedPins;
    }
    public int score() {
        int totalScores=0;
        int rollsIndex=0;
        for(int frame=0;frame<10; frame++)
        {
            if(isStrike(rollsIndex)) {
                totalScores+=10+strikeBonus(rollsIndex);
                rollsIndex++;
            }
            else if (isSpare(rollsIndex)) {
                totalScores+=10+ spareBonus(rollsIndex);
                rollsIndex += 2;
            }
            else{
                totalScores += sumOfFrame(rollsIndex);
                rollsIndex += 2;
            }
        }
        return totalScores;
    }
    private boolean isSpare(int rollsIndex){
        return rolls[rollsIndex] + rolls[rollsIndex+1] == 10;
    }
    private boolean isStrike(int rollsIndex){
        return rolls[rollsIndex] == 10;
    }
    private int strikeBonus(int rollsIndex){
        return rolls[rollsIndex+1]+rolls[rollsIndex+2];
    }
    private int spareBonus(int rollsIndex){
        return rolls[rollsIndex+2];
    }
    private int sumOfFrame(int rollsIndex){
        return rolls[rollsIndex] + rolls[rollsIndex + 1];
    }
}
