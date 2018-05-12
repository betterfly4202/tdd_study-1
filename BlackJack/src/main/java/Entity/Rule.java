package Entity;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class Rule {

    public void cardPrint(Gammer gammer, Dealer dealer) {
        System.out.println("DEALER CARD "+dealer.dealerCardList.toString());
        System.out.println("GAMMER CARD "+gammer.gammerCardList.toString());
    }

    public void checkPoint(Gammer gammer, Dealer dealer) {

    }


}
