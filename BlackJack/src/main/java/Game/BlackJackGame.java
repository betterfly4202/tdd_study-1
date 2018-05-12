package Game;

import Entity.CardDeck;
import Entity.Dealer;
import Entity.Gammer;
import Entity.Rule;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class BlackJackGame {

    public static void main(String[] args) throws Exception {

        boolean gameEnd = false;

        BlackJackGameServiceImpl blackJackGame = new BlackJackGameServiceImpl();
        CardDeck cardDeck = new CardDeck();
        Rule rule = new Rule();
        Gammer gammer = new Gammer();
        Dealer dealer = new Dealer();

        //BlackJack init
        blackJackGame.gameStart(cardDeck, rule, gammer, dealer);


        /*
        while(!gameEnd){
            rule.checkPoint(gammer, dealer);
        }
        */

        //Print
        rule.cardPrint(gammer, dealer);

    }

}
