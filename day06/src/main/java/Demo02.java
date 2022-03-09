public class Demo02 {
	static int a = 1;
	public static void main(String[] args) {
		/**
		 *  面向对象
		 *  oop -- Object Oriented Programming 以对象为导向的程序设计
		 *  物以类聚  人以群分
		 *  方法其实就是一个简单的封装体 我们所封装的函数其实只能在当前类中使用 操作数组的方法可不可以放到一个工具里边
		 *  当我们不断的封装的时候 面对的细节就不存在了 面对的都是功能
		 *  数据类型
		 *  
		 *   byte short int long float double boolean char
		 *   class [] interface
		 *   每一个数据类型其实都有自己的属性和方法
		 *   程序做的事情其实就是处理数据, 某种程度上可以理解class相当于一个自定义的数据类型 操作 
		 *   自定义数据类型的时候可以有属性和方法
		 *   
		 *   一个数据类型主要由几部分构成
		 *   	1. 类型本身有属性           
		 *   	2. 类型本身可以去操作
		 *      3. 创建 通过变量去体现  int a
		 *   	4. 创建的实例可以去操作
		 *   注意并不是所有的数据类型都有这些 有些只有操作 属性
		 *   
		 *   
		 */
		
		// 大西瓜挖掘机炒菜
		// 1. 挖掘机
		Car car = new Car();
		// 2. 大西瓜
		Xigua xigua = new Xigua();
		// 3. 炒菜
		xigua.drive(car);
	}

}

// 人类  --- 看成人的属性和人的行为构成的  人都有一个头 两条腿 两胳膊 名字 年龄 性别
//    对一个事物的描述
// 具体的人  --- 是该类的一个实体 这个实体具有该类的属性和行为
//class Person{
//	int age;
//	String name;
//}



/**
 * 大西瓜如何用挖掘机炒菜?
 * 几个事物 2事物 
 * 大西瓜
 * 	  name  
 *    age  属性
 *    行为 会开挖掘机
 * 挖掘机
 *    color
 *    lunzi
 *    翻炒  行为
 * 把一个事物描述 转变为代码
 * 通过分析把人和挖掘机进行了描述可以发现事物都是由属性和方法构成的通过代码得到了体现
 */

// 向下复制 ctrl+shift+up/down  移动alt+up/down
class Car{
	String color;
	void fanchao(){
		System.out.println("挖掘机翻炒开始");
	}
}

class Xigua{
	String name;
	int age;
	void drive(Car c){
		System.out.println("大西瓜会操作挖掘机");
		c.fanchao();
	}
}







