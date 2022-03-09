package test;

import java.beans.AppletInitializer;

public class Demo {
	/*
	 *  抽象
	 *  	1. 具有抽象方法的类就是抽象类 抽象类是不能被实例的
	 *  	2. 抽象类中也可以有非抽象方法
	 *  	3. 抽象类中可以有成员变量 (可以是最终的 也可以不是最终的)
	 *  接口 体现能力
	 *   	1. 方法都是抽象的
	 *   	         方法可以用不抽的嘛? default
	 *   	2. 成员变量 都是final static  
	 *      3. 两个对象对象之间的协议
	 *      
	 * 
	 */
	
	public static void main(String[] args) {
		
//		A a = new A();
//		a.b();
		
		// 一个对象有很多不同的表现形态 多态
		// 属于甜美的女生
		Sweet s = new Sweet();
		// 甜美的女生也属于女孩 向上转型 儿子变爸爸
		Girl g = new Sweet();
		Girl g1 = new Nvhanzi();
		
		
		
		Gexin gx = new Gexin();
//		gx.seek(new Sweet());
//		gx.seek(new Foolish());
//		gx.seek(new Nvhanzi());
		gx.dou(g);
		gx.dou(g1);  // ClassCastException 类型转换异常
	}
	
}

interface InterDemo{
	abstract public void a();
	public default void b(){ // jdk1.8
		System.out.println("我是一个默认方法");
	}
}


class A implements InterDemo{
	
	@Override
	public void a() {
		
	}
	
	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("我是a中的b方法");
	}
}



