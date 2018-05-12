package Entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by orange2652@gmail.com on 2018. 4. 28.
 * Github : https://github.com/myeongkwonhwang
 */
public class CardDeck {
    public Stack<Card> cards;
    public List<Card> tmpCards;
    private static final String[] PATTERNS = {"Heart", "Diamond", "Spade", "Clover"};
    private static final int CARD_CNT = 13;


    public CardDeck(){
        this.makeCardPattern();
        this.cardSuffle();
    }

    private void cardSuffle() {
        while (tmpCards.size() != 0){
            int idx = (int) (Math.random() * tmpCards.size());
            if(tmpCards.size() <= 2) tmpCards.get(idx).setIdx(true);

            cards.push(tmpCards.get(idx));
            tmpCards.remove(idx);
        }
    }

    private void makeCardPattern() {
        tmpCards = new LinkedList<>();
        cards = new Stack<>();
        for(String pattern : PATTERNS){
            this.makeCard(pattern, tmpCards);
        }
    }

    private void makeCard(String pattern, List<Card> tmpCards) {
        for (int i = 1; i <= CARD_CNT; i++){
            Card card = new Card(pattern, this.MakeCardNum(i), this.checkCardPoint(i));
            tmpCards.add(card);
        }
    }

    private String MakeCardNum(int i) {

        if(i == 1){
            return "A";
        }else if(i == 11){
            return "J";
        }else if(i == 12){
            return "Q";
        }else if(i == 13){
            return "K";
        }

        return String.valueOf(i);
    }

    private int checkCardPoint(int i) {

        if(i > 9) return 10;

        return i;
    }

}
