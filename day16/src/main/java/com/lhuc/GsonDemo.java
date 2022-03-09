package com.lhuc;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonDemo {

	public static void main(String[] args) {
		/*
		 * Gson 转换json的
		 * 
		 * 
		 * JSONObject
		 */
		
		Gson gson = new Gson();
		Map<String, String> map = new HashMap<>();
		map.put("name", "xq");
		map.put("age", "18");
		map.put("sex", "nan");
		
		// 实体对象转换json格式  javabean 转换json
		Student1 s1 = new Student1("haha", 18);
		
//		System.out.println(gson.toJson(s1));
//		System.out.println(gson.toJson(map));
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		// 转成json的时候 可以对所有的数据进行筛选
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
			@Override
			public String translateName(Field f) {
				if(f.getName().equals("name")){
					return "姓名";
				}
				return f.getName();
			}
		});
		Gson gson1 = gsonBuilder.create();
		System.out.println(gson1.toJson(map));
		System.out.println(gson1.toJson(s1));
	}

}
