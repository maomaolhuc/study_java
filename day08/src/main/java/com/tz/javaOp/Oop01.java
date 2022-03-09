package com.tz.javaOp;

public class Oop01 {

	public static void main(String[] args) {
		/*
		 * static
		 * super 
		 * 	1. 单独存在的时候是一个引用
		 *  2. 子类构造函数中会默认的调用父类中的构造函数 super() 参数一样的时候 也会去调用(父类需要写了)
		 *  显示的super(参数列表)
		 * 
		 * 继承好处就是 子类可以去使用父类的非私有的方法和属性 
		 * 重写
		 * 	1. 我们不希望父类中的方法被重写 被修改 final(最终)
		 *  final
		 *  1. 子类不能去重写 
		 *  2. 定义成员变量的时候加final 常量 必须要去初始化一个值
		 *  常量的名字 大写的看到就知道是常量 
		 *  3. 加在类上就是一个最终类 不能被继承 
		 *  大写 ctrl+shift+x
		 *  小写 ctrl+shift+y
		 *  
		 */
	}

}

class Father{
	public static final double PI = 3.14;
	public final void papa(){
		System.out.println("我是爸爸我可以你不可以");
	}
}

class Son extends Father{
	/* 不能被重写
	 * public void papa(){
		
	}*/
}








