package practice;

import javax.management.RuntimeErrorException;

public class Line extends Shape{
	private Point p1;
	private Point p2;
	
	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Line(Point p1, Point p2,String color) {
		super(color);
		this.p1 = p1;
		this.p2 = p2;
	}


	public Point getP1() {
		return p1;
	}

	
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	
	public Point getP2() {
		return p2;
	}

	
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	@Override
	public void draw() {
		System.out.print("将点("+p1.getX()+","+p1.getY()+") ("+p2.getX()
		+","+p2.getY()+")连成一条"+this.getColor()+"颜色的线");
		
	}
	
	public double length(){
		return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) 
				+ Math.pow((p1.getY() - p2.getY()), 2));
	}
	
	@Override
	public int compare(Shape o) {
		// 比较 同类型的 点和线去比较  健壮性
		if(!(o instanceof Line)){
			throw new RuntimeErrorException(null, "不是一个类型");
		}
		
		// 向下转型
		Line otherLine = (Line)o;
		double result = this.length() - otherLine.length();
		if(result > 0){
			return 1;
		}else if(result < 0){
			return -1;
		}else{
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
	}
	
	
}





















































