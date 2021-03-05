package day3.oops;

class Employee {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1111);
		employee.setName("Mr. John Doe");
		System.out.println("Employee Name:"+employee.getName());
		System.out.println("Employee Id:"+employee.getId());
	}

}
