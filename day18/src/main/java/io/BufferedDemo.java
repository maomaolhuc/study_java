package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 	字符是比较局限的
		 * 	字节可能按照一定大小读的时候会把字读差了
		 * 
		 *  FileInputStream
		 *  FileOutputStream
		 *  FileReader
		 *  FileWriter
		 *  
		 * 	提高效率  包装了一层 关流只关最外层的就可以了
		 *  BufferedInputStream
		 *  BufferedOutputStream
		 *  BufferedReader  readLine()
		 *  BufferedWrite   Map  配置文件  键值对
		 *  
		 *  编码 字节转字符
		 *  InputStreamReader
		 *  OutputStreamWriter
		 *  
		 *  数据顺序必须一样
		 *  DataInputStream
		 *  DataOutputStream
		 *  
		 *  序列化流
		 *  ObjectInputStream
		 *  ObjectOutputStream
		 *  
		 *  打印流  标准输出流  日志
		 *  PrintStream 
		 *  PrintWriter
		 * 
		 */
		/*
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:/Users/TZ-xq/Desktop/18/buf.txt", true));
		String str = "满村老司机";
		bos.write(str.getBytes());
		bos.close();
		
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("C:/Users/TZ-xq/Desktop/18/buf.txt"));
		int len = 0;
		byte[] buf = new byte[1024];
		while((len = bis.read(buf))!= -1){
			System.out.println(new String(buf, 0 , len));
		}
		// 设计默认
		bis.close();
		
		*/
		
		
		BufferedReader br = new BufferedReader(
				new FileReader("C:/Users/TZ-xq/Desktop/18/buf.txt"));
//		int len = 0;
//		while((len = br.read()) != -1){
//			System.out.print((char)len);
//		}
		String line = "";
//		System.out.println(br.readLine());
		// 效率更高
		while((line=br.readLine()) != null){
			System.out.println(line);
		}
		

	}

}







