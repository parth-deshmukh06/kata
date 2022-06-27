package bowling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingTest {
    @Test
    public void scoreShouldReturnZeroWhenZeroPinIsKnockedInAFrame(){
        Game game = new Game();

        for(int rolls=0;rolls<2;rolls++){
            game.roll(0);
        }

        assertEquals(0, game.score());
    }

    @Test
    public void scoreShouldReturnTwoWhenOnePinIsKnockedInEachRollOfAFrame(){
        Game game = new Game();

        for(int rolls=0;rolls<2;rolls++){
            game.roll(1);
        }

        assertEquals(2, game.score());
    }
    @Test
    public void scoreShouldReturnNineteenWhenItsASpareAndThreePinsAreKnockedInEachRollOfNextFrame(){
        Game game = new Game();
        game.roll(4);
        game.roll(6);
        game.roll(3);
        game.roll(3);

        assertEquals(19,game.score());

    }
    @Test
    public void scoreShouldReturnTwentyFourIfThereIsAStrikeFollowedByThreeAndFour(){
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(4);

        assertEquals(24,game.score());
    }


}
