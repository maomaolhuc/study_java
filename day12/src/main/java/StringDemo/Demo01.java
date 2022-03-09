package StringDemo;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * String 类 是final类
		 * String 是一个不可以被改变的
		 * 
		 */
		// String s1 = "abc";
		// String s2 = "abc"; // 不会被创建了
		// System.out.println(s1 == s2); // true
		// String a = "hello";
		// String b = "world";
		// 相等的
		// System.out.println("helloworld" == "hello"+"world"); // true
		// 为啥是false呢? a b变量
		// System.out.println("helloworld" == a + b); // false
		// System.out.println("helloworld".equals(a+b)); // true
		// String s3 = "123";  		   // s3 创建一个对象
		// String s4 = new String("123"); // s4创建两个对象  不会这样子做
		// System.out.println(s3 == s4);  // false
			
		// char[] chs = {'1','2','3'};
		// System.out.println(new String(chs));
			
		
		// 字符串中方法无非就是 截取 切割 替换 索引
		// String str = "123456789";
		// System.out.println(str.charAt(2)); // 3
		// String sub = str.substring(0, 5);  // [m, n)
		// System.out.println(sub);
		
		
		// String str = "Demo.java";
		// 偏移位置 从偏移位置开始算
		// System.out.println(str.startsWith("emo", 1));
		// System.out.println(str.endsWith(".java"));
		
		
		// String其实就是一个char数组拼起来的
//		String str = "     hello world     ";
//		System.out.println("|"+str+"|");
//		System.out.println("|"+trim(str)+"|");
//		System.out.println(str.trim());
//		System.out.println(str.replace('h', 'x'));
//		System.out.println(str.replaceAll("hel", "xxx"));
		
		// toCharArray();  把Stirng变成一个字符数组
		
//		String str1 = "abc abc abc";
//		String[] arr = str1.split(" ");
//		System.out.println(Arrays.toString(arr));
		
		// 金额转换 123 
		String str = "hello world";
		// 0~ ffff 返回之内的是bmp 字符  超出这个最小的返回 添加进来的字符叫增补字符
		int index = str.indexOf('o');
		System.out.println((int)'a');
		int index1 = str.indexOf("o");
		System.out.println(index);
		System.out.println(index1);
		
	} 
	
	// trim 去除 两边
	public static String trim(String str){
		String temp = str.substring(0);
		int start = 0;
		int end = temp.length() - 1;
		
		// 从前面后面扫描，记录恰好不要遇到空格的start,end  .用substring截取
		while(temp.charAt(start) == ' ' && start <= end){
			start++;
		}
		
		while(temp.charAt(end) == ' ' && start <= end){
			end--;
		}
		
		return temp.substring(start, end+1);
	}
	
}





















