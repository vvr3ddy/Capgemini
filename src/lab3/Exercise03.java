package lab3;

import java.util.*;

public class Exercise03 {
	static String alterString(String str) {
		char[] s = str.toCharArray();
		for(int i = 0; i<str.length(); i++) {
			if(str.toLowerCase().charAt(i)=='a'
					||str.toLowerCase().charAt(i)=='e'
					||str.toLowerCase().charAt(i)=='i'
					||str.toLowerCase().charAt(i)=='o'
					||str.toLowerCase().charAt(i)=='u') ;
			else {
				if(Character.isUpperCase(str.charAt(i)))
					s[i] = (char) (((str.charAt(i)- 'A'+1)%26)+'A');
				else
					s[i] = (char) (((str.charAt(i)- 'a'+1)%26)+'a');
			}
		}return (new String(s));
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(alterString(read.nextLine()));
	}
}
