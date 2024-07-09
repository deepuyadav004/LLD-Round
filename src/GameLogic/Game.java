package GameLogic;

import Utility.OutputHandler.OutputHandlerImplementation;
import Utility.OutputHandler.OutputHandlerInterface;
import model.Dice;
import model.Player;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;
    private OutputHandlerInterface outputHandler = new OutputHandlerImplementation();

    public Game(Player player1, Player player2, Dice dice) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;
    }

    void startGame(){
        boolean turn = player1.getHealth() <= player2.getHealth();
        outputHandler.printPlayer(player1);
        outputHandler.printPlayer(player2);
        while(true){
            long attackPower = dice.rollDice();
            long defendPower = dice.rollDice();

            if(turn){
                if(attackPower*player1.getAttack() > defendPower*player2.getStrength()){
                    player2.setHealth(player2.getHealth() - (attackPower*player1.getAttack() - defendPower*player2.getStrength()));
                }
                if(player2.getHealth() <= 0){
                    outputHandler.printPlayer(player1);
                    outputHandler.printPlayer(player2);
                    outputHandler.printString("Winner is player "+player1.getName());
                    return;
                }
            }else{
                if(attackPower*player2.getAttack() > defendPower*player1.getStrength()){
                    player1.setHealth(player1.getHealth() - (attackPower*player2.getAttack() - defendPower*player1.getStrength()));
                }
                if(player1.getHealth() <= 0){
                    outputHandler.printPlayer(player1);
                    outputHandler.printPlayer(player2);
                    outputHandler.printString("Winner is player "+player2.getName());
                    return;
                }
            }
            turn = !turn;
            outputHandler.printPlayer(player1);
            outputHandler.printPlayer(player2);
            outputHandler.newLine();
        }
    }
}
