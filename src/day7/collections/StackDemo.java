package day7.collections;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		s.add(1);
		s.add(2);
		s.push(3);
		s.push(4);
		
		Enumeration<Integer> en = s.elements();
		while(en.hasMoreElements()) {
			
			System.out.println(en.nextElement());
		}

	}

}
