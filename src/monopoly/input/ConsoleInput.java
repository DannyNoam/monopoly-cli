package monopoly.input;

public class ConsoleInput implements AbstractInput {
    
    private static final AbstractParser consoleParser = new ConsoleParser();
    
    public static void main(String args[]) {
        consoleParser.parse("roll-dice");
        consoleParser.parse("end-turn");
        consoleParser.parse("roll-dice");
        consoleParser.parse("roll-dice");
        consoleParser.parse("end-turn");
        consoleParser.parse("roll-dice");
        consoleParser.parse("end-turn");
    }
    
}
