package practice;

import java.util.Arrays;

public class CompareUtil {

	public static void main(String[] args) {
		// 比较的肯定是同一图形
		// 接受的任意的同一类型的图形
		Point[] arr = new Point[]{
			new Point(3, 4),
			new Point(1, 2),
			new Point(6, 8)
		};
		
		Circle[] arr1 = new Circle[]{
			new Circle(new Point(3, 4), 10),
			new Circle(new Point(1, 2), 6),
			new Circle(new Point(6, 8), 8)
		};
		
		Line[] arr2 = new Line[]{
			new Line(new Point(3, 4), new Point(6, 8)),
			new Line(new Point(0, 10), new Point(0, 8)),
			new Line(new Point(0, 0), new Point(5, 5))
		};
		
		System.out.println("距离原点最远的点是:" + max(arr));
		System.out.println("最长的线是:" + max(arr1));
		System.out.println("最大的圆是:" + max(arr2));
		
		System.out.println("距离原点最近的点是:" + min(arr));
		System.out.println("最短的线是:" + min(arr1));
		System.out.println("最小的圆是:" + min(arr2));
		// System.out.println(min(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		sort(arr1);
		System.out.println(Arrays.toString(arr1));
		sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	
	public static Shape max(Shape[] arr){
		Shape max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max.compare(arr[i]) < 0){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static Shape min(Shape[] arr){
		Shape min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(min.compare(arr[i]) > 0){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void sort(Shape[] arr){		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j].compare(arr[i]) < 0){
					Shape temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
