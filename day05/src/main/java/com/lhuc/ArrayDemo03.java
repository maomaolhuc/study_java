package com.lhuc;

import java.util.Arrays;

public class ArrayDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {30,20,10,5,4};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		// 复制快捷键 ctrl+alt+up/down
		System.out.println(Arrays.toString(arr));
		System.out.println(3 ^ 4 ^ 4); // 位异或
	}
	
	
	public static void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]){
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
	}
}
