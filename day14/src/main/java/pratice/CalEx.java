package pratice;

import java.util.Calendar;
import java.util.Scanner;

public class CalEx {
	/**
	 *  通过输入一个年月日 获取到当月的这个日历 打印出来 并且[]把输入的这个日期包起来
	 * 
	 */
	public static void main(String[] args) {
		CalEx cal = new CalEx();
		cal.year = cal.getInput("年");
		cal.month = cal.getInput("月");
		cal.day = cal.getInput("日期");	
		cal.printCal();
	}
	
	private int year;
	private int month;
	private int day;
	
	public int getInput(String str){
		System.out.println("请输入"+str);
		return new Scanner(System.in).nextInt();
	}
	
	public void printCal(){
		// 日历 6行 7列  通过Caldendar.set(year, month, day) 当月的日历
		int[][] arr = new int[6][7];
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 0);
		int max = cal.get(Calendar.DAY_OF_MONTH);
		// 星期天开始的
		for(int i=1;i<=max;i++){
			cal.set(year, month-1, i);
			int row = cal.get(Calendar.WEEK_OF_MONTH)-1;
			int col = cal.get(Calendar.DAY_OF_WEEK)-1;
			arr[row][col] = i;
		}
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				if(arr[x][y] != 0){
					if(arr[x][y] == day){
						System.out.print("["+arr[x][y]+"]");
					}else{
						System.out.print(arr[x][y]);
					}
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	
	
	

}
