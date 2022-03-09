package java8time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		System.out.println(localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
		System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
		
		// 把string 变成localdate  进行日期的加减
		String time1 = "2018-04-23";
		LocalDate t = LocalDate.parse(time1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(t);
	}

}
