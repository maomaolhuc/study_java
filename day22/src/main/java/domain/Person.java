package domain;

public class Person {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class s = Person.class.getClassLoader().loadClass(null);
		System.out.println(s);
	}
	
	public String name;
	int age;
	public Person() {
		// TODO 自动生成的构造函数存根
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void say(){
		System.out.println(name + "..." + age);
	}
	
	public void say(String name){
		System.out.println(name + "...");
	}
	
	public static void show(){
		System.out.println("静态方法");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
