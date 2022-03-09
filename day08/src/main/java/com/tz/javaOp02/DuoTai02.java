package com.tz.javaOp02;

public class DuoTai02 {
 	public static void main(String[] args) {
 		
 		
 		/*
 		 *  多态中特点
 		 *  
 		 *  1. 成员变量特点 (同名)
 		 *  编译: 看父类中有没有这个变量 没有的话报错
 		 *  运行: 参考引用类的成员变量
 		 *  编译看左边 运行看左边
 		 *  
 		 *  2. 主要的(成员函数的) 
 		 *  编译: 看父类有没有 没有的话报错
 		 *  运行: 看子类是否存在 如果存在 执行自己的 如果不存在执行父类的
 		 *  动态绑定
 		 *  
 		 *  3. 静态方法
 		 *  静态和类绑定的
 		 *  编译: 看父类中存在不
 		 *  运行: 类绑定的 
 		 * 
 		 */
 		// 向上转型 好处是 可以去调用父类的方法 提高了程序的扩展性 不需要子类方法
 		A a = new B();
 		// 向下转型  需要子类方法的时候 执行特定的子类方法 判断 因为是强转 
 		B b = (B)a;
 		
 		
// 		System.out.println(a.num);
// 		System.out.println(b.num);
 		a.say();
 		b.say();
 		
 		
	}
}

class A{
	int num = 10;
	
	static void say(){
		System.out.println("haha");
	}
}

class B extends A{
	int num = 20;
	
	static void say(){
		System.out.println("hehe");
	}
}
