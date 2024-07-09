package main.java.GameLogic.PlayerInitializer;

import main.java.Utility.InputHandler.InputHandler;
import main.java.Utility.InputHandler.InputHandlerInterface;
import main.java.model.Player;

public class CustomPlayerInitializer {
    InputHandlerInterface inputHandler = new InputHandler();
    Player player;

    public Player playerInitializer(){
        System.out.println("Enter name of the player: ");
        String name = inputHandler.inputString();

        System.out.println("Enter health of the player: ");
        long health = inputHandler.integerInput();

        System.out.println("Enter strength of the player: ");
        long strength = inputHandler.integerInput();

        System.out.println("Enter attack of the player: ");
        long attack = inputHandler.integerInput();

        player = new Player(name, health, strength, attack);
        return player;
    }
}
