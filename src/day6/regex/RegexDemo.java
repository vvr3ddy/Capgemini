package day6.regex;

import java.util.regex.*;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		String pattern = "a{2,}+";
		Pattern p1 = Pattern.compile(pattern);
		Matcher m1 = p1.matcher("1234 Haahaha");
		while(m1.find()) {
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
	}
}
