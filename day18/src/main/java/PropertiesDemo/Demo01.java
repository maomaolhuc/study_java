package PropertiesDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		/**
		 * Properties  和io流的结合
		 */
//		
//		Properties prop = new Properties();
//		prop.setProperty("dage", "lidazhao");
//		prop.setProperty("erge", "chenduxiu");
//		
//		FileOutputStream fos = new FileOutputStream("C:/Users/TZ-xq/Desktop/18/config.txt");
//		// 写中文会变成unicode编码 不要写中文 不认识
//		prop.store(fos, "config");
//		fos.close();
		
//		Properties prop1 = new Properties();
//		FileInputStream fis = new FileInputStream("C:/Users/TZ-xq/Desktop/18/config.txt");
//		prop1.load(fis);
//		System.out.println(prop1);
		
		
		// 软件有一个试用天数 4
		Properties prop = new Properties();
		File file = new File("C:/Users/TZ-xq/Desktop/18/sublime.properties");
		if(!file.exists()){
			file.createNewFile();
		}
		FileInputStream fis = new FileInputStream("C:/Users/TZ-xq/Desktop/18/sublime.ini");
		int count = 1;
		prop.load(fis);
		String value = prop.getProperty("count");
		if(value != null){
			count = Integer.valueOf(value);
			count++;
			if(count >= 4){
				System.out.println("小伙子交钱啦");
				return;
			}
		}
		prop.setProperty("count", count+"");
		FileOutputStream fos = new FileOutputStream("C:/Users/TZ-xq/Desktop/18/sublime.ini");
		prop.store(fos, "sublime");
		fis.close();
		fos.close();
	}

}








