package GameLogic;

import GameLogic.PlayerInitializer.CustomPlayerInitializer;
import GameLogic.PlayerInitializer.DefaultPlayerInitializer;
import Utility.InputHandler.InputHandler;
import Utility.InputHandler.InputHandlerInterface;
import model.Dice;
import model.Player;

public class GameInitializer {
    Player player1;
    Player player2;
    Dice dice;
    DefaultPlayerInitializer defaultPlayerInitializer;
    CustomPlayerInitializer customPlayerInitializer;
    InputHandlerInterface inputHandler = new InputHandler();
    Game game;


    void initializeGame(){
        long gameType;
        System.out.println("Press 1 for default mode and press 2 for custom mode: ");
        gameType = inputHandler.integerInput();
        if(gameType==1){
            System.out.println("Input first player details: ");
            player1 = defaultPlayerInitializer.playerInitializer();

            System.out.println("Input second player details: ");
            player2 = defaultPlayerInitializer.playerInitializer();
        }else if(gameType==2){
            System.out.println("Input first player details: ");
            player1 = customPlayerInitializer.playerInitializer();

            System.out.println("Input second player details: ");
            player2 = customPlayerInitializer.playerInitializer();
        }else{
            throw new IllegalArgumentException("Game initialization failed.");
        }

        System.out.println("Press 1 for custom dice or press 2 for default dice");
        long customDice = inputHandler.integerInput();
        if(customDice==1){
            System.out.println("Enter sides of dice: ");
            int sides = inputHandler.smallIntegerInput();
            dice = new Dice(sides);
        }else if(customDice==2){
            dice = new Dice();
        }else{
            throw new IllegalArgumentException("Game initialization failed.");
        }

        game = new Game(player1, player2, dice);
        game.startGame();
    }
}
