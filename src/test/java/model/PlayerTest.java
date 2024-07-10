package test.java.model;

import main.java.Utility.RandomNumberGenerator;
import main.java.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    private RandomNumberGenerator randomNumberGenerator;

    @BeforeEach
    public void setUp() {
        randomNumberGenerator = Mockito.mock(RandomNumberGenerator.class);
    }

    @Test
    public void testPlayerConstructorWithCustomValues() {
        Player player = new Player("Player1", 100, 50, 30);
        assertEquals("Player1", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(50, player.getStrength());
        assertEquals(30, player.getAttack());
    }

    @Test
    public void testPlayerConstructorWithInvalidCustomValues() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Player("Player1", 0, 50, 30);
        });
        assertEquals("Invalid Player Input", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Player("Player1", 100, 0, 30);
        });
        assertEquals("Invalid Player Input", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Player("Player1", 100, 50, 0);
        });
        assertEquals("Invalid Player Input", exception.getMessage());
    }

    @Test
    public void testSettersAndGetters() {
        Player player = new Player("Player1", 100, 50, 30);

        player.setName("Player2");
        assertEquals("Player2", player.getName());

        player.setHealth(200);
        assertEquals(200, player.getHealth());

        player.setStrength(80);
        assertEquals(80, player.getStrength());

        player.setAttack(40);
        assertEquals(40, player.getAttack());
    }
}
