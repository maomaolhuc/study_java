package test;

public class InterDemo1 {

	public static void main(String[] args) {
		/*
		 *  alt + / 提示
		 *  能力
		 *  
		 *  看这个能力的时候 不去看对象到底是谁 
		 *  谁实现了这个能力 都符合的
		 *  面向了接口 更加的灵活了 解耦 程序见的耦合性就低了
		 */
		
		ErHa erHa = new ErHa();
//		erHa.eat();
		JingQuan jq = new JingQuan();
		Cat c = new Cat();
//		catchMan(c);
//		catchMan(jq);
//		
		Note n = new Note();
		n.use(new Key());
		n.use(new Mouse());
		n.use(new Shoubing());
	}
	
	
	public static void catchMan(InterCatch c){
		c.catchMan();
	}

}

abstract class Dog{
	abstract public void eat();
	abstract public void sleep();
}

class ErHa extends Dog{
	@Override
	public void eat() {
		System.out.println("吃骨头");
	}
	
	@Override
	public void sleep() {
		System.out.println("趴着睡");
	}
}

interface InterCatch{
	public void catchMan();
}

class JingQuan extends Dog implements InterCatch{
	@Override
	public void eat() {
		System.out.println("高级狗粮");
	}
	
	@Override
	public void sleep() {
		System.out.println("躺着睡觉");
	}
	
	@Override
	public void catchMan() {
		System.out.println("我是警犬 我会抓坏蛋");
	}
}

class Cat implements InterCatch{
	public void eat() {
		System.out.println("老鼠");
	}
	
	public void sleep() {
		System.out.println("圈着睡觉");
	}
	
	public void catchMan() {
		System.out.println("我是黑毛警长  我会抓坏蛋");
	}
}



class Note{
//	void useKey(Key k){
//		k.close();
//		k.run();
//	}
//	
//	void useMouse(Mouse m){
//		m.close();
//		m.run();
//	}
	
	void use(Usb s){
		s.run();
		s.close();
	}
	
}


interface Usb{
	void run();
	void close();
}


class Key implements Usb{
	public void run(){
		System.out.println("键盘运行");
	}
	
	public void close(){
		System.out.println("键盘关闭");
		
	}
}

class Mouse implements Usb{
	public void run(){
		System.out.println("鼠标运行");
	}
	
	public void close(){
		System.out.println("鼠标关闭");
	}
}

class Shoubing implements Usb{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("手柄链接");
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("手柄关闭");
	}
	
}

























