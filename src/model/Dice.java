package model;

import java.util.Random;

public class Dice {
    private int sides;
    Random random;

    /*
    * This constructor will use to generate dice with user defined number of faces.
    * Basically it will generate a random number between 1 and sides
    * */
    public Dice(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    /*
    * This constructor will be used when user generate a program with default sides.
    * Currently default sides is 6 as given in problem statement
    * */
    public Dice() {
        this.random = new Random();
    }

    /*
    *  roll class will generate random number between 1 to sides and used by our game
    * */
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}