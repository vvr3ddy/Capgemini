package day5.tasks;

public class Task01 {
	public static void main(String[] args) {
		String s = "Hello World";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println();
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i'
					|| s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u') {

			} else
				System.out.print(s.charAt(i));
		}
		System.out.println();

		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1) {
				System.out.print(s.charAt(i));
			} else {
				if (s.charAt(i) == s.charAt(i + 1)) {

				} else {
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}
