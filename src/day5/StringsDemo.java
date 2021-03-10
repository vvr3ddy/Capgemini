package day5;

public class StringsDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";

		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println("s1==s2:" + (s1 == s2));
		System.out.println("s1==s3:" + (s1 == s3));
		System.out.println("s3==s4:" + (s3 == s4));
		System.out.println("s1.equals(s3):" + (s1.equals(s3)));
		System.out.println("s3.equals(s4):" + (s3.equals(s4)));
		
		//immutability
		System.out.println("S1:"+s1);
		s1.concat("HELLO");
		// clearly the literal s1 is unchanged, this proves immutability
		System.out.println(s1);
		
		//same happens for s4
		s4.concat("HELLO");
		System.out.println("s4:"+s4);
		
		s1 = s1.concat("HELLO");
		System.out.println("s1:"+s1);
		//the only way to change its value is by assigning a new value to it
		//direct changes on string literals and instances do not affect the value
	}
}
