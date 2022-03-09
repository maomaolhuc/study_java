package reflect_test;

import java.lang.reflect.Method;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(0);
		array.add(2);
		System.out.println("-------添加整型数据后-------");
		System.out.println(array);
		Class c1 = array.getClass();
		Method m1 = c1.getMethod("add", Object.class);
		m1.invoke(array,"hello");
		m1.invoke(array, "world");
		m1.invoke(array, "java");
		System.out.println("-------添加字符串数据后-------");
		System.out.println(array);
	}
}
