package monopoly.board;

import monopoly.player.AbstractMonopolyPlayer;

public class MonopolyBoard {
    
    private static MonopolyBoard instance = null;
    
    public static MonopolyBoard getInstance() {
        if(instance == null) {
            instance = new MonopolyBoard();
        }
        
        return instance;
    }

    public void updateBoardPosition(AbstractMonopolyPlayer abstractMonopolyPlayer, int diceRoll) {
        System.out.println("Updating board position for player. Are they human? " + abstractMonopolyPlayer);
    }
    
}
