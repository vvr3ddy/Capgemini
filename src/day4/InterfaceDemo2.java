package day4;

interface Vehicle {
	int A = 10;

	abstract int noOfWheels();
}

interface Chassis {
	int A = 20;
	abstract void chassisType();
	abstract int noOfWheels();
}
interface Engine extends Chassis {
	abstract void engineType();
}
class Car implements Vehicle, Chassis {

	@Override
	public int noOfWheels() {

		return 4;
	}

	@Override
	public void chassisType() {
		// TODO Auto-generated method stub
		
	}

}

class Bike implements Vehicle {

	@Override
	public int noOfWheels() {
		return 2;
	}
}

class Bus implements Vehicle {
	@Override
	public int noOfWheels() {
		return 6;
	}
}
class Truck implements Vehicle,Engine {

	@Override
	public void engineType() {
		// TODO
		
	}

	@Override
	public int noOfWheels() { //common method to Engine and Chassis
		// TODO
		return 0;
	}

	@Override
	public void chassisType() {
		// TODO 
		
	}
	
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Vehicle V = new Car();
		System.out.println(V.A);
	}
}
