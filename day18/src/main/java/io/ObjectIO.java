package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectIO {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 *  存档
		 *  .object
		 *  序列化 类必须要实现 Serializable 接口
		 *  指定一个 ID  要不然每次修改 都会不匹配
		 */
		
		// 序列化
		/*
		Person person = new Person("李大钊", 20);
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:/Users/TZ-xq/Desktop/18/person.object"));
		oos.writeObject(person);
		oos.close();
		*/
		
		// 反序列化
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:/Users/TZ-xq/Desktop/18/person.object"));
		Object o = ois.readObject();
		System.out.println(o);
	}

}




class Person implements Serializable{
	private String name;
	private int age;
	private boolean married;
	private String string;
	private static final long serialVersionUID = 1123L;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}












