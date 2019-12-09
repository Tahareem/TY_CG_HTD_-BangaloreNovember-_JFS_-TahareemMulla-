package com.capg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1 =new LinkedHashMap<String,Integer>();
		l1.put("Hebbal", 560045);
		l1.put("BTM", 570095);
		l1.put("BTR", 590045);
		l1.put(null, 560045);
		
		l1.put(null, null);
		
		
		
		
		l1.remove("BTR");
		System.out.println("==============");
		System.out.println(l1.containsKey("BTM"));
		System.out.println(l1.containsValue(560045));
		System.out.println("=============");
		
		Set<Map.Entry<String,Integer>> s1=l1.entrySet();
		
		for (Map.Entry<String, Integer>e1: s1 )
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("---------------");
		}
		
		
		
		
	}
}
