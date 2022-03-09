package InnerDemo;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 *  static 修饰的内部类
		 *  
		 *  当内部类是静态的时候 只能访问外部类的静态成员或者静态方法
		 *  静态内部类中定义方法可以是静态的也可以是非静态的
		 *  非静态的内部类 不能去定义静态方法
		 *  
		 *  内部类就是去封装一些不想让别人知道的东西 --- 金屋藏娇
		 *  字节码文件: Outer3$Inner.class
		 */
		
		Outer2.Inner in = new Outer2.Inner();
		in.say();
		Outer2.Inner.haha();
		
		
		// int a = 10;
		// Integer aa = new Integer(10).intValue(); // 返回值
		// Integer bb = 10;
		// System.out.println(a == aa);
		// System.out.println(bb == aa);
		// double d = 10;
		// System.out.println(bb == d);
		
		// -128 ~ 127  不会去开辟新的空间去存储值
		// ctrl + 鼠标左键
		// Integer a = 128;
		// Integer b = 128;
		// System.out.println(a == b); // false
	}

}

class Outer2{
	static int num = 10;
	
	static void a(){
		
	}
	
	static class Inner{
		void say(){
			System.out.println(num);
			a();
		}
		
		static void haha(){
			System.out.println("静态内部类中的静态方法");
		}
		
	}
}