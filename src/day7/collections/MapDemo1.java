/*
 * Iterations on Maps
 */

package day7.collections;

import java.util.*;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Key1", "Value1");
		map.put("Key2", "Value2");
		map.put("Key3", "Value3");
		map.put("Key1", "Value4"); // Duplicate Key --Overrides the value at key
		map.put("Key4", "Value1"); // Duplicate Value is allowed
		System.out.println("HashMap:" + map); // Order is based on the generated Hash
		System.out.println();
		for (String key : map.keySet()) {
			System.out.printf("%-10s %-10s \n", key, map.get(key));
//			System.out.println("Value:" + map.get(key));
		}
		System.out.println();
		System.out.println("Values in the Map");
		for (String val : map.values()) {
			System.out.println(val);
		}
		System.out.println("Using Map.Entry:");
		for (Map.Entry<String, String> m : map.entrySet()) {
			//System.out.println(m); -- Valid
				
			System.out.printf("%-10s%-10s\n", m.getKey(), m.getValue());
		}
	}
}
