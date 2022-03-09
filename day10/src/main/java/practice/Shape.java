package practice;

/*
 *  1. 创建图形抽象类Shape 图形有color属性  draw画画方法
 *     Shape具有构造函数 (空参构造函数默认颜色为black)
 *  2. 创建Point类继承Shape 重写draw方法 
 *     打印:在(x,y)画了color颜色的点  
 *     Point具有一个distance方法计算到原点的距离
 *  3. 创建Line类继承Shape 重写draw方法 
 *     打印:将点(x1,y1) (x2,y2)连成一条color颜色的线
 *     Line具有一个length方法计算Line的长度
 *  4. 创建一个Circle类继承Shape类 重写draw方法 
 *     打印:以(x,y)为,radius为半径,画一个color颜色的圆
 *     Circle具有方法getArea getRound方法计算圆的面积与周长
 *     如果没有指定center默认为原点
 *  5. 创建带有箭头的ArrowLine类 继承Line 具有方向arrow属性 重写draw调用父类的draw方法
 *     并打印: 方向为arrow
 *  6. 创建一个接口  接口实现compare方法
 *     Point需要具有比较距离的方法 compare
 *     Line需要具有比较距离的方法 compare 
 *     Circle需要具有比较大小的方法 compare 
 *  7. 创建图形管理器
 *     往里边添加图形的功能
 *	        来调用图形draw  (容器)
 *  8. 创建CompareUtil工具类
 *     max方法   比较同一图形 获取最大的
 *     min方法   比较同一图形 获取最小的
 *     sort方法  比较同一图形 排序
 *     例如执行 max(obj[] objs); 返回最大的那一项
 */

abstract public class Shape implements ShapeCompare{
	private String color;
	private final static String DEFAULT_COLOR = "black";
	
	public Shape(){
		this(DEFAULT_COLOR);
	}
	
	public Shape(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	abstract public void draw();
	
}




























