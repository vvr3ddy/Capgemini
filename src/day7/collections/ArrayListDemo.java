package day7.collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		System.out.println("Elements of o1:"+o1);
		
		ArrayList<Integer> o2 = new ArrayList<Integer>();
		o2.add(3);
		o2.add(4);
		o2.add(100);
		o2.add(101);
		System.out.println("Elements of o2 before addAll():"+o2);
		o2.addAll(o1); // we can directly add a whole collection into the List
		System.out.println("Elements of o2 after addAll():"+o2);
		o2.removeAll(o1);
		System.out.println("Elements of o2 after removeAll():"+o2);
		o2.add(3);
		o2.add(4);
		o2.retainAll(o1);
		System.out.println("Elements of o2 after retainAll():"+o2);
		
	}

}
