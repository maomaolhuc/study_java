package java8time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneIdEx {
	public static void main(String[] args) {
		/**
		 *  时区
		 *  ZoneId  LocalDateTime 转换
		 * 
		 */
		
		ZoneId defaultId = ZoneId.systemDefault();
		// 默认时区
		System.out.println(defaultId);
		// 所有可用时区
		System.out.println(ZoneId.getAvailableZoneIds());
		
		// 设定了时区
		ZoneId id = ZoneId.of("America/New_York");
		// 拿到偏移的时区时间
		OffsetDateTime offsetDateTime = OffsetDateTime.now(id);
		System.out.println(offsetDateTime);
		
		// 设定时区 +08:00
		ZoneOffset zoneOffset = ZoneOffset.of("+08:00");
		LocalDateTime localDateTime = LocalDateTime.now();
		OffsetDateTime offsetDateTime2 = OffsetDateTime.of(localDateTime, zoneOffset);
		System.out.println(offsetDateTime2);
		
		// 更加完善
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
	}
}
