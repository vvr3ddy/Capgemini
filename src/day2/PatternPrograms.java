package day2;

public class PatternPrograms {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(j==0||i==0||j==3||i==3) {
					System.out.print("* ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j <= i)
					System.out.print(j + 1 + " ");
			}
			System.out.println();
		}

	}
}
