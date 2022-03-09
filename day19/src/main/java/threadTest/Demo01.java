package threadTest;

public class Demo01 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 *  多线程
		 *  进程是啥?
		 *  	其实就是电脑中运行的程序, 每一个进程都有自己的内存分配 进程之间是可以去切换的 (消耗资源的)
		 *  	进程中是有1-n个线程
		 *  线程是啥?  
		 *  	线程是进程中实体, 被系统独立的去调度分派的一个单元,一个进程中至少有一个线程
		 *  	同一类线程共享空间 每一个线程都有自己独立的计数器 独立的运行栈 线程之间做切换(消耗比较小)
		 *  
		 *  区别:
		 *  	多进程就是可以同时运行很多个程序
		 *  	多线程在一个程序里可以有多个任务在执行
		 *  
		 *  
		 *  
		 *  java中创建线程的方式
		 *   	1. 第一种继承Thread类, 重写run方法
		 *   	   通过getName方法获取线程的名称
		 *       Thread.currentThread() 获取当前执行线程的对象
		 *       
		 *       cpu是随机的切换执行 线程需要cpu运行到的时候给它一个执行权力,谁抢到
		 *       切换到当前的线程 至于执行的长短 cpu
		 *   	
		 */	
		
				
		// 创建一个线程对象
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		// 这里没有开启线程 普通方法在运行
		// d.run();
		// 开启线程执行 run方法
		// 设定线程的优先级
		// d1.setPriority(6);
		// System.out.println(d1.getPriority());
		
		// 设置当前线程为守护线程(保安,保洁阿姨) 设置必须在线程的start之前 
		// d1.setDaemon(true);
		// d1.start();
		// Thread.sleep(1000);
		// d2.start();
		
		// System.out.println(Thread.currentThread());

	}
}



class Demo extends Thread{
	String name;
	
//	public Demo(String name) {
//		super(name);
//	}

	public void run(){
		for(int i=0;i<20;i++){
//			System.out.println(this.getName() + "-----" + i);
			System.out.println(Thread.currentThread().getName() + "-----" + i);
		}
	}
}














