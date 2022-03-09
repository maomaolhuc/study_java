package ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Demo01 {

	public static void main(String[] args) {
		// 构造一个初始容量为十的空列表。  ArrayList 就是数组的实现 数组是具有索引的
		List list = new ArrayList();
		ArrayList list1 = new ArrayList();
		// 可以去添加不同的数据类型 但是通常都会写一样的数据
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(4);
		list1.addAll(list);
//		list.remove(2);
		System.out.println(list);
		System.out.println(list1);
		
		// 有序的 
		for(int i=0;i<list.size();i++){
			// System.out.println(list.get(i));
		}
		
		System.out.println(list);
		// 是可以在迭代的过程中去修改元素的
		ListIterator it =  list.listIterator();
		// 不能再迭代的过程中去修改元素的
		// Iterator it = list.iterator();
		while(it.hasNext()){
			int num = (int)it.next();
			if(num == 3)
				 it.add(10);
//			System.out.println(it.next());
		}
		System.out.println(list);
		
		// 这种方式会多一点 迭代器
//		for(Iterator it = list.iterator();it.hasNext();){
//			int num = (int)it.next();
//			if(num == 3)
//				list.add(10);
//			System.out.println(num);
//		}
//		
//		System.out.println(list);
		
		
		
		// toArray 为啥需要有这个方法 因为集合是可变得 转成数组目的其实就是为了不让改变了
		int[] arr = {1,2,3,4};
		// 大坑 小心
		List list2 = Arrays.asList(arr); // 数组转集合   方便去添加 会有一个异常
		// java.lang.UnsupportedOperationException 
		// list2.add(5);  
//		Object[] arr2 = list2.toArray(); // 集合转成数组 不让在修改
		
	}

}
