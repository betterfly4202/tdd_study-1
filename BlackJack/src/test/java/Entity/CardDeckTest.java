package Entity;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class CardDeckTest {

    CardDeck cardDeck;

    @Before
    public void setUp(){
        cardDeck = new CardDeck();
    }

    @Test
    public void cardDeckSizeTest(){
        assertThat(cardDeck.cards, hasSize(52));
        System.out.println(cardDeck.cards.toString());
    }

    @Test
    public void cardDeckPointTest(){
        for (Card card: cardDeck.cards) {
            boolean point = false;
            if(card.getCardPoint() <= 10 && card.getCardPoint() >= 1) point = true;
            assertTrue(point);
        }
    }

    @Test
    public void cardDeckCardNumMatherCardPoint(){
        for (Card card: cardDeck.cards) {
            if("A".equals(card.getCardNum())){
                assertThat(card.getCardPoint(), is(1));
            }
            if("J".equals(card.getCardNum())){
                assertThat(card.getCardPoint(), is(10));
            }
            if("Q".equals(card.getCardNum())){
                assertThat(card.getCardPoint(), is(10));
            }
            if("K".equals(card.getCardNum())){
                assertThat(card.getCardPoint(), is(10));
            }
        }
    }

    @Test
    public void cardDeckIdxTest(){
        for (int i=0; i < 2; i ++){
            Card card = cardDeck.cards.pop();
            assertTrue(card.isViewFlag());
        }
    }

    @Test
    public void cardDeckPopTest(){
        assertThat(cardDeck.drawingCard(), isA(Card.class));
    }
}
