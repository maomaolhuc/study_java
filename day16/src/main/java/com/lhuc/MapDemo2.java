package com.lhuc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		/**
		 * Map.Entry 内部接口
		 */
		Map<String ,String> map = new HashMap<>();
		map.put("1", "hah");
		map.put("2", "zhangsan");
		map.put("3", "lisi");
		
		// Set 集合
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for (Iterator<Map.Entry<String, String>> iterator = entries.iterator(); iterator.hasNext();) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() +"---" +entry.getValue());
		}
		
	}

}
