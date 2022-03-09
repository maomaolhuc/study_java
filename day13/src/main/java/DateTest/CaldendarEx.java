package DateTest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class CaldendarEx {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance(); 
//		System.out.println(calendar.get(Calendar.YEAR));
//		System.out.println(calendar.get(Calendar.MONTH) + 1); // 0-11
//		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		// System.out.println(calendar.get(Calendar.DAY_OF_WEEK) - 1); // 星期从1开始第一天是星期天 
		
		// 自己写一个获取 星期几的方法
		// System.out.println(getWeek(calendar.get(Calendar.DAY_OF_WEEK)));
		
//		calendar.set(2019, 9, 01);
//		calendar.setTimeInMillis(System.currentTimeMillis());
//		System.out.println(calendar.get(Calendar.YEAR));
//		System.out.println(calendar.get(Calendar.MONTH) + 1); // 0-11
//		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		calendar.add(Calendar.YEAR, 1);
		System.out.println(calendar.get(Calendar.YEAR));
		
		
	}
	
	public static String getWeek(int i){
		String[] weeks = {"","星期7","星期1","星期2","星期3","星期4","星期5","星期6"};
		return weeks[i];
	}

}

























