package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KeyDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/TZ-xq/Desktop/18/key.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		
		// 通过键盘输入 
		// 转换
		InputStreamReader osw = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(osw);
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		String str = null;
		while((str=br.readLine()) != null){
			if(str.equals("over"))break;
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
