package com.tz.javaOp;

public class Demo {
	public static void main(String[] args) {
		/*
		 * 父类的构造函数如果执行了子类可以重写的方法. 在子类实例化的时候,父类回去调用子类中的方法
		 * 父类的构造函数中不要去执行 子类可以重写的方法  最好是调用自己的私有方法
		 * 
		 */
		B b = new B();
		// b.test(); //   10
	}
}

class A{
	A(){
		System.out.println("调用了父类构造函数");
		test();
	}

	private void test(){
		
	}
}

class B extends A{
	int num = 10;
	B(){
		super(); // 调用父类的构造函数
		// super 单独是一个引用
	}
	void test(){
		System.out.println("调用了我");
		System.out.println(num);
	}
}