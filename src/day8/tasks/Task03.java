package day8.tasks;

class Employee {
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void validate() throws Exception {
		try {
			if (firstName == null || lastName == null) {
				throw new NullPointerException("Entry Missing");
			}
			if (firstName.length() < 3 || lastName.length() < 3) {
				throw new InvalidNameException("Name should be minimum 3 characters");
			}
			System.out.println("Valid name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class InvalidNameException extends Exception {
	public InvalidNameException(String msg) {
		super();
	}
}

public class Task03 {
	public static void main(String[] args) throws Exception {
		Employee employee = new Employee(null, "abcd");
		employee.validate();
	}
}
