package test.java.GameLogic;

import main.java.GameLogic.Game;
import main.java.GameLogic.PlayerInitializer.CustomPlayerInitializer;
import main.java.GameLogic.PlayerInitializer.DefaultPlayerInitializer;
import main.java.Utility.InputHandler.InputHandler;
import main.java.Utility.InputHandler.InputHandlerInterface;
import main.java.Utility.OutputHandler.OutputHandlerImplementation;
import main.java.Utility.OutputHandler.OutputHandlerInterface;
import main.java.model.Dice;
import main.java.model.Player;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameInitializerTest {
    @Mock
    private Player player1 = new Player("xyz");

    @Mock
    private Player player2 = new Player("abc");

    @Mock
    Dice dice = new Dice();

    @Mock
    DefaultPlayerInitializer defaultPlayerInitializer = new DefaultPlayerInitializer();

    @Mock
    CustomPlayerInitializer customPlayerInitializer = new CustomPlayerInitializer();

    @Mock
    InputHandlerInterface inputHandler = new InputHandler();

    @Mock
    private OutputHandlerInterface outputHandler = new OutputHandlerImplementation();

    @Test
    public void outputHandlerTest(){
        OutputHandlerInterface outputHandler = new OutputHandlerImplementation();
        assertNotNull(outputHandler, "OutputHandler should not be null");
        assertTrue(outputHandler instanceof OutputHandlerImplementation, "OutputHandler should be an instance of OutputHandlerImplementation");
    }

    @Test
    public void playerTest(){
        assertNotNull(player1, "Player should be present");
        assertNotNull(player2, "player2 should be present");
        assertTrue(player1 instanceof Player);
        assertTrue(player2 instanceof Player);
    }

    @Test
    public void customPLayerInitializerTest(){
        assertNotNull(customPlayerInitializer);
        assertTrue(customPlayerInitializer instanceof CustomPlayerInitializer);
    }

    @Test
    public void defaultPlayerInitializerTest(){
        assertNotNull(defaultPlayerInitializer);
        assertTrue(defaultPlayerInitializer instanceof DefaultPlayerInitializer);
    }
}