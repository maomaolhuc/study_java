import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 数组 上节课讲了一些基本的排序算法
		 * 二维数组
		 * int[][] arr = new int[4][];
		 * 
		 */
		// 定义了一个维度是3的二维数组
		// 多行注释 ctrl+shift+/ 
		/*
		int[][] arr = new int[3][];
		// 分别给每一个去初始长度
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		*/
		
		// 输入人员的信息存储起来 name age sex
		System.out.println("请输入存储多少个人");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		// 定义个二维数组用来存储
		String[][] arr = new String[num][3];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入姓名");
			String name = in.next();
			arr[i][0] = name;
			System.out.println("请输入年龄");
			String age = in.next();
			arr[i][1] = age;
			System.out.println("请输入性别");
			String sex = in.next();
			arr[i][2] = sex;
		}
		
		for (int i = 0; i < arr.length; i++) {
			String[] p = arr[i];
			System.out.println(p[0]+"---"+p[1]+"----"+p[2]);
		}
	}

}
