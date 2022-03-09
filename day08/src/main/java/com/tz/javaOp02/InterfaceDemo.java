package com.tz.javaOp02;

public class InterfaceDemo {
	public static void main(String[] args) {
		/*
		 * 类是自定义的数据类型
		 * 通过类之间的组合 继承可以操作对象
		 * 看重的是对象的能力 
		 * 拍照是能力 --- 关心的就是拍的好看 但是什么手机不重要
		 * java中定义这个能力(解决问题的)叫做接口 Interface
		 * usb接口 生产电脑的 会把鼠标和键盘焊死吗? 
		 * 弄个口(链接能力 -- 标准)  做电脑的和做鼠标键盘的 符合口的大小就可以去配对了
		 * 接口相当于 扩展 一方去定义这个规则 另外一方按照这个规则去做事
		 * 
		 * 接口的出现是为了什么
		 * JAVA中没有多继承 因为会出现不确定性 单继承 
		 * 
		 * 接口中都是抽象方法
		 * 成员变量final static 必须要有初始值
		 * 没有构造方法的  接口不能被实例  
		 * 
		 * 类与类之间是继承关系 但是只能去单继承 
		 * 类与接口叫实现   可以多实现
		 * 实现接口的这个类 也必须去重写抽象方法
		 */
		
		
		
		
		
		
		Note note = new Note();
		note.useUsb(new Mouse());
		note.useUsb(new KeyBoard());
	}
}


class Note{
//	void useMouse(Mouse m){
//		m.run();
//		m.close();
//	}
//	
//	void useKey(KeyBoard k){
//		k.run();
//		k.close();
//	}
	
	void useUsb(USB s){
		s.run();
		s.close();
	}
	
}

interface USB{
	public void run();
	public void close();
}

class Mouse implements USB{
	
	public void run(){
		System.out.println("鼠标运行");
	}
	
	
	public void close(){
		
		System.out.println("鼠标停止");
	}
}

class KeyBoard implements USB{
	
	public void run(){
		System.out.println("键盘运行");
	}
	
	public void close(){
		System.out.println("键盘停止");
	}
}






/*
interface Inter1{
	public abstract void eat();
}

interface Inter2{
	public abstract void say();
}

class A implements Inter1,Inter2{
	@Override
	public void eat() {
		System.out.println("吃....");
	}
	
	@Override
	public void say() {
		System.out.println("说....");
	}
}*/

