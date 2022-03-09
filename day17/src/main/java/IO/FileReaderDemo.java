package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/TZ-xq/Desktop/17/text.txt");
		FileReader fr = new FileReader(file);
		char[] buf = new char[512]; // 1kb
		int len = 0;
		while((len = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}
		
		
		FileWriter fw = new FileWriter("C:/Users/TZ-xq/Desktop/17/text1.txt", true);
		String str = "我爱你";
		fw.write(str);
		fw.close();
		

	}

}
