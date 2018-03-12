package racinggame;

import java.util.Random;

/**
 * Created by orange2652@gmail.com on 2018. 3. 10.
 * Github : https://github.com/myeongkwonhwang
 */
public class Car implements CarService, Cloneable{
    private int carNum = 0;
    private int position = 0;
    private int round = 0;

    public Car(int carNum){
        this.carNum = carNum;
        this.position = 1; //출발선
        this.round = 0;
        System.out.println(carNum+"유저가 생성되었습니다.");
    }

    @Override
    public void roundChange(Car car) {
        car.round = car.round + 1;
        move(car);
    }

    @Override
    public int moveRandom() {
        Random random = new Random();
        return random.nextInt(10);
    }

    @Override
    public boolean moveYn() {
        int randomValue = moveRandom();
        System.out.println(this.carNum +"차의 random값  : " +randomValue);
        if(randomValue > 3){
            return true;
        }
        return false;
    }

    @Override
    public void move(Car car) {
        System.out.println("차이름 : " +carNum+ ", 차위치 : " +position+ ", 라운드 : "+round);
        if(moveYn() == true)
            car.position = car.position +1;
    }

    @Override
    public void printPosition(Car car){
        System.out.print(car.carNum+"차");
        for (int i = 0; i < car.position; i++)
            System.out.print("-");
            System.out.println();
    }

    //clone interface 구현
    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car cloneCar = (Car) super.clone();
        cloneCar.carNum = this.carNum;
        cloneCar.position = this.position;
        cloneCar.round = this.round;

        return cloneCar;
    }
}
