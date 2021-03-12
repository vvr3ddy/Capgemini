package day8.tasks;

public class Task05 {
	public String repeatEnd(String str, int n) {
		StringBuilder res = new StringBuilder();
		String subst = str.substring(str.length() - n, str.length());
		while (n > 0) {
			res.append(subst);
			n--;
		}
		return res.toString();
	}

	public static void main(String[] args) {
		Task05 t5 = new Task05();
		System.out.println(t5.repeatEnd("Hello",2));
	}
}
