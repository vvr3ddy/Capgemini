package day5;

public class MutableDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("sb="+sb);
		sb.append("HELLO");
		System.out.println("sb="+sb);
	}
}
