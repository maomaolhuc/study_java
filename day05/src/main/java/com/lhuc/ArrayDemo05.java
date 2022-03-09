package com.lhuc;

import java.util.Arrays;

public class ArrayDemo05 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,10,20,40};
		int index = search(arr, 7);
		System.out.println(-index-1);
		// System.out.println(Arrays.toString(insertArr(arr, 7)));
		System.out.println(-Arrays.binarySearch(arr, 7)-1);
	}
	
	public static int[] insertArr(int[] arr, int value){
		int index = search(arr, value);
		int len = arr.length;
		// 插入一个  新数组 需要加一长度
		int[] newArr = new int[len+1];
		// 怎么插入呢?
		for(int i=0;i<len;i++){
			// 小于index 数组前半部分
			if(i < index){
				newArr[i] = arr[i];
			}else{
				// 后半部分 i+1 放到新数组
				newArr[i+1] = arr[i];
			}
		}
		newArr[index] = value;
		return newArr;
	}
	
	public static int search(int[] arr, int value){
		int min = 0;
		int max = arr.length - 1;
		int mid = 0;
		while(min <= max){
			mid = (min + max) >> 1;
			// 中间值比 value大 证明在 左边 max = mid - 1 
			if(arr[mid] > value){
				max = mid - 1;
			// 中间值比 value小 证明在 右边 min = mid + 1 
			}else if(arr[mid] < value){
				min = mid + 1;
			}else{
				return mid;
			}
		}
//		return -1;
		return -(min+1);  // 插入点
	}
}
