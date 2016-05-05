package monopoly.action;

import com.google.inject.Guice;
import com.google.inject.Injector;

import monopoly.components.DiceRollController;
import monopoly.modules.ModuleFactory;
import monopoly.player.MonopolyPlayerController;

public abstract class MonopolyAction {
    protected static final Injector injector = Guice.createInjector(ModuleFactory.get("dice-module"), ModuleFactory.get("player-module"));
    protected static final DiceRollController diceRollController = injector.getInstance(DiceRollController.class);
    protected static final MonopolyPlayerController playerController = injector.getInstance(MonopolyPlayerController.class);
    
    public abstract void execute();
}
