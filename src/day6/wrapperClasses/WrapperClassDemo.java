package day6.wrapperClasses;

public class WrapperClassDemo {
	public static void main(String[] args) {
		int a = 10;
		
		//auto boxing
		Integer a1 = a;  // directly assign the value of a to a1 after jdk 1.5 or above
		Integer a2 = Integer.valueOf(a); // before jdk 1.5 
		Integer x = 200;
		Integer y = 200;
		System.out.println(x==y); //will be true only if the value of Integer object is below 127
		System.out.println(a1);
		System.out.println(a2);
	}
}
