package monopoly.action;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;

import monopoly.modules.ModuleFactory;
import monopoly.player.MonopolyPlayerController;

@Singleton
public class EndTurnAction implements MonopolyAction {
    
    private final Injector injector = Guice.createInjector(ModuleFactory.get("player-module"));
    private final MonopolyPlayerController monopolyPlayerController = injector.getInstance(MonopolyPlayerController.class);
    
    @Override
    public void execute() {
        monopolyPlayerController.advanceTurn();
    }
}
