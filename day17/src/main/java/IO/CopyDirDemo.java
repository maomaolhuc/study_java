package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDirDemo {

	public static void main(String[] args) {
		/**
		 *  复制文件夹
		 *  碰到文件夹 创建文件夹 往里边复制
		 *  
		 *  直接找文件 一次创建mkdirs 直接写
		 */
		File file = new File("E:/1801作业");
		
		copy(file, "C:/Users/TZ-xq/Desktop");
	}

	public static void copy(File file, String name){
		if(!file.exists())return;
		
		if(file.isFile()){
			// 获取文件路径
			String path = file.getAbsolutePath();
			// 复制到的地方
			String outPath = name + path.substring(2);
			File parent = new File(outPath).getParentFile();
			if(!parent.exists()){
				parent.mkdirs();
			}
			
			try(FileInputStream fis = new FileInputStream(file);
					FileOutputStream fos = new FileOutputStream(outPath);){
				byte[] buf = new byte[4096];
				int len = 0;
				while((len = fis.read(buf)) != -1){
					fos.write(buf, 0, len);
					fos.flush();
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
		// 获取到文件列表
		File[] files = file.listFiles();
		for (File sub : files) {
			copy(sub, name);
		}
	}
}




















