import GameLogic.GameInitializer;
import Utility.OutputHandler.OutputHandlerImplementation;
import Utility.OutputHandler.OutputHandlerInterface;
import model.Player;

public class Main {
    public static void main(String[] args) {

        OutputHandlerInterface outputHandler = new OutputHandlerImplementation();

        System.out.println("Game is Loading...");
        outputHandler.newLine();
        outputHandler.printString("Instructions: ");
        outputHandler.newLine();
        outputHandler.printString("Game can be played in two modes custom mode and default mode");
        outputHandler.printString("Custom mode: User will give attack, health, strength and name as input to game");
        outputHandler.printString("Default mode: Game will randomly generate values for attack, health and strength.");
        outputHandler.printString("*************************************************************************");
        outputHandler.newLine();
        GameInitializer gameInitializer = new GameInitializer();
        gameInitializer.initializeGame();
    }
}