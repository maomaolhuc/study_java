package threadTest;

public class Demo02 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Runnabale 接口  这种方式比较多 
		 * 好处: 避免单继承的局限性
		 * 
		 */
		
		
		ThreadDemo d1 = new ThreadDemo();
		Thread t1 = new Thread(d1);
		// 一个Thread 只能开启一个 
		t1.start();
		t1.start();
	}
}


class ThreadDemo implements Runnable{
	@Override
	public void run() {
		
		for(int i=0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
	}
}












