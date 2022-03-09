package com.tz;

public class Demo {
	static int a = 10;
	int b = 20;
	// main 入口
	public static void main(String[] nice) {
		/*
		 * 类其实就是一个自定义的数据类型 描述客观事物的行为和属性的
		 * static静态 修饰词 只要加了静态的随着class加载就加载了
		 * 成员变量加了static --- 类变量
		 * 非静态的成员变量 每个对象都是各自拥有的 --- 不共有
		 * 静态的成员变量(类变量)共有的  
		 * 静态的成员变量不需要实例化对象的
		 * 
		 * static 静态
		 * 如何使用?
		 * 1. 通过static修饰的 可以通过类名去直接访问 不需要创建对象的
		 * 2. 静态的是随着类加载而加载的 静态方法不依赖对象存在去执行
		 * 
		 * 注意:
		 * 1. 静态和静态是可以访问的 
		 * 2. 非静态的是可以使用静态的
		 * 3. 静态中不能写this super this是创建对象的时候 this才会有指向的 没有创建的时候this是没有指向的
		 * 
		 * 成员变量区别:
		 * 成员变量是创建对象的时候才会赋值的 静态的成员变量随着类加载而加载的
		 * 调用的时候 成员变量只能通过对象.属性  静态的类名.属性 
		 * 存储 static 静态区  成员变量堆内存
		 * 
		 * 
		 * 静态代码块
		 * static {
		 * 
		 * } 
		 * 静态代码块 随着类加载而加载的 并且它只会执行一次 初始化类变量
		 * 
		 * 
		 * 构造代码块
		 * {
		 * 	
		 * }
		 * 随着对象的创建就会去执行一次 初始化成员变量
		 * 静态代码块 > 构造代码块 > 构造函数
		 * 
		 */
//		System.out.println(new com.tz.Demo().a);
//		System.out.println(com.tz.Demo.a);
//		System.out.println(new com.tz.Demo().b++); // 20
//		System.out.println(new com.tz.Demo().b++); // 20
//		System.out.println(new com.tz.Demo().a++);       // 10
//		System.out.println(new com.tz.Demo().a++);       // 11
//		System.out.println(com.tz.Demo.a++);       // 12
//		System.out.println(com.tz.Demo.a++); 		// 13
		
//		 com.tz.A a1 = new com.tz.A();
//		 com.tz.A a2 = new com.tz.A();
//		 
//		 a1.haha();
//		 a2.haha();
		
		 {
			 int c = 10;
		 }
//		 System.out.println(c);		 
		 
		 
		 
		 double length = Graph.length(new Pointer(3 , 4), new Pointer(6, 8));
		 System.out.println(length);
		 
		 Pointer center = new Pointer(0,0);
		 double round = Graph.getRound(new Cirle(center, 5));
		 System.out.println(round);
		 
		 double area = Graph.getArea(new Cirle(5));
		 System.out.println(area);
		 
	}

}

class A{
	static {
		int a = 10;
		System.out.println("static 代码块"+a);
	}
	
	
	
	A(){
		System.out.println("com.tz.A 构造函数");
	}
	public void haha(){
		System.out.println(123);
	}
	
	{
		int num = 20;
		System.out.println("构造代码块"+num);
	}
}







