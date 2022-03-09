package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String str = "nice";
		
		// 获取系统中属性 分隔符 换行
		System.out.println(System.getProperty("file.separator"));
		System.out.println(File.separator);
		
		String str1 = System.getProperty("line.separator") + "xq";
		// 没有的话也会自动创建
		FileOutputStream fos = new FileOutputStream("C:/Users/TZ-xq/Desktop/17/text1.txt", true);
		
		// 把之前的删除了 在写一次
		fos.write(str.getBytes());
		fos.write(str1.getBytes());
		
	}

}
