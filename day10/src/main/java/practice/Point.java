package practice;

import javax.management.RuntimeErrorException;

public class Point extends Shape{
	
	private int x;
	private int y;
	
	
	
	// 没有颜色 默认black
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// 指定颜色
	public Point(int x, int y, String color){
		super(color);
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public void draw() {
		System.out.println("在("+this.getX()+","+this.getY()+")画了"+this.getColor()+"颜色的点");
	}
	
	public double distance(){
		return Math.sqrt(x*x+y*y);
	}
	
	@Override
	public int compare(Shape o) {
		// 比较 同类型的 点和线去比较  健壮性
		if(!(o instanceof Point)){
			throw new RuntimeErrorException(null, "不是一个类型");
		}
		
		// 向下转型
		Point otherPoint = (Point)o;
		double result = this.distance() - otherPoint.distance();
		if(result > 0){
			return 1;
		}else if(result < 0){
			return -1;
		}else{
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "{"+this.getX()+", "+this.getY()+"}"+this.getColor();
	}
}










