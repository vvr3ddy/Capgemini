/*
 * Exercise 04 of lab 6
 * Write a function which accepts the marks of students as a Hashmap and return the details of the
 * students eligible for the medals along with type of medal.
 * The input Hashmap contains the student registration number as key and mark as value.
 * The output Hashmap should contain the student registration number as key and the medal type
 * as value.
 */

package lab6;

import java.util.*;

public class Exercise04 {

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> students) {
		HashMap<Integer, String> medal = new HashMap<>();
		String med = "No Medal";
		int marks = 0;
		for (Map.Entry<Integer, Integer> student : students.entrySet()) {
			marks = Integer.parseInt(student.getValue().toString());
			if (marks >= 90) {
				med = "Gold";
			} else if (marks < 90 && marks >= 80) {
				med = "Silver";
			} else if (marks < 80 && marks >= 70) {
				med = "Bronze";
			}

			medal.put(student.getKey(), med);
		}
		return medal;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter no of students:");
		HashMap<Integer, Integer> students = new HashMap<>();
		int size = read.nextInt();
		int sId = 0;
		int marks = 0;
		while (size > 0) {
			System.out.println("Enter student regId:");
			sId = read.nextInt();
			System.out.println("Enter student marks:");
			marks = read.nextInt();
			students.put(sId, marks);
			size--;
		}
		System.out.println();
		HashMap<Integer, String> medals = getStudents(students);
		System.out.printf("%-10s\t%-5s%n", "Student Id", "Medal");

		for (Map.Entry<Integer, String> medal : medals.entrySet()) {
			System.out.printf("%-10s\t%-5s%n", medal.getKey().toString(), medal.getValue().toString());
		}
	}
}
