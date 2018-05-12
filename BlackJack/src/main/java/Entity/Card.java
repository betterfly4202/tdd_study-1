package Entity;

/**
 * Created by orange2652@gmail.com on 2018. 4. 28.
 * Github : https://github.com/myeongkwonhwang
 */
public class Card {
    private boolean viewFlag = false;    // 첫번째 카드 노출을 위한 boolean 값
    private String pattern = "";    // card Pattern
    private String cardNum = "";    // card 숫자/문자
    private String owner = "";
    private int cardPoint = 0;      // 카드 point

    public Card(String pattern, String cardNum, int cardPoint){
        this.pattern = pattern;
        this.cardNum = cardNum;
        this.cardPoint = cardPoint;
    }

    public boolean isViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(boolean viewFlag) {
        this.viewFlag = viewFlag;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public int getCardPoint() {
        return cardPoint;
    }

    public void setCardPoint(int cardPoint) {
        this.cardPoint = cardPoint;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String noView(){
        return owner+"Card{" +
                "pattern='" + "****" + '\'' +
                ", cardNum='" + "****" + '\'' +
                '}'+"\n";
    }

    @Override
    public String toString() {
        if(this.owner == "DEALER" && this.isViewFlag())
            return "pattern='" + "****" + '\'' +
                    ", cardNum='" + "****" + '\'';
        return "pattern='" + pattern + '\'' +
                ", cardNum='" + cardNum + '\'';
    }


}
