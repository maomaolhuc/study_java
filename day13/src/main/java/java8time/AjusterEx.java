package java8time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class AjusterEx {

	public static void main(String[] args) {
		
		
		LocalDate localDate = LocalDate.now();
		LocalDate first = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		LocalDate time = localDate.with(ChronoField.MONTH_OF_YEAR,6);
		System.out.println(first);
		System.out.println(first.get(ChronoField.DAY_OF_WEEK));
		System.out.println(time);
	}

}
