package com.capg.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
		
		t1.put(34, "Tannu");
		t1.put(189, "annu");
		t1.put(12, "bannu");

		t1.put(67,null);
		t1.put(34, "Tannu");
		
		
		Set<Map.Entry<Integer, String>> s1=t1.entrySet();
		
		for (Entry<Integer, String> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------");
		}
		
	}
}
