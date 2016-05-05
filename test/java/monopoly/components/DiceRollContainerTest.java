package monopoly.components;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.mockito.Mockito;

public class DiceRollContainerTest {
    
    private static final int DICE_ROLL_NUMBER_ONE = 4;
    private static final int DICE_ROLL_NUMBER_TWO = 4;
    
    private static final DiceRollContainer diceRollContainer = new DiceRollContainer(DICE_ROLL_NUMBER_ONE, DICE_ROLL_NUMBER_TWO);
    
    @Test
    public void test_getRollNumber() {
        int rollNumber = diceRollContainer.getRollNumber();
        int expected = DICE_ROLL_NUMBER_ONE + DICE_ROLL_NUMBER_TWO;
        
        assertEquals(expected, rollNumber);
    }
    
    @Test
    public void test_hasRolledDouble() {
        boolean rolledDouble = diceRollContainer.hasRolledDouble();
        
        assertTrue(rolledDouble);
    }
    
}
