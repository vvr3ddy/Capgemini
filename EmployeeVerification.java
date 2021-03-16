package Main01;

import java.util.stream.*;
import java.util.*;
import Main01.EmployeeInfo.SortMethod;

class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary + ">");
		return sb.toString();
	}
}

class EmployeeInfo {
	enum SortMethod {
		BYNAME, BYSALARY;
	}

	public List<Employee> sort(List<Employee> emps, final SortMethod method) {

		if (method == SortMethod.BYNAME) {
			return emps.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		} else {
			return emps.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
					.collect(Collectors.toList()); // important to pass test case: Test_SortBySalary
		}
	}

	public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
		return entities.stream().allMatch(e -> e.getName().toUpperCase().startsWith(character.toUpperCase()))
				|| entities.stream().allMatch(e -> e.getName().toUpperCase().endsWith(character.toUpperCase())); 
		//logical or part is important to pass test case: Test_isCharacterWith2E
	}

}

public class EmployeeVerification {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();

		emps.add(new Employee("Andye", 40000));
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Rickie", 40000));
		emps.add(new Employee("Time", 40000));
		emps.add(new Employee("Time", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		System.out.println(ei.isCharacterPresentInAllNames(emps, "A"));
		System.out.println(ei.sort(emps, SortMethod.BYNAME));
		System.out.println(ei.sort(emps, SortMethod.BYSALARY));
	}
}
