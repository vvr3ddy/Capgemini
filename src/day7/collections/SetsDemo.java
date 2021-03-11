package day7.collections;

import java.util.*;


class E {
	String s;
	int i;
	public E(String s, int i) {
		super();
		this.s = s;
		this.i = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		E other = (E) obj;
		if (i != other.i)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	
}
public class SetsDemo {
	public static void main(String[] args) {
		String str = "hello";
		String s = "Hi";
		String s1 = "A";
		System.out.println(str.hashCode());
		System.out.println(s1.hashCode());
		E e1 = new E("John",1);
		E e2 = new E("John",1);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode()); //we override equals and hashCode methods in the class to ensure that
										   // the hashcode generated is same if the objects have same data
	}
}
