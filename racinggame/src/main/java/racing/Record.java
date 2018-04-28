package racing;

/**
 * Created by orange2652@gmail.com on 2018. 4. 6.
 * Github : https://github.com/myeongkwonhwang
 */
public class Record {

    private String carName = "";
    private int locationHistory = 0;
    private int round = 0;

    Record(String carName, int recordLocation, int round){
        this.round = round;
        this.carName = carName;
        this.locationHistory = recordLocation;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
