package day3.oops;

class Empl {
	String name;
	int id;
	String dept;
	Address address;

	public Empl(String name, int id, String dept, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.address = address;
	}

	public void displayEmpDetails() {
		System.out.println("Name:" + name);
		System.out.println("ID:" + id);
		System.out.println("Dept:" + dept);
		System.out.println("Address:");
		System.out.println("Dno:" + address.dNo);
		System.out.println("Street:" + address.streetName);
		System.out.println("Pin Code:" + address.pincode);
	}
}

class Address {
	int dNo;
	String streetName;
	int pincode;

	public Address(int dNo, String streetName, int pincode) {
		super();
		this.dNo = dNo;
		this.streetName = streetName;
		this.pincode = pincode;
	}

}

public class HasADemo {
	public static void main(String[] args) {
		//method 1
		Address addr = new Address(1234, "ABC", 560054);
		Empl empl = new Empl("John Doe", 123, "IT", addr);
		empl.displayEmpDetails();
		//method 2
		Empl e2 = new Empl("John Doe", 124, "HR", new Address(123, "ABC", 12345));
		e2.displayEmpDetails();

	}
}
