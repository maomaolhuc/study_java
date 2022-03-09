package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) {
		/**
		 * 	文件复制
		 * 	需要把一个文件中的数据读取出来 
		 *  输出到另外一个文件中
		 */
		
		File file = new File("C:/Users/TZ-xq/Desktop/17/text.txt");
		File oFile = new File("C:/Users/TZ-xq/Desktop/17/copy.txt");
		/*
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(oFile);
			// 1024倍数  1kb
			byte[] buf = new byte[1024];
			int len = 0;
			// 读取
			while((len = fis.read(buf)) != -1){
				fos.write(buf, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		// try-with-resourse  自动释放资源的
		try(FileInputStream fis = new FileInputStream(file);FileOutputStream fos = new FileOutputStream(oFile);){
			// 1024倍数  1kb
			byte[] buf = new byte[1024];
			int len = 0;
			// 读取
			while((len = fis.read(buf)) != -1){
				fos.write(buf, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
