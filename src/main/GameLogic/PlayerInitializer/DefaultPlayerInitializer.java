package main.GameLogic.PlayerInitializer;

import main.Utility.InputHandler.InputHandler;
import main.Utility.InputHandler.InputHandlerInterface;
import main.model.Player;

public class DefaultPlayerInitializer {
    InputHandlerInterface inputHandler = new InputHandler();

    Player player;

    public Player playerInitializer(){
        System.out.println("Enter name of the player: ");
        String name = inputHandler.inputString();

        player = new Player(name);
        return player;
    }
}
