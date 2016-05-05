package monopoly.components;

import java.util.Random;

public class Dice implements AbstractDice {
    
    private final Random random = new Random();

    @Override
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
