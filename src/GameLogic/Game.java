package GameLogic;

import model.Dice;
import model.Player;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Game(Player player1, Player player2, Dice dice) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;
    }

    void startGame(){
        boolean turn = player1.getHealth() <= player2.getHealth();
        while(true){
            long attackPower = dice.rollDice();
            long defendPower = dice.rollDice();
            System.out.println("Running...");
            if(turn){
                if(attackPower*player1.getAttack() > defendPower*player2.getStrength()){
                    player2.setHealth(attackPower*player1.getAttack() - defendPower*player2.getStrength());
                }
                if(player2.getHealth() <= 0){
                    System.out.println("Winner is player "+player1.getName());
                    return;
                }
            }else{
                if(attackPower*player2.getAttack() > defendPower*player1.getStrength()){
                    player1.setHealth(attackPower*player2.getAttack() - defendPower*player1.getStrength());
                }
                if(player1.getHealth() <= 0){
                    System.out.println("Winner is player "+player2.getName());
                    return;
                }
            }
            turn = !turn;
        }
    }
}
