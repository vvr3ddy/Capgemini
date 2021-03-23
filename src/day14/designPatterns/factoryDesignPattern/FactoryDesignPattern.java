package day14.designPatterns.factoryDesignPattern;

interface Car {
	void capacity();

}

class SUV implements Car {

	@Override
	public void capacity() {
		System.out.println("6");

	}

}

class HatchBack implements Car {

	@Override
	public void capacity() {
		System.out.println("4");

	}

}

class Factory {
	Car getCar(String type) {
		if (type.equalsIgnoreCase("SUV")) {
			return new SUV();
		} else if (type.equalsIgnoreCase("HATCHBACK")) {
			return new HatchBack();
		} else {
			return null;
		}
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
		Factory F = new Factory();
		Car car = F.getCar("SUV");
		car.capacity();
	}
}
