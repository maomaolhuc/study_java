package IO;

import java.io.File;

public class DeleteDemo {

	public static void main(String[] args) {
		File file = new File("C:/Users/TZ-xq/Desktop/17");
		// 删除要把目录里边的删完 才能删除目录
		File del = new File(file, "1");
		del.delete();
		
		File delfile = new File("C:/Users/TZ-xq/Desktop/del");
		delFile(delfile);
	}

	public static void delFile(File delfile) {
		if(!delfile.exists())return;
		if(delfile.isFile()){
			delfile.delete();
		}else if (delfile.isDirectory()) {
			// 是文件夹就进去删除
			each(delfile);
		}
	}
	
	public static void each(File dir){
		File[] files = dir.listFiles();
		for (File file : files) {
			if(file.isFile()){
				file.delete();
			}else{
				each(file);
				// 子文件删除完删除 文件夹
				file.delete();
			}
		}
		
	}

}
