package racinggame;

import java.util.List;

/**
 * Created by orange2652@gmail.com on 2018. 3. 10.
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingGame {
    //게임 user 초기화
    static void makeUser(List<Car> users, int userCnt) {
        for (int i = 0; i < userCnt; i++){
            Car car = new Car(i);
            users.add(car);
        }
    }

    /**
     * game 시작
     * @param users 각 라운드별 인원(자동차) 리스트
     * @param roundCnt 진행할 라운드 수
     * @param userCnt 게임유저(자동차)
     */
    static void playGame(List<Car> users, int roundCnt, int userCnt) throws CloneNotSupportedException {
        for (int i = 0; i < roundCnt; i++)
            roundeChange(userCnt, users, i);
    }

    /**
     * 라운드 증가
     * @param userCnt
     * @param users
     * @param i
     */
    private static void roundeChange(int userCnt, List<Car> users, int i) throws CloneNotSupportedException {
        int listIdx = i * 3;
        for (int loc = 0; loc < userCnt; loc++){
            Car userCar = users.get(loc+listIdx).clone();
            userCar.roundChange(userCar);
            users.add(userCar);
        }
    }
}
