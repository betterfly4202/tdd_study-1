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
    public void cardReceive(Card card) {
        if(dealerCardList.size() == 0 ) card.setViewFlag(true);
        dealerCardList.add(card);
    }

    @Override
    public int sumMyCardPoint() {
        int sumPoint = 0;
        for (Card card: dealerCardList) sumPoint += card.getCardPoint();

        return sumPoint;
    }
}
