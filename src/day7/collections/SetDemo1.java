package day7.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
	
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(100);
		s.add(100);
		s.add(1000);
		s.add("a");
		s.add("A");
		s.add(95);
		System.out.println(s); //stored based on hashcode
		
		Set s1 = new LinkedHashSet();
		s1.add(1);
		s1.add(100);
		s1.add(100);
		s1.add(2);
		System.out.println(s1); //maintains insertion order
		
		
		TreeSet s2 = new TreeSet();
		s2.add(100); // uses a sorted order
	}
}
