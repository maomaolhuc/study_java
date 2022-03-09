package homework;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 
		 *  集合 Collection 分为很多不同的容器 区分的标准是数据结构不同
		 *  Collection
		 *  	List: 特点: 有序 可重复 索引
		 *  		ArrayList   可变大小的数组   查找快 增删慢
		 *  		LinkedList  链表  增删快 查找慢 每次都会从头找
		 *  					去重复 equals重写  contains
		 *  					堆栈先进后出  列队先进先出
		 *  		迭代的时候是可以去修改的 listIterator
		 *  		迭代器  forEach for---get获取索引
		 *  	Set: 去重复 顺序是不确定的
		 *  		HashSet 	哈希表 保证元素的唯一性 自定义的对象 重写hasCode() equals()方法   查询快
		 *  		LinkedHashSet  有序 
		 *  		TreeSet     二叉树 对集合元素进行排序 
		 *  					自然排序Compareable compareTo()  比较器Compareator  compare() 
		 *  					自定义对象 必须实现自然排序
		 *  Map 键值对  映射关系
		 *  	HashMap  哈希表 无序 
		 *  	HashTable  同步的 null不能做为key
		 *  	Properties  可以从流中读取 存储数据
		 *  	LinkedHashMap  有序的
		 *  	TreeMap  二叉树 自然排序
		 *  	KeySet  ---- 所有的键
		 *  	Collection.values  --- 所有的值
		 *  	entrySet  ----  关系 --- 键值
		 * 
		 * 
		 */
		
		ShopCart sc = new ShopCart();
		Product p1 = new Product(123, "lidazhao", 10);
		Product p2 = new Product(465, "york", 20);
		Product p3 = new Product(798, "nice", 30);
		Product p4 = new Product(666, "chenduxiu", 40);
		Product p5 = new Product(666, "chenduxiu", 40);
		sc.add(p1, 3);
		sc.add(p2, 4);
		sc.add(p3, 2);
		sc.add(p4, 1);
		sc.add(p5, 1);
		
		sc.remove(p5, 2);
		sc.clearCar();
		sc.print();
	}

}
