package com.tz.javaOp02;

public class DuoTai {

	public static void main(String[] args) {
		
		/*
		 * 
		 *  爸爸
		 *    方法 
		 *    	 eat 
		 *       say() 大人在说话
		 *	儿子 继承了爸爸
		 *       eat say
		 *  这种方式就是多态
		 *  成员变量
		 *  成员函数
		 *  静态
		 */
		Zi zi = new Zi();
//		System.out.println(zi.say);
//		System.out.println(zi.youxi);
		// 老爸不在家 儿子装成爸爸
		// 父类的引用指向子类自己  以父亲的名义玩游戏
		// 向上转型  
		Fu f = new Zi();
		f.say();
		System.out.println(f.say);
		System.out.println(f.youxi);
		// 向下转型  老爸回家了 儿子是不是要变回去
		Zi zz = (Zi)f;
		System.out.println(zz.say);
		System.out.println(zz.youxi);
	}

}

class Fu{
	String say = "大人说话";
	String youxi = "吃鸡";
	void say(){
		System.out.println("大人说话");
	}
}

class Zi extends Fu{
	String say = "嘤嘤嘤";
	String youxi = "小霸王";
	
	void say1(){
		System.out.println("小孩说话");
	}
}
