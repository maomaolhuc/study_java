package reflect_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import domain.Person;

public class Demo01 {

	public static void main(String[] args) throws Exception{
		/**
		 * 
		 * 	反射技术
		 * 	1. 获取指定的构造函数
		 * 	2. 通过构造函数初始化对象
		 */
		// 看object由那个类加载器加载
//		ClassLoader classloader = Class.forName("java.lang.Object").getClassLoader();
//		System.out.println(classloader);

//		Class pc = Person.class;
//		System.out.println(pc.getName());
//		Field[] arr = pc.getFields();
//		for (Field field : arr) {
//			System.out.println(field);
//		}
		
		
		Person person = new Person();
		Class c = person.getClass();
		Class c1 = c.newInstance().getClass();
		System.out.println(c1);
		
		String clsName = "domain.Person";
		Class cls = Class.forName(clsName);
		Object obj = cls.newInstance();
		// 异常1: 初始化异常 没有空参的构造函数
		// 异常2: 权限不够
		System.out.println("空参构造器:" + obj);
		getConstructor();
	}
	
	public static void getConstructor() throws Exception{
		String className = "domain.Person";
		Class cls = Class.forName(className);
		Constructor con = cls.getConstructor(String.class, int.class);
		// 有了构造器对象, 初始化对象
		
		Object obj = con.newInstance("xq",18);
		
		System.out.println("指定构造器:" + obj);
	}

}
