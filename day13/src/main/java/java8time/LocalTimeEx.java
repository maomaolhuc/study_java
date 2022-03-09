package java8time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		
		localTime = localTime.plusHours(3);
		System.out.println(localTime);

	}

}
