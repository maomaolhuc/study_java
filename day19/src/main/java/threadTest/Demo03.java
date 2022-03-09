package threadTest;

public class Demo03 {

	public static void main(String[] args) {
		/*
		 * 卖票
		 * 很多站点
		 * 
		 * 多个线程在操作同一个数据的时候 很容易出现安全问题
		 *   1. 线程任务中操作的数据是共享的
		 *   2. 线程任务操作数据的代码有多个
		 *   上厕所没锁门
		 *  咋办?
		 *  你去上厕所 把门锁了 别人要等你上完了
		 *  排队状态 
		 *  
		 *  同步代码块里边写 共享的数据操作
		 *  synchronized方法或语句提供对与每个对象相关联的隐式监视器锁
		 *  synchronized 变成同步的过程 
		 *  
		 *  		 
		 *  */
		SaleTicket st = new SaleTicket();
		for(int i=0;i<4;i++){
			new Thread(st).start();
		}
	}
}


class SaleTicket implements Runnable{
	public int num = 100;
	public void run() {
		while(num > 0){
			// 对象是做为一个标识  监视器  放一个对象不可变的
			// 同步代码块  this  SaleTicket.class
			// 会代码变得层级不清楚
			sale();
		}
	};
	
	// 如果 synchronized 修饰在方法上就是 同步方法  this
	public synchronized void sale(){
		try {
			// 模拟cpu切换导致线程冻结状态
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(num > 0){
			System.out.println(Thread.currentThread().getName() 
					+ "售票点---"+ num + "号");
		}
		num--;
	}
	
	// SaleTicket.class 锁
	public synchronized static void say(){}
}













