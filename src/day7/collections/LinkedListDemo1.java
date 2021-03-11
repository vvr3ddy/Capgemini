package day7.collections;

import java.util.*;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add(10);
		list.addFirst(100);
		System.out.println(list);
		
		list.addLast(2000);
		list.add(100);
		System.out.println("list:"+list);
	}

}
