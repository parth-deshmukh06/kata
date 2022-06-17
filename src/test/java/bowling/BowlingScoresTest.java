package bowling;

import org.bowling.BowlingScores;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingScoresTest {

    @Test
    void shouldReturnZeroScoreWhenZeroPinKnocked(){
        BowlingScores bowlingScores =new BowlingScores();
        final int EXPECTED_SCORE=0;
        int pinsKnocked=0;
        bowlingScores.roll(0);
        int actualScore = bowlingScores.intScores();
        assertEquals(EXPECTED_SCORE,actualScore);
    }

}
