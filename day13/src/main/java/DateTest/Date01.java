package DateTest;

import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/**
		 *  Date 日期对象
		 * 
		 */
		
		// 废弃了 不用了
		Date date = new Date(2018,4,23);
		// 传递一个毫秒数 System.currentTimeMillis() 返回系统毫秒数1970到现在的
		System.out.println(System.currentTimeMillis());
		Date date1 = new Date(System.currentTimeMillis());
		// 本地格式化 弃用
		System.out.println(date1.toLocaleString());
	}

}
