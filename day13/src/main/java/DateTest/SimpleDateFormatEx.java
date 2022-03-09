package DateTest;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat simple = new SimpleDateFormat("现在是 yyyy年MM月dd日  HH:mm:ss");
		System.out.println(simple.format(date));
	}

}
