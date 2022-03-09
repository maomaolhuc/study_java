package com.lhuc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo3 {

	public static void main(String[] args) {
		/**
		 * TreeMap
		 * 
		 * 键值唯一 Set集合
		 * 
		 */
		
		Map<Student1, String> map = new TreeMap<>(new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				int temp = o1.getName().compareTo(o2.getName());
				return temp ==0?o1.getAge() - o2.getAge() : temp;
			}
		});
		
		map.put(new Student1("wonderful", 18), "东莞");
		map.put(new Student1("nice", 23), "成都");
		map.put(new Student1("pu", 20), "广州");
		map.put(new Student1("pu", 20), "tokoy");
		
//		Map<Student1, String> map = new HashMap<>();
//		map.put(new Student1("wonderful", 18), "东莞");
//		map.put(new Student1("nice", 23), "成都");
//		map.put(new Student1("pu", 20), "广州");
//		map.put(new Student1("pu", 20), "tokoy");
		
		Set<Student1> keSet = map.keySet();
		for (Iterator<Student1> iterator = keSet.iterator(); iterator.hasNext();) {
			Student1 key = iterator.next();
			System.out.println(key + "--" + map.get(key));
			
		}
	}

}



class Student1{
	private String name;
	private int age;
	public Student1(String name, int age) {
		super();
		this.name = name;
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
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
}












