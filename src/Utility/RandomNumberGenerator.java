package Utility;

import java.util.Random;

public class RandomNumberGenerator {
    Random random = new Random();

    public long generateRandomNumber(long limit){
        if(limit < 1){
            throw new IllegalArgumentException("Limit cannot be negative");
        }
        return random.nextLong(limit+1);
    }

    public long generateRandomNumber(){
        return random.nextLong(1001);
    }
}
