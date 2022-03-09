package com.lhuc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * Map 键值对 映射关系
		 * 
		 * HashMap  --- HashTable(不能放null值, 同步)
		 * TreeMap  json
		 * 
		 * 
		 */
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "xq");
		map.put("name1", "haha");
		map.put("age", "18");
		
		// 返回的是map中key  Set集合
		Set<String> keySet = map.keySet();
		
		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			System.out.println(key +":::"+map.get(key));
		}
		
		// 返回map中所有的值
		Collection<String> values = map.values();
		System.out.println(values);
		
		
//		System.out.println(map);
		System.out.println(map.containsKey("name"));
	}

}
