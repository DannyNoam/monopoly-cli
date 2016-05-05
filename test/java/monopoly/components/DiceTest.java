package monopoly.components;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {
    
    private static final Dice dice = new Dice();

    @Test
    public void test_roll_not_null() {
        int rollNumber = dice.roll();
        
        assertNotNull(rollNumber);
    }
    
    public void test_roll_returns_num_between_1_to_6() {
        int rollNumber = dice.roll();
        
        assertTrue(rollNumber >= 1 && rollNumber <= 6);
    }
}
