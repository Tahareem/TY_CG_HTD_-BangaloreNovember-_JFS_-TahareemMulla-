package com.capg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmpLInkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(23, new Employee(45000,"John"));
		l1.put(73, new Employee(45000,"victor"));
		l1.put(34, new Employee(45000,"wick"));
		
		System.out.println(l1.get(23));
		
		
		Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		
		for (Map.Entry<Integer, Employee> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("---------------");
		}
		
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.containsKey(34));
		System.out.println(l1.containsValue(new Employee(45000,"John")));
		
		
	}
}
