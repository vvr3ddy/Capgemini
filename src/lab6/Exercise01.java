/*
 * Exercise 01 of Lab 6
 *  Create a method which accepts a hash map and return the values of the map in
 *  sorted order as a List.
 */

package lab6;

import java.util.*;

public class Exercise01 {
	public static List getValues(HashMap mapName) {
		List values = new ArrayList();
		for (Object o : mapName.values()) {
			values.add(o);
		}
		Collections.sort(values);
		return values;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		read.nextLine();
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i<size; i++) {
			String key = read.nextLine();
			int value = read.nextInt();
			read.nextLine();
			map.put(key, value);
		}
		
		List res = getValues(map);
		for (Object o : res) {
			System.out.println(o.toString());
		}
	}
}
