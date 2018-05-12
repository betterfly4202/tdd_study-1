package Entity;

/**
 * Created by orange2652@gmail.com on 2018. 4. 28.
 * Github : https://github.com/myeongkwonhwang
 */
public class Card {
    private boolean idx = false;
    private String pattern = "";
    private String cardNum = "";
    private int cardPoint = 0;

    public Card(String pattern, String cardNum, int cardPoint){
        this.pattern = pattern;
        this.cardNum = cardNum;
        this.cardPoint = cardPoint;
    }

    public boolean isIdx() {
        return idx;
    }

    public void setIdx(boolean idx) {
        this.idx = idx;
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

    @Override
    public String toString() {
        return "Card{" +
                "idx=" + idx +
                ", pattern='" + pattern + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", cardPoint=" + cardPoint +
                '}'+"\n";
    }
}
