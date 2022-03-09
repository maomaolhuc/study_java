package com.tz;

public class Demo02 {

	public static void main(String[] args) {
		// 面向对象 封装 继承 多态 
		/*
		 * 
		 *  继承  类与类之间的联系 产生关系之后 才会有一系列的操作
		 *  extends
		 *  
		 *  子类通过extends继承的 父类  子类是不是可以使用父类的方法
		 *  但是如果 子类和父类行为不一样的话 可以去重写父类中的方法
		 *  重写  覆盖
		 *    如果子类出现了和父类一模一样的方法  覆盖父类的方法
		 *    哪些情况下是可以去重写的呢?
		 *    	1. 必须要有继承关系
		 *      2. 权限等于或者大于父类的权限的
		 *      	重写必须是一模一样 返回值 名字 都是一样的
		 *      3. 静态可以重写不  不可以
		 *      4. 构造方法不可以被重写
		 *     
		 *  子类会继承父类的属性
		 *  1. 但是父类的属性如果私有了 不能直接访问到了 必须通过set get方法才可以访问到父类中的属性
		 *  2. 如果子类和父类具有相同的属性的时候 优先访问自己的  但是想要拿到父类的属性的时候 super获取到父类中的属性
		 *  
		 *  构造函数
		 *  当子父类都有构造函数的时候 先执行父类的 因为子类构造函数中第一句都有一个默认的super隐式的 无参的情况 
		 *  为啥要去初始化父类的构造函数呢? 因为初始化的时候可能会用到父类的属性和方法
		 */
		
		Son1 s1 = new Son1();
		s1.eat();
//		System.out.println(s1.money);
		Son2 s2 = new Son2();
		s2.eat();
//		System.out.println(s2.getMoney());
		System.out.println(s2.money);
	}

}

class Son1 extends Father{
	int money = 200;
	void eat(){
//		System.out.println("我是老大我喜欢吃米饭" + money);
		System.out.println("我是老大我喜欢吃米饭" + super.money);
	}
	public Son1() {
		// 调用父类的无参的构造函数
		// super();
		System.out.println("我是son1  构造函数");
	}
	
	
	
}

class Son2 extends Father{
	void eat(){
		System.out.println("我是老三我喜欢吃面条");
	}
}

class Father{
	// private int money = 100;
//	public int getMoney() {
//		return money;
//	}
	
	public Father() {
		System.out.println("我是Father 构造函数");
	}
	
	int money = 100;
	
	void eat(){
		System.out.println("我是爸爸我喜欢吃吃面条 吃米饭");
	}

	
	
}

