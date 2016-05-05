package monopoly.modules;

import com.google.inject.AbstractModule;

import monopoly.player.AbstractMonopolyPlayer;
import monopoly.player.AbstractMonopolyPlayerBot;
import monopoly.player.MonopolyPlayer;
import monopoly.player.MonopolyPlayerBot;

public class PlayerModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AbstractMonopolyPlayer.class).to(MonopolyPlayer.class);
        bind(AbstractMonopolyPlayerBot.class).to(MonopolyPlayerBot.class);
    }
    
}
