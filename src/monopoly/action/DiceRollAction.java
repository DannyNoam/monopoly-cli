package monopoly.action;

import com.google.inject.Guice;
import com.google.inject.Injector;

import monopoly.components.DiceRollController;
import monopoly.modules.DiceModule;
import monopoly.modules.ModuleFactory;
import monopoly.modules.PlayerModule;


public class DiceRollAction implements MonopolyAction {
    
    private final Injector injector = Guice.createInjector(ModuleFactory.get("dice-module"), ModuleFactory.get("player-module"));
    private final DiceRollController diceRollController = injector.getInstance(DiceRollController.class);

    @Override
    public void execute() {
        System.out.println("You have rolled: " + diceRollController.getRollNumber());
        System.out.println("Have you rolled double? " + diceRollController.hasRolledDouble());
        
    }

}
