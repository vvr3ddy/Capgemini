package day10.dateAPIs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo01 {
	public static void main(String[] args) throws ParseException {
		System.out.println("Today\'s date is:" + LocalDate.now());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.parse(LocalDate.now().toString()));

		LocalDate date = LocalDate.now();
		System.out.println("Today is :" + date.getDayOfWeek());
		System.out.println("Today is :" + date.getDayOfMonth() + " day of the month");
		System.out.println("Today is :" + date.getDayOfYear() + " day of the year");
		System.out.println("It is :" + date.getMonth() + " month");
		System.out.println();
		System.out.println("Addition operations on dates");
		System.out.println("After 100 days from today it will be :" + date.plusDays(100).getDayOfWeek());
		System.out.println("After 10 weeks from now the date will be:" + date.plusWeeks(10));
		System.out.println();
		System.out.println("Substraction operations on dates");
		System.out.println("Two weeks ago it was:" + date.minusWeeks(2));
	}
}
