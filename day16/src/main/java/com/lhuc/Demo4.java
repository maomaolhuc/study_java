package com.lhuc;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface Inter<T>{
	void show(T t);
}

// 不需要创建对喜就明确是String类型
class B implements Inter<String>{
	@Override
	public void show(String t) {
		
	}
}


// 如果不能明确实例对象是什么类型 就把这个类型延伸到创建对象的时候在明确
class A<T> implements Inter<T>{
	@Override
	public void show(T t) {

	}
}




