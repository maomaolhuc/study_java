public class Demo03 {

	public static void main(String[] args) {
		// 类通过实例 这个实例可以去访问属性和方法
		/**
		 *  类中的变量属性 成员变量
		 *  方法中的变量 局部变量
		 *  成员变量中初始化值
		 *  int 0 
		 *  float 0.0
		 *  dobule 0.0
		 *  string null
		 *  char  \u0000
		 *  boolean false
		 *  
		 *  
		 *  虽然说我们可以通过对象.属性去给实例对象添加一定的数据 但是可能有一些误操作
		 *  描述一个事物的时候要尽可能的去贴近这个事物
		 *  为了保证不要对对象的属性有一些操作的操作 就对属性进行了私有话 private 不能够直接访问了
		 *  对数据操作无非就是 获取(get) 设置(set)
		 *  为啥要有get set
		 *  1. 为了避免错误的操作
		 *  2. 因为函数中可以 在方法中可以使用语句 if 可以限制操作
		 *  
		 *  函数在去频繁执行的时候 也是有开销的
		 *  在这个对象直接创建的时候就给他一个初始化的值  构造函数
		 *  
		 */
		Person p = new Person();
//		p.name = "老王";
//		p.age = -10;
		p.setName("老王");
		p.setAge(-40);
		p.say();
	}

}

class Person{
	private String name;
	private int age;
	/*char ch;
	float f;
	double d;
	
	boolean bool;*/
	void say(){
		System.out.println(name+"---"+age);
	}
	
	public void setName(String na){
		name = na;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int ag){
		if(ag < 0 || ag > 130){
			System.out.println("你是妖怪吗?");
			return;
		}
		age = ag;
	}
	
	public int getAge(){
		return age;
	}
}


