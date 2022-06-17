package org.bowling;

public class BowlingScores {
    private int totalScores=0;
    public void roll(int numberOfKnockedPins) {
        setTotalScores(numberOfKnockedPins);
    }
    public int score() {
        return totalScores;
    }
    private void setTotalScores(int knockedPins){
        totalScores = totalScores + knockedPins;
    }
    private int getTotalScores(){
        return totalScores;
    }
}
