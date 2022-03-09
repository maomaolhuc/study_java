package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class TranslateIO {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		/**
		 * 
		 * 转换流
		 * InputStreamReader
		 * OutputStreamWriter
		 * 
		 */
		
		// 编码转换
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("C:/Users/TZ-xq/Desktop/18/haha.txt"),"utf-8");
		
		osw.write("哈哈");
		osw.close();
		
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("C:/Users/TZ-xq/Desktop/18/haha.txt"),"utf-8");
		char[] buf = new char[512];
		int len = isr.read(buf);
		System.out.println(new String(buf,0,len));
	}

}
