package java8time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class DIYAjuster {

	public static void main(String[] args) {
		
		int nextWorkDay = LocalDateTime.now().with(new MyAjust()).getDayOfMonth();
		System.out.println(nextWorkDay);
		
	}

}

/**
 * 看下一个工作日是哪一天
 * @author xq
 *
 */
class MyAjust implements TemporalAdjuster{
	@Override
	public Temporal adjustInto(Temporal temporal) {
		// 获取当前是星期几
		DayOfWeek week = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
		int add = 1;
		if(week == DayOfWeek.FRIDAY)add+=3;
		if(week == DayOfWeek.SATURDAY)add+=2;
		return temporal.plus(add, ChronoUnit.DAYS);
	}
}
