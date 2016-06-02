package monopoly.player;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Iterables;

import monopoly.board.MonopolyBoard;
import monopoly.board.MonopolyBoardProperty;

public abstract class AbstractMonopolyPlayer { 
    
    private final MonopolyBoard monopolyBoard = MonopolyBoard.getInstance();
    private final List<MonopolyBoardProperty> monopolyBoardProperties = monopolyBoard.getMonopolyProperties();
    private final Iterator<MonopolyBoardProperty> monopolyBoardIterator = Iterables.cycle(monopolyBoardProperties).iterator();
    private MonopolyBoardProperty currentProperty;
    
    public abstract boolean isHuman();
    
    public void updateBoardPosition(int diceRoll) {
        for(int i = 1; i < diceRoll; i++) {
            monopolyBoardIterator.next();
        }
        currentProperty = monopolyBoardIterator.next();
        currentProperty.addPlayer(this);
    }

    public void buyProperty() {
        currentProperty.buyProperty(this);
    }
}
