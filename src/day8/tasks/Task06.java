package day8.tasks;

public class Task06 {
	public String repeatFront(String str, int n) {
		StringBuilder res = new StringBuilder();
		res.append(str.substring(0, n));
		while(n>0) {
			res.append(str.substring(0, n-1));
			n--;
		}
		return res.toString();
	}
	public static void main(String[] args) {
		Task06 t6 = new Task06();
		System.out.println(t6.repeatFront("Ice Cream", 2));
	}
}
