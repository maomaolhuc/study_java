package com.lhuc;

public class ArrayDemo01 {
	
	public static void main(String[] args) {
		
		/*
		 	2010-2018年所有2月的天数
		 	判断是不是闰年   布尔值
		 	year % 4 == 0 && year % 100 !=0
		 	year % 400 == 0
		 	
		 	
		 	方法 function
		 	
		 	访问修饰 静态 无返回值 名字(参数){
		 	
		 	}
		 	
		 	静态方法中 执行的函数 也要写成静态的
		 */
		
		
		
		for(int i=2010;i<=2018;i++){
			int day = getDay(i, 3);
			System.out.println(i +" ---- "+day);
		}
		
	}
	
	public static int getDay(int year, int month) {
		int result = 31;
		switch (month) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				result = 31;
//				break;
			case 2:
				result = isYear(year) ? 29 : 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				result = 30;
				break;
			default:
				result = 31;
				break;
		}
		return result;
	}
	
	public static boolean isYear(int year){
		return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
	}

}
