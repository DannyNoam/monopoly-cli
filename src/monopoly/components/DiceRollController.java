package monopoly.components;

import com.google.inject.Inject;

public class DiceRollController {
    
    private final AbstractDice diceOne;
    private final AbstractDice diceTwo;
    
    @Inject
    public DiceRollController(AbstractDice diceOne, AbstractDice diceTwo) {
        this.diceOne = diceOne;
        this.diceTwo = diceTwo;
    }
    
    public DiceRollContainer getDiceRoll() {
        return new DiceRollContainer(diceOne.roll(), diceTwo.roll());
    }
}
