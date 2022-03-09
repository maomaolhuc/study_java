package com.tz.javaOp;

public class Oop02 {
	
	/*
	 * 
	 * 描述一类事物的时候 不能够很具体的去描述它 描述吃的时候 不能够很具体的描述出来 
	 * abstract 抽象  看不明白的 不具体的
	 * 定义了抽象方法的类 也必须是抽象的 抽象类
	 * 
	 * 把有共性的东西抽取出来的 
	 * 
	 * 1. 继承了抽象类 子类必须去重写 父类的方法 否则子类也是抽象的
	 * 2. 成员变量 抽象的成员变量 可以是常量 可以是变量
	 * 3. 可以有构造函数 目的就是给子类调用初始化的 抽象类可以去实例化吗? 不会去实例化抽象类的
	 * 4. 抽象类可不可以有 不抽象的方法 可以的 
	 * 抽象类不去写抽象方法 那我写它干嘛? 定义成为抽象的目的就是不让它去实例化
	 * 
	 * 以后我们去面对问题 就去看父类 有没有这个解决问题的功能 有的话 我们就不需要去面对子类了
	 * 子类中其实就是定义独有的方法
	 * 
	 * abstract 
	 * final  定义了就是最终类 不能被继承 但是抽喜类通常都是做为父类出现的
	 * private 子类找不到方法  抽象类也不能被实例 所以定义私有没有意义
	 * static 抽象方法去调用有意义没
	 * 
	 */
	
	public static void main(String[] args) {
		Dog g = new Dog("豆豆", "公");
		g.eat();
	}
}

abstract class Animal{
	String name;
	String sex;
	
	public Animal(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	abstract void eat();
}

class Dog extends Animal{
	
	public Dog(String name, String sex){
		super(name, sex);
	}
	
	void eat(){
		System.out.println("狗吃骨头");
	}
}

class Pig extends Animal{
	public Pig(String name, String sex){
		super(name, sex);
	}
	void eat(){
		System.out.println("饲料");
	}
}

