package day10.streamsapi.employees;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private int age;
	private int salary;

	
	
	public Employee(int id, String name, String dept, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", salary=" + salary + "]";
	}

}
