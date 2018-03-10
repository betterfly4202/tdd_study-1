package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by orange2652@gmail.com on 2018. 3. 10.
 * Github : https://github.com/myeongkwonhwang
 */
public class testCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int userCnt = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int roundCnt = sc.nextInt();

        List<Car> users = new ArrayList<>();


        if(userCnt > 0 && roundCnt > 0) {
            //게임 초기화
            RacingGame.makeUser(users, userCnt);
            //진행
            RacingGame.playGame(users, roundCnt, userCnt);
        }
    }

}
