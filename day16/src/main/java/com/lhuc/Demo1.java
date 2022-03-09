package com.lhuc;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		/**
		 *  菱形泛型 jdk1.5之后才出现的
		 *  使用大部分都是在集合中
		 *  集合中只能装引用类型  
		 *  1. 提前告知运行错误  将运行时期的错误 提前到编译时期去显示
		 *  2. 避免强制类型转换的问题  ClassCastException
		 *  3. 泛型其实就是给编译器去使用的  泛型在编译的阶段会进行一个限定 但是在class文件中还是会被删除的
		 *  
		 *  .java  ----  javac (泛型去限定)  ----  java(执行的时候,会把泛型给清除掉)
		 *  
		 *  
		 */
		// 后边的类型可以省略
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(123);  // new Integer(123)  进行了自动的装箱操作
		list.add(456);
		System.out.println(list);
		
		// 还是会以Object类型返回迭代的内容
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			// object ---> it.next()  
			// 强制类型转换的时候是有风险的 类型不匹配的
			Integer str = it.next();
			System.out.println(str);
		}
		
	}

}
