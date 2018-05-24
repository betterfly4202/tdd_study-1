package Entity;

import java.util.Scanner;

/**
 * Created by orange2652@gmail.com on 2018. 5. 12.
 * Github : https://github.com/myeongkwonhwang
 */
public class Rule {

    int gammerPoint = 0;
    int dealerPoint = 0;
    boolean dealerTurn = true; //false - stand
    boolean gammerTurn = true;
    String winName = "";

    public void cardPrint(Gammer gammer, Dealer dealer) {
        System.out.println("DEALER CARD "+dealer.dealerCardList.toString());
        System.out.println("GAMMER CARD "+gammer.gammerCardList.toString());
    }

    public void checkPoint(Gammer gammer, Dealer dealer, CardDeck cardDeck) {
        dealerPoint = dealer.sumMyCardPoint();
        gammerPoint = gammer.sumMyCardPoint();

        this.winChk();
        if(dealerTurn){
            dealer.cardReceive(cardDeck.drawingCard());
        }

        System.out.println("추가로 카드를 받으시겠습니까?");
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        if("1".equals(inputData)){
            gammer.cardReceive(cardDeck.drawingCard());
        }


    }

    private void winChk() {

        if( dealerTurn && dealerPoint >= 17 ){
            dealerTurn = false;
        }

        if( !dealerTurn && dealerPoint > 21 ){
            if (gammerPoint > 21) {
                System.out.println("딜러가 이겼습니다.");
                System.exit(0);
            }else{
                System.out.println("게이머가 이겼습니다.");
                System.exit(0);
            }
        }

        if( gammerPoint > 21){
            System.out.println("딜러가 이겼습니다.");
            System.exit(0);
        }

        if( !dealerTurn && !gammerTurn){
            int gamePoint = gammerPoint - dealerPoint;
            if(gamePoint > 0 ){
                System.out.println("게이머가 이겼습니다.");
                System.exit(0);
            }else{
                System.out.println("딜러가 이겼습니다.");
                System.exit(0);
            }
        }
    }
}
