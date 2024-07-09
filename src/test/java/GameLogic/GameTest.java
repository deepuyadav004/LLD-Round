package test.java.GameLogic;

import main.java.GameLogic.Game;
import main.java.Utility.OutputHandler.OutputHandlerInterface;
import main.java.model.Dice;
import main.java.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;
    private Dice dice;
    private OutputHandlerInterface outputHandler;

    @BeforeEach
    public void setUp() {
        player1 = new Player("Player 1", 100, 20, 30); // Replace with your player constructor parameters
        player2 = new Player("Player 2", 120, 25, 25); // Replace with your player constructor parameters
        dice = Mockito.mock(Dice.class);
        outputHandler = Mockito.mock(OutputHandlerInterface.class);

        game = new Game(player1, player2, dice);
        game.outputHandler = outputHandler; // Inject the mock OutputHandlerInterface
    }

    @Test
    public void testStartGame_Player1Wins() {

        game.startGame();

        verify(outputHandler, times(6)).printPlayer(any(Player.class));
        verify(outputHandler, times(2)).newLine();
        verify(outputHandler).printString("Winner is player Player 1");
    }

    @Test
    public void testStartGame_Player2Wins() {
        game.startGame();

        verify(outputHandler, times(6)).printPlayer(any(Player.class));
        verify(outputHandler, times(2)).newLine();
        verify(outputHandler).printString("Winner is player Player 2");
    }

}
