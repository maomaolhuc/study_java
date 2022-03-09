package com.lhuc;

import java.util.Arrays;

public class ArrayDemo02 {

	public static void main(String[] args) {
		/*
		 *  说到数组都会有一个问题就是排序
		 *  基本的算法我们要去了解
		 * 	冒泡 选择排序
		 *  想法转换成代码
		 */
		
		int[] arr = {13,5,31,8,20};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	// 选择排序 始终用第一个去比较
	public static void sort(int[] arr){
		// 控制比较多少趟
		for(int i=0;i<arr.length-1;i++){
			// 控制每一趟比较了多少次
			for(int j=i+1;j<arr.length;j++){
				// 交换了
				if(arr[i] > arr[j]){
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}












