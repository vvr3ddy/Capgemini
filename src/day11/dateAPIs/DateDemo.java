/*
 * 
 */

package day11.dateAPIs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-YYYY W M w ");
		System.out.println("Date:" + ld.format(dtf1));
		System.out.println();
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtf4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtf5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Localized FULL:" + ld.format(dtf2));
		System.out.println("Localized LONG:" + ld.format(dtf3));
		System.out.println("Localized MEDIUM:" + ld.format(dtf4));
		System.out.println("Localized SHORT:" + ld.format(dtf5));
	}
}
