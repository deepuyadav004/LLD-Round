package main.Utility.OutputHandler;

import main.model.Player;

public class OutputHandlerImplementation implements OutputHandlerInterface {
    @Override
    public void printPlayer(Player player) {
        System.out.println("Player name: " + player.getName());
        System.out.println("Attack: "+player.getAttack());
        System.out.println("Health: "+player.getHealth());
        System.out.println("Strength: "+player.getStrength());
    }

    public void printString(String toBePrinted){
        System.out.println(toBePrinted);
    }

    public void newLine(){
        System.out.println("");
    }
}
