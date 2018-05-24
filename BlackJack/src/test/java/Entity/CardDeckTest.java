package Entity;

import org.junit.*;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class CardDeckTest {

    CardDeck cardDeck;

    //초기화
    @Before
    public void setUp(){
        cardDeck = new CardDeck();
    }

    //카드덱 생성시 사이즈 체크
    @Test
    public void cardDeckSizeTest(){
        assertThat(cardDeck.cards, hasSize(52));
        System.out.println(cardDeck.cards.toString());
    }

    //카드덱 1점 미만 10점 초과 점수 확인
    @Test
    public void cardDeckPointTest(){
        for (Card card: cardDeck.cards) {
            boolean point = false;
            if(card.getCardPoint() <= 10 && card.getCardPoint() >= 1) point = true;
            assertTrue(point);
        }
    }

    //영문 카드번호 점수 확인
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

    //카드덱 스택에서 뺄때 첫 두장만 뷰플래그 확인
    @Test
    public void cardDeckIdxTest(){
        for (int i=0; i < 2; i ++){
            Card card = cardDeck.cards.pop();
            assertTrue(card.isViewFlag());
        }
    }

    //카드덱에서 카드뽑을 때 card객체가 나오는지....
    @Test
    public void cardDeckPopTest(){
        assertThat(cardDeck.drawingCard(), isA(Card.class));
        assertThat(cardDeck.cards.size(), is(52));
    }
}
