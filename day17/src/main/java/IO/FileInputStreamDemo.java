package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		/**
		 *  流
		 *	FileInputStream
		 *  FileOutputStream
		 *  	
		 *  FileReader
		 *  FileWriter
		 *  
		 *  BufferedReader
		 *  BufferedWriter
		 *  BufferedInputStream
		 *  BufferedOutputStream
		 *  
		 *  InputStreamReader
		 *  OutputStreamWriter
		 *  
		 *  DataInputStream
		 *  DataOutputStream
		 *  
		 *  ObjectInputStream
		 *  ObjectOutputStream
		 * 
		 */
		
		// 字节流
		File file = new File("C:/Users/TZ-xq/Desktop/17/text.txt");
		FileInputStream fis = new FileInputStream(file);
		// 获取文件的大小
		// System.out.println(fis.available());
		// int ch1 = fis.read();
		// System.out.println((char)ch1);
		
		// 循环读取
//		int ch = 0;
//		while((ch = fis.read()) != -1){
//			System.out.println((char)ch);
//		}
		
		// 设定每次读取的大小
		byte[] buf = new byte[fis.available()];
		int len = 0;
		while((len = fis.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}
		fis.close();
		
		
	}

}
