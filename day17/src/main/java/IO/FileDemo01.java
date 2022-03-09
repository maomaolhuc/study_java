package IO;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	public static void main(String[] args) throws IOException {
		/**
		 *  IO流
		 *  	数据进行一个持久化存储
		 *  	文件 
		 *  
		 *  C:/Users/TZ-xq/Desktop/17
		 * 
		 */
		File parent = new File("C:/Users/TZ-xq/Desktop/17");
		File file = new File(parent,"123.txt");
		
		// 文件大小 length()
		System.out.println(file.length());
//		System.out.println(parent.isFile());
//		System.out.println(parent.isDirectory());
		// System.out.println(file.getParent());
//		if(!file.exists()){
//			file.createNewFile();
//		}
		
		// File file = new File("C:/Users/TZ-xq/Desktop/1801作业");
		// 返回目录中的第一级的列表
//		File[] files = file.listFiles();
//		for (File file2 : files) {
//			System.out.println(file2);
//		}
		
		// mkdir创建单个
		// mkdirs创建多个
//		File dir = new File("C:/Users/TZ-xq/Desktop/file/a/b/c");
//		dir.mkdirs();
		
	}

}
