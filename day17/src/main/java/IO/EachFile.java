package IO;

import java.io.File;

public class EachFile {

	public static void main(String[] args) {
		/**
		 *  遍历目录
		 *  
		 */
		
		
		File file = new File("C:/Users/TZ-xq/Desktop/1801作业");
		eachFile(file);
	}
	
	public static void eachFile(File file){
		if(!file.exists())return;
		
		if(file.isDirectory()){
			// 传递过滤器
			File[] files = file.listFiles();
			for(File sub : files){
				// 是不是文件
				if(sub.isFile()){
					System.out.println(sub);
				}else{
					// 是文件夹就重复
					eachFile(sub);
				}
			}
		}else{
			System.out.println(file);
		}
	}

}
