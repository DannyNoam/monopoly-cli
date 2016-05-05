package monopoly.components;

import java.util.Random;

public class Dice implements AbstractDice {
    
    private final Random rand = new Random();

    @Override
    public int roll() {
        return rand.nextInt(6) + 1;
    }
}
