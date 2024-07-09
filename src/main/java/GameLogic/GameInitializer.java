package main.java.GameLogic;

import main.java.GameLogic.PlayerInitializer.CustomPlayerInitializer;
import main.java.GameLogic.PlayerInitializer.DefaultPlayerInitializer;
import main.java.Utility.InputHandler.InputHandler;
import main.java.Utility.InputHandler.InputHandlerInterface;
import main.java.Utility.OutputHandler.OutputHandlerImplementation;
import main.java.Utility.OutputHandler.OutputHandlerInterface;
import main.java.model.Dice;
import main.java.model.Player;

public class GameInitializer {
    private Player player1;
    private Player player2;
    private Dice dice;
    private DefaultPlayerInitializer defaultPlayerInitializer = new DefaultPlayerInitializer();
    private CustomPlayerInitializer customPlayerInitializer = new CustomPlayerInitializer();
    private InputHandlerInterface inputHandler = new InputHandler();
    private Game game;
    private OutputHandlerInterface outputHandler = new OutputHandlerImplementation();


    public void initializeGame(){
        long gameType;
        outputHandler.printString("Press 1 for default mode and press 2 for custom mode: ");
        gameType = inputHandler.integerInput();
        if(gameType==1){
            outputHandler.printString("Input first player details: ");
            player1 = defaultPlayerInitializer.playerInitializer();

            outputHandler.printString("Input second player details: ");
            player2 = defaultPlayerInitializer.playerInitializer();
        }else if(gameType==2){
            outputHandler.printString("Input first player details: ");
            player1 = customPlayerInitializer.playerInitializer();

            outputHandler.printString("Input second player details: ");
            player2 = customPlayerInitializer.playerInitializer();
        }else{
            throw new IllegalArgumentException("Game initialization failed.");
        }

        outputHandler.printString("Press 1 for custom dice or press 2 for default dice");
        long customDice = inputHandler.integerInput();
        if(customDice==1){
            outputHandler.printString("Enter sides of dice: ");
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
