package java8time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateEx {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		
//		int year = localDate.get(ChronoField.YEAR);
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		DayOfWeek week = localDate.getDayOfWeek();
		// 判断是否是闰年
		boolean isYear = localDate.isLeapYear();
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(isYear);
		
		localDate = localDate.minusDays(3).minusYears(1).minusMonths(2);
		localDate = localDate.plusDays(3);
		System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
					
	}

}
