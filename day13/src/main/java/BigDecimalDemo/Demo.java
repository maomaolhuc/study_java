package BigDecimalDemo;

import java.math.BigDecimal;

public class Demo {
	public static void main(String[] args) {
//		double a = 123.123;
//		double b = 1000;
//		System.out.println(a/b); // 误差 错误
		
//		BigDecimal bd = new BigDecimal(100.00);
//		BigDecimal scal = bd.setScale(3,5);
//		System.out.println(scal);
//		System.out.println(bd);
		
		// valueOf 传递参数运算是可以的  
		// 构造方法不行? 传入浮点不行 传入字符串可以没精度问题
//		BigDecimal a = BigDecimal.valueOf(123.123);
//		BigDecimal b = BigDecimal.valueOf(1000);
		BigDecimal a = new BigDecimal("125");
		BigDecimal b = new BigDecimal("1000");
		// setScale(保留的位数, 四舍五入)
		System.out.println(a.divide(b));
	}
	
	
	public static BigDecimal add(double a, double b){
		return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
	}
	
	public static BigDecimal divide(double a, double b){
		return BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b));
	}
	
}
