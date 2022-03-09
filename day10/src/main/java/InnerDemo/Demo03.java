package InnerDemo;

public class Demo03 {

	public static void main(String[] args) {
		
		/*
		 *  内部类是在成员位置上的
		 *  局部内部类
		 *  内部类写在方法中的
		 *  注意点: 在jdk1.8之前 局部内部类如果写成员变量必须是final的
		 *        如果是用的以前的版本 一定呀注意这个问题
		 *  局部内部类是不能加static 因为static是给成员变量修饰的 
		 *  字节码文件 Outer3$1Inner.class
		 */
		
		Outer3 o = new Outer3();
		o.method();
	}

}

class Outer3{
	int num = 10;
	void method(){
		class Inner{
			// jdk1.8前 必须是final
			/*final*/ int num = 20;
			void show(){
				int num = 30;
				System.out.println("我是局部内部类" + num);
				System.out.println("我是局部内部类" + this.num);
			}
		}
		new Inner().show();
	}
}






