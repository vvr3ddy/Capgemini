/*
 *  Task04: Create a java program to read the names from a given text file
 *  and perform regular expressions on them.
 */

package day14.Tasks;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task04 {
	public static List<String> populateNames() throws Exception {
		return Files.lines(Paths.get("names.txt")).limit(50).collect(Collectors.toList());
		
	}

	public static void main(String[] args) throws Exception {
		List<String> names = populateNames();
		System.out.println("Names ending with vowels");
		List<String> l1 = endWithVowel(names);
		l1.forEach(System.out::println);
		
		System.out.println("Names with length >5 char:");
		List<String> l2 = lenGreaterThan5(names);
		l2.forEach(System.out::println);
	}

	public static List<String> endWithVowel(List<String> list) {
		List<String> endWithVow = new ArrayList<String>();
		String regex = "[aeiouAEIOU]$";
		Pattern p = Pattern.compile(regex);
		for (String s : list) {
			Matcher m = p.matcher(s);
			if (m.find()) {
				endWithVow.add(s);
			}
		}
		return endWithVow;
	}

	public static List<String> lenGreaterThan5(List<String> list) {
		List<String> res = new ArrayList<>();
		String regex = "^[\\w]{5,}";
		Pattern p = Pattern.compile(regex);
		for(String l:list) {
			Matcher m = p.matcher(l);
			if(m.find()) {
				res.add(l);
			}
		}
		return res;
	}
}
