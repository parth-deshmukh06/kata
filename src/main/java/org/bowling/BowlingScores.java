package org.bowling;

public class BowlingScores {
    int totalScores=0;
    public void roll(int numberOfKnockedPins) {
        totalScores = totalScores + numberOfKnockedPins;
    }

    public int score() {
        return totalScores;
    }
}
