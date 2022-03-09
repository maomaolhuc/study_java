package wrap;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	包装类  以后使用的时候基本都是使用包装类
		 * 		 基本数据类型 包装类用于和字符串转换
		 * 	byte    Byte
		 * 	short   Short
		 * 	int     Integer
		 * 	long    Long
		 * 	float   Float
		 * 	double  Double
		 * 	boolean Boolean
		 * 	char    Character    
		 */
		Integer a = new Integer(1);
		Integer b = new Integer("1");
		
		// 进制写的啥 前面的数字就是什么进制的  字符串转成int
		/*int num1 = Integer.parseInt("10");
		int num2 = Integer.parseInt("51",8);
		int num3 = Integer.parseInt("A1",16);
		boolean t = Boolean.parseBoolean("true");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(t);*/
		
		
		// 基本数据类型的包装类是可以去使用方法和属性的 基本数据类型需要装箱之后才可以去调用方法和属性
		// 包装类 拆箱是可以去运算的  
		// jdk1.5 之后进行了自动拆装箱
		Integer num = 10;  //   装箱过程   
		Integer num1 = new Integer(10);
		Integer num2 = Integer.valueOf(10);  // 返回一个Integer实例
		//num = num + 10;  
		// Integer num --> int num + 10 ---> num ---> Integer
		// num = num.intValue(); // int 基本数据类型
		// num = Integer.valueOf(num + 10);
		num = Integer.valueOf(num.intValue() + 10);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
	}

}
















