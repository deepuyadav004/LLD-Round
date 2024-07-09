package Utility.OutputHandler;

import model.Player;

public class OutputHandlerImplementation implements OutputHandlerInterface {
    @Override
    public void printPlayer(Player player) {
        System.out.println(player.getName());
        System.out.println(player.getAttack());
        System.out.println(player.getHealth());
        System.out.println(player.getStrength());
    }

    public void printString(String toBePrinted){
        System.out.println(toBePrinted);
        return;
    }
}
