package reflect_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import domain.Person;

public class Demo3 {

	public static void main(String[] args) throws Exception{
		/**
		 * 
		 * 	反射技术
		 * 	1. 获取方法
		 */
//		getMethod();
//		getStaticMethod();
		
	

	}
	
	public static void getMethod() throws Exception{
		String clsName = "domain.Person";
		Class cls = Class.forName(clsName);
		
		String methodName = "say";
		Method method = cls.getMethod(methodName, String.class);
		method.invoke(cls.newInstance(), "反射传入的");
		
	}
	
	public static void getStaticMethod() throws Exception{
		String clsName = "domain.Person";
		Class cls = Class.forName(clsName);
		
		String methodName = "show";
		Method staticMethod = cls.getMethod(methodName, null);
		staticMethod.invoke(cls.newInstance(), null);
	}

}
