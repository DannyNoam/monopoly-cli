package monopoly.components;

public class DiceRollContainer {

    private final int diceRollOne;
    private final int diceRollTwo;

    public DiceRollContainer(int diceRollOne, int diceRollTwo) {
        this.diceRollOne = diceRollOne;
        this.diceRollTwo = diceRollTwo;
    }
    
    public int getRollNumber() {
        return diceRollOne + diceRollTwo;
    }
    
    public boolean hasRolledDouble() {
        return diceRollOne == diceRollTwo;
    }
}
