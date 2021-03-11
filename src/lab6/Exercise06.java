/*
 * Exercise 06 of lab 6
 * Create a method which accepts the id and the age of people as a Map and decide if
 * they are eligible for vote. A person is eligible for vote if his age is greater than 18. Add the IDs of
 * all the eligible persons to list and return the list
 * 
 * Sample Output:
 * Enter the population of area:
 * 3
 * Enter the id of person 1:
 * 1
 * Enter the dob (in dd-MM-yyyy) of person 1:
 * 01-01-2000
 * Enter the id of person 2:
 * 2
 * Enter the dob (in dd-MM-yyyy) of person 2:
 * 10-12-2005
 * Enter the id of person 3:
 * 3
 * Enter the dob (in dd-MM-yyyy) of person 3:
 * 01-01-1990
 * Details of voters in the area:
 * 1         	01-01-2000          
 * 2         	10-12-2005          
 * 3         	01-01-1990          
 * Eligible Voters List:
 * 1
 * 3
 * 
 */



package lab6;

import java.text.ParseException;
import java.time.*;
import java.text.*;
import java.util.*;

public class Exercise06 {
	public static boolean calculateAgeOnDate(Date date) {

		Instant instant = date.toInstant();
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate givenDate = zone.toLocalDate();
		Period period = Period.between(givenDate, LocalDate.now());

		return period.getYears() >= 18 ? true : false;
	}

	public static List<Integer> votersList(HashMap<Integer, Date> areaList) {
		List<Integer> voters = new ArrayList<>();
		Date date;
		for (Map.Entry<Integer, Date> voter : areaList.entrySet()) {
			date = voter.getValue();
			if (calculateAgeOnDate(date)) {
				voters.add(voter.getKey());
			}
		}
		return voters;
	}

	public static void main(String[] args) throws ParseException {

		Scanner read = new Scanner(System.in);

		System.out.println("Enter the population of area:");
		int size = read.nextInt();

		String dob = "";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date;
		int id = 0;
		HashMap<Integer, Date> areaList = new HashMap<>();
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the id of person " + (i + 1) + ":");
			id = read.nextInt();
			read.nextLine();
			System.out.println("Enter the dob (in dd-MM-yyyy) of person " + (i + 1) + ":");
			dob = read.nextLine();
			date = formatter.parse(dob);
			areaList.put(id, date);
		}
		
		List<Integer> ids = votersList(areaList);
		
		System.out.println("Details of voters in the area:");
		System.out.printf("%-10s\t%-20s%n","Voter ID","Date of Birth");
		
		for (Map.Entry<Integer, Date> voter : areaList.entrySet()) {
			System.out.printf("%-10s\t%-20s%n", voter.getKey(), formatter.format(voter.getValue()).toString());
		}
		
		System.out.println("Eligible Voters List:");
		for (int i : ids) {
			System.out.println(i);
		}
		
	}

}