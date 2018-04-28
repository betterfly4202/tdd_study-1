package racing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by orange2652@gmail.com on 2018. 4. 6.
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingGame implements RacingGameService {
    HashMap<Integer, Record> recordMap = new HashMap<>();;

    public RacingGame() {}

    @Override
    public void gameStart(String[] users, int roundCnt) {

        for (int i = 0; i < users.length; i++) {
            Car carUser = new Car(users[i]);
            nextRound(carUser, roundCnt);
        }
    }

    @Override
    public void nextRound(Car carUser, int roundCnt) {
        int round = 0;
        while ( roundCnt != 9 ) {
            goAndRecord(carUser, round);
            round++;
            roundCnt--;
        }

    }

    public void goAndRecord(Car carUser, int round) {
        if (moveYn() == true && round != 0) { carUser.go(); }
        carHistoryRecord(carUser,carUser.recordLocation(),round);
    }

    private void carHistoryRecord(Car carUser, int recordLocation, int round) {
        Record carRecord = new Record(carUser.recordCarName(), recordLocation, round);
        recordMap.put(round, carRecord);
    }

    @Override
    public boolean moveYn() {
        if( moveRandom() > 3 ) return true;
        return false;
    }

    @Override
    public int moveRandom() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
