package lock;

public class ThreadDeadth {

	public static void main(String[] args) {
		Dead d1 = new Dead(true);
		Dead d2 = new Dead(false);
		new Thread(d1).start();
		new Thread(d2).start();
		
		/**
		 * 
		 *  同步嵌套 很容易出现死锁
		 */

	}
}


class Dead implements Runnable{
	public boolean flag;
	private static Object o1 = new Object();
	private static Object o2 = new Object();
	public Dead(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {
	
		if(flag){
			while(true){
				synchronized(o1){
					synchronized(o2){
						System.out.println(Thread.currentThread().getName()+"....");
					}
				}
			}
		}else{
			while(true){
				synchronized(o2){
					synchronized(o1){
						System.out.println(Thread.currentThread().getName()+"....");
					}
				}
			}
		}
	}
}







