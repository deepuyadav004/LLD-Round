package test.java;

import main.java.GameLogic.GameInitializer;
import main.java.Main;
import main.java.Utility.OutputHandler.OutputHandlerInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private OutputHandlerInterface outputHandler;
    private GameInitializer gameInitializer;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        outputHandler = Mockito.mock(OutputHandlerInterface.class);
        gameInitializer = Mockito.mock(GameInitializer.class);
    }

    @Test
    public void testMain() {
        Mockito.doNothing().when(outputHandler).newLine();
        Mockito.doNothing().when(outputHandler).printString(Mockito.anyString());
        Mockito.doNothing().when(gameInitializer).initializeGame();

        Main.main(new String[]{});

        String consoleOutput = outContent.toString();

        verify(outputHandler).newLine();
        verify(outputHandler).printString("Instructions: ");
        verify(outputHandler).printString("Game can be played in two modes custom mode and default mode");
        verify(outputHandler).printString("Custom mode: User will give attack, health, strength and name as input to game");
        verify(outputHandler).printString("Default mode: Game will randomly generate values for attack, health and strength.");
        verify(outputHandler).printString("*************************************************************************");
        verify(outputHandler, Mockito.times(2)).newLine();

        verify(gameInitializer).initializeGame();

        assertTrue(consoleOutput.contains("Game is Loading..."));
    }
}
