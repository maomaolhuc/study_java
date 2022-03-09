package InnerDemo;

import InnerDemo.Outer.Inner;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * 内部类
		 * 	当Inner想要访问outer的内容的时候都需要创建outer的对象 
		 * 	如果把inner放到outer中就可以之间去访问outer中的内容而不需要去创建outer的对象
		 * 
		 * 访问方式
		 * 	内部类可以访问到外部类的所有的属性
		 *  外部类如果想要访问到内部类中的属性和方法的时候 就需要创建内部类对象 Outer.Inner
		 *  非静态内部类调用 new Outer().new Inner()
		 *  
		 *  
		 * 成员变量 局部变量
		 * 通常去使用成员变量时候 this省略的
		 * outer的成员变量和inner的变量名相同的时候 访问到outer的成员变量的时候
		 * Outer.this.attr
		 * 
		 * 非静态的内部类如果写静态的成员必须是final的 最终的
		 */
		
		// new Inner().say();
		Inner in = new Outer().new Inner();
		in.say();
		// System.out.println(Outer.a);
	}
}

class Outer{
	private int num = 10;
	class Inner{
		static final int a = 10;
		int num = 20;
		void say(){
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}
}

