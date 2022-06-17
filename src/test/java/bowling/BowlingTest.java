package bowling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingTest {
    @Test
    public void scoreShouldReturnZeroWhenZeroPinIsKnockedInAFrame(){
        Game game = new Game();

        for(int rolls=0;rolls<=2;rolls++){
            game.roll(0);
        }

        assertEquals(0, game.score());
    }

}
