package monopoly.action;

import monopoly.player.MonopolyPlayerController;

public class BuyPropertyAction extends MonopolyAction {
    
    private final MonopolyPlayerController monopolyPlayerController = injector.getInstance(MonopolyPlayerController.class);

    @Override
    public void execute() {
        monopolyPlayerController.buyProperty();
    }

}
