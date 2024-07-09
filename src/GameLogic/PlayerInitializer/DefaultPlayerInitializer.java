package GameLogic.PlayerInitializer;

import Utility.InputHandler.InputHandler;
import Utility.InputHandler.InputHandlerInterface;
import model.Player;

public class DefaultPlayerInitializer {
    InputHandlerInterface inputHandler = new InputHandler();

    Player player;

    Player playerInitializer(){
        System.out.println("Enter name of the player: ");
        String name = inputHandler.inputString();

        player = new Player(name);
        return player;
    }
}
