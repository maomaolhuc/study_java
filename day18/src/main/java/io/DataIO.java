package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIO {

	public static void main(String[] args) throws IOException {
		/*
		 * 
		 * 数据流      输出的和输入的顺序要一样  
		 * DataInputStream
		 * DataOutputStream
		 * int a = 10;
		 */
		/*
		DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("C:/Users/TZ-xq/Desktop/18/data.txt"));

		int a = 10;
		double d = 11.1;
		float f = 123.123f;
		boolean bo = false;
		dos.writeInt(a);
		dos.writeDouble(d);
		dos.writeFloat(f);
		dos.writeBoolean(bo);
		dos.close();
		*/
		
		
		DataInputStream dis = new DataInputStream(
				new FileInputStream("C:/Users/TZ-xq/Desktop/18/data.txt"));
		int a = dis.readInt();
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readBoolean());
		
	}

}
