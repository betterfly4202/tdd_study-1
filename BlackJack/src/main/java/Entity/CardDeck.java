package Entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by orange2652@gmail.com on 2018. 4. 28.
 * Github : https://github.com/myeongkwonhwang
 */
public class CardDeck {
    private static final String[] PATTERNS = {"Heart", "Diamond", "Spade", "Clover"};   // 카드모양
    private static final int CARD_CNT = 13;                                             // 카드숫자

    public Stack<Card> cards;       //섞여있는 카드덱(Stack)
    public List<Card> tmpCards;     //섞이이전 카드덱(LinkedList)

    public CardDeck(){
        this.makeCardPattern();
        this.cardSuffle();
    }

    private void cardSuffle() {
        while (tmpCards.size() != 0){
            int idx = (int) (Math.random() * tmpCards.size());
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

    public Card drawingCard() {
        return cards.pop();
    }
}
