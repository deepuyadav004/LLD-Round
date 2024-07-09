package main.java.GameLogic.PlayerInitializer;

import main.java.Utility.InputHandler.InputHandler;
import main.java.Utility.InputHandler.InputHandlerInterface;
import main.java.model.Player;

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
