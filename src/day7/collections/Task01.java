package day7.collections;

import java.util.*;

public class Task01 {
	public static void main(String[] args) {
		ArrayList<String> project1 = new ArrayList<String>();
		ArrayList<String> project2 = new ArrayList<String>();

		project1.add("Sachin");
		project1.add("Amit");
		project1.add("Rahul");
		project1.add("Kumar");

		project2.add("Roshan");
		project2.add("Varsha");
		project2.add("Sachin");
		project2.add("Amit");
		project2.add("Amar");

		System.out.println(project1);
		System.out.println(project2);

		project2.removeAll(project1);
		System.out.println(project2);

		project2.addAll(project1);
		System.out.println(project2);

		Collections.sort(project2);
		System.out.println("Ascending Order:" + project2);

		Collections.sort(project2, Collections.reverseOrder());
		System.out.println("Descending order:" + project2);
	}
}
