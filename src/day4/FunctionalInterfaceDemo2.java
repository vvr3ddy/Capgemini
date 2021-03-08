package day4;

@FunctionalInterface
interface Eligibility {
	String checkAge(int age);
}

public class FunctionalInterfaceDemo2 {
	public static void main(String[] args) {
		Eligibility e = (age) ->{
			if(age>=18) return "YES";
			else return "NO";
		};
		System.out.println(e.checkAge(10));
	}
}
