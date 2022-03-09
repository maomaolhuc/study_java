package com.tz.javaOp;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 *  作业邮箱 2039971852@qq.com
		 *  1.设计一个学生类Student，其数据成员有name(姓名)、age(年龄)和degree(学位)。Show方法显示信息。 构造函数
		 *	由Student类派生出本科类与研究生
		 *	2.本科生类Undergraduate和研究生类Graduate，本科生类Undergraduate增加成员specialty(专业)，
		 *    添加方法UndergraduateShow()显示信息，
		 *	3.研究生类Graduate增加成员direction(研究方向)。添加GraduateShow()方法，用于输出数据成员信息
		 *	4.科生类Undergraduate和研究生类Graduate定义构造函数初始化属性（要求使用super调用父类的构造函数）
		 * 
		 */
		
		Graduate g = new Graduate("Aha", 18, "学士", "佛学");
		g.GraduateShow();
		Undergraduate u = new Undergraduate("李大钊", 66, "院士", "革命");
		u.UndergraduateShow();
	}
}


class Graduate extends Student{
	public String direction;

	public Graduate(String name, int age, String degree, String direction) {
		super(name, age,degree);
		this.direction = direction;
	}
	
	public void GraduateShow(){
		super.show();
		System.out.println("我是"+direction+"研究方向的");
	}
}

class Undergraduate extends Student{
	
	public String specialty;

	public Undergraduate(String name, int age, String degree, String specialty) {
		super(name, age,degree);
		this.specialty = specialty;
	}
	
	public void UndergraduateShow(){
		super.show();
		System.out.println("我是"+specialty+"专业");
	}
	
}


class Student{
	public String name;
	public int age;
	public String degree;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Student(String name, int age, String degree) {
		super();
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	
	public void show(){
		System.out.println("我是"+name+",今年"+age+"岁.我是"+degree+"学位");
	}
}




















