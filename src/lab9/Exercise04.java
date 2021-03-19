package lab9;

interface Car {
	int getYear();
}

class Cars {
	private int makeYear;
	private String modelName;

	public Cars(int makeYear, String modelName) {
		super();
		this.makeYear = makeYear;
		this.modelName = modelName;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}

public class Exercise04 {
	public static void main(String[] args) {
		Cars cars = new Cars(1975, "Ford Mustang");
		Car car = cars::getMakeYear;
		System.out.println(car.getYear());

	}
}
