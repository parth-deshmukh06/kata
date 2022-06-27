package tictactoegame;

import org.junit.Test;
import org.tictactoegame.TicTacToeGame;

import static org.junit.Assert.assertEquals;

public class TicTacToeGameTest {
    @Test
    public void shouldHaveNineFields(){
        TicTacToeGame game = new TicTacToeGame();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                game.mark(i,j,'X');
            }
        }
        assertEquals("Draw", game.result());
    }
}
