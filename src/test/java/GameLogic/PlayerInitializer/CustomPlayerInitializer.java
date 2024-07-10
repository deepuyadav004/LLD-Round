package test.java.GameLogic.PlayerInitializer;

import main.java.Utility.InputHandler.InputHandler;
import main.java.Utility.InputHandler.InputHandlerInterface;
import main.java.model.Player;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomPlayerInitializer {
    @Mock
    InputHandlerInterface inputHandler = new InputHandler();
    @Mock
    Player player = new Player("dxy");

    @Test
    public void inputHandlerTest(){
        assertNotNull(inputHandler);
        assertTrue(inputHandler instanceof InputHandler);
    }

    @Test
    public void playerTest(){
        assertNotNull(player);
        assertTrue(player instanceof Player);
    }
}