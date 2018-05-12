package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class Dealer extends AbstractGameUser{
    public List<Card> dealerCardList = null;

    public Dealer(){
        dealerCardList = new ArrayList<>();
    }

    @Override
    public void cardReceive(Card card, String user) {
        card.setOwner(user);
        dealerCardList.add(card);
    }
}
