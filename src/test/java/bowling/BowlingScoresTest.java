package bowling;

import org.bowling.BowlingScores;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingScoresTest {

    @Test
    public void shouldReturnZeroScoreWhenZeroPinKnocked(){
        BowlingScores bowlingScores =new BowlingScores();
        final int EXPECTED_SCORE=0;
        int pinsKnocked=0;

        bowlingScores.roll(pinsKnocked);
        int actualScore = bowlingScores.score();

        assertEquals(EXPECTED_SCORE,actualScore);
    }

    @Test
    public void shouldReturnTwoScoreWhenTwoPinsKnocked(){
        BowlingScores bowlingScores =new BowlingScores();
        final int EXPECTED_SCORE=2;
        int pinsKnocked=2;

        bowlingScores.roll(pinsKnocked);
        int actualScore = bowlingScores.score();

        assertEquals(EXPECTED_SCORE,actualScore);
    }
}
