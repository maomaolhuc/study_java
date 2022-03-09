package com.lhuc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo5 {

	public static void main(String[] args) {
		/**
		 *  泛型的限定
		 * 
		 */
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		TreeSet<String> set = new TreeSet<>();
//		set.add("abc");
//		set.add("efg");
//		
//		print(set);
//		print(list);
		
		
		ArrayList<Person> list =new ArrayList<>();
		list.add(new Person("daxigua", 18));
		list.add(new Person("shasha", 20));
		list.add(new Person("pu", 23));
		
		LinkedList<Student> set = new LinkedList<>();
		set.add(new Student("wonderful", 18, "男"));
		set.add(new Student("nice", 26, "男"));
		set.add(new Student("hah", 23, "男"));
		
		
		
		print(list);
		print(set);
		System.out.println("==============");
		Collections.sort(set, new PersonCompare());
		Collections.sort(list, new PersonCompare());
		System.out.println("==============");
		print(set);
		print(list);
		
		
	}
	
	// ? 通配符  (? extends E) 这个既可以是E 也可以是E的子类  最大限定 E
	// ? super E  可以是自己也可以是E的父类 最小限定E
	public static void print(Collection<? extends Person> list){
		for (Iterator<? extends Person> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}


class Person{
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}

class Student extends Person implements Comparable<Student>{
	private String sex;
	public Student(String name, int age, String sex) {
		super(name,age);
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}



	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}


		@Override
		public int compareTo(Student o) {
			return this.getName().compareTo(o.getName());
		}
	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", age=" + this.getAge() + ", sex=" + sex + "]";
	};
}

class PersonCompare implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge() - o2.getAge();
	}
}





