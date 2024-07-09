package Utility.InputHandler;
import java.util.Scanner;

public class InputHandler implements InputHandlerInterface {
    private Scanner scanner;

    public InputHandler(){
        scanner = new Scanner(System.in);
    }

    public String inputString(){
        String userInput = scanner.nextLine();
        return userInput;
    }

    public long integerInput(){
        long userInput = scanner.nextLong();
        return userInput;
    }
}
