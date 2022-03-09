package DateTest;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateParseEx {

	public static void main(String[] args) throws ParseException {
		/**
		 * 
		 * String ---> Date  
		 */
		
//		String time1 = "2018-04-23";
		String time1 = "2018年04月23日 星期一";
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		// 会有一个错误 如果不匹配
		// 字符串日期解析成  Date对象
		Date date = dateFormat.parse(time1);
		System.out.println(date);
		
		
		String time2 = "2018-4-23 21:52:30";
		DateFormat dateFormat2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		System.out.println(dateFormat2.parse(time2));
		
		String time3 = "2018/04/23 21:31:30";
		DateFormat simple = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		System.out.println(simple.format(new Date()));
		System.out.println(simple.parse(time3));
		
		 
	}

}
