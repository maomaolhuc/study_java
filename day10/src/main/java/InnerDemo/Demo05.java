package InnerDemo;

import java.io.BufferedWriter;

public class Demo05 {

	public static void main(String[] args) {
		
		/*
		 * 抽象类是不能被实例化的 
		 * 为什么不行呢 那是因为抽象类中的方法都是抽象的 必须要重写之后才可以去创建对象
		 * 
		 * 前提: 匿名内部类实现前提必须要有关系 继承实现
		 * 通常就是在实例接口  使用的时候 通常方法不会很多
		 *  
		 */
		Abs abs = new Abs(){
			@Override
			void say() {
				System.out.println("我叫做匿名内部类");
			}
			
			@Override
			void say2() {
				// TODO Auto-generated method stub
			}
		};
//		abs.say();
		
		Outer5 o = new Outer5();
//		o.method();
		
		P p = new P();
		p.method();
	}

}

abstract class Abs{
	abstract void say();
	abstract void say2();
}

interface Inter{
	
	void haha();
}

class Outer5{
	
	class Inner extends Abs{
		void say(){
			System.out.println("fu");
		}
		@Override
		void say2() {
			// TODO Auto-generated method stub
			
		}
	}
	
	void method(){
		// 实例化inner
		new Inner(){
			// 创建内部类
			@Override
			void say() {
				// TODO Auto-generated method stub
				System.out.println("重写fu");
			}
		}.say();
		// 如果不去创建子类对象 执行方法 匿名内部类
		Abs a = new Abs(){
			@Override
			void say() {
				System.out.println("我是成员内部类");
			}

			@Override
			void say2() {
				// TODO Auto-generated method stub
			}
		};
		
		a.say();
		a.say2();
	}
}


class P{
	public void method(){
//		new Object(){
//			void say(){
//				System.out.println("我是匿名内部类");
//			}
//		}.say();
		
		Object o = new Object(){
			void say(){
				System.out.println("我是匿名内部类");
			}
		};
		// o.say(); // 编译失败
	}
}









