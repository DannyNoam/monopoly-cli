package monopoly.board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Iterables;

import monopoly.board.property.*;
import monopoly.player.AbstractMonopolyPlayer;

public class MonopolyBoard {
    
    private final List<MonopolyBoardProperty> monopolyBoardProperties = new ArrayList<>();
    private static MonopolyBoard instance = null;
    private final Iterator<MonopolyBoardProperty> boardIterator = Iterables.cycle(monopolyBoardProperties).iterator();
    
    private MonopolyBoard() {
        monopolyBoardProperties.add(new OldKentRoad());
        monopolyBoardProperties.add(new WhitechapelRoad());
    }
    
    public static MonopolyBoard getInstance() {
        if(instance == null) {
            instance = new MonopolyBoard();
        }
        
        return instance;
    }

    public void updateBoardPosition(AbstractMonopolyPlayer abstractMonopolyPlayer, int diceRoll) {
        for(int i = 1; i < diceRoll; i++) {
            boardIterator.next();
        }
        MonopolyBoardProperty monopolyBoardProperty = boardIterator.next();
        monopolyBoardProperty.addPlayer(abstractMonopolyPlayer);
    }
    
    public List<MonopolyBoardProperty> getMonopolyProperties() {
        return monopolyBoardProperties;
    }
    
}
