package Room;

import java.util.Scanner;

public class Hotel {
	
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.printRooms();
		
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("请输入操作 1:订房   2:退房   3:退出");
			int num = in.nextInt();
			switch (num) {
			case 1:
				System.out.println("请输入房间号");
				hotel.order(in.next());
				break;
				
			case 2:
				System.out.println("请输入房间号");
				hotel.back(in.next());
				break;

			default:
				System.exit(0);
				break;
			}
		}
	}
	
	// 容器装所有的房间
	public Room[][] rooms;

	public Hotel(){
		this(3, 5);
	}
	
	private Hotel(int row, int num) {
		// 未占用的状态
		rooms = new Room[row][num];
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				if(i == 0){
					rooms[i][j] = new Room("普通间", ""+(i+1)+0+j,false);
				}
				
				if(i == 1){
					rooms[i][j] = new Room("双人间", ""+(i+1)+0+j,false);
				}
				
				if(i == 2){
					rooms[i][j] = new Room("豪华间", ""+(i+1)+0+j,false);
				}
			}
		}
	}
	
	
	public void order(String num){
		
		boolean flag = true;
		// 每次订房间的时候 需要去检查一下这个房间是不是被定了
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				if(rooms[i][j].getNum().equals(num) && rooms[i][j].isUse() == false){
					System.out.println("恭喜开房成功");
					rooms[i][j].setUse(true);
					flag = false;
				}
			}
		}
		printRooms();
		if(flag){
			System.out.println("不好意思这个房间已经被占用了");
		}
	}
	
public void back(String num){
		
		boolean flag = true;
		// 每次订房间的时候 需要去检查一下这个房间是不是被定了
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				if(rooms[i][j].getNum().equals(num) && rooms[i][j].isUse() == true){
					System.out.println("退房成功，欢迎下次再来");
					rooms[i][j].setUse(false);
					flag = false;
				}
			}
		}
		printRooms();
		
		if(flag){
			System.out.println("你咋这么秀呢");
		}
	}
	
	
	public void printRooms(){
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				System.out.print(rooms[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
}
