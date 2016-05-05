package monopoly.player;

import monopoly.board.MonopolyBoard;

public abstract class AbstractMonopolyPlayer { 
    
    private final MonopolyBoard monopolyBoard = MonopolyBoard.getInstance();
    public abstract boolean isHuman();
    
    public void updateBoardPosition(int diceRoll) {
        monopolyBoard.updateBoardPosition(this, diceRoll);
    }
}
