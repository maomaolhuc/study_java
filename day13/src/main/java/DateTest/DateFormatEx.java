package DateTest;

import java.util.Date;
import java.text.DateFormat;

public class DateFormatEx {

	public static void main(String[] args) {
		Date date = new Date();
		 System.out.println(date);
		
		
		// DateFormat格式化日期对象的 
		// getDateInstance  只有年月日星期
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dateFormat.format(date));
		
		// getDateTimeInstance  年月日时分秒
		DateFormat dateTime = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(dateTime.format(date));
	}

}
