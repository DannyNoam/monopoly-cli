package monopoly.action;

import java.util.HashMap;

public class MonopolyActionFactory {
    
    private static final HashMap<String, MonopolyAction> monopolyActions;
    
    static {
        monopolyActions = new HashMap<>();
        monopolyActions.put("roll-dice", new DiceRollAction());
        monopolyActions.put("end-turn", new EndTurnAction());
        monopolyActions.put("buy-property", new BuyPropertyAction());
    }
    
    private MonopolyActionFactory () {}
    
    public static MonopolyAction getAction(String command) {
        return monopolyActions.get(command);
    }
}
