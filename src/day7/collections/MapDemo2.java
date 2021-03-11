package day7.collections;

import java.util.*;

class Student {
	private int id;
	private String name;
	private String dept;

	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	// Generate equals and hashCode methods to do comparison and remove duplicates
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class MapDemo2 {
	public static void main(String[] args) {

		HashMap<Student, Integer> studentMarkList = new HashMap<Student, Integer>();
		studentMarkList.put(new Student(1, "John", "Mech"), 80);
		studentMarkList.put(new Student(2, "Sam", "Mech"), 89);
		studentMarkList.put(new Student(3, "Rose", "Mech"), 55);
		studentMarkList.put(new Student(1, "John", "Mech"), 78); // Overridden value if we generate hashCode and equals
																	// method in the Student Class
		studentMarkList.put(new Student(5, "John", "Mech"), 90);

		System.out.printf("%-35s\t%-5s\n", "Student", "Marks");

		for (Map.Entry<Student, Integer> entries : studentMarkList.entrySet()) {
			System.out.printf("%-30s\t%-5d\n", entries.getKey(), entries.getValue());
		}
	}
}
