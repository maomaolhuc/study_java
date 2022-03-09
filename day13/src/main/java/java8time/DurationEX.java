package java8time;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationEX {
	public static void main(String[] args) {
		
		// 获取时间差
		LocalDateTime localDateTime1 = LocalDateTime.now();
		LocalDateTime localDateTime2 = LocalDateTime.of(2018,10,1,0,0,0);
		Duration duration = Duration.between(localDateTime1, localDateTime2);
		System.out.println(duration.toDays());
	}
}
