package com.lhuc;

public class ArrayDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 *  查找
		 *  在一个数组中找到最大的那个一个
		 *  	1. 选择第一项做为比较项 如果比 max就存起来 依次往后去比较
		 *  在一个数组中找 想要找到的那一项
		 *   	1. 任意数组 找某一个元素 找到返回索引(返回值)
		 *      2. 前提是在有序数组中 找到所需要的那个元素
		 *        	二分查找法 --- 折半查找
		 *          在一个有序数组中插入一个值 还让当前的数组保持有序
		 * 
		 */
		int[] arr = {1,2,3,6,20,46};
		System.out.println(getMax(arr));
		System.out.println(getValue(arr, 4));
	}
	
	public static int getMax(int[] arr){
		// 取第一项做为比较项
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getValue(int[] arr, int value){
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(value == arr[i]){
				index = i;
				break;
			}
		}
		return index;
	}
}
