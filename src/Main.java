import GameLogic.GameInitializer;
import Utility.OutputHandler.OutputHandlerImplementation;
import Utility.OutputHandler.OutputHandlerInterface;
import model.Player;

public class Main {
    public static void main(String[] args) {

        OutputHandlerInterface outputHandler = new OutputHandlerImplementation();

        System.out.println("Game is Loading...");
        GameInitializer gameInitializer = new GameInitializer();
        gameInitializer.initializeGame();
    }
}