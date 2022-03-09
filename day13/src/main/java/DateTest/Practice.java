package DateTest;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Practice {

	public static void main(String[] args) throws ParseException {
		/**
		 *  计算1000天之后是星期几？
		 *  add
		 *  
		 *  计算给定的两个日期差了多少天?
		 *  2018-4-28   2018-10-1 差了多少天？
		 *  1. String --> Date  ---> 毫秒 计算多少天
		 *  
		 *  
		 */
		System.out.println(getDay(10));
		System.out.println(getMinusDay( "2018-5-1", "2018-4-28"));
		
		// 计算时间差
		// jdk1.8之后的
		LocalDate localDate1 = LocalDate.of(2018,4,23);
		LocalDate localDate2 = LocalDate.of(2018,10,1);
		long l = ChronoUnit.DAYS.between(localDate1, localDate2);
		System.out.println(l);
		
		
		
		
		System.out.println(getTotalDay(2018,2));
	}
	
	public static String getDay(int num){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, num);
		return calendar.get(Calendar.YEAR) + "-" 
				+ (calendar.get(Calendar.MONTH)+1) + "-"
				+ calendar.get(Calendar.DAY_OF_MONTH);
	} 
	
	public static int getMinusDay(String time1,String time2) throws ParseException{
	
		Date t1 = DateFormat.getDateInstance(DateFormat.MEDIUM).parse(time1);
		Date t2 = DateFormat.getDateInstance(DateFormat.MEDIUM).parse(time2);
		long s = Math.abs(t1.getTime() - t2.getTime());
		return (int)(s/1000/60/60/24);
	}
	
	public static int getTotalDay(int year, int month){
		// 设定0 获取的是上个月最后一天
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month,0);
		
//		calendar.set(year, month,1);
//		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	

	public static int getFirstDay(int year, int month){
		Calendar calendar = Calendar.getInstance();
		// 当月第一天 
		calendar.set(year, month-1,1);
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
	
}
