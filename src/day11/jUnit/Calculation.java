package day11.jUnit;

public class Calculation {
	int add(int a, int b) {
		int res = 0;
		if (a >= 0 && b >= 0)
			res = a + b;
		return res;
	}
	boolean nameTest(String name) {
		return name.startsWith("a");
	}
	
	boolean checkPalin(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString().equals(str);
	}
}
