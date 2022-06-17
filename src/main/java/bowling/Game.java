package bowling;

public class Game {

    private int score = 0;
    private final int[] rollScore = new int[21];
    private int currentRoll = 0;
    public void roll(int pins) {
        rollScore[currentRoll]=pins;
        currentRoll++;
        //score+=pins;
    }

    public int score() {
        int i = 0;
        for(int frames=0;frames<10;frames++){
            if(rollScore[i] + rollScore[i+1] == 10){
                score = 10 + rollScore[i+2];
            }else{
                score += rollScore[i] + rollScore[i+1];
            }
            i+=2;
        }

        return score;
    }
}
