package InnerDemo;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * 内部类如果被 private修饰
		 * 如果想要使用内部类中的方法 对外提供一个访问方式
		 */
//		Outer4.Inner in = new Outer4().get();
//		in.say();
//		in.show();
		
		A a = new Outer4().getInner();
		a.show();
		a.say();
	}

}


abstract class A{
	abstract void show();
	abstract void say();
}


class Outer4{
	private class Inner extends A{
		void say(){
			System.out.println("hahaha");
		}
		
		void show(){
			System.out.println("show 重写");
		}
	}
	
	public A getInner(){
		return new Inner();
	}
}













