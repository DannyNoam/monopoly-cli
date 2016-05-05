package monopoly.action;

import com.google.inject.Singleton;

import monopoly.player.MonopolyPlayerController;

@Singleton
public class EndTurnAction extends MonopolyAction {
    
    private final MonopolyPlayerController monopolyPlayerController = injector.getInstance(MonopolyPlayerController.class);
    
    @Override
    public void execute() {
        monopolyPlayerController.advanceTurn();
    }
}
