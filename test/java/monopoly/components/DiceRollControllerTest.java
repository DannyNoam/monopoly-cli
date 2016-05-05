package monopoly.components;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.mockito.Mockito;

public class DiceRollControllerTest {
    
    private static final int DICE_ROLL_NUMBER = 4;
    
    private static final AbstractDice diceOne = Mockito.mock(Dice.class);
    private static final AbstractDice diceTwo = Mockito.mock(Dice.class);
    
    private static final DiceRollController diceRollController = new DiceRollController(diceOne, diceTwo);

    @Before
    public void before() {
        Mockito.when(diceOne.roll()).thenReturn(DICE_ROLL_NUMBER);
        Mockito.when(diceTwo.roll()).thenReturn(DICE_ROLL_NUMBER);
    }
    
    @Test
    public void test_getRollNumber() {
        int rollNumber = diceRollController.getRollNumber();
        int expected = DICE_ROLL_NUMBER * 2;
        
        assertEquals(expected, rollNumber);
    }
    
    @Test
    public void test_hasRolledDouble() {
        boolean rolledDouble = diceRollController.hasRolledDouble();
        
        assertTrue(rolledDouble);
    }
    
}
