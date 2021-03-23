package day14.Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private String dept;
	private int id;
	private int marks;
	private String name;

	public Student(int id, String name, String dept, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}

	public String getDept() {
		return dept;
	}

	public int getId() {
		return id;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
	}
}

public class Task03 {
	public static List<Student> populateStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Ram", "CSE", 78));
		students.add(new Student(2, "John", "ECE", 85));
		students.add(new Student(3, "Vinay", "MECH", 92));
		students.add(new Student(4, "Krishna", "CSE", 43));
		students.add(new Student(5, "Smriti", "EEE", 38));
		students.add(new Student(6, "Ramesh", "IT", 50));

		return students;
	}

	public static void main(String[] args) {
		List<Student> students = populateStudents();
		System.out.println("List of students");
		System.out.println(students);
		System.out.println("Count of students in CSE" + countCSE(students));
		System.out.println("Sorted Students based on name:");
		List<Student> l1 = sortAscName(students);
		l1.forEach(System.out::println);
		System.out.println("Sorted Students based on name(Desc):");
		List<Student> l2 = sortDescName(students);
		l2.forEach(System.out::println);
		System.out.println("Students who have passed");
	}

	public static long countCSE(List<Student> list) {

		return list.stream().filter(e -> e.getDept().equalsIgnoreCase("cse")).count();
	}

	public static List<Student> sortAscName(List<Student> list) {
		return list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}

	public static List<Student> sortDescName(List<Student> list) {
		return list.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
	}

	public static List<Student> passStudent(List<Student> list) {
		return list.stream().filter(e -> e.getMarks() > 50).collect(Collectors.toList());
	}
}
