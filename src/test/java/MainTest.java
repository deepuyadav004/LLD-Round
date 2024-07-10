package test.java;
import main.java.GameLogic.GameInitializer;
import main.java.Utility.OutputHandler.OutputHandlerImplementation;
import main.java.Utility.OutputHandler.OutputHandlerInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void outputHandlerTest(){
        OutputHandlerInterface outputHandler = new OutputHandlerImplementation();
        assertNotNull(outputHandler, "OutputHandler should not be null");
        assertTrue(outputHandler instanceof OutputHandlerImplementation, "OutputHandler should be an instance of OutputHandlerImplementation");
    }

    @Test
    public void gameInitializerTest(){
        GameInitializer gameInitializer = new GameInitializer();
        assertNotNull(gameInitializer, "GameInitializer should not be null");
    }

}