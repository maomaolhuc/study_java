package throwDemo2;


public class FinallyDemo {

	public static void main(String[] args) {
		/**
		 * finaly 必定会执行的  
		 * finally 通常都是释放资源的
		 * try...finally
		 * try...catch...finally
		 * 
		 * try_with_resourse 自动释放资源 自动执行finally 1.7之后
		 * 
		 * 运行时的问题 try final之后的内容不能被打印
		 */
		
		try{
			System.out.println(1/0);
		} catch (Exception e) {
			// return; // 后边的也不会被执行
			// System.exit(0); // 退出jvm finally不会被执行了
		} finally {
			System.out.println("我必然会被执行");
		}
		System.out.println("over");
		
	}

}
