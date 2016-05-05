package monopoly.action;

import monopoly.components.DiceRollContainer;

public class DiceRollAction extends MonopolyAction {

    @Override
    public void execute() {
        DiceRollContainer diceRollContainer = diceRollController.getDiceRoll();
        playerController.setPlayerDiceRoll(diceRollContainer.getRollNumber());
    }

}
