package racing;

/**
 * Created by orange2652@gmail.com on 2018. 4. 6.
 * Github : https://github.com/myeongkwonhwang
 */
public interface RacingGameService {

    void gameStart(String[] users, int roundCnt);

    void nextRound(Car carUser, int roundCnt);

    boolean moveYn();

    int moveRandom();
}
