package StringDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 字符的比较
		 * 是因为实现了 Comparable接口 重写了compareTo 方法
		 */
		
		String s1 = "bcha";
		String s2 = "baa";
		
		System.out.println(s1.compareTo(s2));
		
		Student[] arr = new Student[]{
				new Student("pu", 20),
				new Student("jigongbao", 18),
				new Student("chengduxiu", 18),
				new Student("Lebron James", 27)
		};
		
		System.out.println(Arrays.toString(arr));
		/*for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].compareTo(arr[j]) > 0){
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}*/
		// System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(!(o1 instanceof Student)){
					throw new ClassCastException("类型不对");
				}
				
				if(!(o2 instanceof Student)){
					throw new ClassCastException("类型不对");
				}
				Student s1 = (Student)o1;
				Student s2 = (Student)o2;
				int temp = s1.getAge() - s2.getAge();
				return temp == 0 ? s1.getName().compareTo(s2.getName()) : temp;
			}
		});
		
		new Student("a", 10).method().method().method();
		
		System.out.println(Arrays.toString(arr));
	}
}





class Student implements Comparable{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public Student method(){
		
		
		return this;
	}
	
	/**
	 * @return the name
	 */
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



	/**
	 * 按照年龄排序
	 * 
	 * 年龄一样 换成姓名排序
	 * 两个条件 一个age 一个name
	 * alt+/
	 */
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Student)){
			throw new ClassCastException("类型不对");
		}
		// 转成student才可以使用age
		Student s = (Student)o;
		int temp = this.age - s.age;
		return temp == 0 ? this.name.compareTo(s.name) : temp;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}









