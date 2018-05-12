package Game;

import Entity.CardDeck;
import Entity.Dealer;
import Entity.Gammer;
import Entity.Rule;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class BlackJackGameServiceImpl implements BlackJackGameService {

    @Override
    public void gameStart(CardDeck cardDeck, Rule rule, Gammer gammer, Dealer dealer) throws Exception {
        this.init(cardDeck, gammer, dealer);
    }

    @Override
    public void init(CardDeck cardDeck, Gammer gammer, Dealer dealer) throws Exception {
        for (int i = 0; i < 2; i++){
            dealer.cardReceive(cardDeck.drawingCard(),"GAMMER");
            gammer.cardReceive(cardDeck.drawingCard(),"DEALER");
        }

    }
}
