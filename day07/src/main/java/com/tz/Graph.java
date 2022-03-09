package com.tz;

/*
 * 实现一个几何的类 工具 
 *  计算点与点之间的距离
 *  	(x1-x1)^2 + (y1-y2)^2
 *  计算圆的面积
 *  计算点距离圆点的位置
 *     距离原点的(0,0)
 *  计算圆的周长
 *  
 *  类与类之间的组合使用
 *  类就是自定义的数据类型   数据类型之间是不是可以去组合 类之间的组合
 *  
 *  通过实现自定义的数据类型  ##封装##这个类型的属性 操作  隐藏实现的细节  把复杂的东西 不断的简化
 *  
 */
public class Graph {
	// 1. 怎么样就不会去实例化了呢?
	private Graph(){}
	
	public static double length(Pointer p1, Pointer p2){
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2)
				+ Math.pow(p1.getY() - p2.getY(), 2));
	}
	
	public static double distance(Pointer p){
		return Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY());
	}
	
	public static double getRound(Cirle c){
		return 2*c.getRadius()*Cirle.getPi();
	}
	
	public static double getArea(Cirle c){
		// πr^2
		return Cirle.getPi()*Math.pow(c.getRadius(), 2);
	}
}
