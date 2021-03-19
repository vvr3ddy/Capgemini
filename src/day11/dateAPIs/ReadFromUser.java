package day11.dateAPIs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class ReadFromUser {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Input date of birth(yyyy-MM-dd):");
		String joiningDate = read.nextLine();
//		DateTimeFormatter format1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		LocalDate date = LocalDate.parse(joiningDate);
//		System.out.println("Formatted Date: " + date.format(format1));
		System.out.println("Your age:" + LocalDate.now().minusYears(date.getYear()).getYear()+" Years");
	}
}
