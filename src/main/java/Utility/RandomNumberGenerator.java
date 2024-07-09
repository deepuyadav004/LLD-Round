package main.java.Utility;

import java.util.Random;

public class RandomNumberGenerator {
    Random random = new Random();

    public RandomNumberGenerator() {
    }

    /*
    * This function will generate random number between 1 and limit inclusive.
    * This function will be used when user provide a upper limit of attack, strength, health
    * */
    public long generateRandomNumber(long limit){
        if(limit < 1){
            throw new IllegalArgumentException("Limit cannot be negative");
        }
        return random.nextLong(limit)+1;
    }

    /*
    * By default this function will be used.
    * It will generate random number between 1 and 1000 inclusive
    * */
    public long generateRandomNumber(){
        return random.nextLong(1000)+1;
    }
}
