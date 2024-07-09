package Utility;

import java.util.Scanner;

public class InputHandler {
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
