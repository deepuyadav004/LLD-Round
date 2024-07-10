package test.java.GameLogic;

import main.java.GameLogic.Game;
import main.java.Utility.OutputHandler.OutputHandlerImplementation;
import main.java.Utility.OutputHandler.OutputHandlerInterface;
import main.java.model.Dice;
import main.java.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class GameTest {

    @Mock
    private Player player1;

    @Mock
    private Player player2;

    @Mock
    private Dice dice;

    @Mock
    private OutputHandlerInterface outputHandler = new OutputHandlerImplementation();


    @Test
    public void testStartGame_Player1Wins() {
        OutputHandlerInterface outputHandler = new OutputHandlerImplementation();
        assertNotNull(outputHandler, "OutputHandler should not be null");
        assertTrue(outputHandler instanceof OutputHandlerImplementation, "OutputHandler should be an instance of OutputHandlerImplementation");
    }
}