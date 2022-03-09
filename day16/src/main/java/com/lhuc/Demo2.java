package com.lhuc;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		/**
		 * 
		 *  Set集合 TreeSet 自然排序
		 *  
		 */
		
		TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 主要条件--长度  次要条件--字母顺序
				int temp = o1.length() - o2.length(); 
				return temp == 0 ? o1.compareTo(o2) : temp;
			}
		});
		set.add("xxshu");
		set.add("qiuzhiruoke");
		set.add("james");
		
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String object = iterator.next();
			System.out.println(object);
		}
	}

}
