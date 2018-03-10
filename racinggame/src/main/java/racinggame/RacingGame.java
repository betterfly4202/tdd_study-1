package racinggame;

import java.util.List;

/**
 * Created by orange2652@gmail.com on 2018. 3. 10.
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingGame {
    static void makeUser(List<Car> users, int userCnt) {
        for (int i = 0; i < userCnt; i++){
            Car car = new Car(i);
            users.add(car);
        }
    }

    static void playGame(List<Car> users, int roundCnt, int userCnt) {
        for (int i = 0; i < roundCnt; i++)
            roundeChange(userCnt, users);
    }

    private static void roundeChange(int userCnt, List<Car> users) {
        for (int loc = 0; loc < userCnt; loc++){
            Car userCar;
            userCar = users.get(loc);
            userCar.roundChange(userCar);
            users.add(userCar);
        }
    }
}
