package Game;

import Entity.CardDeck;
import Entity.Dealer;
import Entity.Gammer;
import Entity.Rule;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public interface BlackJackGameService {

    //gameStart
    void gameStart(CardDeck cardDeck, Rule rule, Gammer gammer, Dealer dealer) throws Exception;

    void init(CardDeck cardDeck, Gammer gammer, Dealer dealer) throws Exception;
}
