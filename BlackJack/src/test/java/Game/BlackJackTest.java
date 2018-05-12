package Game;

import Entity.*;
import Entity.Rule;
import org.hamcrest.Matcher;
import org.junit.*;

import java.util.Collection;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class BlackJackTest {
    CardDeck cardDeck;
    Rule rule;
    Dealer dealer;
    Gammer gammer;
    BlackJackGameServiceImpl blackJackGame;

    @Before
    public void SetUp(){
        cardDeck = new CardDeck();
        rule = new Rule();
        dealer = new Dealer();
        gammer = new Gammer();
        blackJackGame = new BlackJackGameServiceImpl();


    }

    @Test
    public void initGameCardCntTest() throws Exception {
        blackJackGame.gameStart(cardDeck, rule, gammer, dealer);
        assertThat(gammer.gammerCardList, hasSize(2));
        assertThat(dealer.dealerCardList, hasSize(2));
    }
}
