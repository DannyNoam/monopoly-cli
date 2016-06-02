package monopoly.board;

import java.util.ArrayList;
import java.util.List;

import monopoly.player.AbstractMonopolyPlayer;

public abstract class MonopolyBoardProperty {
    private final List<AbstractMonopolyPlayer> monopolyPlayers = new ArrayList<>();
    private AbstractMonopolyPlayer owner;
    
    public void addPlayer(AbstractMonopolyPlayer abstractMonopolyPlayer) {
        monopolyPlayers.add(abstractMonopolyPlayer);
    }
    
    public List<AbstractMonopolyPlayer> getPlayers() {
        return monopolyPlayers;
    };
    
    public boolean buyProperty(AbstractMonopolyPlayer abstractMonopolyPlayer) {
        if(owner == null) {
            owner = abstractMonopolyPlayer;
            return true;
        }
        
        return false;
    }
    
    public AbstractMonopolyPlayer getOwner() {
        return owner;
    }
}
