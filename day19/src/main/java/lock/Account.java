package lock;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
	/**
	 *  双11了我们要买东西了
	 *  星空
	 *  星空对象
	 */
	// 账号
	private String accoutNo;
	
	private final ReentrantLock lock = new ReentrantLock();
	private double money;

	public String getAccoutNo() {
		return accoutNo;
	}

	public void setAccoutNo(String accoutNo) {
		this.accoutNo = accoutNo;
	}

	public double getPrice() {
		return money;
	}

	public void setPrice(double price) {
		this.money = price;
	}


	public Account(String accoutNo, double price) {
		super();
		this.accoutNo = accoutNo;
		this.money = price;
	}
	
	
	public void buy( double price){
		lock.lock();
		try {
			while(true){
				if(this.getPrice() >= price){
					
					System.out.println(Thread.currentThread().getName() + "购买成功" + price);
					this.money -= price;
					System.out.println("账户余额："+this.money);
				}else{
					System.out.println("账户余额不足，请充值");
					break;
				}
			}
		} finally {
			// 出没出问题这个索都要解开 要不然其他的线程不能执行 死了
			lock.unlock();
		}
	}
}
