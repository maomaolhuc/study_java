public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 
		 * 初始化的时候添加姓名和年龄 使用构造函数 构造函数的写法 类名一致
		 * 构造函数默认return 可以不去写
		 * 但是可不可以写 可以的 如果说初始化不满足条件 结束运行return
		 * 
		 * 发现了一个问题? 前边那个没写构造函数 为啥他就可以初始化呢?
		 * 1. 当没有去指定的时候 编译的时候默认去添加一个无参数的构造函数
		 * 2. 当我们去指定了一个构造函数的时候 编译的时候就不会去添加了
		 * 
		 * 构造函数可以有多个
		 * 函数是可以去重载的 overload
		 * 和返回值无关 同一个函数不同的参数列表就可以构成重载
		 * 
		 * 构造函数可不可以私有化? 可以的 
		 * 目的是为了不让这个对象创建实例
		 * 
		 * 
		 * 构造函数之间的相互调用问题?
		 * 互相去调用的时候 通过this(实参列表) 必须要写在构造函数中的第一句
		 * 
		 */
		People p = new People("老王", 40);
		p.say();
		
	}
	
	
	/*public static int a(){
		return 1;
	}
	
	public static void a(int a){
		
	}
	
	public static void a(boolean a, int b){
		
	}
	
	public static void a(int b, boolean a){
		
	}*/
}

// alt+shift+s
class People{
	
	private String name;
	private int age;
	
	
	
	public People() {
		
	}
	
	
	private People(String name){
		this.name = name;
	}
	
	public People(String name, int age) {
//		if(age < 0){
//			return;
//		}
		this(name);
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 130)
			return;
		this.age = age;
	}
	
	void say(){
		System.out.println(this.name +"---"+this.age);
	}
}
