package monopoly.player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MonopolyPlayerController {
    
    private final List<AbstractMonopolyPlayer> playerTurns = new ArrayList<>();
    private final Iterator<AbstractMonopolyPlayer> playersIterator = Iterables.cycle(playerTurns).iterator();
    
    private AbstractMonopolyPlayer currentPlayer;
    
    @Inject
    public MonopolyPlayerController(AbstractMonopolyPlayer playerOne, AbstractMonopolyPlayerBot playerTwo) {
        currentPlayer = playerOne;
        playerTurns.add(playerOne);
        playerTurns.add(playerTwo);
    }
    
    public void advanceTurn() {
        currentPlayer = playersIterator.next();
    }
    
    public void setPlayerDiceRoll(int rollNumber) {
        currentPlayer.updateBoardPosition(rollNumber);
    }
}
