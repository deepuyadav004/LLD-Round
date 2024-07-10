package test.java.model;

import main.java.model.Dice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    private Dice dice;

    @Test
    public void testRollDiceWithinRange() {
        dice = new Dice(10);
        for (int i = 0; i < 100; i++) {
            int roll = dice.rollDice();
            assertTrue(roll >= 1 && roll <= 10); // Ensure the roll is within the expected range
        }
    }

    @Test
    public void testRollDiceWithDefaultSidesWithinRange() {
        dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.rollDice();
            assertTrue(roll >= 1 && roll <= 6); // Ensure the roll is within the expected range for default sides
        }
    }

    @Test
    public void testDiceConstructorWithInvalidSides() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Dice(0); // Should throw an exception
        });
        assertEquals("Number of sides must be at least 1", exception.getMessage());
    }
}
