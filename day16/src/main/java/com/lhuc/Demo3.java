package com.lhuc;

public class Demo3 {
	public static void main(String[] args) {
		/**
		 *  泛型的是使用
		 *  给类加泛型  --- 泛型类
		 *   
		 *  泛型方法
		 *  非静态方法给方法加泛型 --- 方法操作的类型不确定的时候 可以将泛型定义在方法上
		 *  泛型不要给static写到一起  如果非要写到一起 要明确类型
		 */
		
		Print<String> p = new Print<>();
	
		// p.show("123");
		// p.show(123);
		
		Print.say("123");
		Print.say(123);
	}
}


class Print<S>{
	// 方法上加泛型 
	public void show(S s){ // 形参
		System.out.println(s);
	}
	
	// 静态方法  不行
//	public static void say(S s){ // S什么时候出现的 创建对象之后 静态在创建之前
//		System.out.println(s);
//	}
	
	// 如果要给静态方法加泛型 在静态方法上明确类型 S
	public static<W> void say(W s){ // S什么时候出现的 创建对象之后 静态在创建之前
		System.out.println(s);
	}
	
	
}






