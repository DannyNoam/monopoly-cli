package monopoly.components;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import monopoly.player.MonopolyPlayerController;

@Singleton
public class DiceRollController {
    
    private final AbstractDice diceOne;
    private final AbstractDice diceTwo;
    
    @Inject
    private MonopolyPlayerController monopolyPlayerController;
    
    @Inject
    public DiceRollController(AbstractDice diceOne, AbstractDice diceTwo) {
        this.diceOne = diceOne;
        this.diceTwo = diceTwo;
    }
    
    public int getRollNumber() {
        return diceOne.roll() + diceTwo.roll();
    }
    
    public boolean hasRolledDouble() {
        return diceOne.roll() == diceTwo.roll();
    }

}
