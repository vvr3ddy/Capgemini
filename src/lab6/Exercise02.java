/*
 * Exercise 02 of lab 6
 * Create a method that accepts a character array and count the number of
 * times each character is present in the array.
 */
package lab6;

import java.util.*;

public class Exercise02 {

	public static Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> freq = new HashMap<>();

		for (char c : arr) {
			if (c == '\s') {
				continue;
			}
			if (!freq.containsKey(c)) {
				freq.put(c, 1);
			} else {
				freq.put(c, freq.get(c) + 1);

			}
		}

		return freq;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String sentence = read.nextLine();

		char[] ch = sentence.toCharArray();

		Map<Character, Integer> freq = countChars(ch);

		System.out.printf("%-10s\t%-10s%n", "Character", "Frequency");

		for (Map.Entry<Character, Integer> entries : freq.entrySet()) {
			System.out.printf("%-10s\t%-10s%n", entries.getKey().toString(), entries.getValue().toString());
		}
	}
}
