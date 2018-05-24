package Entity;

import org.junit.*;

import static org.assertj.core.api.Assertions.*;
/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class CardTest {

    Card card;

    @Before
    public void setUp(){
        card = new Card("Spade","A", 1);
    }

    @Test
    public void cardPatternTest(){
        assertThat(card.getPattern()).isEqualTo("Spade");
    }

    @Test
    public void cardNumTest(){ assertThat(card.getCardNum()).isEqualTo("A"); }

    @Test
    public void cardPointTest(){
        assertThat(card.getCardPoint()).isEqualTo(1);
    }
}
