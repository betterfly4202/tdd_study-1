package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class Gammer extends AbstractGameUser{
    public List<Card> gammerCardList = null;

    public Gammer(){
        gammerCardList = new ArrayList<>();
    }

    @Override
    public void cardReceive(Card card, String user) {
        card.setOwner(user);
        gammerCardList.add(card);
    }
}
