package reflect_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import domain.Person;

public class Demo2 {

	public static void main(String[] args) throws Exception{
		/**
		 * 
		 * 	反射技术
		 * 	1. 获取字段
		 */
		getField();
	}
	
	public static void getField() throws Exception{
		String clsName = "domain.Person";
		Class cls = Class.forName(clsName);
		String fieldName = "name";
		// 获取 公共 字段
		Field field1 = cls.getField(fieldName);
		Field field2 = cls.getDeclaredField("age");
		// System.out.println(field1);
		// System.out.println(field2);
		
		// 共有的
		Field[] arr1 = cls.getFields();
		// 私有的
		Field[] arr2 = cls.getDeclaredFields();
		for (Field field : arr1) {
			System.out.println(field + "..共有");
		}
		for (Field field : arr2) {
			System.out.println(field + "..私有");
		}
		
		Object obj = cls.newInstance();
		field1.set(obj, "xq");
		// field2.set(obj, 18); // 异常 被私有的不行 没有修饰的也不行
		// AccessiableObject中的方法 setAccessiable方法 才可以设置 
		// 取消访问权限
		field2.setAccessible(true); 
		field2.set(obj, 18); 
		System.out.println(obj);
		System.out.println(field2.get(obj));
	}

}
