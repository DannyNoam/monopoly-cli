package monopoly.modules;

import com.google.inject.AbstractModule;
import monopoly.components.AbstractDice;
import monopoly.components.Dice;

public class DiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AbstractDice.class).to(Dice.class);
    }
    
}
