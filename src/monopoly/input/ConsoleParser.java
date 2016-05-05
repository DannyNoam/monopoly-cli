package monopoly.input;

import monopoly.action.MonopolyAction;
import monopoly.action.MonopolyActionFactory;

public class ConsoleParser implements AbstractParser {
    
    public void parse(String command) {
        MonopolyAction monopolyAction = MonopolyActionFactory.getAction(command);
        
        if(monopolyAction == null) {
            System.out.println("Unknown command!");
        } else {
            monopolyAction.execute();
        }
    }
}
