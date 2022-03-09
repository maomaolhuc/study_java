package practice1;

public class Bank {
	/*
	 * 两个人存钱
	 *   存的金额  账户
	 *   操作的共享数据是谁?  total
	 */
	
	private int total;
	public void add(int num, String name){
		cun(num, name);
	}
	
	public synchronized void cun(int num, String name){
		total += num;
		System.out.println(name + "存了" + num +"金额");
		System.out.println("总金额"+total);
	}
	
	public synchronized void qu(int num, String name){
		if(total <= 100){
			System.out.println("兄弟留条活路啊");
			return;
		}
		total -= num;
		System.out.println(name + "取了" + num +"金额");
		System.out.println("总金额"+total);
	}
}
