package racing;

public class Car implements  CarService{

	private String carName = "";
	private int location = 1;
	
	
	public Car(String carName) {
		this.carName = carName;
	}

	@Override
	public void go() {
		this.location += 1;
	}

	@Override
	public int recordLocation() {
		return this.location;
	}

	@Override
	public String recordCarName() { return this.carName; }

}
