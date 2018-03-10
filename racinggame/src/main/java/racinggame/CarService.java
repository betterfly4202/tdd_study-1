package racinggame;

/**
 * Created by orange2652@gmail.com on 2018. 3. 10.
 * Github : https://github.com/myeongkwonhwang
 */
public interface CarService {

    void roundChange(Car car);
    int moveRandom();
    boolean moveYn();
    void move(Car car);

}
