package practice;

import javax.management.RuntimeErrorException;

public class Circle extends Shape{
	private Point center;
	private final static Point DEFAULT_POINT = new Point(0, 0);
	private int radius;
	
	// 如果只是一圆心就不创建
	private Circle(Point center){
		this.center = center;
	}
	
	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius,String color) {
		super(color);
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(int radius){
		this(DEFAULT_POINT);
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("以("+center.getX()+","+center.getY()
		+")为圆心,"+radius+"为半径,画一个"+this.getColor()+"颜色的圆");
	}
	
	public double getArea(){
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	public double getRound(){
		return 2*this.radius*Math.PI;
	}
	
	@Override
	public int compare(Shape o) {
		// 比较 同类型的 点和线去比较  健壮性
		if(!(o instanceof Circle)){
			throw new RuntimeErrorException(null, "不是一个类型");
		}
		
		// 向下转型
		Circle otherCircle = (Circle)o;
		double result = this.getRound() - otherCircle.getRound();
		if(result > 0){
			return 1;
		}else if(result < 0){
			return -1;
		}else{
			return 0;
		}
	}
}






























