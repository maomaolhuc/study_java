import java.util.Arrays;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 *  杨辉三角
		 *1       1
		 *2      1 1    arr[1][0]  arr[1][1]
		 *3     1 2 1  arr[2][0]  arr[2][1]  arr[2][1]
		 *4    1 3 3 1     
		 *5   1 4 6 4 1
		 *6  1 5 10 10 5 1
		 *  
		 *  每一行相当于二维数组的子项 但是每一个子项的长度是不是不一样的 
		 *  1. 每一项的索引和长度的关系 +1
		 *  2. 每一个子项的开头和结尾都是1 arr[i][0] = 1  arr[i][arr[i].length-1] = 1
		 *  3. 除去开头和结尾中间的每一项都是前一个子项的  
		 *  arr[index][i] = arr[index-1][i] + arr[index-1][i-1]
		 *  int[][] arr = new int[6][]
		 *  
		 */
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			// 1. 遍历初始化每一项的长度
			arr[i] = new int[i+1];
			
			// 2. 填空 遍历每一个子项 
			for (int j = 0; j < arr[i].length; j++) {
				// 3. 开头和结尾都是1
				if(j==0 || j==arr[i].length-1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}*/
	}

}
