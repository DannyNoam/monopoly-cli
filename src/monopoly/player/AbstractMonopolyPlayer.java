package monopoly.player;

public abstract class AbstractMonopolyPlayer { 
    
    public abstract boolean isHuman();
    
    public void updateBoardPosition(int diceRoll) {
        System.out.println("Updating board position for dice roll" + diceRoll);
    }
}
