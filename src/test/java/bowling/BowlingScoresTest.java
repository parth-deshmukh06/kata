package bowling;

import org.bowling.BowlingGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingScoresTest {

    @Test
    public void shouldReturnZeroScoreWhenZeroPinKnocked(){
        BowlingGame bowlingGame =new BowlingGame();
        final int EXPECTED_SCORE=0;
        int pinsKnocked=0;

        bowlingGame.roll(pinsKnocked);
        int actualScore = bowlingGame.score();

        assertEquals(EXPECTED_SCORE,actualScore);
    }

    @Test
    public void shouldReturnTwoScoreWhenTwoPinsKnocked(){
        BowlingGame bowlingGame =new BowlingGame();
        final int EXPECTED_SCORE=2;
        int pinsKnocked=2;

        bowlingGame.roll(pinsKnocked);
        int actualScore = bowlingGame.score();

        assertEquals(EXPECTED_SCORE,actualScore);
    }

    @Test
    public void shouldReturnTotalScoreOfAllRolls(){
        BowlingGame bowlingGame =new BowlingGame();
        final int EXPECTED_TOTAL_SCORE=20;
        int pinsKnocked=1;

        for(int i = 0; i<20; i++)
        { bowlingGame.roll(pinsKnocked); }
        int actualScore = bowlingGame.score();

        assertEquals(EXPECTED_TOTAL_SCORE,actualScore);
    }

    @Test
    public void shouldHandleOneSpare(){
        BowlingGame bowlingGame =new BowlingGame();
        bowlingGame.roll(3);
        bowlingGame.roll(7);
        bowlingGame.roll(4);
        for(int i=0;i<17;i++)
        { bowlingGame.roll(1); }

        int actualScore = bowlingGame.score();

        assertEquals(35,actualScore);
    }

    @Test
    public void shouldAddBonusOfOneStrike(){
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(10);
        bowlingGame.roll(5);
        bowlingGame.roll(4);
        for(int i=0;i<16;i++)
        { bowlingGame.roll(1); }

        int actualScore = bowlingGame.score();

        assertEquals(44,actualScore);
    }

    @Test
    public void testWholeGame(){
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(10);        //strike
        bowlingGame.roll(5);        //spare
        bowlingGame.roll(5);        //spare
        for(int i=0;i<14;i++)
        { bowlingGame.roll(1); }
        bowlingGame.roll(5);        //spare
        bowlingGame.roll(5);
        bowlingGame.roll(5);

        int actualScore = bowlingGame.score();

        assertEquals(60,actualScore);
    }

}
