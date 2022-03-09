package IO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFilterDemo {

	public static void main(String[] args) {
		/**
		 * 
		 * 文件过滤
		 */
		
		File file = new File("C:/Users/TZ-xq/Desktop/1801作业");
//		File[] arr = file.listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.length() > 1024;
//			}
//		});
//		
//		File[] arr = file.listFiles(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
//				return name.equals("大西瓜");
//			}
//		});
		
		
		File[] arr = file.listFiles(new MyFileFilter(".md"));
		System.out.println(arr.length);
		for (File file2 : arr) {
			System.out.println(file2);
		}
	}

}



class MyFileFilter implements FilenameFilter{
	private String name;
	
	public MyFileFilter(String name){
		this.name = name;
	}
	
	@Override
	public boolean accept(File dir, String hz) {
		return hz.endsWith(name);
	}
}















