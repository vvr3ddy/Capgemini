package day4.problem;

class Car {
	private int yearModel;
	private String make;
	private int speed;

	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void accelerate() {
		speed += 5;
	}

	void brake() {
		if (speed >= 5)
			speed -= 5;
	}
}

public class Task1 {
	public static void main(String[] args) {
		Car car = new Car(1965, "Bat Mobile");
		System.out.println("Accelerating");
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();

	}
}
