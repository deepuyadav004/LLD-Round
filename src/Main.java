import GameLogic.GameInitializer;
import model.Player;

public class Main {
    public static void main(String[] args) {

        System.out.println("Game is Loading...");

        GameInitializer gameInitializer = new GameInitializer();
        gameInitializer.initializeGame();
    }
}