package diff;

public class Question {
	public static void main(String[] args) {
		
	}
}

interface Inter{
	void a();
	void b();
	void c();
}

// 为什么抽象类可以没有抽象方法?
// 发现这个抽象类 没有抽象方法
// 具体方法 模板   
// 抽象类中 定义的普通方法一般是给子类去调用的方法, 一个或者多个抽象的留给子类去实现 模板模式
abstract class templ implements Inter{
	public void a(){};
	public void b(){};
	public void c(){};
	
	abstract public void say();
}

class AA extends templ{
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
}


class BB extends templ{
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
}