package com.tz;

public class ExtendsDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * 当子类和父类具有相同参数的构造函数
		 * 1. 子类还是会隐式调用父类的无参构造函数的
		 * 2. 显示的书写super构造函数  默认调用父类无参的那个就不会添加了
		 * 
		 * 
		 * 作业
		 * 
		 * 1.设计一个学生类Student，其数据成员有name(姓名)、age(年龄)和degree(学位)。Show方法显示信息。 构造函数
		 *	由Student类派生出本科类与研究生
		 *	2.本科生类Undergraduate和研究生类Graduate，本科生类Undergraduate增加成员specialty(专业)，
		 *    添加方法UndergraduateShow()显示信息，
		 *	3.研究生类Graduate增加成员direction(研究方向)。添加GraduateShow()方法，用于输出数据成员信息
		 *	4.科生类Undergraduate和研究生类Graduate定义构造函数初始化属性（要求使用super调用父类的构造函数）
		 * 
		 */
	}

}

class Fu{
	int a ;
	int b;
	// com.tz.Fu(){}
	Fu(int a){
		this.a = a;
	}
//	com.tz.Fu(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}
}

class Zi extends Fu{
	int a;
	int b;
	public Zi(int a, int b) {
		super(a);
		this.b = b;
	}
	
}
