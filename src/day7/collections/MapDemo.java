package day7.collections;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Key1", "Value1");
		map.put("Key2", "Value2");
		map.put("Key3", "Value3");
		map.put("Key1", "Value4"); // Duplicate Key --Overrides the value at key
		map.put("Key4", "Value1"); // Duplicate Value is allowed
		System.out.println("HashMap:" + map); // Order is based on the generated Hash
		System.out.println();
		
		
		LinkedHashMap<String, String> map1 = new LinkedHashMap<String, String>();
		map1.put("Key1", "Value1");
		map1.put("Key2", "Value2");
		map1.put("Key3", "Value3");
		map1.put("Key1", "Value4"); // Duplicate Key --Overrides the value at key
		map1.put("Key4", "Value1"); // Duplicate Value is allowed
		System.out.println("LinkedHashMap before replace:" + map1); // sorted based on insertion order
		map1.replace("Key1", "Value10");
		System.out.println("LinkedHashMap:" + map1); // sorted based on insertion order
		System.out.println();
		
		
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		map2.put("Key1", "Value1");
		map2.put("Key2", "Value2");
		map2.put("Key3", "Value3");
		map2.put("Key1", "Value4"); // Duplicate Key --Overrides the value at key
		map2.put("Key4", "Value1"); // Duplicate Value is allowed
		System.out.println("TreeMap:" + map2); // sorted based on keys
	}
}
