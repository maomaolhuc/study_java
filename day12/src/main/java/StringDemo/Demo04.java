package StringDemo;

public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 
		 * String是不可以被更改的
		 * StringBuffer 线程安全的 同步
		 * 	是一个长度可以变化的  
		 * 	容器 缓冲区
		 *  可以操作多个数据类型的
		 *  最终通过toString方法返回字符串
		 *  
		 * StringBuilder 非安全的
		 * 	jdk1.5之后的
		 *  和StringBuffer方法是一样的
		 *  提高效率
		 *  简化书写
		 *  建议使用 StringBuilder
		 *  
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append(true).append(123).append('a');
		sb.delete(0, 4);
		sb.insert(1, " world");
		sb.reverse();
		String str = sb.toString();
		System.out.println(str);
		
		
		Integer[] arr = {31,21,11,69,9,4,5,2,100};
		// 作业： 写一个类实现Comparetor接口   使用Arrays.sort()  进行排序 正序 逆序都可以
		// 之前的那个图形的比较改一下 
		
	}

}
